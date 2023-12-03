Web
mvn clean test -Dgroups=web -Dselenide.browser=chrome && allure serve ./target/allure-results
    DemoQATest
    mvn clean test -Dgroups=demoqa -Dselenide.browser=chrome
Remote
mvn clean test -Dgroups=web -Dselenide.remote=http://localhost:4444/wd/hub -Dselenide.browser=chrome && allure serve ./target/allure-results
mvn clean test -Dgroups=web -Dselenide.browser=com.teoke.provider.web.WebRecordVideoLocalProvider && allure serve ./target/allure-results
Mobile
Run app Mydemo : mvn clean test -Dgroups=mobile -Dselenide.browser=com.teoke.provider.mobile.ApiDemosDemoAndroidProvider
Run app APIdemo : mvn clean test -Dgroups=mobile -Dselenide.browser=com.teoke.provider.mobile.ApiDemosDemoAndroidProvider

Generate report
allure serve ./target/allure-results

#docker stop and remove all : for /f %i in ('docker ps -q') do docker stop %i & docker rm %i
