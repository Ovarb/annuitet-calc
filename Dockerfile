# Version: 0.0.1
FROM java:8
MAINTAINER Vsevolod Alexeev <ovarb6@gmail.com>
WORKDIR /home

ADD ./target/annuitet-calc-1.0-SNAPSHOT.jar /home/annuitet-calc-1.0-SNAPSHOT.jar

CMD java -jar annuitet-calc-1.0-SNAPSHOT.jar

