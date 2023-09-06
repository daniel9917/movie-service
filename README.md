
# Movie Service: Spring Security + OAuth2.0

This project exposes endpoints under base path
http://localhost:{server.port}/ and under movie paths
http://localhost:{server.port}/movie/ please check MovieController and TestController to see the available methods.

The project uses Spring 6.++ and Spring Boot 3.++, provides implementation for keycloak integration, JWT converter and OAuth Security.



This repository is based on the tutorial provided by "Un programador nace". Please check https://www.youtube.com/watch?v=zR3igUft1KA



## Environment Variables

To run this project, you will need to add the following environment variables to your .env file

`DATASOURCE_URL` : This variable lets the application know the url. Example could be 'jdbc:mysql://localhost:3306/movie-schema'

`DB_USERNAME` : This variable is the user name that jdbc will use to authenticate with the db.

`DB_PASSWORD` : This variable is the password that jdbc will use to authenticate with the db.

`KEYCLOAK_REALM_URL` : This is the realm url that is provided by keycloak, you can find this by access the Keycloak Administration GUI, selecting a realm, clicking settings, endpoints section, click on OpenID Endpoint Configuration and select the value for the "issuer" field in the json.

`CLIENT_ID` : This is the client Id that will be validated against matching the roles. (client Id created in keycloak)













