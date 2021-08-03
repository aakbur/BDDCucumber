$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("TwentyTwenty.feature");
formatter.feature({
  "line": 1,
  "name": "login check for osa",
  "description": "",
  "id": "login-check-for-osa",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "Given Entering the osa url \"https://osaconsultingtech.com/\"",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "Clicking on forum button",
  "keyword": "And "
});
formatter.match({
  "location": "TwentyTwentySteps.clicking_on_forum_button()"
});
formatter.result({
  "duration": 4349769200,
  "error_message": "java.lang.NullPointerException\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy20.click(Unknown Source)\r\n\tat com.osa.pages.HomePage.clickForumButton(HomePage.java:25)\r\n\tat com.osa.steps.TwentyTwentySteps.clicking_on_forum_button(TwentyTwentySteps.java:32)\r\n\tat ✽.And Clicking on forum button(TwentyTwenty.feature:4)\r\n",
  "status": "failed"
});
formatter.scenario({
  "line": 6,
  "name": "As a student of OSA login practice with username and password",
  "description": "",
  "id": "login-check-for-osa;as-a-student-of-osa-login-practice-with-username-and-password",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@ExampleValid"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 7,
      "value": "#Given Entering the osa url \"https://osaconsultingtech.com/\""
    },
    {
      "line": 8,
      "value": "#And Clicking on forum button"
    }
  ],
  "line": 9,
  "name": "I Enter the email \"jjjjg\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I Enter the password \"jgjgjgjgjg\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I click on LoginButton",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I am on the OSA Student page",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "I verify the Student page Title",
  "keyword": "And "
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
  "status": "skipped"
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
  "status": "skipped"
});
formatter.match({
  "location": "TwentyTwentySteps.i_click_on_LoginButton()"
});
formatter.result({
  "status": "skipped"
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