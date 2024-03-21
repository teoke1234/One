**Selenide + Rest Assured + Junit5 + Allure for Web, Mobile,and Api Automation**

One single framework to automate web, mobile and api.

**Preferred Java Version : JDK-11**

**Libraries Used**:
1. [Selenide for web and mobile automation](https://github.com/selenide/selenide)
2. [Rest Assured for Api automation](https://github.com/rest-assured/rest-assured)
3. [Junit5 as testing framework](https://junit.org/junit5/)
4. [Allure for reporting](https://docs.qameta.io/allure/)
5. [Owner for properties file management](https://github.com/matteobaccan/owner)
6. [Lombok to avoid boilerplates](https://github.com/projectlombok/lombok)
7. [PODAM for test data generation](https://mtedone.github.io/podam/usage.html)
8. [Java Faker for random data](https://github.com/DiUS/java-faker)
9. [AssertJ for fluent assertion of Api](https://assertj.github.io/doc/)


**Sample Web Test**

```java
public class AddEmployeeTest extends WebTestSetup {

    private final LoginDetails loginDetails = LoginTestData.getEmloyeeDetails();
    private final EmployeeDetails employeeDetails = EmployeeTestData.getRamdomEmployeeDetails();

    @WebTest
    void testAddEmployee(){
        LoginPage.getInstance()
                .loginToApplication(loginDetails)
                .navigateToEmployeeInformationPage()
                .addNewEmployee(employeeDetails)
                .checkWhetherEmployeeCreatedSuccessfully();
    }

}

```
**Sample Mobile Test**

```java
public class AddToCartTest extends MobileTestSetup {

    void addToCartTest() {
        HomeScreen homeScreen = screen(HomeScreen.class);

        homeScreen
                .navigateToViewScreen(0)
                .checkWhetherAddToCartButtonIsPresent();

    }
}
```

**Sample Api Test**

```java
public class UserTest extends ApiTestSetUp {

    private final UserDetails userTestData = UserTestData.getUserDetails();

    @ApiTest
    void createUser() {
        Response response = UserApi.createUser(userTestData);

        response.prettyPrint();
        System.out.println(response.jsonPath().getString("name"));
        ResponseAssert.assertThat(response)
                .statusCodeIs(201)
                .canBeDeserializedTo(CreateUserResponse.class)
                .matchingRule(response1 -> response1.jsonPath().getString("job").equalsIgnoreCase(userTestData.getJob()))
                .matchWithSchema("create-user-response-schema.json")
                .assertAll();
    }
}
```

**To run web tests:**

```mvn clean test -Dgroups=web -Dselenide.browser=chrome```
```mvn clean test -Dgroups=web -Dselenide.browser=firefox```

**To run mobile tests:**

Local-Run app Mydemo | ```mvn clean test -Dgroups=mobile -Dselenide.browser=com.teoke.provider.mobile.MyDemoAppAndroidProvider```

Local-Run app APIdemo | ```mvn clean test -Dgroups=mobile -Dselenide.browser=com.teoke.provider.mobile.ApiDemoAndroidProvider```



**To run api tests:**

API     - ```mvn clean test -Dgroups=api```

**To generate allure report after execution**

Install Allure in the machine - ```brew install allure```

Open allure reports - ```allure serve ./target/allure-results```
