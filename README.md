# CMC_Examen
Prueba CMC


##Create Database in PostgreSQL

`CREATE DATABASE cmc_database
WITH
OWNER = postgres
ENCODING = 'UTF8'
TABLESPACE = pg_default
CONNECTION LIMIT = -1;`

`COMMENT ON DATABASE cmc_database IS 'database cmc test';`

`ALTER ROLE cmc_apl IN DATABASE cmc_database SET role TO 'cmc_apl';`

##Create Table Usuario

`CREATE TABLE public.usuario
(
id integer NOT NULL DEFAULT nextval('usuario_id_seq'::regclass),
nombre character varying COLLATE pg_catalog."default" NOT NULL,
contrasena character varying COLLATE pg_catalog."default" NOT NULL,
CONSTRAINT usuario_pkey PRIMARY KEY (id)
)`

`TABLESPACE pg_default;`

`ALTER TABLE public.usuario OWNER to postgres;`