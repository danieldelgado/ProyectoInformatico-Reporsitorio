select * from user_ ; 
select userid from user_ u where userid not in (select us.userId from usuario us);
select * from role_;
select * from users_roles;
select * from users_roles where roleId in ('28611','31234');
select * from users_groups;
-- 28611 postualnte ,
-- 31234 colaborador
select * from usuario where userId in (select ur.userId from users_roles ur where ur.roleId in ('28611'));


select * from postulacion;
select * from fasepostulacion;
INSERT INTO fasepostulacion 
(`fasePostulacionId`, `solicitudRequerimientoId`, `usuarioId`, `tipoFase`, `fechaFase`, `descripcion`, `estado`, `activo`, `usuariocrea`, `fechacrea`, `usuariomodifica`) VALUES 
('2', '1', '22248', '78', '2016-05-07 07:05:10', 'Inicio de la evalucion', '71', '1', '22248', '2016-05-07 07:05:10', '22248') ,
('3', '1', '22257', '78', '2016-05-07 07:05:10', 'Inicio de la evalucion', '71', '1', '22248', '2016-05-07 07:05:10', '22248') ,
('4', '1', '22212', '81', '2016-05-07 07:05:10', 'Inicio de la evalucion', '71', '1', '22248', '2016-05-07 07:05:10', '22248') ,
('5', '2', '22248', '79', '2016-05-07 07:05:10', 'Inicio de la evalucion', '71', '1', '22248', '2016-05-07 07:05:10', '22248') ,
('6', '2', '22257', '78', '2016-05-07 07:05:10', 'Inicio de la evalucion', '71', '1', '22248', '2016-05-07 07:05:10', '22248') ,
('7', '2', '22230', '79', '2016-05-07 07:05:10', 'Inicio de la evalucion', '71', '1', '22248', '2016-05-07 07:05:10', '22248') ,
('8', '3', '22248', '78', '2016-05-07 07:05:10', 'Inicio de la evalucion', '71', '1', '22248', '2016-05-07 07:05:10', '22248') ,
('9', '3', '22257', '80', '2016-05-07 07:05:10', 'Inicio de la evalucion', '71', '1', '22248', '2016-05-07 07:05:10', '22248') ,
('10', '3', '22212', '80', '2016-05-07 07:05:10', 'Inicio de la evalucion', '71', '1', '22248', '2016-05-07 07:05:10', '22248') ,
('11', '3', '22230', '78', '2016-05-07 07:05:10', 'Inicio de la evalucion', '71', '1', '22248', '2016-05-07 07:05:10', '22248') ,
('12', '4', '22248', '81', '2016-05-07 07:05:10', 'Inicio de la evalucion', '71', '1', '22248', '2016-05-07 07:05:10', '22248') ,
('13', '4', '22257', '80', '2016-05-07 07:05:10', 'Inicio de la evalucion', '71', '1', '22248', '2016-05-07 07:05:10', '22248') ;




select * from fasepostulacion;
select * from fasepostulacionevaluacion;
INSERT INTO `revhitssportal`.`fasepostulacionevaluacion` (`evaluacionId`, `fasePostulacionId`) VALUES ('1', '1');
INSERT INTO `revhitssportal`.`fasepostulacionevaluacion` (`evaluacionId`, `fasePostulacionId`) VALUES ('2', '1');
INSERT INTO `revhitssportal`.`fasepostulacionevaluacion` (`evaluacionId`, `fasePostulacionId`) VALUES ('1', '2');
INSERT INTO `revhitssportal`.`fasepostulacionevaluacion` (`evaluacionId`, `fasePostulacionId`) VALUES ('3', '3');
INSERT INTO `revhitssportal`.`fasepostulacionevaluacion` (`evaluacionId`, `fasePostulacionId`) VALUES ('3', '4');
INSERT INTO `revhitssportal`.`fasepostulacionevaluacion` (`evaluacionId`, `fasePostulacionId`) VALUES ('4', '4');
INSERT INTO `revhitssportal`.`fasepostulacionevaluacion` (`evaluacionId`, `fasePostulacionId`) VALUES ('5', '4');

select * from detallerepuestaevaluacion;


select * from evaluacion;




