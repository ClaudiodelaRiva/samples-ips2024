--Datos para carga inicial de la base de datos

--Para giis.demo.tkrun:
delete from inscripcion;
delete from atleta
delete from carreras;
insert into carreras(id,inicio,fin,fecha,descr) values 
	(100,'2016-10-05','2016-10-25','2016-11-09','finalizada'),
	(101,'2016-10-05','2016-10-25','2016-11-10','en fase 3'),
	(102,'2016-11-05','2016-11-09','2016-11-20','en fase 2'),
	(103,'2016-11-10','2016-11-15','2016-11-21','en fase 1'),
	(104,'2016-11-11','2016-11-15','2016-11-22','antes inscripcion')
        (105,'2024-08-01','2024-11-01','2024-10-06','en fase 1')
;
insert into atletas (id,nombre,fechaNacimiento) values
	(100, A1, 1992-01-01),
	(101, A2, 2010-01-01),
	(102, A3, 2000-01-01);
insert into inscripcion (id,fechaInscripcion,idCarrera,idAtleta) values
	(101, I1, 2016-10-06, 100, 100);
