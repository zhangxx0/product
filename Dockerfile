FROM hub.c.163.com/library/java:8-alpine

MAINTAINER xinxin 377241804@qq.com

ADD server1/target/*.jar app.jar

EXPOSE 8082

ENTRYPOINT ["java", "-jar", "/app.jar"]