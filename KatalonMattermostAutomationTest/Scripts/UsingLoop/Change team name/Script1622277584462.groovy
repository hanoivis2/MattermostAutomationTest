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
import com.*

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:8065/login')

WebUI.setText(findTestObject('Object Repository/Page_Mattermost/input_All team communication in one place, _dcc84b'), 'linhknife796')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Mattermost/input_All team communication in one place, _a3edc6'), 
    'HGnKy8xZufLE9vEr3x7Zxw==')

WebUI.click(findTestObject('Object Repository/Page_Mattermost/span_Sign in'))

WebUI.click(findTestObject('change dark theme_2/Page_Town Square - Buffalo Mattermost/button_user-1_style--none sidebar-header-dr_eabf2e'))

WebUI.click(findTestObject('Object Repository/ChangeTeamName/Page_Town Square - Chiken Mattermost/span_Team Settings'))

for (int i = 0; i < 4; i++) {
    WebUI.click(findTestObject('ChangeTeamName/Page_Town Square - Chiken Mattermost/span_Edit'))

    WebUI.setText(findTestObject('ChangeTeamName/Page_Town Square - Chiken Mattermost/input_Team Name_teamName'), CustomKeywords.'com.Utils.randomString'(
            20))

    WebUI.click(findTestObject('ChangeTeamName/Page_Town Square - Chiken Mattermost/span_Save'))
}

WebUI.closeBrowser()

