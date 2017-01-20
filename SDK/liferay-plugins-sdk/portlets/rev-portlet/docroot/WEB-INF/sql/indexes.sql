create index IX_8C88CC16 on ActividadCronograma (actividadCronogramaId, cronogramaId, grupoUsuario);
create index IX_B57B7D3D on ActividadCronograma (cronogramaId, grupoUsuario);

create index IX_6C362917 on Contrato (usuarioId);

create index IX_54815BAD on Cronograma (solicitudEvaluacionDesempennoId);

create index IX_DE3A4858 on Estudio (usuarioId);

create index IX_1EA6C920 on Experiencia (usuarioId);

create index IX_E5011B05 on FasePostulacion (fasePostulacionId);
create index IX_E49423F9 on FasePostulacion (fasePostulacionId, solicitudRequerimientoId, usuarioId, tipoFase);
create index IX_31601335 on FasePostulacion (solicitudRequerimientoId, fasePostulacionId);
create index IX_26884404 on FasePostulacion (solicitudRequerimientoId, fasePostulacionId, usuarioId);
create index IX_3DD5C436 on FasePostulacion (solicitudRequerimientoId, usuarioId, tipoFase);

create index IX_60B9A1F on FasePostulacionPuestoEvaluacion (evaluacionId);
create index IX_7CBD8F0A on FasePostulacionPuestoEvaluacion (fasePostulacionId);
create index IX_A22D1B72 on FasePostulacionPuestoEvaluacion (solicitudFuncionId);

create index IX_905E65EE on Funcion (activo);
create index IX_AC085D73 on Funcion (descripcion);

create index IX_21DC64CB on Observaciones (tabla, registroId);

create index IX_E0052BA5 on Parametro (parametroIdpadre);
create index IX_9CDF672F on Parametro (parametroIdpadre, valor);

create index IX_CFC74745 on Postulacion (solicitudRequerimientoId);
create index IX_E272E5F4 on Postulacion (solicitudRequerimientoId, usuarioId);

create index IX_D6434D50 on PrioridadGrupoUsuarios (solicitudEvaluacionDesempennoId);

create index IX_24B38389 on Puesto (descripcion);

create index IX_C87E53D0 on PuestoEvaluacion (solicitudFuncionId);

create index IX_EB7E0501 on Referencia (usuarioId);

create index IX_BF01054 on Requisito (descripcion);

create index IX_A926BE0B on SolicitudRequerimiento (activo);
create index IX_EAA29C7D on SolicitudRequerimiento (contenidoId);
create index IX_96963AE1 on SolicitudRequerimiento (estado);
create index IX_48953397 on SolicitudRequerimiento (solicitudRequerimientoId);

create index IX_6DD81378 on SolicitudRequerimientoFuncion (solicitudFuncionId);
create index IX_11B52C77 on SolicitudRequerimientoFuncion (solicitudFuncionId, funcionId);
create index IX_A2BE354D on SolicitudRequerimientoFuncion (solicitudFuncionId, tagId);

create index IX_C1183918 on SolicitudRequerimientoRequisito (solicitudRequerimientoId);
create index IX_9FB67BAD on SolicitudRequerimientoRequisito (solicitudRequerimientoId, tagId);

create index IX_5495C78E on Usuario (userId);

create index IX_BF97B255 on UsuarioRequisito (userId);

create index IX_71D8AD94 on rec_ActividadPlanUsuario (actividadPlanId);
create index IX_9E887CF7 on rec_ActividadPlanUsuario (userId);

create index IX_ABA1E4E2 on rec_FasePostulacionEvaluacion (evaluacionId);
create index IX_78468627 on rec_FasePostulacionEvaluacion (fasePostulacionId);

create index IX_9A360F46 on rec_PreguntaRespuesta (preguntaId);
create index IX_26854F9E on rec_PreguntaRespuesta (respuestaId);

create index IX_13820ED5 on rec_SolicitudRequerimientoFuncion (funcionId);
create index IX_B967CB2A on rec_SolicitudRequerimientoFuncion (solicitudRequerimientoId);