
select  
padre.parametroId as parametroIdpadre, 
padre.descripcion, 
hijo.parametroId ,
hijo.descripcion, 
hijo.valor,
hijo.codigo, 
hijo.tipodato, 
hijo.activo, 
hijo.usuariocrea, 
hijo.fechacrea, 
hijo.usuariomodifica, 
hijo.fechamodifica
  from  
( select 
  parametroId , descripcion  
  from 
  parametro 
  where parametroIdpadre = 0 ) padre , 
( select 
  parametroId, parametroIdpadre, codigo, descripcion, valor, tipodato, activo, usuariocrea, fechacrea, usuariomodifica, fechamodifica
  from 
  parametro 
  where parametroIdpadre <> 0  ) hijo
  where 
  hijo.parametroIdpadre =  padre.parametroId
  and  
  padre.parametroId in (77,69,47)
  group by padre.parametroId,padre.descripcion, 
  hijo.parametroId 
  order by 1,3;


select * from parametro;



































