@echo off
cd ../
call mvn clean package -Dmaven.test.skip=true -pl eureka-server -am
@pause