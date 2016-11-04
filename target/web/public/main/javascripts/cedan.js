// Main cedan module
var cedan = angular.module('myApp', ['ui.bootstrap', 'confirmDialogBoxModule']);

cedan.controller('edCtrl', function($scope, $http, $timeout, $uibModal, edanService) {

 $scope.fichas = [];

    function getAllEdan() {
       edanService.getAll().then(function(res){
             $scope.fichas = res.data;
        }, function(err){
           // error
        });
     }

      $scope.selectedEdan = {};

      $scope.editEdan = function(ed){
            $scope.selectedEdan = angular.copy(ed);
      };

      $scope.updateEdan = function(){
         edanService.updateEdan($scope.selectedEdan).then(function(res) {
             $('.modal').modal('hide');
             showAlertMessage(res.status, res.msg);
             getAllEdan();
         }, function(err){
             // error
        });
      }

    $scope.newEdan = {};

    $scope.addEdan = function() {
        edanService.addEdan($scope.newEdan).then(function(res) {
                  $('.modal').modal('hide');
                  var newId = res.data.id;
                  $scope.newEdan["id"] = newId;
                  $scope.fichas.push($scope.newEdan);
                  $scope.newEdan ={};
                  showAlertMessage(res.status, res.msg);
          }, function(err){
                // error
          });
    }

   $scope.deleteEdan = function(edId) {
           edanService.deleteEdan(edId).then(function(res){
                       var newEdanList=[];
                       angular.forEach($scope.fichas,function(ed){
                                if(ed.id != edId) {
                                        newEdanList.push(ed);
                                 }
                        });
                        $scope.fichas = newEdanList;
             showAlertMessage(res.status, res.msg);
         }, function(err){
                 // error
          });
      }

    getAllEdan();

    $scope.alerts = [];

    function showAlertMessage(status, message) {
              if(status == "success") {
                    $scope.alerts.push({type: "alert-success", title: "SUCCESS", content: message});
              } else if(status == "error") {
                     $scope.alerts.push({type: "alert-danger", title: "ERROR", content: message});
              }
    };

  });


/**
 * Directive for alert notification. You can also use angular ui-bootstrap for better alert notifications
 */
cedan.directive('notification', function($timeout){
  return {
    restrict: 'E',
    replace: true,
    scope: {
      ngModel: '='
    },
    template: '<div ng-class="ngModel.type" class="alert alert-box">{{ngModel.content}}</div>',
     link: function(scope, element, attrs) {
          $timeout(function(){
            element.hide();
          }, 3000);
      }
  }
});



cedan.service("edanService", function($http, $q) {

   var task = this;
   task.taskList = {};

   task.getAll = function() {
          var defer = $q.defer();
          $http.get('/edan/list')
          .success(function(res){
                task.taskList = res;
                defer.resolve(res);
           })
           .error(function(err, status){
              defer.reject(err);
           });

         return defer.promise;
     }

   task.deleteEdan = function(id) {
        var defer = $q.defer();
        $http.get('/edan/delete?edId=' + id)
        .success(function(res){
               task.taskList = res;
                defer.resolve(res);
         }).error(function(err, status){
               defer.reject(err);
         });

         return defer.promise
   }

   task.updateEdan = function(data) {
      var defer = $q.defer();
      $http.post('/edan/update', data)
      .success(function(res){
               task.taskList = res;
               defer.resolve(res);
       }).error(function(err, status){
                defer.reject(err);
       });

       return defer.promise
   }

   task.addEdan = function(data) {
         var defer = $q.defer();
         $http.post('/edan/create', data)
         .success(function(res){
                task.taskList = res;
                defer.resolve(res);
         })
         .error(function(err, status){
                defer.reject(err);
         });;

          return defer.promise
      }

   return task;

 });


/**
 * Module for confirm dialog box
 * To use this, add this module as a dependency in app module.
 */
angular.module('confirmDialogBoxModule', ['ui.bootstrap'])
  .directive('ngConfirmClick', ['$uibModal', function($uibModal) {

      var modalInstanceCtrl = function($scope, $uibModalInstance) {
        $scope.ok = function() {
          $uibModalInstance.close();
        };

        $scope.cancel = function() {
          $uibModalInstance.dismiss('cancel');
        };
      };

      return {
        restrict: 'A',
        scope:{
          ngConfirmClick:"&"
        },
        link: function(scope, element, attrs) {
          element.bind('click', function() {
            var message = attrs.ngConfirmMessage || "Are you sure ?";

            // Template for confirmation dialog box
            var modalHtml = '<div class="modal-body">' + message + '</div>';
            modalHtml += '<div class="modal-footer"><button class="btn btn-primary" ng-click="ok()">OK</button><button class="btn btn-default" ng-click="cancel()">Cancel</button></div>';

            var modalInstance = $uibModal.open({
              template: modalHtml,
              controller: modalInstanceCtrl
            });

            modalInstance.result.then(function() {
              scope.ngConfirmClick();
            }, function() {
              //Modal dismissed
            });
          });

        }
      }
    }
  ]);
