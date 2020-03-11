# ConnectedCityRoads

Program to find the connected cities.

## Getting Started

Please checkout the project into STS (IDE). 

### Prerequisites

Maven 3.0+ is your build tool
Your favorite IDE. I used STS.
JDK 1.8+


### Installing building and deploying

Download the file from
https://github.com/rinkisingh2019/ConnectedCityRoads.git
go to STS
import - Existing MAven project
give the downloaded path.
You will see pom.xml came up in the selection. Plese select that.
Do next and finish. It will create a project in your local.
Go to SpringbootCityConnectedRoadServiceApplication - >right click - >Run As -> Spring Boot App
You will see the following on the console 
Tomcat started on port(s): 8080 (http) with context path ''
2020-03-11 09:45:36.776  INFO 7156 --- [  restartedMain] gbootCityConnectedRoadServiceApplication : Started SpringbootCityConnectedRoadServiceApplication in 1.283 seconds (JVM running for 1.753)

Go to the chrome browser - Hit the folowing URL. You should see the following responses.

http://localhost:8080/connected?origin=Boston&destination=Newark 
yes 
http://localhost:8080/connected?origin=Boston&destination=Philadelphia 
yes 
http://localhost:8080/connected?origin=Philadelphia&destination=Albany 
no



## Running the tests

To Run the test.
Go to ConnectedCityRoads-master/src/test/java/com/springboot/city/connected/road/springbootcityconnectedroadservice/IsCityConnectedTest.java
Right click on IsCityConnectedTest.java -> Run As -> Junit Test - You see all tests passed in green.


### Break down into end to end tests

There are three tests written 
Tring to test if Boston and NewYork is connected.
 Test 1:
 assertEquals("Yes", service.isCitiesConnected("Boston", "NewYork"));
 Test 2:
 assertEquals("Yes", service.isCitiesConnected("Boston", "Philadelphia"));
 Test 3:
 assertEquals("No", service.isCitiesConnected("Philadelphia", "Albany"));





## Contributing


## Versioning

Please use the master branch

## Authors

Rinki Singh
