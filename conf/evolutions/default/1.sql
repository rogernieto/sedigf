# --- !Ups

CREATE TABLE "usuario"("id" SERIAL PRIMARY KEY ,"nombre" varchar(50) , "apellidos" varchar(50)  ,"email" varchar(50),"password" varchar(50));
INSERT INTO "usuario" values (1,'Juan', 'Perez','mail@mail.com','1234');
INSERT INTO "usuario" values (2,'Arnoldo', 'Perez','amail@mail.com','1234');
INSERT INTO "usuario" values (3,'Pedro', 'Perez','pmail@mail.com','1234');
INSERT INTO "usuario" values (4,'Miguel', 'Perez','mmail@mail.com','1234');
INSERT INTO "usuario" values (5,'Miguelangrl', 'Perezoso','mmailm@mail.com','1234');

CREATE TABLE "edan"("id" SERIAL PRIMARY KEY ,"entrevistador" varchar(75) , "cargo" varchar(30), "institucion" varchar(50), "telefono" varchar(10)  ,"email" varchar(50));
INSERT INTO "edan" values (1,'Juan', 'Perez','Alcaldia','1234', 'mail@mail.com');
INSERT INTO "edan" values (2,'Juan', 'Perez','Alcaldia','1234', 'mail1@mail.com');
INSERT INTO "edan" values (3,'Juan', 'Perez','Alcaldia','1234', 'mail2@mail.com');
INSERT INTO "edan" values (4,'Juan', 'Perez','Alcaldia','1234', 'mail333@mail.com');


# --- !Downs

DROP TABLE "usuario";
DROP TABLE "edan";
