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

WebUI.callTestCase(findTestCase('Login successfully'), [('username') : '', ('password') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Change clock display/Page_Town Square - abc Mattermost/path'))

WebUI.click(findTestObject('Object Repository/Change clock display/Page_Town Square - abc Mattermost/button_Account Settings'))

WebUI.click(findTestObject('Object Repository/Change clock display/Page_Town Square - abc Mattermost/button_Display'))

WebUI.click(findTestObject('Object Repository/Change clock display/Page_Town Square - abc Mattermost/span_Edit'))

if (timeFormat == 12) {
    WebUI.click(findTestObject('Object Repository/Change clock display/Page_Town Square - abc Mattermost/label_12-hour clock (example 400 PM)'))
} else {
    WebUI.click(findTestObject('Object Repository/Change clock display/Page_Town Square - abc Mattermost/label_24-hour clock (example 1600)'))
}

WebUI.click(findTestObject('Object Repository/Change clock display/Page_Town Square - abc Mattermost/span_Save'))

WebUI.click(findTestObject('Object Repository/Change clock display/Page_Town Square - abc Mattermost/span_'))

