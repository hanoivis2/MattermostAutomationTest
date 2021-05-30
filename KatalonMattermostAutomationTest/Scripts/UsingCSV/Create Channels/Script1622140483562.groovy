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

WebUI.setText(findTestObject('Page_Mattermost/input_All team communication in one place, _dcc84b'), 'user-1')

WebUI.setEncryptedText(findTestObject('ChangeTeamName/Page_Mattermost/input_All team communication in one place, _a3edc6'), 
    'MZgS3bkacIma+dCTaK/maA==')

WebUI.sendKeys(findTestObject('Object Repository/Page_Mattermost/input_All team communication in one place, _a3edc6'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Town Square - mastermost7961 Mattermost/span_'))

if (type.equals('public')) {
    WebUI.click(findTestObject('Object Repository/Page_Town Square - mastermost7961 Mattermost/label_Public - Anyone can join this channel'))
} else {
    WebUI.click(findTestObject('Object Repository/Page_Town Square - mastermost7961 Mattermost/label_Private - Only invited members can jo_3e905d'))
}

WebUI.setText(findTestObject('Object Repository/Page_Town Square - mastermost7961 Mattermost/input_Name_newChannelName'), 
    name)

WebUI.setText(findTestObject('Object Repository/Page_Town Square - mastermost7961 Mattermost/textarea_(optional)_newChannelPurpose'), 
    purpose)

WebUI.setText(findTestObject('Object Repository/Page_Town Square - mastermost7961 Mattermost/textarea_(optional)_newChannelHeader'), 
    header)

WebUI.click(findTestObject('Object Repository/Page_Town Square - mastermost7961 Mattermost/button_Create Channel'))

WebUI.closeBrowser()

