FROM openjdk:11 AS build
WORKDIR               /opt/project
COPY .mvn             /opt/project/.mvn
COPY src              /opt/project/src
COPY pom.xml          /opt/project/
COPY mvnw             /opt/project/mvnw
RUN ./mvnw clean package

FROM openjdk:11
COPY --from=build /opt/project/target/*.jar book-service.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","/book-service.jar"]