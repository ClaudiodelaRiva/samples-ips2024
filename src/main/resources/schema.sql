--Primero se deben borrar todas las tablas (de detalle a maestro) y lugo anyadirlas (de maestro a detalle)
--(en este caso en cada aplicacion se usa solo una tabla, por lo que no hace falta)

--Para giis.demo.tkrun:

drop table Inscripcion;
drop table Carreras;
drop table Atleta:

create table Carreras (id int primary key not null, inicio date not null, fin date not null, fecha date not null, descr varchar(32), check(inicio<=fin), check(fin<fecha));
create table Atleta (id int primary key not null, nombre varchar (50) not null, fechaNacimiento date not null);
create table Inscripcion (id int primary key not null, fechaInscripcion date not null, idCarrera int,  idAtleta int, 
                          foreign key (idCarrera) references Carreras(id),
                          foreign key (idAtleta) references Atleta(id)
                          );

