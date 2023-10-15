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

WebUI.navigateToUrl('https://za.shein.com/')

WebUI.click(findTestObject('Object Repository/WebOR/Page_Shop Trendy Womens Fashion  Women Clot_14aa62/button_COLLECT ALL'))

WebUI.setText(findTestObject('Object Repository/WebOR/Page_Shop Trendy Womens Fashion  Women Clot_14aa62/input_Virgin Islands (U.S.)  1340_sui-input_33056b'), 
    'haripriyabhogi@gmail.com')

WebUI.click(findTestObject('Object Repository/WebOR/Page_Shop Trendy Womens Fashion  Women Clot_14aa62/span_CONTINUE'))

WebUI.setEncryptedText(findTestObject('Object Repository/WebOR/Page_Shop Trendy Womens Fashion  Women Clot_14aa62/input_Password_sui-input__inner sui-input___b5b877'), 
    'ZaJEugbsRAySLgEY4PX/Hw==')

WebUI.click(findTestObject('Object Repository/WebOR/Page_Shop Trendy Womens Fashion  Women Clot_14aa62/button_Sign In'))

WebUI.click(findTestObject('Object Repository/WebOR/Page_Shop Trendy Womens Fashion  Women Clot_14aa62/a_Forgot your password'))

WebUI.click(findTestObject('Object Repository/WebOR/Page_Shop Trendy Womens Fashion  Women Clot_14aa62/button_CANCEL'))

WebUI.closeBrowser()

