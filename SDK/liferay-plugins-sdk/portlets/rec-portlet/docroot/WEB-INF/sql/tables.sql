create table AVANCE_ESTADO_SOLICITUD_RECLUTAMIENTO (
	AESR_ID LONG not null primary key,
	AESR_ESTADO VARCHAR(75) null,
	AESR_ACTIVO VARCHAR(75) null,
	AESR_USUARIO_CREA LONG,
	AESR_FECHA_CREA DATE null,
	AESR_USUARIO_MODIFICA LONG,
	AESR_FECHA_MODIFICA DATE null
);

create table CONTRATO (
	CT_ID LONG not null primary key,
	CT_ESTADO VARCHAR(75) null,
	CT_ACTIVO VARCHAR(75) null,
	CT_USUARIO_CREA LONG,
	CT_FECHA_CREA DATE null,
	CT_USUARIO_MODIFICA LONG,
	CT_FECHA_MODIFICA DATE null
);

create table CURRICULUM_VITAE (
	CV_ID LONG not null primary key,
	CV_ESTADO VARCHAR(75) null,
	CV_ACTIVO VARCHAR(75) null,
	CV_USUARIO_CREA LONG,
	CV_FECHA_CREA DATE null,
	CV_USUARIO_MODIFICA LONG,
	CV_FECHA_MODIFICA DATE null
);

create table EVALUACION_RECLUTAMIENTO (
	ER_ID LONG not null primary key,
	ER_ESTADO VARCHAR(75) null,
	ER_ACTIVO VARCHAR(75) null,
	ER_USUARIO_CREA LONG,
	ER_FECHA_CREA DATE null,
	ER_USUARIO_MODIFICA LONG,
	ER_FECHA_MODIFICA DATE null
);

create table FICHA_INGRESO (
	FI_ID LONG not null primary key,
	FI_ESTADO VARCHAR(75) null,
	FI_ACTIVO VARCHAR(75) null,
	FI_USUARIO_CREA LONG,
	FI_FECHA_CREA DATE null,
	FI_USUARIO_MODIFICA LONG,
	FI_FECHA_MODIFICA DATE null
);

create table NUEVE_CUADRANTES (
	NC_ID LONG not null primary key,
	REQ_ESTADO VARCHAR(75) null,
	REQ_ACTIVO VARCHAR(75) null,
	SR_USUARIO_CREA LONG,
	SR_FECHA_CREA DATE null,
	SR_USUARIO_MODIFICA LONG,
	SR_FECHA_MODIFICA DATE null
);

create table PUESTOS_LABORALES (
	PL_ID LONG not null primary key,
	PL_PUESTO VARCHAR(75) null,
	PL_ESTADO VARCHAR(75) null,
	PL_ACTIVO VARCHAR(75) null,
	PL_USUARIO_CREA LONG,
	PL_FECHA_CREA DATE null,
	PL_USUARIO_MODIFICA LONG,
	PL_FECHA_MODIFICA DATE null
);

create table REQUERIMIENTO_PERSONAL (
	REQ_ID LONG not null primary key,
	REQ_ESTADO VARCHAR(75) null,
	REQ_ACTIVO VARCHAR(75) null,
	REQ_USUARIO_CREA LONG,
	REQ_FECHA_CREA DATE null,
	REQ_USUARIO_MODIFICA LONG,
	REQ_FECHA_MODIFICA DATE null
);

create table SOLICITUD_RECLUTAMIENTO (
	SR_ID LONG not null primary key,
	SR_PL_ID VARCHAR(75) null,
	SR_ESTADO LONG,
	SR_ACTIVO VARCHAR(75) null,
	SR_USUARIO_CREA LONG,
	SR_FECHA_CREA DATE null,
	SR_USUARIO_MODIFICA LONG,
	SR_FECHA_MODIFICA DATE null
);

create table cartilla_reclutamiento (
	CR_ID LONG not null primary key,
	CR_ESTADO VARCHAR(75) null,
	CR_ACTIVO VARCHAR(75) null,
	CR_USUARIO_CREA LONG,
	CR_FECHA_CREA DATE null,
	CR_USUARIO_MODIFICA LONG,
	CR_FECHA_MODIFICA DATE null
);

create table rec_Foo (
	fooId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	field1 VARCHAR(75) null,
	field2 BOOLEAN,
	field3 INTEGER,
	field4 DATE null,
	field5 VARCHAR(75) null
);

create table rec_foo (
	fooId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	field1 VARCHAR(75) null,
	field2 BOOLEAN,
	field3 INTEGER,
	field4 DATE null,
	field5 VARCHAR(75) null
);