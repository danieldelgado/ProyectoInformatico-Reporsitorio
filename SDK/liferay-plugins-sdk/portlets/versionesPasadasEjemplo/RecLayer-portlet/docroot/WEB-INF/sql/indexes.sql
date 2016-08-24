create index IX_AC085D73 on Funcion (descripcion);

create index IX_24B38389 on Puesto (descripcion);

create index IX_BF01054 on Requisito (descripcion);

create index IX_96963AE1 on SolicitudRequerimiento (estado);
create index IX_DA6406D6 on SolicitudRequerimiento (puestoId, responsableRRHH, tiempoContrato, fechacrea, fechacrea);
create index IX_48953397 on SolicitudRequerimiento (solicitudRequerimientoId);

create index IX_5495C78E on Usuario (userId);

create index IX_13820ED5 on rec_SolicitudRequerimientoFuncion (funcionId);
create index IX_B967CB2A on rec_SolicitudRequerimientoFuncion (solicitudRequerimientoId);