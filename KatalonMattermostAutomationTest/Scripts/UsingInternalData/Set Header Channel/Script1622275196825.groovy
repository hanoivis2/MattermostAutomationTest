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

WebUI.navigateToUrl('https://cdnccnpm1.herokuapp.com/')

WebUI.setText(findTestObject('Object Repository/SetChanelHeader/Page_Mattermost/input_All team communication in one place, _dcc84b'), 
    'linhknife796')

WebUI.setEncryptedText(findTestObject('Object Repository/SetChanelHeader/Page_Mattermost/input_All team communication in one place, _a3edc6'), 
    'HGnKy8xZufLE9vEr3x7Zxw==')

WebUI.click(findTestObject('Object Repository/SetChanelHeader/Page_Mattermost/span_Sign in'))

WebUI.click(findTestObject('Object Repository/SetChanelHeader/Page_Town Square - abc Mattermost/span_'))

WebUI.setText(findTestObject('Object Repository/SetChanelHeader/Page_Town Square - abc Mattermost/input_Name_newChannelName'), 
    'abc')

WebUI.click(findTestObject('Object Repository/SetChanelHeader/Page_Town Square - abc Mattermost/span_Create Channel'))

WebUI.click(findTestObject('Object Repository/SetChanelHeader/Page_abc - abc Mattermost/span_(Edit)'))

WebUI.setText(findTestObject('Object Repository/SetChanelHeader/Page_abc - abc Mattermost/textarea_Edit the Channel Header_edit_textbox'), 
    'A')

WebUI.setText(findTestObject('Object Repository/SetChanelHeader/Page_abc - abc Mattermost/textarea_A'), 'Ad')

WebUI.setText(findTestObject('Object Repository/SetChanelHeader/Page_abc - abc Mattermost/textarea_Ad'), 'Add')

WebUI.setText(findTestObject('Object Repository/SetChanelHeader/Page_abc - abc Mattermost/textarea_Add'), 'Add ')

WebUI.setText(findTestObject('Object Repository/SetChanelHeader/Page_abc - abc Mattermost/textarea_Add_1'), 'Add')

WebUI.setText(findTestObject('Object Repository/SetChanelHeader/Page_abc - abc Mattermost/textarea_Add'), 'Ad')

WebUI.setText(findTestObject('Object Repository/SetChanelHeader/Page_abc - abc Mattermost/textarea_Ad'), 'A')

WebUI.setText(findTestObject('Object Repository/SetChanelHeader/Page_abc - abc Mattermost/textarea_A'), '')

WebUI.setText(findTestObject('Object Repository/SetChanelHeader/Page_abc - abc Mattermost/textarea_Edit the Channel Header_edit_textbox'), 
    's')

WebUI.setText(findTestObject('Object Repository/SetChanelHeader/Page_abc - abc Mattermost/textarea_s'), 'se')

WebUI.setText(findTestObject('Object Repository/SetChanelHeader/Page_abc - abc Mattermost/textarea_se'), 'set')

WebUI.setText(findTestObject('Object Repository/SetChanelHeader/Page_abc - abc Mattermost/textarea_set'), 'set ')

WebUI.setText(findTestObject('Object Repository/SetChanelHeader/Page_abc - abc Mattermost/textarea_set_1'), 'set h')

WebUI.setText(findTestObject('Object Repository/SetChanelHeader/Page_abc - abc Mattermost/textarea_set h'), 'set he')

WebUI.setText(findTestObject('Object Repository/SetChanelHeader/Page_abc - abc Mattermost/textarea_set he'), 'set hea')

WebUI.setText(findTestObject('Object Repository/SetChanelHeader/Page_abc - abc Mattermost/textarea_set hea'), 'set head')

WebUI.setText(findTestObject('Object Repository/SetChanelHeader/Page_abc - abc Mattermost/textarea_set head'), 'set heade')

WebUI.setText(findTestObject('Object Repository/SetChanelHeader/Page_abc - abc Mattermost/textarea_set heade'), 'set header')

WebUI.click(findTestObject('Object Repository/SetChanelHeader/Page_abc - abc Mattermost/span_Save'))

