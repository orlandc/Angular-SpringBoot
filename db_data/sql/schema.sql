CREATE TABLE "public"."area" (
  "id_area"   int4        NOT NULL,
  "nombre"    varchar(15) NOT NULL,
  CONSTRAINT pk_area_id PRIMARY KEY ("id_area"),
  UNIQUE ("id_area")
);

CREATE TABLE "public"."subarea" (
  "id_subarea" int4        NOT NULL,
  "nombre"     varchar(15) NOT NULL,
  "area"       int4        NOT NULL,
  CONSTRAINT pk_subarea_id PRIMARY KEY ("id_subarea"),
  FOREIGN KEY ("area") REFERENCES "public"."area" ("id_area") ON DELETE NO ACTION ON UPDATE NO ACTION
);

CREATE TABLE "public"."typenui" (
  "id_typenui" int4         NOT NULL,
  "typenui"    varchar(55)  NOT NULL,
  CONSTRAINT pk_typenui_id PRIMARY KEY ("id_typenui"),
  UNIQUE ("typenui")
);

CREATE TABLE "public"."employees" (
  "nui"       int4        NOT NULL,
  "typenui"   int4        NOT NULL,
  "nombres"   varchar(15) NOT NULL,
  "apellidos" varchar(15) NOT NULL,
  "subarea"   int4,
  CONSTRAINT pk_employee_nui PRIMARY KEY ("nui"),
  CONSTRAINT fk_typenui FOREIGN KEY ("typenui") REFERENCES "public"."typenui" ("id_typenui") ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT fk_subarea FOREIGN KEY ("subarea") REFERENCES "public"."subarea" ("id_subarea") ON DELETE NO ACTION ON UPDATE NO ACTION
);

CREATE SEQUENCE "user_id_seq";

CREATE TABLE "public"."usuario" (
    "id"       int4        NOT NULL DEFAULT nextval('user_id_seq'),
    "username" varchar(15) NOT NULL,
    "password" varchar(255) NOT NULL,
    UNIQUE ("username"),
    CONSTRAINT pk_usuario_id PRIMARY KEY ("id")
);

CREATE TABLE "public"."rol" (
    "id"         int4        NOT NULL,
    "rol_nombre" varchar(15) NOT NULL,
    UNIQUE ("rol_nombre"),
    CONSTRAINT pk_rol_id PRIMARY KEY ("id")
);

CREATE TABLE "public"."usuario_rol" (
    "usuario_id" int4  NOT NULL,
    "rol_id"     int4  NOT NULL,
    CONSTRAINT pk_usuario_rol_id PRIMARY KEY ("usuario_id", "rol_id"),
    CONSTRAINT fk_usuario FOREIGN KEY("usuario_id") REFERENCES "public"."usuario" ("id") ON DELETE NO ACTION ON UPDATE NO ACTION,
    CONSTRAINT fk_rol     FOREIGN KEY("rol_id")     REFERENCES "public"."rol" ("id")     ON DELETE NO ACTION ON UPDATE NO ACTION
);

CREATE OR REPLACE FUNCTION delfunc(id numeric) RETURNS void AS $$
    BEGIN
      DELETE FROM employees
		  WHERE nui = id;
    END;
$$ LANGUAGE plpgsql