import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Login successfully'), [('username') : username, ('password') : password], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Mattermost/div_MattermostAll team communication in one_93cd78'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Mattermost/input_All team communication in one place, _a3edc6'), 
    'nPfpYrEr/l65N6FKFb1a2w==')

WebUI.sendKeys(findTestObject('Object Repository/Page_Mattermost/input_All team communication in one place, _a3edc6'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Mattermost/div_MattermostAll team communication in one_93cd78'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Mattermost/input_All team communication in one place, _a3edc6'), 
    '2H6z+v2UDdxEqT9Fyl6EKQ==')

WebUI.click(findTestObject('Object Repository/Page_Mattermost/span_Sign in'))

WebUI.click(findTestObject('Object Repository/Page_Mattermost/span_Create a team'))

WebUI.setText(findTestObject('Object Repository/Page_Mattermost/input_Team Name_teamNameInput'), teamName)

WebUI.click(findTestObject('Object Repository/Page_Mattermost/span_Next'))

WebUI.click(findTestObject('Object Repository/Page_Mattermost/span_Finish'))

