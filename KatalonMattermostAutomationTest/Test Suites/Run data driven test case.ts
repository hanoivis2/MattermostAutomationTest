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
      <isRun>true</isRun>
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
</TestSuiteEntity>
