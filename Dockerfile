FROM eclipse-temurin:17
COPY target/vk.jar vk.jar
CMD [ "java", "-jar", "vk.jar" ]
