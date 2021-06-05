$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Page1.feature");
formatter.feature({
  "line": 1,
  "name": "Problem1",
  "description": "",
  "id": "problem1",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4126732000,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Verify Values \u0026 Total balance on the screen",
  "description": "",
  "id": "problem1;verify-values-\u0026-total-balance-on-the-screen",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User able to navigate to required URL",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User verifies values on the screen are greater than \"0\"",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "User verifies total balance is current",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User verifies Currency is \"$\" for all the values",
  "keyword": "And "
});
formatter.match({
  "location": "Page1_StepDefinition.user_able_to_navigate_to_required_URL()"
});
formatter.result({
  "duration": 5645547200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "0",
      "offset": 53
    }
  ],
  "location": "Page1_StepDefinition.user_verifies_values_on_the_screen_are_greater_than(String)"
});
formatter.result({
  "duration": 10615100,
  "error_message": "java.lang.NullPointerException\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy17.getText(Unknown Source)\r\n\tat pages.Page1.getValue1(Page1.java:27)\r\n\tat steps.Page1_Steps.verifyValuesGreaterThanGivenValue(Page1_Steps.java:54)\r\n\tat stepDefinition.Page1_StepDefinition.user_verifies_values_on_the_screen_are_greater_than(Page1_StepDefinition.java:32)\r\n\tat ✽.Then User verifies values on the screen are greater than \"0\"(Page1.feature:5)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Page1_StepDefinition.user_verifies_total_balance_is_current()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "$",
      "offset": 27
    }
  ],
  "location": "Page1_StepDefinition.user_verifies_Currency_is_for_all_the_values(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 700656900,
  "status": "passed"
});
});