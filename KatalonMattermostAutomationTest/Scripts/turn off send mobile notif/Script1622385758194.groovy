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

WebUI.setText(findTestObject('Object Repository/turn off mobile notif/Page_Mattermost/input_All team communication in one place, _dcc84b'), 
    'linhknife796')

WebUI.setEncryptedText(findTestObject('Object Repository/turn off mobile notif/Page_Mattermost/input_All team communication in one place, _a3edc6'), 
    'AUFDKhCnJHCoxVYLtHPNpg==')

WebUI.sendKeys(findTestObject('Object Repository/turn off mobile notif/Page_Mattermost/input_All team communication in one place, _a3edc6'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/turn off mobile notif/Page_Town Square - eligendi Mattermost/span_Town Square'))

WebUI.click(findTestObject('Object Repository/turn off mobile notif/Page_Town Square - eligendi Mattermost/button_Notification Preferences'))

WebUI.click(findTestObject('Object Repository/turn off mobile notif/Page_Town Square - eligendi Mattermost/div_Send mobile push notificationsEditFor a_b69205'))

WebUI.click(findTestObject('Object Repository/turn off mobile notif/Page_Town Square - eligendi Mattermost/input_Only for mentions_channelDesktopNotif_af1537'))

WebUI.click(findTestObject('Object Repository/turn off mobile notif/Page_Town Square - eligendi Mattermost/button_Save'))

WebUI.closeBrowser()
