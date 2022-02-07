Test assignment solution.


Environment:</br>

Operating system - Ubuntu 20.04 </br>
Java version - openjdk 11.0.13 </br>
Build tool - Gradle 7.3.3


To build the project:</br>
$ cd premiums </br>
$ gradle build


To run the project:</br>
$ graddle wrapper</br>
$ ./gradlew run

To run the tests:</br>
$ gradle test

Test results are available at ./build/reports/tests/test/index.html


Implementation description:

The following classes have been created to model the policy - Policy, PolicyObject and PolicySubObject. Policy depends on an ArrayList of PolicyObject objects. PolicyObject depends on ArrayList of PolicySubObject objects.
PremiumCalculator class contains premium calculation logic.
