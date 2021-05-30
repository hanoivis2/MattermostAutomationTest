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

WebUI.setText(findTestObject('Object Repository/custom theme_2/Page_Mattermost/input_All team communication in one place, _dcc84b'), 
    'user-1')

WebUI.setEncryptedText(findTestObject('Object Repository/custom theme_2/Page_Mattermost/input_All team communication in one place, _a3edc6'), 
    'MZgS3bkacIma+dCTaK/maA==')

WebUI.click(findTestObject('Object Repository/custom theme_2/Page_Mattermost/span_Sign in'))

WebUI.click(findTestObject('Object Repository/change dark theme_2/Page_Town Square - Buffalo Mattermost/button_user-1_style--none sidebar-header-dr_eabf2e'))

WebUI.click(findTestObject('Object Repository/custom theme_2/Page_Town Square - Buffalo Mattermost/span_Account Settings'))

WebUI.click(findTestObject('Object Repository/custom theme_2/Page_Town Square - Buffalo Mattermost/button_Display'))

WebUI.click(findTestObject('Object Repository/custom theme_2/Page_Town Square - Buffalo Mattermost/div_ThemeEditOpen to manage your theme'))

WebUI.click(findTestObject('Object Repository/custom theme_2/Page_Town Square - Buffalo Mattermost/label_Custom Theme'))

WebUI.setText(findTestObject('Object Repository/ChangeThemeCustom/Page_Town Square - abc Mattermost/textarea_sidebarBg2f3136,sidebarTextffffff,_c82985'), 
    '{"sidebarBg":"#2f3136","sidebarText":"#ffffff","sidebarUnreadText":"#ffffff","sidebarTextHoverBg":"#33363c","sidebarTextActiveBorder":"#66cfa0","sidebarTextActiveColor":"#ffffff","sidebarHeaderBg":"#27292c","sidebarHeaderTextColor":"#ffffff","onlineIndicator":"#43b581","awayIndicator":"#faa61a","dndIndicator":"#f04747","mentionBg":"#6e84d2","mentionColor":"#ffffff","centerChannelBg":"#36393f","centerChannelColor":"#dddddd","newMessageSeparator":"#6e84d2","linkColor":"#2095e8","buttonBg":"#43b581","buttonColor":"#ffffff","errorTextColor":"#ff6461","mentionHighlightBg":"#3d414f","mentionHighlightLink":"#6e84d2","codeTheme":"monokai","mentionBj":"#ffffff"}{"sidebarBg":"#2f3136","sidebarText":"#ffffff","sidebarUnreadText":"#ffffff","sidebarTextHoverBg":"#33363c","sidebarTextActiveBorder":"#66cfa0","sidebarTextActiveColor":"#ffffff","sidebarHeaderBg":"#27292c","sidebarHeaderTextColor":"#ffffff","onlineIndicator":"#43b581","awayIndicator":"#faa61a","dndIndicator":"#f04747","mentionBg":"#6e84d2","mentionBg":"#6e84d2","mentionColor":"#ffffff","centerChannelBg":"#36393f","centerChannelColor":"#dddddd","newMessageSeparator":"#6e84d2","linkColor":"#2095e8","buttonBg":"#43b581","buttonColor":"#ffffff","errorTextColor":"#ff6461","mentionHighlightBg":"#3d414f","mentionHighlightLink":"#6e84d2","codeTheme":"monokai"}')

WebUI.click(findTestObject('custom theme_2/Page_Town Square - abc Mattermost/span_Save'))

