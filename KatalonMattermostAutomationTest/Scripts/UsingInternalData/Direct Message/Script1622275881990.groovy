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

WebUI.openBrowser('')

WebUI.navigateToUrl('localhost:8065')

WebUI.setText(findTestObject('Object Repository/DirectMessage/Page_Mattermost/input_All team communication in one place, _dcc84b'), 
    'user-1')

WebUI.setText(findTestObject('Object Repository/DirectMessage/Page_Mattermost/input_All team communication in one place, _a3edc6'), 
    'SampleUs@r-1')

WebUI.click(findTestObject('Object Repository/DirectMessage/Page_Mattermost/button_Sign in'))

WebUI.click(findTestObject('Object Repository/DirectMessage/Page_Town Square - abc Mattermost/span_'))

WebUI.click(findTestObject('Object Repository/DirectMessage/Page_Town Square - abc Mattermost/div_conganhhcmusgmail.com'))

WebUI.click(findTestObject('Object Repository/DirectMessage/Page_Town Square - abc Mattermost/div_conganhhcmus1'))

WebUI.click(findTestObject('Object Repository/DirectMessage/Page_Town Square - abc Mattermost/span_Go'))

WebUI.setText(findTestObject('Object Repository/DirectMessage/Page_conganhhcmus, conganhhcmus1 - abc Mattermost/textarea_Write to conganhhcmus, conganhhcmu_8ebd96'), 
    'A')

WebUI.setText(findTestObject('Object Repository/DirectMessage/Page_conganhhcmus, conganhhcmus1 - abc Mattermost/textarea_A'), 
    'AB')

WebUI.setText(findTestObject('Object Repository/DirectMessage/Page_conganhhcmus, conganhhcmus1 - abc Mattermost/textarea_AB'), 
    'ABC')

