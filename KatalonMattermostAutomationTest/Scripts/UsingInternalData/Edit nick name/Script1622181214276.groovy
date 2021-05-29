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

WebUI.setText(findTestObject('Object Repository/Page_Mattermost/input_All team communication in one place, _dcc84b'), 'user-1')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Mattermost/input_All team communication in one place, _a3edc6'), 
    'MZgS3bkacIma+dCTaK/maA==')

WebUI.click(findTestObject('Object Repository/Page_Mattermost/button_Sign in'))

WebUI.click(findTestObject('Object Repository/Page_Town Square - Buffalo Mattermost/svg'))

WebUI.click(findTestObject('Object Repository/Page_Town Square - Buffalo Mattermost/button_Account Settings'))

WebUI.click(findTestObject('Object Repository/Page_Town Square - Buffalo Mattermost/span_Click Edit to add a nickname'))

WebUI.setText(findTestObject('Object Repository/Page_Town Square - Buffalo Mattermost/input_Nickname_nickname'), nickname)

WebUI.click(findTestObject('Object Repository/Page_Town Square - Buffalo Mattermost/button_Save'))

WebUI.closeBrowser()

