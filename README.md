## Angular Frontent with SpringBoot (Java) Backend
The objective of this exercise is to allow a reflection on the chosen solutions and debate during the technical interview. The construction of this application is used to demonstrate technical skill in the development of a service-oriented RESTfull application.

### Technology Stack
Component         | Technology
---               | ---
Frontend          | [Angular 5](https://github.com/angular/angular)
Backend (REST)    | [SpringBoot](https://projects.spring.io/spring-boot) (Java)
Security          | Token Based (Spring Security and [JWT](https://github.com/auth0/java-jwt) )
REST Documentation| [Swagger UI](https://github.com/springfox/springfox)
REST Spec         | [Open API Standard](https://www.openapis.org/) 
Database          | Postgresql
Persistence       | JPA (Using Spring Data)
Server Build Tools| Maven(Java)

## Folder Structure
```bash
PROJECT_FOLDER
│  README.md
│  pom.xml
└──[db_data]
│     │  schema.sql  # Contains DB Script to create tables that executes during the App 
│     │  data.sql    # Contains DB Script to Insert data that executes during the App 
└──[src]      
│  └──[main]      
│     └──[java]      
│     └──[resources]
│        │  application.properties #contains springboot cofigurations
└──[webui]
   │  package.json     
   │  angular-cli.json   #ng build configurations)
   └──[node_modules]
   └──[src]              #frontend source files
   └──[dist]             #frontend build files, auto-created after running angular build: ng -build
```

## Prerequisites
Ensure you have this installed before proceeding further
- Java 11
- Maven 3.8.2
- Node 16.10.0
- npm 7.24.0,   
- Angular-cli 12.2.8
- Docker 20.20.7
- Docker Compose 1.21.2
Note: this requeriments are implemented in docker files to deploy the application.

## About
This is an RESTfull implementation of an employee magnagement app.
The goal of the project is to 
- Highlight techniques of making and securing a REST full app using SpringBoot
- How to consume an RESTfull service and make an HTML5 based Single Page App using Angular

### Features of the Project
* Backend
  * Token Based Security (using Spring security)
  * API documentation and Live Try-out links with Swagger 
  * Posgresql database
  * Using JPA template to talk to relational database
  * How to request and respond for paginated data 

* Frontend
  * Organizing Components, Services, Directives, Pages etc in an Angular App
  * Techniques to Lazy load Data (Infinite Scroll)
  * Techniques to load large data set in a data-table but still keeping DOM footprint less
  * Routing and guarding pages that needs authentication
  * Basic visulaization

* Build
  * How to build all in one app that includes (database, sample data, RESTfull API, Auto generated API Docs, frontend and security)
  * Deploy with dockers, and docker-compose.