Web
mvn clean test -Dgroups=web -Dselenide.browser=chrome
    DemoQATest
    mvn clean test -Dgroups=demoqa -Dselenide.browser=chrome
Remote
mvn clean test -Dgroups=web -Dselenide.remote=http://localhost:4444/wd/hub -Dselenide.browser=chrome
Mobile
Run app Mydemo : mvn clean test -Dgroups=mobile -Dselenide.browser=com.tmb.provider.mobile.local.ApiDemosDemoAndroidProvider
Run app APIdemo : mvn clean test -Dgroups=mobile -Dselenide.browser=com.teoke.provider.mobile.ApiDemosDemoAndroidProvider

Generate report
allure serve ./target/allure-results
