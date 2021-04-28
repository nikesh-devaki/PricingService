# Pricing Service

### Running Instructions From command line:

1. cd $PROJECT_HOME
2. Build the project using pom.xml - > mvn clean install
3. Run the application -> java -jar target/CoursePricing-0.0.1-SNAPSHOT.jar

### Testing Instructions:

curl --location --request GET 'http://localhost:8080/course/1/price?currency=USD&location=BGL'

### Seed data is inserted into H2 database on application start up:

![image](https://user-images.githubusercontent.com/6975882/116446708-d8afba80-a874-11eb-8f0d-0ea3cff3fb34.png)

![image](https://user-images.githubusercontent.com/6975882/116446801-f2e99880-a874-11eb-991d-2bcc091d691c.png)

### Implementation Details:
