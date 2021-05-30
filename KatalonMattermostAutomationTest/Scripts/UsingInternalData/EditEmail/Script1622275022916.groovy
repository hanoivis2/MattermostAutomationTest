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

WebUI.navigateToUrl('http://localhost:8065/login')

WebUI.setText(findTestObject('Object Repository/edit email_2/Page_Mattermost/input_All team communication in one place, _dcc84b'), 
    'linhknife796')

WebUI.setEncryptedText(findTestObject('Object Repository/edit email_2/Page_Mattermost/input_All team communication in one place, _a3edc6'), 
    'AUFDKhCnJHCoxVYLtHPNpg==')

WebUI.sendKeys(findTestObject('Object Repository/edit email_2/Page_Mattermost/input_All team communication in one place, _a3edc6'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/edit email_2/Page_Town Square - eligendi Mattermost/button_linhknife796_style--none sidebar-hea_0abf9a'))

WebUI.click(findTestObject('Object Repository/edit email_2/Page_Town Square - eligendi Mattermost/button_Account Settings'))

WebUI.click(findTestObject('Object Repository/edit email_2/Page_Town Square - eligendi Mattermost/div_EmailEditlinhknife796gmail.com'))

WebUI.setText(findTestObject('Object Repository/edit email_2/Page_Town Square - eligendi Mattermost/input_New Email_primaryEmail'), 
    email)

WebUI.setText(findTestObject('Object Repository/edit email_2/Page_Town Square - eligendi Mattermost/input_Confirm Email_confirmEmail'), 
    email)

WebUI.setEncryptedText(findTestObject('Object Repository/edit email_2/Page_Town Square - eligendi Mattermost/input_Current Password_currentPassword'), 
    'AUFDKhCnJHCoxVYLtHPNpg==')

WebUI.sendKeys(findTestObject('Object Repository/edit email_2/Page_Town Square - eligendi Mattermost/input_Current Password_currentPassword'), 
    Keys.chord(Keys.ENTER))

