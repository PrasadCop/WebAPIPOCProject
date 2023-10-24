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

WebUI.navigateToUrl('https://www.yahoo.com/')

WebUI.click(findTestObject('Object Repository/WebOR/Page_Yahoo  Mail, Weather, Search, Politics_802e32/a_Sign in'))

WebUI.verifyElementVisible(findTestObject('Object Repository/WebOR/Page_Yahoo/strong_Signin'))

WebUI.verifyElementPresent(findTestObject('Object Repository/WebOR/Page_Yahoo/input_Enter Country Code_username'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/WebOR/Page_Yahoo/input_aol.com_signin'))

WebUI.takeElementScreenshotAsCheckpoint('SigninButton', findTestObject('Page_Yahoo  Mail, Weather, Search, Politics_802e32/a_Sign in'))

WebUI.verifyElementVisible(findTestObject('Object Repository/WebOR/Page_Yahoo/a_Create anaccount'))

WebUI.takeElementScreenshot(findTestObject('Object Repository/WebOR/Page_Yahoo/a_Create anaccount'))

WebUI.closeBrowser()

