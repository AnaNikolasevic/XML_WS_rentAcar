# Rent a car
Faculty web project for advertising and rental cars. It consists of one monolithic and one microservice application that communicate with each other and maintain the consistency of common data.


<h>Required installation to run application:</h><br>
- Java SDK v1.8<br>
- Maven 3.6.2<br>
- NodeJS v12.16.3<br>
- PostgreSQL v12.0<br>
- VueJS v2.0<br>
- docker desktop<br>

Running application
- First you need to make a copy of this repository with git clone
- Import each service separately as a Maven project
- In the terminal, you need to position yourself in the root directory of each microservice and do the mvnw package command
- In the power shell it is necessary to position yourself in the Microservices directory and do the command docker-compose up --build
- To start the frontend of the agent application in the terminal, type the command npm update, and then npm run serve 

