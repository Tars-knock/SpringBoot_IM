# 该镜像需要依赖的基础镜像
FROM openjdk:18-ea-15-oraclelinux7
# 声明一个Dockerfile中的变量，必须在from后声明
ARG ARTIFICIAL_NAME=helloBoot-0.0.1-SNAPSHOT.jar
# 将当前目录下的jar包复制到docker容器的/目录下
COPY ./target/helloBoot-0.0.1-SNAPSHOT.jar /helloBoot-0.0.1-SNAPSHOT.jar
# 运行过程中创建一个mall-tiny-docker-file.jar文件
RUN bash -c 'touch /helloBoot-0.0.1-SNAPSHOT.jar'
# 声明服务运行在6060端口
EXPOSE 8080 6061
# 声明容器中的挂载点
#VOLUME /helloBoot-0.0.1-SNAPSHOT.jar
# 指定docker容器启动时运行jar包
ENTRYPOINT ["java","-jar","-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=6061","-Dspring.profiles.active=sit","/helloBoot-0.0.1-SNAPSHOT.jar"]
# 指定维护者的名字
MAINTAINER Tars