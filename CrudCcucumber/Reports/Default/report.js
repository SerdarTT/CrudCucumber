$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("CRUD.feature");
formatter.feature({
  "line": 3,
  "name": "Login feature",
  "description": "",
  "id": "login-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@CRUD"
    },
    {
      "line": 2,
      "name": "@regression"
    }
  ]
});
formatter.before({
  "duration": 3453961656,
  "status": "passed"
});
formatter.scenario({
  "line": 45,
  "name": "USer can update article",
  "description": "",
  "id": "login-feature;user-can-update-article",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 44,
      "name": "@Update"
    }
  ]
});
formatter.step({
  "line": 46,
  "name": "I click to signIn button",
  "keyword": "When "
});
formatter.step({
  "line": 47,
  "name": "I enter steterbasgit@gmail.com in email",
  "keyword": "When "
});
formatter.step({
  "line": 48,
  "name": "I enter Ilyas532? in passowrd",
  "keyword": "And "
});
formatter.step({
  "line": 49,
  "name": "I click on Sign in button",
  "keyword": "And "
});
formatter.step({
  "line": 50,
  "name": "I click on profile",
  "keyword": "And "
});
formatter.step({
  "line": 51,
  "name": "I click on title",
  "keyword": "And "
});
formatter.step({
  "line": 52,
  "name": "I click on edit button",
  "keyword": "And "
});
formatter.step({
  "line": 53,
  "name": "I clean title box",
  "keyword": "And "
});
formatter.step({
  "line": 54,
  "name": "I enter Democrats in new Title box",
  "keyword": "And "
});
formatter.step({
  "line": 55,
  "name": "I clean about box",
  "keyword": "And "
});
formatter.step({
  "line": 56,
  "name": "I enter Dr Jill in about article",
  "keyword": "And "
});
formatter.step({
  "line": 57,
  "name": "I clean article box",
  "keyword": "And "
});
formatter.step({
  "line": 58,
  "name": "I enter Joe Biden loves first Lady Jill in article box",
  "keyword": "And "
});
formatter.step({
  "line": 59,
  "name": "I clean tag box",
  "keyword": "And "
});
formatter.step({
  "line": 60,
  "name": "I enter Dr in tag box",
  "keyword": "And "
});
formatter.step({
  "line": 61,
  "name": "I click to publish article",
  "keyword": "Then "
});
formatter.match({
  "location": "HomepageSD.clickToSignIn()"
});
formatter.result({
  "duration": 2227311465,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "steterbasgit@gmail.com",
      "offset": 8
    }
  ],
  "location": "HomepageSD.enterEmail(String)"
});
formatter.result({
  "duration": 2195587307,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ilyas532?",
      "offset": 8
    }
  ],
  "location": "HomepageSD.enterPassword(String)"
});
formatter.result({
  "duration": 2070330787,
  "status": "passed"
});
formatter.match({
  "location": "HomepageSD.clickSignInButton()"
});
formatter.result({
  "duration": 2095223205,
  "status": "passed"
});
formatter.match({
  "location": "ReadSD.clickOnProfile()"
});
formatter.result({
  "duration": 458640520,
  "status": "passed"
});
formatter.match({
  "location": "ReadSD.clickOnTitle()"
});
formatter.result({
  "duration": 449855254,
  "status": "passed"
});
formatter.match({
  "location": "ReadSD.clickOnEdit()"
});
formatter.result({
  "duration": 540099075,
  "status": "passed"
});
formatter.match({
  "location": "UpdateSD.cleanTitleBox()"
});
formatter.result({
  "duration": 4083140743,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Democrats",
      "offset": 8
    }
  ],
  "location": "UpdateSD.enterNewTitle(String)"
});
formatter.result({
  "duration": 2090474981,
  "status": "passed"
});
formatter.match({
  "location": "ReadSD.clean()"
});
formatter.result({
  "duration": 110228136,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Dr Jill",
      "offset": 8
    }
  ],
  "location": "CreateSD.aboutArticle(String)"
});
formatter.result({
  "duration": 104982829,
  "status": "passed"
});
formatter.match({
  "location": "UpdateSD.cleanArticle()"
});
formatter.result({
  "duration": 2036098340,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Joe Biden loves first Lady Jill",
      "offset": 8
    }
  ],
  "location": "CreateSD.article(String)"
});
formatter.result({
  "duration": 2114188224,
  "status": "passed"
});
formatter.match({
  "location": "UpdateSD.cleanTag()"
});
formatter.result({
  "duration": 2087789960,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Dr",
      "offset": 8
    }
  ],
  "location": "CreateSD.tags(String)"
});
formatter.result({
  "duration": 111967188,
  "status": "passed"
});
formatter.match({
  "location": "CreateSD.clickPublish()"
});
formatter.result({
  "duration": 2046475046,
  "status": "passed"
});
formatter.after({
  "duration": 163582808,
  "status": "passed"
});
});