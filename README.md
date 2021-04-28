# Course Pricing Service

### Running Instructions From command line:

1. cd $PROJECT_HOME
2. Build the project using pom.xml - > mvn clean install
3. Run the application -> java -jar target/CoursePricing-0.0.1-SNAPSHOT.jar

### Testing Instructions:

curl --location --request GET 'http://localhost:8080/course/1/price?currency=USD&location=BGL'

### Output:

![image](https://user-images.githubusercontent.com/6975882/116449965-5fb26200-a878-11eb-86f5-0283374d1136.png)

### Seed data is inserted into H2 database on application start up:

![image](https://user-images.githubusercontent.com/6975882/116446708-d8afba80-a874-11eb-8f0d-0ea3cff3fb34.png)

![image](https://user-images.githubusercontent.com/6975882/116446801-f2e99880-a874-11eb-991d-2bcc091d691c.png)

### Implementation Details:
* The application is developed using Spring Boot with H2 in-memory database.
* I have considered Tax, currency conversion charges of courses.
* A new type of charge can be created by extending Charge class and adding a charge record for that course.

### Technical Debt:
* Course-Charge tables schema can be further normalized.
* City level tax, currency conversion charge percentages are currently stored as static map. This can be moved to .properties file.
* Unit test cases not written.
* Error handling and validation constraints/checks.
