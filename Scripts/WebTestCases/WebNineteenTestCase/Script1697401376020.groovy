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

WebUI.navigateToUrl('https://www.capitecbank.co.za/')

WebUI.scrollToElement(findTestObject('WebOR/Page_Open a Capitec Account on the App  Cap_d6755b/a_Switch to Capitec'), 0)

WebUI.click(findTestObject('Object Repository/WebOR/Page_Open a Capitec Account on the App  Cap_d6755b/a_Switch to Capitec'))

WebUI.click(findTestObject('Object Repository/WebOR/Page_Switch To Capitec  How To Open An Acco_fcee48/a_Switch Your Debit Orders'))

WebUI.setText(findTestObject('Object Repository/WebOR/Page_Switch my debit orders  Contact us  Ca_0958b4/input_First name___field_906'), 
    'TEST')

WebUI.setText(findTestObject('Object Repository/WebOR/Page_Switch my debit orders  Contact us  Ca_0958b4/input_Surname___field_908'), 
    'TEST')

WebUI.setText(findTestObject('Object Repository/WebOR/Page_Switch my debit orders  Contact us  Ca_0958b4/input_ID  Passport number___field_912'), 
    'E85565454454')

WebUI.setText(findTestObject('Object Repository/WebOR/Page_Switch my debit orders  Contact us  Ca_0958b4/input_Email address___field_910'), 
    'test@test.com')

WebUI.setText(findTestObject('Object Repository/WebOR/Page_Switch my debit orders  Contact us  Ca_0958b4/input_Cellphone number___field_909'), 
    '000789444555')

WebUI.click(findTestObject('Object Repository/WebOR/Page_Switch my debit orders  Contact us  Ca_0958b4/b'))

WebUI.click(findTestObject('Object Repository/WebOR/Page_Switch my debit orders  Contact us  Ca_0958b4/button_Submit'))

WebUI.verifyElementText(findTestObject('Object Repository/WebOR/Page_Switch my debit orders  Contact us  Ca_0958b4/span_Please upload your bank state.ment'), 
    'Please upload your bank state.ment.')

WebUI.closeBrowser()

