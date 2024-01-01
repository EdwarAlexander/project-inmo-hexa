--creacion de tabla cliente
create table cliente(
	id serial primary key,
	nombres varchar(100) not null,
	apellidos varchar(100) not null,
	celular varchar(20),
	correo varchar(50) unique,
	nro_documento varchar(20) unique
);
--documentacion de la tabla cliente
comment on table cliente is 'Tabla que guarda la información del cliente';
comment on column cliente.id is 'Identificador unico de la tabla cliente';
comment on column cliente.nombres is 'Nombre del cliente';
comment on column cliente.apellidos is 'Apellidos del cliente';
comment on column cliente.celular is 'Celular del cliente';
comment on column cliente.correo is 'Correo del cliente';
comment on column cliente.nro_documento is 'Nro de documento del cliente';