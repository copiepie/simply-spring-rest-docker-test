FROM --platform=\$BUILDPLATFORM adoptopenjdk/openjdk11 as builder
ARG PKG_USERNAME
ARG PKG_PASSWORD
WORKDIR /tmp/app
ADD . ./
RUN ./gradlew bootJar -PghUser=$PKG_USERNAME -PghPass=$PKG_PASSWORD

FROM --platform=\$BUILDPLATFORM adoptopenjdk/openjdk11 as exec
EXPOSE 8080
WORKDIR /opt/app
COPY --from=builder /tmp/app/build/libs/app.jar ./
CMD ["java", "-jar", "app.jar"]
