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

WebUI.click(findTestObject('change dark theme_2/Page_Town Square - Buffalo Mattermost/button_user-1_style--none sidebar-header-dr_eabf2e'))

WebUI.click(findTestObject('Object Repository/Change teammate name display/Page_Town Square - abc Mattermost/button_Account Settings'))

WebUI.click(findTestObject('Object Repository/Change teammate name display/Page_Town Square - abc Mattermost/button_Display'))

WebUI.click(findTestObject('Object Repository/Change teammate name display/Page_Town Square - abc Mattermost/span_Edit'))

switch (teammateDisplayType) {
    case 0:
        WebUI.click(findTestObject('Object Repository/Change teammate name display/Page_Town Square - abc Mattermost/input_Teammate Name Display_name_formatFormat'))

        break
    case 1:
        WebUI.click(findTestObject('Object Repository/Change teammate name display/Page_Town Square - abc Mattermost/input_Show username_name_formatFormat'))

        break
    case 2:
        WebUI.click(findTestObject('Object Repository/Change teammate name display/Page_Town Square - abc Mattermost/input_Show nickname if one exists, otherwis_6c8756'))

        break
    default:
        WebUI.click(findTestObject('Object Repository/Change teammate name display/Page_Town Square - abc Mattermost/input_Teammate Name Display_name_formatFormat'))

        break
}

WebUI.click(findTestObject('Object Repository/Change teammate name display/Page_Town Square - abc Mattermost/span_Save'))

WebUI.click(findTestObject('Object Repository/Change teammate name display/Page_Town Square - abc Mattermost/span_'))

WebUI.closeBrowser()

