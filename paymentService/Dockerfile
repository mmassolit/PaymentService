FROM openjdk:11
WORKDIR /Users/max_slob/git/PaymentService
COPY target/paymentService-0.0.1-SNAPSHOT.jar service.jar
EXPOSE 8086
CMD ["java", "-jar", "service.jar"]