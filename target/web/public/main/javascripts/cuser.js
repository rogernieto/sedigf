// Main cuser module
var cuser = angular.module('myApp', ['ui.bootstrap', 'confirmDialogBoxModule']);

cuser.controller('userCtrl', function($scope, $http, $timeout, $uibModal, UserService) {

 $scope.usuarios = [];

    function getAllUsuario() {
       UserService.getAll().then(function(res){
             $scope.usuarios = res.data;
        }, function(err){
           // error
        });
     }

      $scope.selectedUsuario = {};

      $scope.editUsuario = function(usu){
            $scope.selectedUsuario = angular.copy(usu);
      };

      $scope.updateUsuario = function(){
         UserService.updateUsuario($scope.selectedUsuario).then(function(res) {
             $('.modal').modal('hide');
             showAlertMessage(res.status, res.msg);
             getAllUsuario();
         }, function(err){
             // error
        });
      }

    $scope.newUsuario = {};

    $scope.addUsuario = function() {
        UserService.addUsuario($scope.newUsuario).then(function(res) {
                  $('.modal').modal('hide');
                  var newId = res.data.id;
                  $scope.newUsuario["id"] = newId;
                  $scope.usuarios.push($scope.newUsuario);
                  $scope.newUsuario ={};
                  showAlertMessage(res.status, res.msg);
          }, function(err){
                // error
          });
    }

   $scope.deleteUsuario = function(usuId) {
           UserService.deleteUsuario(usuId).then(function(res){
                       var newUserList=[];
                       angular.forEach($scope.usuarios,function(usu){
                                if(usu.id != usuId) {
                                        newUserList.push(usu);
                                 }
                        });
                        $scope.usuarios = newUserList;
             showAlertMessage(res.status, res.msg);
         }, function(err){
                 // error
          });
      }

    getAllUsuario();

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
cuser.directive('notification', function($timeout){
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




cuser.service("UserService", function($http, $q) {

   var task = this;
   task.taskList = {};

   task.getAll = function() {
          var defer = $q.defer();
          $http.get('/usu/list')
          .success(function(res){
                task.taskList = res;
                defer.resolve(res);
           })
           .error(function(err, status){
              defer.reject(err);
           });

         return defer.promise;
     }

   task.deleteUsuario = function(id) {
        var defer = $q.defer();
        $http.get('/usu/delete?usuId=' + id)
        .success(function(res){
               task.taskList = res;
                defer.resolve(res);
         }).error(function(err, status){
               defer.reject(err);
         });

         return defer.promise
   }

   task.updateUsuario = function(data) {
      var defer = $q.defer();
      $http.post('/usu/update', data)
      .success(function(res){
               task.taskList = res;
               defer.resolve(res);
       }).error(function(err, status){
                defer.reject(err);
       });

       return defer.promise
   }

   task.addUsuario = function(data) {
         var defer = $q.defer();
         $http.post('/usu/create', data)
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
