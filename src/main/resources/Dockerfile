FROM openjdk:11-ea-jdk-slim as builder
WORKDIR /tmp/app
ADD . ./
RUN ./gradlew bootJar

FROM --platform=\$BUILDPLATFORM openjdk:11-ea-jdk-slim as exec
EXPOSE 8080
WORKDIR /opt/app
COPY --from=builder /tmp/app/build/libs/app.jar ./
CMD ["java", "-jar", "app.jar"]
