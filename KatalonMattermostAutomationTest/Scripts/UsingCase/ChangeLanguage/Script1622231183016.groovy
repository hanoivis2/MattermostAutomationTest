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

WebUI.setText(findTestObject('Object Repository/Page_Mattermost/input_All team communication in one place, _dcc84b'), 'linhknife796')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Mattermost/input_All team communication in one place, _a3edc6'), 
    'HGnKy8xZufLE9vEr3x7Zxw==')

WebUI.click(findTestObject('Object Repository/Page_Mattermost/button_Sign in'))

String lang = language

WebUI.click(findTestObject('Object Repository/Page_Town Square - abc Mattermost/svg'))

WebUI.click(findTestObject('Object Repository/Page_Town Square - abc Mattermost/button_Account Settings'))

WebUI.click(findTestObject('Object Repository/Page_Town Square - abc Mattermost/button_Display'))

WebUI.click(findTestObject('Object Repository/Page_Town Square - abc Mattermost/span_Edit'))

WebUI.click(findTestObject('Object Repository/Page_Town Square - abc Mattermost/div_English'))

switch (lang) {
    case 'Română':
        WebUI.setText(findTestObject('Object Repository/Page_Town Square - abc Mattermost/input_English_react-select-2-input'), 
            'Română')

        break
    case 'Español':
        WebUI.setText(findTestObject('Object Repository/Page_Town Square - abc Mattermost/input_English_react-select-2-input'), 
            'Español')

        break
    case 'Italiano':
        WebUI.setText(findTestObject('Object Repository/Page_Town Square - abc Mattermost/input_English_react-select-2-input'), 
            'Italiano')

        break
    case '한국어 (Alpha)':
        WebUI.setText(findTestObject('Object Repository/Page_Town Square - abc Mattermost/input_English_react-select-2-input'), 
            '한국어 (Alpha)')

        break
    default:
        WebUI.setText(findTestObject('Object Repository/Page_Town Square - abc Mattermost/input_English_react-select-2-input'), 
            'English')}

WebUI.click(findTestObject('Object Repository/Page_Town Square - abc Mattermost/button_Save'))

