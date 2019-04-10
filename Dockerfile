#NOT necessary anymore
FROM dsilahcilar/centos7-jdk8
COPY target/*.jar /opt
CMD java -jar /opt/*jar