FROM openjdk:17
VOLUME /tmp

ADD /home/mohs/.jenkins/workspace/onlineexam/common-model/target/common-model.jar common-model-0.0.1.jar
ENTRYPOINT [ "java","-jar","/common-model-0.0.1.jar" ]

