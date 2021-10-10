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
└──[emloyee]
|  └──[src]    
│     └──[main]      
│        └──[java]      
│        └──[resources]
│           │  application.properties #contains springboot cofigurations
└──[webui]
   │  package.json     
   │  angular-cli.json   #ng build configurations
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
  
```bash
docker-compose up -d
```
## DB (postgresql)
Creation of database schema and data are done using sql scripts that Springs runs automatically in the build project. To modify the database schema or the data you can modify schema.sql and data.sql which can be found at `/db_data`

## Spring security
The security is implemented using JWT tokens. The tokens are generated using Spring Security and JWT. The tokens are generated using the `/auth/login` endpoint. The tokens are used to authenticate the user and the user is then granted access to the protected resources.

Additional is disabled Cors to allow cross-origin requests, it is necesary to allow the frontend to access the backend. if needed change WebSecurityConfig.java file to enable Cors.

By default ports for backend an database are exposed on the host machine. If you are running with mayor security permissions you can change the ports to use the ports that are exposed in docker-compose.yml file.

### Build Frontend (optional step)
Code for frontend is buil in firts execute of docker container. However if you modified the frontend code and want your changes to get reflected then you must build the frontend 
```bash
# Navigate to PROJECT_FOLDER/docker-compose.yml
docker-compose down && docker-compose up -d
```
### Accessing Application
Cpmponent         | URL                                      | Credentials
---               | ---                                      | ---
Frontend          |  http://hostip:8080                      | `admin/admin`, `user/user`
Swagger (API Ref) |  http://hostip:8080/swagger-ui.html      | 
Swagger Spec      |  http://hostip:8080//v2/api-docs         |

### Screenshots
#### Frontend
![Frontend](/images/frontend.png?raw=true)
---
#### Login
![Login](/images/login.png?raw=true)
---
#### Dashboard - firts page
![Dashboard](/images/dashboard.png?raw=true)
---
#### Employee list
![EmployeeList](/images/employee_list.png?raw=true)
---
#### Employee Details
![EmployeeDetails](/images/employee-detail.png?raw=true)
---
#### API Docs - Swagger
![ApiDocs](/images/backend.png?raw=true)
---
#### Database Schema
![ER-Diagram](/images/db_schema.png?raw=true)