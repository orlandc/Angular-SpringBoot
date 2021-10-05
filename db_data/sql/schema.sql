CREATE TABLE "public"."area" (
  "id"        int4        NOT NULL,
  "nombre"    varchar(15) NOT NULL,
  PRIMARY KEY ("id"),
  UNIQUE ("id")
);

CREATE TABLE "public"."subarea" (
  "id"        int4        NOT NULL,
  "nombre"    varchar(15) NOT NULL,
  "deparment" int4        NOT NULL,
  PRIMARY KEY ("id"),
  FOREIGN KEY ("deparment") REFERENCES "public"."area" ("id") ON DELETE NO ACTION ON UPDATE NO ACTION
);

CREATE TABLE "public"."employees" (
  "nui"       int4        NOT NULL,
  "typenui"   int4        NOT NULL,
  "nombres"   varchar(15) NOT NULL,
  "apellidos" varchar(15) NOT NULL,
  "area"      int4,
  "subarea"   int4,
  PRIMARY KEY ("nui"),
  CONSTRAINT fk_area    FOREIGN KEY ("area")    REFERENCES "public"."area"    ("id") ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT fk_subarea FOREIGN KEY ("subarea") REFERENCES "public"."subarea" ("id") ON DELETE NO ACTION ON UPDATE NO ACTION
);

CREATE SEQUENCE "user_id_seq";

CREATE TABLE "public"."usuario" (
    "id"       int4        NOT NULL DEFAULT nextval('user_id_seq'),
    "username" varchar(15) NOT NULL,
    "password" varchar(255) NOT NULL,
    UNIQUE ("username"),
    PRIMARY KEY ("id")
);

CREATE TABLE "public"."rol" (
    "id"         int4        NOT NULL,
    "rol_nombre" varchar(15) NOT NULL,
    UNIQUE ("rol_nombre"),
    PRIMARY KEY ("id")
);

CREATE TABLE "public"."usuario_rol" (
    "usuario_id" int4  NOT NULL,
    "rol_id"     int4  NOT NULL,
    PRIMARY KEY ("usuario_id", "rol_id"),
    CONSTRAINT fk_usuario FOREIGN KEY("usuario_id") REFERENCES "public"."usuario" ("id") ON DELETE NO ACTION ON UPDATE NO ACTION,
    CONSTRAINT fk_rol     FOREIGN KEY("rol_id")     REFERENCES "public"."rol" ("id")     ON DELETE NO ACTION ON UPDATE NO ACTION
);