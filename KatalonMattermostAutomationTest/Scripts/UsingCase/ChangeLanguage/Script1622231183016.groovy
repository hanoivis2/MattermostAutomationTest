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

WebUI.navigateToUrl('http://localhost:8065/')

WebUI.setText(findTestObject('Object Repository/Page_Mattermost/input_All team communication in one place, _dcc84b'), 'user-1')

WebUI.setEncryptedText(findTestObject('change dark theme_2/Page_Mattermost/input_All team communication in one place, _a3edc6'), 
    'MZgS3bkacIma+dCTaK/maA==')

WebUI.click(findTestObject('Object Repository/Page_Mattermost/button_Sign in'))

String lang = language

WebUI.click(findTestObject('change dark theme_2/Page_Town Square - Buffalo Mattermost/button_user-1_style--none sidebar-header-dr_eabf2e'))

WebUI.click(findTestObject('Object Repository/Page_Town Square - abc Mattermost/button_Account Settings'))

WebUI.click(findTestObject('Object Repository/Page_Town Square - abc Mattermost/button_Display'))

WebUI.click(findTestObject('Object Repository/edit language_2/Page_Town Square - Buffalo Mattermost/div_LanguageEditEnglish'))

WebUI.click(findTestObject('Object Repository/Page_Town Square - abc Mattermost/div_English'))

switch (lang) {
    case 'Rom??n??':
        WebUI.setText(findTestObject('Object Repository/Page_Town Square - abc Mattermost/input_English_react-select-2-input'), 
            'Rom??n??')

        break
    case 'Espa??ol':
        WebUI.setText(findTestObject('Object Repository/Page_Town Square - abc Mattermost/input_English_react-select-2-input'), 
            'Espa??ol')

        break
    case 'Italiano':
        WebUI.setText(findTestObject('Object Repository/Page_Town Square - abc Mattermost/input_English_react-select-2-input'), 
            'Italiano')

        break
    case '????????? (Alpha)':
        WebUI.setText(findTestObject('Object Repository/Page_Town Square - abc Mattermost/input_English_react-select-2-input'), 
            '????????? (Alpha)')

        break
    default:
        WebUI.setText(findTestObject('Object Repository/Page_Town Square - abc Mattermost/input_English_react-select-2-input'), 
            'English')}

WebUI.click(findTestObject('Object Repository/Page_Town Square - abc Mattermost/button_Save'))

WebUI.closeBrowser()

