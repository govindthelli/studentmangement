#stage-1

FROM maven:latest AS builder

WORKDIR /app

COPY pom.xml ./

RUN mvn dependency:go-offline -B

COPY . .

RUN mvn clean package -Dskiptests

#stage 2

FROM tomcat:9.0

COPY --from=builder /app/target/*.war /usr/local/tomcat/webapps/ROOT.war

CMD ["catalina.sh", "run"]


