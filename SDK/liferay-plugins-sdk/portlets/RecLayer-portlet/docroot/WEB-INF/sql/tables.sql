create table ActividadPlan (
	actividadPlanId LONG not null primary key,
	planAccionId LONG,
	duracion INTEGER,
	actividad VARCHAR(75) null,
	cumplio BOOLEAN,
	observacion VARCHAR(75) null,
	evidencia VARCHAR(75) null,
	objetivo VARCHAR(75) null,
	activo BOOLEAN,
	usuariocrea LONG,
	fechacrea DATE null,
	usuariomodifica LONG,
	fechacreamodifica DATE null
);

create table Actividades (
	actividadesId LONG not null primary key,
	cronogramaEvaluacionPersonalId LONG,
	fechacreamodifica DATE null,
	fechaInicioEvaluacion DATE null,
	fechaFinEvaluacion DATE null,
	descripcion VARCHAR(75) null,
	activo BOOLEAN,
	usuariocrea LONG,
	fechacrea DATE null,
	usuariomodifica LONG
);

create table Certificado (
	certificadoId LONG not null primary key,
	descripcion VARCHAR(75) null,
	empresa VARCHAR(75) null,
	cargo VARCHAR(75) null,
	usuarioHitssId LONG,
	activo BOOLEAN,
	usuariocrea LONG,
	fechacrea DATE null,
	usuariomodifica LONG,
	fechacreamodifica DATE null
);

create table Conocimiento (
	conocimientoId LONG not null primary key,
	descripcion VARCHAR(75) null,
	etiquetaId LONG,
	nivel VARCHAR(75) null,
	herramiento VARCHAR(75) null,
	implementacion VARCHAR(75) null,
	activo BOOLEAN,
	usuariocrea LONG,
	fechacrea DATE null,
	usuariomodifica LONG,
	fechacreamodifica DATE null,
	usuarioHitssId LONG
);

create table Contrato (
	contratoId LONG not null primary key,
	descripcion VARCHAR(75) null,
	fechaEmitida DATE null,
	Titulo BOOLEAN,
	Motivo VARCHAR(75) null,
	activo BOOLEAN,
	usuariocrea LONG,
	fechacrea DATE null,
	usuariomodifica LONG,
	fechacreamodifica DATE null,
	usuarioHitssId LONG
);

create table CriteriosEvaluacion (
	criteriosEvaluacionId LONG not null primary key,
	nombre VARCHAR(75) null,
	nivelCriterio VARCHAR(75) null,
	observacion VARCHAR(75) null,
	parametroPadreId LONG,
	evaluacionId LONG,
	activo BOOLEAN,
	usuariocrea LONG,
	fechacrea DATE null,
	usuariomodifica LONG,
	fechacreamodifica DATE null
);

create table CronogramaEvaluacionPersonal (
	cronogramaEvaluacionPersonalId LONG not null primary key,
	solicitudEvaluacionDesempenoId LONG,
	descripcion VARCHAR(75) null,
	estado VARCHAR(75) null,
	observacion VARCHAR(75) null,
	activo BOOLEAN,
	usuariocrea LONG,
	fechacrea DATE null,
	usuariomodifica LONG,
	fechacreamodifica DATE null
);

create table Entrevista (
	entrevistaId LONG not null primary key,
	usuarioHitssId LONG,
	observacion VARCHAR(75) null,
	asistio BOOLEAN,
	activo BOOLEAN,
	usuariocrea LONG,
	fechacrea DATE null,
	usuariomodifica LONG,
	fechacreamodifica DATE null
);

create table Estudio (
	estudioId LONG not null primary key,
	nombre VARCHAR(75) null,
	logro VARCHAR(75) null,
	fechaInicio DATE null,
	fechaFino DATE null,
	nivel LONG,
	activo BOOLEAN,
	usuariocrea LONG,
	fechacrea DATE null,
	usuariomodifica LONG,
	fechacreamodifica DATE null,
	usuarioHitssId LONG
);

create table Etiqueta (
	etiquetaId LONG not null primary key,
	tagId LONG,
	groupId LONG,
	companyId LONG
);

create table Evaluacion (
	evaluacionId LONG not null primary key,
	tiempoMinuto LONG,
	enfoque LONG,
	puestoEvaluacion LONG,
	tiempoPuesto LONG,
	TipoEvaluacion LONG,
	activo BOOLEAN,
	usuariocrea LONG,
	fechacrea DATE null,
	usuariomodifica LONG,
	fechacreamodifica DATE null
);

create table EvaluacionPregunta (
	evaluacionPreguntaId LONG not null primary key,
	preguntaId LONG,
	evaluacionId LONG,
	descripcion VARCHAR(75) null,
	nivel LONG
);

create table Experiencia (
	estudioId LONG not null primary key,
	descripcion VARCHAR(75) null,
	nivel LONG,
	empresa VARCHAR(75) null,
	proyecto VARCHAR(75) null,
	fechaInicio DATE null,
	fechaFin DATE null,
	usuarioHitssId LONG,
	activo BOOLEAN,
	usuariocrea LONG,
	fechacrea DATE null,
	usuariomodifica LONG,
	fechacreamodifica DATE null
);

create table Funcion (
	funcionId LONG not null primary key,
	descripcion VARCHAR(75) null,
	exigible BOOLEAN,
	etiquetaId LONG,
	activo BOOLEAN,
	usuariocrea LONG,
	fechacrea DATE null,
	usuariomodifica LONG,
	fechacreamodifica DATE null
);

create table FuncionRequerimiento (
	funcionId LONG not null primary key,
	requerimientoRecursoId LONG
);

create table FuncionUsuario (
	funcionId LONG not null primary key,
	usuarioHitssId LONG
);

create table InformeRetroalimentacion (
	informeRetroalimentacionId LONG not null primary key,
	planAccionId LONG,
	responsable VARCHAR(75) null,
	fechaEmision VARCHAR(75) null,
	titulo VARCHAR(75) null,
	integrante VARCHAR(75) null,
	descripcion VARCHAR(75) null,
	activo BOOLEAN,
	usuariocrea LONG,
	fechacrea DATE null,
	usuariomodifica LONG,
	fechacreamodifica DATE null
);

create table Parametro (
	parametroId LONG not null primary key,
	descripcion VARCHAR(75) null,
	llave VARCHAR(75) null,
	valor VARCHAR(75) null,
	parametroPadreId LONG,
	activo BOOLEAN,
	usuariocrea LONG,
	fechacrea DATE null,
	usuariomodifica LONG,
	fechacreamodifica DATE null
);

create table PlanAccion (
	planAccionId LONG not null primary key,
	actividadesId LONG,
	responsable VARCHAR(75) null,
	fechaEmitida DATE null,
	fechaProgramada DATE null,
	aprobadorColaborador BOOLEAN,
	aprobadorLideres BOOLEAN,
	activo BOOLEAN,
	usuariocrea LONG,
	fechacrea DATE null,
	usuariomodifica LONG,
	fechacreamodifica DATE null
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

create table PrioridadEquipos (
	prioridadEquiposId LONG not null primary key,
	solicitudEvaluacionDesempenoId LONG,
	responsable LONG,
	activo BOOLEAN,
	usuariocrea LONG,
	fechacrea DATE null,
	usuariomodifica LONG,
	fechacreamodifica DATE null
);

create table Puesto (
	puestoId LONG not null primary key,
	descripcion VARCHAR(75) null,
	fechaContrato DATE null,
	fechaEvaluacionPsicologica DATE null,
	fechaEvalucionTecnica DATE null,
	fechaEntrevistaGerenteArea DATE null,
	fechaEvaluacionRRHH DATE null,
	fechaPostulacion DATE null,
	seleccionado BOOLEAN,
	activo BOOLEAN,
	usuariocrea LONG,
	fechacrea DATE null,
	usuariomodifica LONG,
	fechacreamodifica DATE null,
	requerimientoRecursoId LONG,
	usuarioHitssId LONG
);

create table Referencia (
	referenciaId LONG not null primary key,
	empresa VARCHAR(75) null,
	telefono VARCHAR(75) null,
	responsable VARCHAR(75) null,
	motivo VARCHAR(75) null,
	usuarioHitssId LONG,
	activo BOOLEAN,
	usuariocrea LONG,
	fechacrea DATE null,
	usuariomodifica LONG,
	fechacreamodifica DATE null
);

create table RequerimientoRecurso (
	requerimientoRecursoId LONG not null primary key,
	especialidad VARCHAR(75) null,
	meta VARCHAR(75) null,
	prioridad LONG,
	motivo VARCHAR(75) null,
	fechaSolicitada DATE null,
	fechaMetaIngreso VARCHAR(75) null,
	estado VARCHAR(75) null,
	modalidad LONG,
	lugarTrabajo VARCHAR(75) null,
	observacion VARCHAR(75) null,
	proyecto VARCHAR(75) null,
	requiereequipotenico BOOLEAN,
	reemplazo BOOLEAN,
	revisado BOOLEAN,
	aprobadoFichaIngresoCapitalHumano BOOLEAN,
	observacionFichaIngresoCapitalHumano VARCHAR(75) null,
	aprobadoFichaIngresoOperaciones BOOLEAN,
	observacionFichaIngresoOperaciones VARCHAR(75) null,
	tipoReclutamiento LONG,
	solicitudRequerimientoPersonalId LONG,
	activo BOOLEAN,
	usuariocrea LONG,
	fechacrea DATE null,
	usuariomodifica LONG,
	fechacreamodifica DATE null
);

create table Requisito (
	requisitoId LONG not null primary key,
	descripcion VARCHAR(75) null,
	nivel LONG,
	exigible BOOLEAN,
	activo BOOLEAN,
	usuariocrea LONG,
	fechacrea DATE null,
	usuariomodifica LONG,
	fechacreamodifica DATE null,
	solicitudRequerimientoPersonalId LONG
);

create table Respuesta (
	respuestaId LONG not null primary key,
	descripcion VARCHAR(75) null,
	correcta BOOLEAN,
	preguntaId LONG
);

create table ResultadoEvaluacion (
	resultadoEvaluacionId LONG not null primary key,
	respuestaSelccionada LONG,
	habilidadCumplida BOOLEAN,
	evaluacionId LONG,
	usuarioHitssId LONG
);

create table SolicitudEvaluacionDesempeno (
	solicitudEvaluacionDesempenoId LONG not null primary key,
	descripcion VARCHAR(75) null,
	fechaIncioEvaluacion DATE null,
	estado VARCHAR(75) null,
	motivo VARCHAR(75) null,
	observacion VARCHAR(75) null,
	activo BOOLEAN,
	usuariocrea LONG,
	fechacrea DATE null,
	usuariomodifica LONG,
	fechacreamodifica DATE null
);

create table SolicitudRequerimientoPersonal (
	solicitudRequerimientoPersonalId LONG not null primary key,
	estado VARCHAR(75) null,
	puesto VARCHAR(75) null,
	areaSolicitante LONG,
	cantidadRecursos LONG,
	fechaLimite DATE null,
	cargo VARCHAR(75) null,
	tiempoContrato LONG,
	tipoNegocio LONG,
	presupuestoMaximo LONG,
	presupuestoMinimo LONG,
	cliente LONG,
	activo BOOLEAN,
	usuariocrea LONG,
	fechacrea DATE null,
	usuariomodifica LONG,
	fechacreamodifica DATE null
);

create table UsuarioGrupo (
	userGroupId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	prioridadEquiposId LONG
);

create table UsuarioHitss (
	usuarioHitssId LONG not null primary key,
	userId VARCHAR(75) null,
	userUuId VARCHAR(75) null,
	actividadPlanId LONG
);

create table usuarioGrupo (
	userGroupId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	prioridadEquiposId LONG
);