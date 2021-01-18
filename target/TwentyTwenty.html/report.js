$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("TwentyTwenty.feature");
formatter.feature({
  "line": 1,
  "name": "login check for osa",
  "description": "",
  "id": "login-check-for-osa",
  "keyword": "Feature"
});
formatter.scenario({
  "comments": [
    {
      "line": 2,
      "value": "#Background: Given Entering the osa url \"https://osaconsultingtech.com/\""
    },
    {
      "line": 3,
      "value": "#           And Clicking on forum button"
    }
  ],
  "line": 5,
  "name": "As a student of OSA login practice with username and password",
  "description": "",
  "id": "login-check-for-osa;as-a-student-of-osa-login-practice-with-username-and-password",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@ExampleValid"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Entering the osa url \"https://osaconsultingtech.com/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Clicking on forum button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I Enter the email \"jjjjg\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I Enter the password \"jgjgjgjgjg\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click on LoginButton",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I am on the OSA Student page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I verify the Student page Title",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "https://osaconsultingtech.com/",
      "offset": 22
    }
  ],
  "location": "TwentyTwentySteps.entering_the_osa_url(String)"
});
formatter.result({
  "duration": 23288439200,
  "status": "passed"
});
formatter.match({
  "location": "TwentyTwentySteps.clicking_on_forum_button()"
});
formatter.result({
  "duration": 4993682800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "jjjjg",
      "offset": 19
    }
  ],
  "location": "TwentyTwentySteps.i_Enter_the_email(String)"
});
formatter.result({
  "duration": 202803100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "jgjgjgjgjg",
      "offset": 22
    }
  ],
  "location": "TwentyTwentySteps.i_Enter_the_password(String)"
});
formatter.result({
  "duration": 76969600,
  "status": "passed"
});
formatter.match({
  "location": "TwentyTwentySteps.i_click_on_LoginButton()"
});
formatter.result({
  "duration": 6810592500,
  "error_message": "org.openqa.selenium.NoSuchElementException: Cannot locate an element using xpath\u003d//div[@class\u003d\"printName\"]//label\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027MAHFUZ\u0027, ip: \u0027192.168.1.9\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002714.0.1\u0027\nDriver info: driver.version: RemoteWebDriver\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:327)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat com.utility.Utility.verifyPages(Utility.java:38)\r\n\tat com.osa.pages.ForumLoginPage.clickLoginButton(ForumLoginPage.java:57)\r\n\tat com.osa.steps.TwentyTwentySteps.i_click_on_LoginButton(TwentyTwentySteps.java:48)\r\n\tat ✽.When I click on LoginButton(TwentyTwenty.feature:10)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "TwentyTwentySteps.i_am_on_the_OSA_Student_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TwentyTwentySteps.i_verify_the_Student_page_Title()"
});
formatter.result({
  "status": "skipped"
});
});