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

WebUI.click(findTestObject('create channel_3/Page_Town Square - ten team 3 Mattermost/i_K_icon-plus'))

WebUI.click(findTestObject('Object Repository/create channel_3/Page_Town Square - ten team 3 Mattermost/button_Create New Channel'))

WebUI.setText(findTestObject('Object Repository/Create Public channel/Page_Town Square - abc Mattermost/input_Name_newChannelName'), 
    channelName)

WebUI.setText(findTestObject('Object Repository/Create Public channel/Page_Town Square - abc Mattermost/textarea_(optional)_newChannelPurpose'), 
    purpose)

WebUI.setText(findTestObject('Object Repository/Create Public channel/Page_Town Square - abc Mattermost/textarea_(optional)_newChannelHeader'), 
    header)

WebUI.click(findTestObject('Object Repository/create public_3/Page_Town Square - eligendi Mattermost/button_Create Channel'))

WebUI.closeBrowser()

