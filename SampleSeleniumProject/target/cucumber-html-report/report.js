$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Feature/FeatureFile.feature");
formatter.feature({
  "line": 2,
  "name": "This is just a sample  BDD feature",
  "description": "",
  "id": "this-is-just-a-sample--bdd-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@feature"
    },
    {
      "line": 1,
      "name": "@regerssion"
    }
  ]
});
formatter.scenarioOutline({
  "line": 70,
  "name": "DataProvider1",
  "description": "",
  "id": "this-is-just-a-sample--bdd-feature;dataprovider1",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 69,
      "name": "@DataProvider1"
    }
  ]
});
formatter.step({
  "line": 71,
  "name": "user enter url fromm rownum \"\u003cRowNum\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 72,
  "name": "user enter username and password from rownum \"\u003cRowNum\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 73,
  "name": "user get the details",
  "keyword": "Then "
});
formatter.examples({
  "line": 75,
  "name": "",
  "description": "",
  "id": "this-is-just-a-sample--bdd-feature;dataprovider1;",
  "rows": [
    {
      "cells": [
        "RowNum"
      ],
      "line": 76,
      "id": "this-is-just-a-sample--bdd-feature;dataprovider1;;1"
    },
    {
      "cells": [
        "2"
      ],
      "line": 77,
      "id": "this-is-just-a-sample--bdd-feature;dataprovider1;;2"
    },
    {
      "cells": [
        "3"
      ],
      "line": 78,
      "id": "this-is-just-a-sample--bdd-feature;dataprovider1;;3"
    },
    {
      "cells": [
        "4"
      ],
      "line": 79,
      "id": "this-is-just-a-sample--bdd-feature;dataprovider1;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 5960632300,
  "status": "passed"
});
formatter.scenario({
  "line": 77,
  "name": "DataProvider1",
  "description": "",
  "id": "this-is-just-a-sample--bdd-feature;dataprovider1;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@regerssion"
    },
    {
      "line": 69,
      "name": "@DataProvider1"
    },
    {
      "line": 1,
      "name": "@feature"
    }
  ]
});
formatter.step({
  "line": 71,
  "name": "user enter url fromm rownum \"2\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 72,
  "name": "user enter username and password from rownum \"2\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 73,
  "name": "user get the details",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 29
    }
  ],
  "location": "StepDefinition.user_enter_url_fromm_rownum(String)"
});
formatter.result({
  "duration": 6024155700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 46
    }
  ],
  "location": "StepDefinition.user_enter_username_and_password_from_rownum(String)"
});
formatter.result({
  "duration": 2784300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_get_the_details()"
});
formatter.result({
  "duration": 101300,
  "status": "passed"
});
formatter.write("I am inside tear down");
formatter.after({
  "duration": 271607400,
  "status": "passed"
});
formatter.before({
  "duration": 3441235000,
  "status": "passed"
});
formatter.scenario({
  "line": 78,
  "name": "DataProvider1",
  "description": "",
  "id": "this-is-just-a-sample--bdd-feature;dataprovider1;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@regerssion"
    },
    {
      "line": 69,
      "name": "@DataProvider1"
    },
    {
      "line": 1,
      "name": "@feature"
    }
  ]
});
formatter.step({
  "line": 71,
  "name": "user enter url fromm rownum \"3\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 72,
  "name": "user enter username and password from rownum \"3\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 73,
  "name": "user get the details",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 29
    }
  ],
  "location": "StepDefinition.user_enter_url_fromm_rownum(String)"
});
formatter.result({
  "duration": 5019548900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 46
    }
  ],
  "location": "StepDefinition.user_enter_username_and_password_from_rownum(String)"
});
formatter.result({
  "duration": 766200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_get_the_details()"
});
formatter.result({
  "duration": 33100,
  "status": "passed"
});
formatter.write("I am inside tear down");
formatter.after({
  "duration": 4169027800,
  "status": "passed"
});
formatter.before({
  "duration": 3415175500,
  "status": "passed"
});
formatter.scenario({
  "line": 79,
  "name": "DataProvider1",
  "description": "",
  "id": "this-is-just-a-sample--bdd-feature;dataprovider1;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@regerssion"
    },
    {
      "line": 69,
      "name": "@DataProvider1"
    },
    {
      "line": 1,
      "name": "@feature"
    }
  ]
});
formatter.step({
  "line": 71,
  "name": "user enter url fromm rownum \"4\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 72,
  "name": "user enter username and password from rownum \"4\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 73,
  "name": "user get the details",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "4",
      "offset": 29
    }
  ],
  "location": "StepDefinition.user_enter_url_fromm_rownum(String)"
});
formatter.result({
  "duration": 4110333900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "4",
      "offset": 46
    }
  ],
  "location": "StepDefinition.user_enter_username_and_password_from_rownum(String)"
});
formatter.result({
  "duration": 703900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_get_the_details()"
});
formatter.result({
  "duration": 18600,
  "status": "passed"
});
formatter.write("I am inside tear down");
formatter.after({
  "duration": 4119893300,
  "status": "passed"
});
});