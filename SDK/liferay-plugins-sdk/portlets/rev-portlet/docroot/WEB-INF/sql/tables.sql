create table ActividadCronograma (
	actividadCronogramaId LONG,
	cronogramaId LONG not null primary key,
	descripcion VARCHAR(75) null,
	fechaInicio DATE null,
	fechaFin DATE null,
	cumplido BOOLEAN,
	finalizado BOOLEAN,
	tipoActividad LONG,
	activo BOOLEAN,
	usuariocrea LONG,
	fechacrea DATE null,
	usuariomodifica LONG,
	fechacreamodifica DATE null
);

create table ActividadPlan (
	actividadPlanId LONG not null primary key,
	planAccionId LONG,
	responsable LONG,
	actividad VARCHAR(75) null,
	evidencia VARCHAR(75) null,
	objetivo VARCHAR(75) null,
	activo BOOLEAN,
	usuariocrea LONG,
	fechacrea DATE null,
	usuariomodifica LONG,
	fechacreamodifica DATE null
);

create table Contrato (
	contratoId LONG not null primary key,
	usuarioId LONG,
	motivo VARCHAR(75) null,
	descripcion VARCHAR(75) null,
	titulo VARCHAR(75) null,
	activo BOOLEAN,
	usuariocrea LONG,
	fechacrea DATE null,
	usuariomodifica LONG,
	fechacreamodifica DATE null
);

create table Cronograma (
	cronogramaId LONG not null primary key,
	solicitudEvaluacionDesempennoId LONG,
	descripcion VARCHAR(75) null,
	estado LONG,
	activo BOOLEAN,
	usuariocrea LONG,
	fechacrea DATE null,
	usuariomodifica LONG,
	fechacreamodifica DATE null
);

create table DetalleRepuestaEvaluacion (
	detalleRepuestaEvaluacionId LONG not null,
	evaluacionId LONG not null,
	usuarioId LONG not null,
	descripcion VARCHAR(75) null,
	respuestaSeleccionada LONG,
	primary key (detalleRepuestaEvaluacionId, evaluacionId, usuarioId)
);

create table DetalleRepuestaReclutamiento (
	detalleRepsuestaId LONG not null,
	evaluacionId LONG not null,
	fasePostulacionId LONG not null,
	descripcion VARCHAR(75) null,
	respuestaSeleccionada INTEGER,
	primary key (detalleRepsuestaId, evaluacionId, fasePostulacionId)
);

create table Estudio (
	estudioId LONG not null primary key,
	usuarioId LONG,
	nombre VARCHAR(75) null,
	nivel LONG,
	activo BOOLEAN,
	usuariocrea LONG,
	fechacrea DATE null,
	usuariomodifica LONG,
	fechacreamodifica DATE null
);

create table EtiquetaRelacionada (
	etiquetaRelacionadaId LONG not null primary key,
	tabla VARCHAR(75) null,
	registroId LONG,
	etiqueta LONG,
	tagId LONG,
	groupId LONG,
	companyId LONG
);

create table Evaluacion (
	evaluacionId LONG not null primary key,
	enfoque LONG,
	puestoEvaluacion LONG,
	tipoEvaluacion LONG,
	activo BOOLEAN,
	usuariocrea LONG,
	fechacrea DATE null,
	usuariomodifica LONG,
	fechacreamodifica DATE null
);

create table EvaluacionPregunta (
	evaluacionId LONG not null,
	preguntaId LONG not null,
	nivel LONG,
	primary key (evaluacionId, preguntaId)
);

create table Experiencia (
	experienciaId LONG not null primary key,
	usuarioId LONG,
	descripcion VARCHAR(75) null,
	empresa VARCHAR(75) null,
	proyecto VARCHAR(75) null,
	fechaInicio DATE null,
	fechaFin DATE null,
	activo BOOLEAN,
	usuariocrea LONG,
	fechacrea DATE null,
	usuariomodifica LONG,
	fechacreamodifica DATE null
);

create table FasePostulacion (
	fasePostulacionId LONG not null primary key,
	solicitudRequerimientoId LONG,
	usuarioId LONG,
	tipoFase LONG,
	fechaFase DATE null,
	descripcion VARCHAR(75) null,
	estado LONG,
	activo BOOLEAN,
	usuariocrea LONG,
	fechacrea DATE null,
	usuariomodifica LONG,
	fechacreamodifica DATE null
);

create table Funcion (
	funcionId LONG not null primary key,
	descripcion VARCHAR(75) null,
	etiqueta LONG,
	exigible BOOLEAN,
	activo BOOLEAN,
	usuariocrea LONG,
	fechacrea DATE null,
	usuariomodifica LONG,
	fechacreamodifica DATE null
);

create table InformeRetroalimentacion (
	informeRetroalimentacionId LONG not null primary key,
	planAccionId LONG,
	usuario LONG,
	titulo VARCHAR(75) null,
	descripcion VARCHAR(75) null,
	activo BOOLEAN,
	usuariocrea LONG,
	fechacrea DATE null,
	usuariomodifica LONG,
	fechacreamodifica DATE null
);

create table LogOperaciones (
	logOperacionesId LONG not null primary key,
	tipoActividad LONG,
	actividad VARCHAR(75) null,
	usuario VARCHAR(75) null,
	activo BOOLEAN,
	usuariocrea LONG,
	fechacrea DATE null,
	usuariomodifica LONG,
	fechacreamodifica DATE null
);

create table Observaciones (
	observacionId LONG not null primary key,
	descripcion VARCHAR(75) null,
	tabla VARCHAR(75) null,
	registroId LONG,
	activo BOOLEAN,
	usuariocrea LONG,
	fechacrea DATE null,
	usuariomodifica LONG,
	fechacreamodifica DATE null
);

create table Parametro (
	parametroId LONG not null primary key,
	parametroIdpadre LONG,
	codigo VARCHAR(75) null,
	descripcion VARCHAR(75) null,
	valor VARCHAR(75) null,
	tipodato VARCHAR(75) null,
	activo BOOLEAN,
	usuariocrea LONG,
	fechacrea DATE null,
	usuariomodifica LONG,
	fechacreamodifica DATE null
);

create table PlanAccion (
	planAccionId LONG not null primary key,
	cronogramaId LONG,
	responsable LONG,
	fechaProgramada DATE null,
	aprobadorColaborador BOOLEAN,
	aprobadorLider BOOLEAN,
	jerarquiaEvaluar LONG,
	activo BOOLEAN,
	usuariocrea LONG,
	fechacrea DATE null,
	usuariomodifica LONG,
	fechacreamodifica DATE null
);

create table Postulacion (
	solicitudRequerimientoId LONG not null,
	usuarioId LONG not null,
	fechaPostulacion DATE null,
	estado LONG,
	activo BOOLEAN,
	usuariocrea LONG,
	fechacrea DATE null,
	usuariomodifica LONG,
	fechacreamodifica DATE null,
	primary key (solicitudRequerimientoId, usuarioId)
);

create table Pregunta (
	preguntaId LONG not null primary key,
	descripcion VARCHAR(75) null,
	activo BOOLEAN,
	usuariocrea LONG,
	fechacrea DATE null,
	usuariomodifica LONG,
	fechacreamodifica DATE null
);

create table PrioridadGrupoUsuarios (
	prioridadGrupoUsuariosId LONG not null primary key,
	solicitudEvaluacionDesempennoId LONG,
	responsableGrupo VARCHAR(75) null,
	grupoUsuario VARCHAR(75) null,
	orden INTEGER,
	activo BOOLEAN,
	usuariocrea LONG,
	fechacrea DATE null,
	usuariomodifica LONG,
	fechacreamodifica DATE null
);

create table Puesto (
	puestoId LONG not null primary key,
	descripcion VARCHAR(75) null,
	categoria LONG,
	activo BOOLEAN,
	usuariocrea LONG,
	fechacrea DATE null,
	usuariomodifica LONG,
	fechacreamodifica DATE null
);

create table Referencia (
	referenciaId LONG not null,
	usuarioId LONG not null,
	empresa VARCHAR(75) null,
	telefono VARCHAR(75) null,
	responsable VARCHAR(75) null,
	motivo VARCHAR(75) null,
	activo BOOLEAN,
	usuariocrea LONG,
	fechacrea DATE null,
	usuariomodifica LONG,
	fechacreamodifica DATE null,
	primary key (referenciaId, usuarioId)
);

create table Requisito (
	requisitoId LONG not null primary key,
	descripcion VARCHAR(75) null,
	nivel LONG,
	exigible BOOLEAN,
	herramienta LONG,
	tipoRequisito LONG,
	activo BOOLEAN,
	usuariocrea LONG,
	fechacrea DATE null,
	usuariomodifica LONG,
	fechacreamodifica DATE null
);

create table Respuesta (
	respuestaId LONG not null primary key,
	descripcion VARCHAR(75) null,
	correcta BOOLEAN,
	activo BOOLEAN,
	usuariocrea LONG,
	fechacrea DATE null,
	usuariomodifica LONG,
	fechacreamodifica DATE null
);

create table SolicitudEvaluacionDesempenno (
	solicitudEvaluacionDesempennoId LONG not null primary key,
	descripcion VARCHAR(75) null,
	fechaInicio DATE null,
	estado LONG,
	activo BOOLEAN,
	usuariocrea LONG,
	fechacrea DATE null,
	usuariomodifica LONG,
	fechacreamodifica DATE null
);

create table SolicitudRequerimiento (
	solicitudRequerimientoId LONG not null primary key,
	areaSolicitante LONG,
	cantidadRecursos INTEGER,
	responsableRRHH LONG,
	fechaLimite DATE null,
	tiempoContrato LONG,
	tipoNegocio LONG,
	presupuestoMaximo LONG,
	presupuestoMinimo LONG,
	cliente LONG,
	especialidad LONG,
	meta VARCHAR(75) null,
	prioridad LONG,
	motivo VARCHAR(75) null,
	modalidadjornada LONG,
	modalidadcontrato LONG,
	lugarTrabajo VARCHAR(75) null,
	puestoId LONG,
	proyecto VARCHAR(75) null,
	requieroEquipoTecnico BOOLEAN,
	reemplazo BOOLEAN,
	aprobacionFichaIngresoCapitalHumano BOOLEAN,
	aprobacionFichaIngresoOperaciones BOOLEAN,
	tiporeclutamiento LONG,
	estado LONG,
	activo BOOLEAN,
	usuariocrea LONG,
	fechacrea DATE null,
	usuariomodifica LONG,
	fechacreamodifica DATE null
);

create table SolicitudRequerimientoRequisito (
	solicitudRequerimientoId LONG not null,
	requisitosId LONG not null,
	exigible BOOLEAN,
	primary key (solicitudRequerimientoId, requisitosId)
);

create table Usuario (
	userId LONG not null primary key,
	activo BOOLEAN,
	usuariocrea LONG,
	fechacrea DATE null,
	usuariomodifica LONG,
	fechacreamodifica DATE null
);

create table UsuarioEvaluacion (
	actividadCronogramaId LONG not null,
	usuarioId LONG not null,
	evaluacionId LONG not null,
	primary key (actividadCronogramaId, usuarioId, evaluacionId)
);

create table UsuarioRequisito (
	userId LONG not null,
	requisitoId LONG not null,
	cumplerequisito BOOLEAN,
	primary key (userId, requisitoId)
);

create table rec_ActividadPlanUsuario (
	actividadPlanId LONG not null,
	userId LONG not null,
	primary key (actividadPlanId, userId)
);

create table rec_FasePostulacionEvaluacion (
	evaluacionId LONG not null,
	fasePostulacionId LONG not null,
	primary key (evaluacionId, fasePostulacionId)
);

create table rec_PreguntaRespuesta (
	preguntaId LONG not null,
	respuestaId LONG not null,
	primary key (preguntaId, respuestaId)
);

create table rec_SolicitudRequerimientoFuncion (
	funcionId LONG not null,
	solicitudRequerimientoId LONG not null,
	primary key (funcionId, solicitudRequerimientoId)
);