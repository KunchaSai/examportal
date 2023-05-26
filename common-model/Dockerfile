FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} common-model
ENTRYPOINT ["sh", "-c", "java ${JAVA_OPTS} -jar /common-model.jar"]

