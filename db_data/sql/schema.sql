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
  FOREIGN KEY ("area")    REFERENCES "public"."area"    ("id") ON DELETE NO ACTION ON UPDATE NO ACTION,
  FOREIGN KEY ("subarea") REFERENCES "public"."subarea" ("id") ON DELETE NO ACTION ON UPDATE NO ACTION
);

CREATE TABLE "public"."user" (
    "id"       int4        NOT NULL,
    "username" varchar(15) NOT NULL,
    "password" varchar(15) NOT NULL,
    "salt"     varchar(15) NOT NULL,
    UNIQUE ("username"),
    PRIMARY KEY ("username")
);
