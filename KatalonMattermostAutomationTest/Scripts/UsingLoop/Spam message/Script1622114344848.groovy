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

public static String randomString(String chars, int length) {
	Random rand = new Random();
	StringBuilder sb = new StringBuilder();
	for (int i=0; i<length; i++) {
	  sb.append(chars.charAt(rand.nextInt(chars.length())));
	}
	return sb.toString();
  }

WebUI.openBrowser('')

WebUI.navigateToUrl('https://cdnccnpm1.herokuapp.com/')

if (WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Mattermost/span_Sign in'), 1)) {
	
	WebUI.setText(findTestObject('Object Repository/Page_Mattermost/input_All team communication in one place, _dcc84b'), 'linhknife796')
	
	WebUI.setEncryptedText(findTestObject('Object Repository/Page_Mattermost/input_All team communication in one place, _a3edc6'),
		'HGnKy8xZufLE9vEr3x7Zxw==')
	
	WebUI.click(findTestObject('Object Repository/Page_Mattermost/span_Sign in'))
}

WebUI.click(findTestObject('Object Repository/Page_Town Square - mastermost7961 Mattermost/span_nhom1'))

WebUI.setText(findTestObject('Object Repository/Page_nhom1 - mastermost7961 Mattermost/textarea_Write to nhom1_post_textbox'), 
    'H')

String chars = "abcdefghijklmnopqrstuvwxyz0123456789"
for (int i = 0; i < 50; i++) {
	WebUI.setText(findTestObject('Object Repository/Page_nhom1 - mastermost7961 Mattermost/textarea_Hu'), randomString(chars, 10))
	
	WebUI.sendKeys(findTestObject('Object Repository/Page_nhom1 - mastermost7961 Mattermost/textarea_Hu'), Keys.chord(
		Keys.ENTER))
}

WebUI.closeBrowser()

