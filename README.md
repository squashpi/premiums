Test assignment solution.


Environment:

Operating system - Ubuntu 20.04
Java version - openjdk 11.0.13
Build tool - Gradle 7.3.3


To build the project:
> cd premiums
> gradle build


To run the project:
> graddle wrapper
> ./gradlew run

To run the tests:
> gradle test

Test results are available at ./build/reports/tests/test/index.html


Implementation description:

The following classes have been created to model the policy - Policy, PolicyObject and PolicySubObject. Policy depends on an ArrayList of PolicyObject objects. PolicyObject depends on ArrayList of PolicySubObject objects.
PremiumCalculator class contains premium calculation logic.