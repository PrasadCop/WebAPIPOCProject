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

WebUI.navigateToUrl('https://www.toolsqa.com/')

WebUI.click(findTestObject('Object Repository/WebOR/Page_Tools QA/a_Demo Site'))

WebUI.switchToWindowTitle('DEMOQA')

WebUI.click(findTestObject('Object Repository/WebOR/Page_DEMOQA/h5_Elements'))

WebUI.click(findTestObject('Object Repository/WebOR/Page_DEMOQA/li_Text Box'))

WebUI.setText(findTestObject('Object Repository/WebOR/Page_DEMOQA/input_Full Name_userName'), 'testqa')

WebUI.setText(findTestObject('Object Repository/WebOR/Page_DEMOQA/input_Email_userEmail'), 'testqa@mailjnator.com')

WebUI.setText(findTestObject('Object Repository/WebOR/Page_DEMOQA/textarea_Current Address_currentAddress'), 'where i leave')

WebUI.setText(findTestObject('Object Repository/WebOR/Page_DEMOQA/textarea_Permanent Address_permanentAddress'), 'where i stay')

WebUI.click(findTestObject('Object Repository/WebOR/Page_DEMOQA/button_Submit'))

WebUI.closeBrowser()

