Libraries Used:
Selenide + Rest Assured + Junit5 + Allure for Web, Mobile,and Api Automation

One single framework to automate web, mobile and api.

Preferred Java Version : JDK-11

Libraries Used:

Selenide for web and mobile automation
Rest Assured for Api automation
Junit5 as testing framework
Allure for reporting
Owner for properties file management
Lombok to avoid boilerplates
PODAM for test data generation
Java Faker for random data
AssertJ for fluent assertion of Api











Web
mvn clean test -Dgroups=web -Dselenide.browser=chrome && allure serve ./target/allure-results
    DemoQATest
    mvn clean test -Dgroups=demoqa -Dselenide.browser=chrome
Remote
mvn clean test -Dgroups=web -Dselenide.remote=http://localhost:4444/wd/hub -Dselenide.browser=chrome && allure serve ./target/allure-results
mvn clean test -Dgroups=web -Dselenide.browser=com.teoke.provider.web.WebRecordVideoLocalProvider && allure serve ./target/allure-results
Mobile
Run app Mydemo : mvn clean test -Dgroups=mobile -Dselenide.browser=com.teoke.provider.mobile.MyDemoAppAndroidProvider && allure serve ./target/allure-results
    Run app APIdemo : mvn clean test -Dgroups=mobile -Dselenide.browser=com.teoke.provider.mobile.ApiDemoAndroidProvider && allure serve ./target/allure-results

Generate report
allure serve ./target/allure-results

#docker stop and remove all : for /f %i in ('docker ps -q') do docker stop %i & docker rm %i
