<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>Run data driven test case</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>0</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>false</rerunImmediately>
   <testSuiteGuid>ee01cfc8-7736-405a-aa46-d2315a7a7406</testSuiteGuid>
   <testCaseLink>
      <guid>3e2594cc-766c-4102-9022-3763b05b1949</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>false</isRun>
      <testCaseId>Test Cases/UsingInternalData/Edit name</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>64ef9631-48b3-4039-acd6-19cb15a17df9</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/DB_Data/NameData</testDataId>
      </testDataLink>
      <variableLink>
         <testDataLinkId>64ef9631-48b3-4039-acd6-19cb15a17df9</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>FirstName</value>
         <variableId>ad4b9996-a421-46f2-8a5c-18553e28f2c3</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>64ef9631-48b3-4039-acd6-19cb15a17df9</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>LastName</value>
         <variableId>bd99c0ff-8017-4736-8bd6-b9f4c1fbc781</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>eb6f52d0-071b-4d4a-ba8e-e545782fc88f</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>false</isRun>
      <testCaseId>Test Cases/UsingCSV/LoginUsers</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>ae8adc2c-c401-4e98-b972-ec65b5fe2e01</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/CSV_Data/LoginUsers</testDataId>
      </testDataLink>
      <variableLink>
         <testDataLinkId>ae8adc2c-c401-4e98-b972-ec65b5fe2e01</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>username</value>
         <variableId>fc14aa54-9026-43d4-9ee3-09643f485579</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>ae8adc2c-c401-4e98-b972-ec65b5fe2e01</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>password</value>
         <variableId>335bb6d4-62b7-4c16-87bc-2bc2f75ab9ab</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>42849816-d7d4-4174-b6ac-60e95622c9e4</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>false</isRun>
      <testCaseId>Test Cases/UsingLoop/Login n times</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>81236823-c733-4d8c-ab23-24aabc0656b8</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/DB_Data/UsersData</testDataId>
      </testDataLink>
      <variableLink>
         <testDataLinkId>81236823-c733-4d8c-ab23-24aabc0656b8</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>username</value>
         <variableId>ed5a365f-14b7-45ce-93fe-554172f2d9b3</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>81236823-c733-4d8c-ab23-24aabc0656b8</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>password</value>
         <variableId>c7f5b000-ac17-4784-8261-f4ef137031d9</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>2a31aad1-e19a-4ea8-973e-a98f9715c773</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>false</isRun>
      <testCaseId>Test Cases/UsingInternalData/InvitePeople</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>d7c462f7-3296-4d61-8bf6-6601e4c6c2f3</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/DB_Data/UsersData</testDataId>
      </testDataLink>
      <variableLink>
         <testDataLinkId>d7c462f7-3296-4d61-8bf6-6601e4c6c2f3</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>username</value>
         <variableId>e1987b78-c4f3-436e-bcda-836849323efa</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>d7c462f7-3296-4d61-8bf6-6601e4c6c2f3</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>password</value>
         <variableId>66e44592-d8a4-46a3-a834-4e243f094572</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>7b4fbbfd-45e7-4241-9ed5-354589dac901</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>false</isRun>
      <testCaseId>Test Cases/UsingInternalData/ViewChannelInfo</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>a635982c-5c56-4c34-b2a7-a35b11acf422</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/DB_Data/UsersData</testDataId>
      </testDataLink>
      <variableLink>
         <testDataLinkId>a635982c-5c56-4c34-b2a7-a35b11acf422</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>username</value>
         <variableId>74e36162-2250-4688-814a-6231a01c7e85</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>a635982c-5c56-4c34-b2a7-a35b11acf422</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>password</value>
         <variableId>c7535143-e2df-4a15-809b-dccc30bc6536</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>6df26bfa-e8a2-4980-914e-c1702f5e213d</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>false</isRun>
      <testCaseId>Test Cases/UsingInternalData/ChangeChannelDescription</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>d4f234f0-e2f9-4d98-bd5a-4e35edb18c4e</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/DB_Data/DesciptionChannelData</testDataId>
      </testDataLink>
      <variableLink>
         <testDataLinkId>d4f234f0-e2f9-4d98-bd5a-4e35edb18c4e</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>desciption</value>
         <variableId>33e39f62-6c93-491a-9ea8-eb9d6bb26c5f</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>1c28014b-af99-4c3c-8b5c-aded624d29fc</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>false</isRun>
      <testCaseId>Test Cases/UsingCase/ChangeLanguage</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>7265becf-1de0-4df1-81e3-90c67767e677</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/CSV_Data/LanguageData</testDataId>
      </testDataLink>
      <variableLink>
         <testDataLinkId>7265becf-1de0-4df1-81e3-90c67767e677</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>﻿LanguageData</value>
         <variableId>3ea9c960-65f5-475f-93a4-f81b82acad8a</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>64e83e2b-ce2b-4b7b-886c-f72cddc84bb1</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>false</isRun>
      <testCaseId>Test Cases/CallAnotherTestCase/ViewTeamMember</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>71b31d88-2355-493d-bc72-342c8532dac6</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/CSV_Data/LoginUsers</testDataId>
      </testDataLink>
      <variableLink>
         <testDataLinkId>71b31d88-2355-493d-bc72-342c8532dac6</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>username</value>
         <variableId>43d8fc79-5854-4ce4-a56e-f319b5de3209</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>71b31d88-2355-493d-bc72-342c8532dac6</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>password</value>
         <variableId>596ea142-85bc-41b0-9bf5-2d2a04f9487e</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>2c39f0d9-7583-48c7-baf3-144a86785121</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>false</isRun>
      <testCaseId>Test Cases/UsingIfStatement/ChangeDarkTheme</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>d8b9d886-29d5-45dc-8e0f-678a2bc2281d</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/CSV_Data/LoginUsers</testDataId>
      </testDataLink>
      <variableLink>
         <testDataLinkId>d8b9d886-29d5-45dc-8e0f-678a2bc2281d</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>username</value>
         <variableId>ce29715a-97d9-46eb-bedf-68cdcd71a8e5</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>d8b9d886-29d5-45dc-8e0f-678a2bc2281d</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>password</value>
         <variableId>91809ca1-1cec-47bc-a88a-bc0ede68a56b</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>9633f733-6179-4241-bcf4-0f109c71c1cc</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>false</isRun>
      <testCaseId>Test Cases/UsingIfStatement/FormatTime</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>1b0be51e-3cf3-4dc6-82b3-4091ad85420b</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/CSV_Data/LoginUsers</testDataId>
      </testDataLink>
      <variableLink>
         <testDataLinkId>1b0be51e-3cf3-4dc6-82b3-4091ad85420b</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>username</value>
         <variableId>84748fba-a06a-427e-9a49-96e4bb6075f4</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>1b0be51e-3cf3-4dc6-82b3-4091ad85420b</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>password</value>
         <variableId>f188f92b-d6a0-4fc8-beb5-d54ce78d071c</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>125a404e-ac9a-4bcb-972f-8d62d92aa68f</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/UsingCase/ChangeThemeColor</testCaseId>
   </testCaseLink>
</TestSuiteEntity>
