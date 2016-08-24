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
	registroId LONG,
	etiqueta LONG,
	tabla LONG,
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
	fechaFase DATE null,
	tipoFase LONG,
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
	preguntaId LONG
);

create table ResultadoEvaluacion (
	resultadoEvaluacionId LONG not null primary key,
	respuestaSelccionada LONG,
	habilidadCumplida BOOLEAN,
	evaluacionId LONG,
	usuarioHitssId LONG
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
	usuarioLider LONG,
	lider BOOLEAN,
	activo BOOLEAN,
	usuariocrea LONG,
	fechacrea DATE null,
	usuariomodifica LONG,
	fechacreamodifica DATE null
);

create table UsuarioRequisito (
	userId LONG not null,
	requisitoId LONG not null,
	cumplerequisito BOOLEAN,
	primary key (userId, requisitoId)
);

create table rec_SolicitudRequerimientoFuncion (
	funcionId LONG not null,
	solicitudRequerimientoId LONG not null,
	primary key (funcionId, solicitudRequerimientoId)
);