FROM teoke/one
WORKDIR /home/One
COPY pom.xml .
COPY src .
RUN mvn -e -f /home/One/pom.xml clean test -DskipTests=true