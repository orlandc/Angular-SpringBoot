/*
** ----------------------------------------------------------------------------
** script to insert data into the area table 
** ----------------------------------------------------------------------------
*/
INSERT INTO "area" VALUES(1, 'Gerencia');
INSERT INTO "area" VALUES(2, 'Tecnologia');
INSERT INTO "area" VALUES(3, 'Administracion');
INSERT INTO "area" VALUES(4, 'Operaciones');

/*
** ----------------------------------------------------------------------------
** script to insert data into the subarea table 
** ----------------------------------------------------------------------------
*/

INSERT INTO "subarea" VALUES(10, 'Finanzas', 1);
INSERT INTO "subarea" VALUES(11, 'Contabilidad', 1);
INSERT INTO "subarea" VALUES(12, 'Compras', 1);
INSERT INTO "subarea" VALUES(20, 'Infraestructura', 2);
INSERT INTO "subarea" VALUES(21, 'Desarrollo', 2);
INSERT INTO "subarea" VALUES(22, 'Redes', 2);
INSERT INTO "subarea" VALUES(23, 'CiberSeguridad', 2);
INSERT INTO "subarea" VALUES(30, 'RH', 3);
INSERT INTO "subarea" VALUES(31, 'Mercadeo', 3);
INSERT INTO "subarea" VALUES(32, 'Ventas', 3);
INSERT INTO "subarea" VALUES(40, 'Logistica', 4);
INSERT INTO "subarea" VALUES(41, 'Produccion', 4);
INSERT INTO "subarea" VALUES(42, 'Calidad', 4);


/*
** ----------------------------------------------------------------------------
** script to insert data into rol table 
** ----------------------------------------------------------------------------
*/
INSERT INTO "rol" VALUES(1, 'ROLE_ADMIN');
INSERT INTO "rol" VALUES(2, 'ROLE_USER');

/*
** ----------------------------------------------------------------------------
** script to change owner of all tables of scheme
** ----------------------------------------------------------------------------
*/
ALTER TABLE "public"."deparment" OWNER TO "employe";
ALTER TABLE "public"."employees"  OWNER TO "employe";
ALTER TABLE "public"."dependent"  OWNER TO "employe";
ALTER TABLE "public"."user"  OWNER TO "employe";