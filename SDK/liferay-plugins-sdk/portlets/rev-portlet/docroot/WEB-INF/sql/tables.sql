create table ActividadCronograma (
	actividadCronogramaId LONG not null,
	cronogramaId LONG not null,
	grupoUsuario LONG,
	descripcion VARCHAR(75) null,
	fechaInicio DATE null,
	fechaFin DATE null,
	cumplidoEvaluacion BOOLEAN,
	estado LONG,
	fechaInicioEvaluacion DATE null,
	fechaFinEvaluacion DATE null,
	aprobadoColaborador LONG,
	aprobadoLider LONG,
	usuarioGerenteId LONG,
	usuarioLiderId LONG,
	activo BOOLEAN,
	usuariocrea LONG,
	fechacrea DATE null,
	usuariomodifica LONG,
	fechamodifica DATE null,
	primary key (actividadCronogramaId, cronogramaId)
);

create table ActividadPlan (
	actividadPlanId LONG not null,
	actividadCronogramaId LONG not null,
	planAccionId LONG,
	actividad VARCHAR(75) null,
	evidencia VARCHAR(75) null,
	activo BOOLEAN,
	usuariocrea LONG,
	fechacrea DATE null,
	usuariomodifica LONG,
	fechamodifica DATE null,
	primary key (actividadPlanId, actividadCronogramaId)
);

create table ActividadPlanAccionUsuario (
	actividadPlanAccionUsuariocoId LONG not null,
	actividadPlanId LONG not null,
	usuarioId LONG,
	cumplio LONG,
	actividad VARCHAR(75) null,
	puntuacion INTEGER,
	activo BOOLEAN,
	usuariocrea LONG,
	fechacrea DATE null,
	usuariomodifica LONG,
	fechamodifica DATE null,
	primary key (actividadPlanAccionUsuariocoId, actividadPlanId)
);

create table Contrato (
	contratoId LONG not null,
	usuarioId LONG not null,
	motivo VARCHAR(75) null,
	descripcion VARCHAR(75) null,
	titulo VARCHAR(75) null,
	activo BOOLEAN,
	usuariocrea LONG,
	fechacrea DATE null,
	usuariomodifica LONG,
	fechamodifica DATE null,
	primary key (contratoId, usuarioId)
);

create table Cronograma (
	cronogramaId LONG not null primary key,
	solicitudEvaluacionDesempennoId LONG,
	descripcion VARCHAR(75) null,
	estado LONG,
	aprobacionCronograma INTEGER,
	activo BOOLEAN,
	usuariocrea LONG,
	fechacrea DATE null,
	usuariomodifica LONG,
	fechamodifica DATE null
);

create table DetalleRepuestaEvaluacion (
	detalleRepuestaEvaluacionId LONG not null,
	evaluacionId LONG not null,
	usuarioId LONG not null,
	descripcion VARCHAR(75) null,
	preguntaId LONG,
	respuestaSeleccionada LONG,
	primary key (detalleRepuestaEvaluacionId, evaluacionId, usuarioId)
);

create table DetalleRepuestaReclutamiento (
	detalleRepsuestaId LONG not null,
	usuarioId LONG not null,
	evaluacionId LONG not null,
	descripcion VARCHAR(75) null,
	preguntaId LONG not null,
	respuestaSeleccionada INTEGER,
	primary key (detalleRepsuestaId, usuarioId, evaluacionId, preguntaId)
);

create table Estudio (
	estudioId LONG not null,
	usuarioId LONG not null,
	nombre VARCHAR(75) null,
	annos LONG,
	activo BOOLEAN,
	usuariocrea LONG,
	fechacrea DATE null,
	usuariomodifica LONG,
	fechamodifica DATE null,
	primary key (estudioId, usuarioId)
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
	puestoCategoriaEvaluacion LONG,
	tipoEvaluacion LONG,
	descripcion VARCHAR(75) null,
	activo BOOLEAN,
	usuariocrea LONG,
	fechacrea DATE null,
	usuariomodifica LONG,
	fechamodifica DATE null
);

create table EvaluacionPregunta (
	evaluacionId LONG not null,
	preguntaId LONG not null,
	nivel LONG,
	primary key (evaluacionId, preguntaId)
);

create table Experiencia (
	experienciaId LONG not null,
	usuarioId LONG not null,
	descripcion VARCHAR(75) null,
	empresa VARCHAR(75) null,
	tipoNegocio LONG,
	proyecto VARCHAR(75) null,
	fechaInicio DATE null,
	fechaFin DATE null,
	activo BOOLEAN,
	usuariocrea LONG,
	fechacrea DATE null,
	usuariomodifica LONG,
	fechamodifica DATE null,
	primary key (experienciaId, usuarioId)
);

create table FasePostulacion (
	fasePostulacionId LONG not null primary key,
	solicitudRequerimientoId LONG,
	usuarioId LONG,
	tipoFase LONG,
	fechaFase DATE null,
	descripcion VARCHAR(75) null,
	estado LONG,
	asistio BOOLEAN,
	apruebaFase BOOLEAN,
	puntuacion INTEGER,
	salario DOUBLE,
	activo BOOLEAN,
	usuariocrea LONG,
	fechacrea DATE null,
	usuariomodifica LONG,
	fechamodifica DATE null
);

create table FasePostulacionPuestoEvaluacion (
	fasePostulacionId LONG not null,
	solicitudFuncionId LONG not null,
	evaluacionId LONG not null,
	resultado DOUBLE,
	primary key (fasePostulacionId, solicitudFuncionId, evaluacionId)
);

create table FichaIngreso (
	fichaingresoId LONG not null,
	solicitudRequerimientoId LONG not null,
	userId LONG,
	equipoTecnico BOOLEAN,
	reemplazo BOOLEAN,
	aprobacionFichaIngresoCapitalHumano BOOLEAN,
	aprobacionFichaIngresoOperaciones BOOLEAN,
	activo BOOLEAN,
	usuariocrea LONG,
	fechacrea DATE null,
	usuariomodifica LONG,
	fechamodifica DATE null,
	primary key (fichaingresoId, solicitudRequerimientoId)
);

create table Funcion (
	funcionId LONG not null primary key,
	descripcion VARCHAR(75) null,
	exigible BOOLEAN,
	activo BOOLEAN,
	usuariocrea LONG,
	fechacrea DATE null,
	usuariomodifica LONG,
	fechamodifica DATE null
);

create table InformeRetroalimentacion (
	informeRetroalimentacionId LONG not null primary key,
	regisitrarActividadPlanUsuariocoId LONG,
	usuario LONG,
	descripcion VARCHAR(75) null,
	activo BOOLEAN,
	usuariocrea LONG,
	fechacrea DATE null,
	usuariomodifica LONG,
	fechamodifica DATE null
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
	fechamodifica DATE null
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
	fechamodifica DATE null
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
	fechamodifica DATE null
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
	fechamodifica DATE null
);

create table Postulacion (
	solicitudRequerimientoId LONG not null,
	usuarioId LONG not null,
	fechaPostulacion DATE null,
	estado LONG,
	seleccionado BOOLEAN,
	activo BOOLEAN,
	usuariocrea LONG,
	fechacrea DATE null,
	usuariomodifica LONG,
	fechamodifica DATE null,
	primary key (solicitudRequerimientoId, usuarioId)
);

create table Pregunta (
	preguntaId LONG not null primary key,
	descripcion VARCHAR(75) null,
	activo BOOLEAN,
	usuariocrea LONG,
	fechacrea DATE null,
	usuariomodifica LONG,
	fechamodifica DATE null
);

create table PreguntaRespuesta (
	preguntaId LONG not null,
	respuestaId LONG not null,
	primary key (preguntaId, respuestaId)
);

create table PrioridadGrupoUsuarios (
	prioridadGrupoUsuariosId LONG not null primary key,
	solicitudEvaluacionDesempennoId LONG,
	liderGrupo LONG,
	gerenteArea LONG,
	grupoUsuario VARCHAR(75) null,
	orden INTEGER,
	activo BOOLEAN,
	usuariocrea LONG,
	fechacrea DATE null,
	usuariomodifica LONG,
	fechamodifica DATE null
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

create table PuestoEvaluacion (
	solicitudFuncionId LONG not null,
	evaluacionId LONG not null,
	rangoSuperior DOUBLE,
	rangoInferior DOUBLE,
	primary key (solicitudFuncionId, evaluacionId)
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
	fechamodifica DATE null,
	primary key (referenciaId, usuarioId)
);

create table RegisitrarActividadPlanUsuario (
	actividadPlanId LONG not null,
	regisitrarActividadPlanUsuariocoId LONG not null,
	usuarioId LONG,
	cumplio LONG,
	actividad VARCHAR(75) null,
	puntuacion INTEGER,
	activo BOOLEAN,
	usuariocrea LONG,
	fechacrea DATE null,
	usuariomodifica LONG,
	fechamodifica DATE null,
	primary key (actividadPlanId, regisitrarActividadPlanUsuariocoId)
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
	fechamodifica DATE null
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
	fechamodifica DATE null
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
	especialidad VARCHAR(75) null,
	meta VARCHAR(75) null,
	fechameta DATE null,
	prioridad LONG,
	contenidoId VARCHAR(75) null,
	modalidadjornada LONG,
	modalidadcontrato LONG,
	lugarTrabajo VARCHAR(75) null,
	categoriaPuestoId LONG,
	proyecto VARCHAR(75) null,
	tiporeclutamiento LONG,
	estado LONG,
	activo BOOLEAN,
	usuariocrea LONG,
	fechacrea DATE null,
	usuariomodifica LONG,
	fechamodifica DATE null,
	cantidadAnnosRubro INTEGER
);

create table SolicitudRequerimientoFuncion (
	solicitudFuncionId LONG not null,
	funcionId LONG not null,
	exigible BOOLEAN,
	activo BOOLEAN,
	usuariocrea LONG,
	fechacrea DATE null,
	usuariomodifica LONG,
	fechamodifica DATE null,
	primary key (solicitudFuncionId, funcionId)
);

create table SolicitudRequerimientoRequisito (
	solicitudRequerimientoId LONG not null,
	tagId LONG not null,
	annos LONG,
	exigible BOOLEAN,
	tipoRequisito LONG,
	herramienta LONG,
	activo BOOLEAN,
	usuariocrea LONG,
	fechacrea DATE null,
	usuariomodifica LONG,
	fechamodifica DATE null,
	primary key (solicitudRequerimientoId, tagId)
);

create table Usuario (
	userId LONG not null primary key,
	activo BOOLEAN,
	usuariocrea LONG,
	fechacrea DATE null,
	usuariomodifica LONG,
	fechamodifica DATE null
);

create table UsuarioEvaluacion (
	actividadCronogramaId LONG,
	usuarioId LONG not null primary key,
	evaluacionId LONG,
	nota INTEGER
);

create table UsuarioFuncion (
	userId LONG not null,
	funcionId LONG not null,
	exigible BOOLEAN,
	activo BOOLEAN,
	usuariocrea LONG,
	fechacrea DATE null,
	usuariomodifica LONG,
	fechamodifica DATE null,
	primary key (userId, funcionId)
);

create table UsuarioRequisito (
	userId LONG not null,
	tagId LONG not null,
	annos LONG,
	exigible BOOLEAN,
	tipoRequisito LONG,
	herramienta LONG,
	cumplerequisito BOOLEAN,
	activo BOOLEAN,
	usuariocrea LONG,
	fechacrea DATE null,
	usuariomodifica LONG,
	fechamodifica DATE null,
	primary key (userId, tagId)
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