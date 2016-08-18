select * from SolicitudRequerimiento;
SET SQL_SAFE_UPDATES = 0;
update SolicitudRequerimiento set estado = 75;
select * from 


select * from respuesta;
INSERT INTO `revhitssportal`.`respuesta` (`respuestaId`, `descripcion`, `correcta`, `activo`, `usuariocrea`, `fechacrea`, `usuariomodifica`, `fechamodifica`) 
VALUES 
('11', 'resoyesta 11', '1', '1', '123', '2016-05-07 07:05:10', '123', '2016-05-07 07:05:10');

select * from preguntarespuesta;
INSERT INTO `revhitssportal`.`preguntarespuesta` (`preguntaId`, `respuestaId`) VALUES ('5', '5');

select * from pregunta;
INSERT INTO `revhitssportal`.`pregunta` (`preguntaId`, `descripcion`, `activo`, `usuariocrea`, `fechacrea`, `usuariomodifica`, `fechamodifica`) 
VALUES ('2', 'pregunta 02', '1', '123', '2016-05-07 07:05:10', '123', '2016-05-07 07:05:10'),
 ('3', 'pregunta 03', '1', '123', '2016-05-07 07:05:10', '123', '2016-05-07 07:05:10'),
 ('4', 'pregunta 04', '1', '123', '2016-05-07 07:05:10', '123', '2016-05-07 07:05:10'),
 ('5', 'pregunta 05', '1', '123', '2016-05-07 07:05:10', '123', '2016-05-07 07:05:10');

select * from evaluacionpregunta;
INSERT INTO `revhitssportal`.`evaluacionpregunta` (`evaluacionId`, `preguntaId`, `nivel`) VALUES ('3', '2', '3');
INSERT INTO `revhitssportal`.`evaluacionpregunta` (`evaluacionId`, `preguntaId`, `nivel`) VALUES ('3', '3', '3');
INSERT INTO `revhitssportal`.`evaluacionpregunta` (`evaluacionId`, `preguntaId`, `nivel`) VALUES ('3', '4', '4');
INSERT INTO `revhitssportal`.`evaluacionpregunta` (`evaluacionId`, `preguntaId`, `nivel`) VALUES ('3', '5', '1');
INSERT INTO `revhitssportal`.`evaluacionpregunta` (`evaluacionId`, `preguntaId`, `nivel`) VALUES ('3', '1', '1');



select * from evaluacion;
INSERT INTO `revhitssportal`.`evaluacion` (`evaluacionId`, `enfoque`, `puestoCategoriaEvaluacion`, `tipoEvaluacion`, `activo`, `usuariocrea`, `fechacrea`, `usuariomodifica`, `fechamodifica`)
VALUES 
(1, 87, '1', 83, '1', '123', '2016-05-07 07:05:10', '123', '2016-05-07 07:05:10'),
(2, 88, '1', 83, '1', '123', '2016-05-07 07:05:10', '123', '2016-05-07 07:05:10'),
(3, 89, '1', 84, '1', '123', '2016-05-07 07:05:10', '123', '2016-05-07 07:05:10'),
(4, 86, '1', 83, '1', '123', '2016-05-07 07:05:10', '123', '2016-05-07 07:05:10');




