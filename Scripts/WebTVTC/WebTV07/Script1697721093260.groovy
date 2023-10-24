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

WebUI.navigateToUrl('https://www.dol.gov/agencies/ilab')

WebUI.click(findTestObject('Object Repository/WebOR/Page_Bureau of International Labor Affairs/svg_OUR WORK_svg-inline--fa fa-chevron-down_93c0d7'))

WebUI.click(findTestObject('Object Repository/WebOR/Page_Bureau of International Labor Affairs/span_Cross-Cutting Issues'))

WebUI.verifyElementVisible(findTestObject('Object Repository/WebOR/Page_Cross Cutting Issues  U.S. Department _23ecaf/span_Cross Cutting Issues'))

WebUI.takeElementScreenshotAsCheckpoint('CCI', findTestObject('Page_Cross Cutting Issues  U.S. Department _23ecaf/span_Cross Cutting Issues'))

WebUI.closeBrowser()

