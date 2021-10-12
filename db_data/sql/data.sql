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
** script to insert data into typenui table
** ----------------------------------------------------------------------------
*/
INSERT INTO "typenui" ("id_typenui", "typenui") VALUES (1, 'Cedula');
INSERT INTO "typenui" ("id_typenui", "typenui") VALUES (2, 'T. Identidad');
INSERT INTO "typenui" ("id_typenui", "typenui") VALUES (3, 'Pasaporte');
INSERT INTO "typenui" ("id_typenui", "typenui") VALUES (4, 'Cedula de Extranjeria');

/*
** ----------------------------------------------------------------------------
** script to insert data into rol table 
** ----------------------------------------------------------------------------
*/
INSERT INTO "rol" VALUES(1, 'ROLE_ADMIN');
INSERT INTO "rol" VALUES(2, 'ROLE_USER');

/*
** ----------------------------------------------------------------------------
** script to insert data into employees table 
** ----------------------------------------------------------------------------
*/
INSERT INTO "employees" VALUES (198, 1, 'Donald', 'OConnell', 10);
INSERT INTO "employees" VALUES (199, 1, 'Douglas', 'Grant', 10);
INSERT INTO "employees" VALUES (200, 1, 'Jennifer', 'Whalen', 11);
INSERT INTO "employees" VALUES (201, 1, 'Michael', 'Hartstein', 11);
INSERT INTO "employees" VALUES (202, 1, 'Pat', 'Fay', 12);
INSERT INTO "employees" VALUES (203, 1, 'Susan', 'Mavris', 12);
INSERT INTO "employees" VALUES (204, 1, 'Hermann', 'Baer', 20);
INSERT INTO "employees" VALUES (205, 1, 'Shelley', 'Higgins', 20);
INSERT INTO "employees" VALUES (206, 1, 'William', 'Gietz', 21);
INSERT INTO "employees" VALUES (100, 1, 'Steven', 'King', 21);
INSERT INTO "employees" VALUES (101, 1, 'Neena', 'Kochhar', 22);
INSERT INTO "employees" VALUES (102, 2, 'Lex', 'De Haan', 22);
INSERT INTO "employees" VALUES (103, 2, 'Alexander', 'Hunold', 23);
INSERT INTO "employees" VALUES (104, 2, 'Bruce', 'Ernest', 23);
INSERT INTO "employees" VALUES (105, 2, 'David', 'Austin', 30);
INSERT INTO "employees" VALUES (106, 2, 'Valli', 'Pataballa', 30);
INSERT INTO "employees" VALUES (107, 2, 'Diana', 'Lorentz', 31);
INSERT INTO "employees" VALUES (108, 2, 'Nancy', 'Greenberg', 31);
INSERT INTO "employees" VALUES (109, 2, 'Daniel', 'Faviet', 32);
INSERT INTO "employees" VALUES (110, 2, 'John', 'Chen', 32);
INSERT INTO "employees" VALUES (111, 2, 'Ismael', 'Sciarra', 40);
INSERT INTO "employees" VALUES (112, 2, 'Jose Manuel', 'Urman', 40);
INSERT INTO "employees" VALUES (113, 3, 'Luis', 'Popp', 41);
INSERT INTO "employees" VALUES (114, 3, 'Den', 'Raphaely', 41);
INSERT INTO "employees" VALUES (115, 3, 'Alexander', 'Khoo', 42);
INSERT INTO "employees" VALUES (116, 3, 'Shelli', 'Baida', 42);
INSERT INTO "employees" VALUES (117, 3, 'Sigal', 'Tobias', 10);
INSERT INTO "employees" VALUES (118, 3, 'Guy', 'Himuro', 10);
INSERT INTO "employees" VALUES (119, 3, 'Karen', 'Colmenares', 11);
INSERT INTO "employees" VALUES (120, 3, 'Matthew', 'Weiss', 11);
INSERT INTO "employees" VALUES (121, 3, 'Adam', 'Fripp', 12);
INSERT INTO "employees" VALUES (122, 1, 'Payam', 'Kaufling', 12);
INSERT INTO "employees" VALUES (123, 1, 'Shanta', 'Vollman', 20);
INSERT INTO "employees" VALUES (124, 1, 'Kevin', 'Mourgos', 20);
INSERT INTO "employees" VALUES (125, 1, 'Julia', 'Nayer', 21);
INSERT INTO "employees" VALUES (126, 1, 'Irene', 'Mikkilineni', 21);
INSERT INTO "employees" VALUES (127, 1, 'James', 'Landry', 22);
INSERT INTO "employees" VALUES (128, 1, 'Steven', 'Markle', 22);
INSERT INTO "employees" VALUES (129, 1, 'Laura', 'Bissot', 23);
INSERT INTO "employees" VALUES (130, 1, 'Mozhe', 'Atkinson', 23);
INSERT INTO "employees" VALUES (131, 1, 'James', 'Marlow', 30);
INSERT INTO "employees" VALUES (132, 1, 'TJ', 'Olson', 30);
INSERT INTO "employees" VALUES (133, 2, 'Jason', 'Mallin', 31);
INSERT INTO "employees" VALUES (134, 2, 'Michael', 'Rogers', 31);
INSERT INTO "employees" VALUES (135, 2, 'Ki', 'Gee', 32);
INSERT INTO "employees" VALUES (136, 2, 'Hazel', 'Philtanker', 32);
INSERT INTO "employees" VALUES (137, 2, 'Renske', 'Ladwig', 40);
INSERT INTO "employees" VALUES (138, 2, 'Stephen', 'Stiles', 40);
INSERT INTO "employees" VALUES (139, 2, 'John', 'Seo', 41);
INSERT INTO "employees" VALUES (140, 2, 'Joshua', 'Patel', 41);

/*
** ----------------------------------------------------------------------------
** script to insert data into usuario and rol table 
** ----------------------------------------------------------------------------
*/

INSERT INTO "public"."usuario" ("id", "username", "password") VALUES (1, 'admin', '$2a$10$Xmj9waUUSVkYxQgQjBaCHuJZzom1W6pCAT2qfCv6ursCYVtY3.SQW');
INSERT INTO "public"."usuario" ("id", "username", "password") VALUES (2, 'user', '$2a$10$3SlZwRr1dVSwdF5yEiCE1OZX2hxSdfNnednoqdIIdndy7B1qbyVb.');
INSERT INTO "public"."usuario_rol" ("usuario_id", "rol_id") VALUES (1, 1);
INSERT INTO "public"."usuario_rol" ("usuario_id", "rol_id") VALUES (1, 2);
INSERT INTO "public"."usuario_rol" ("usuario_id", "rol_id") VALUES (2, 2);


/*
** ----------------------------------------------------------------------------
** script to change owner of all tables of scheme
** ----------------------------------------------------------------------------
*/
ALTER TABLE "public"."deparment" OWNER TO "employe";
ALTER TABLE "public"."employees"  OWNER TO "employe";
ALTER TABLE "public"."dependent"  OWNER TO "employe";
ALTER TABLE "public"."user"  OWNER TO "employe";