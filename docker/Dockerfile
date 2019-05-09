#基础镜像
FROM lwieske/java-8:latest

#维护者
MAINTAINER Jaswine<jaswine@163.com>


#卷
VOLUME  /usr/soft

#拷贝
COPY cloud-eureka-1.0.jar cloud-eureka-1.0.jar

EXPOSE 8761


ENTRYPOINT ["java","-jar" ,"cloud-eureka-1.0.jar"]

