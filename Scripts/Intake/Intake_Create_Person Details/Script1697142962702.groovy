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

WebUI.navigateToUrl('https://testportal.dsd.gov.za/SDICMS_TEST/')

WebUI.click(findTestObject('Object Repository/Page_Home Page - SDICMS/a_Log in'))

WebUI.setText(findTestObject('Object Repository/Page_Login - SDICMS/input_Username_Username'), 'LLMabala')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login - SDICMS/input_Password_Password'), 'UTgtvq2BuWJZyjjfHz4pew==')

WebUI.click(findTestObject('Object Repository/Page_Login - SDICMS/input_Change Password_ButtonSave'))

WebUI.click(findTestObject('Object Repository/Page_Home Page - SDICMS/a_Module'))

WebUI.click(findTestObject('Object Repository/Page_Home Page - SDICMS/a_Intake'))

WebUI.click(findTestObject('Object Repository/Page_Intake Page - SDICMS/a_Create'))

WebUI.setText(findTestObject('Object Repository/Page_Create Person - SDICMS/input__Person.First_Name'), 'Job')

WebUI.setText(findTestObject('Object Repository/Page_Create Person - SDICMS/input__Person.Last_Name'), 'Money')

WebUI.setText(findTestObject('Object Repository/Page_Create Person - SDICMS/input_Known As_Person.Known_As'), 'zaka')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Create Person - SDICMS/select_Passport DocumentRSA ID Document'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Page_Create Person - SDICMS/input__Person.Date_Of_Birth'))

WebUI.click(findTestObject('Object Repository/Page_Create Person - SDICMS/a_3'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Create Person - SDICMS/select_- Please select -FemaleMale'), 
    '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Create Person - SDICMS/select_- Please select -AfghanAlbanianAlger_539764'), 
    '16', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Create Person - SDICMS/select_- Please select -AfarAfrikaansAkanAm_65536a'), 
    '1010', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Create Person - SDICMS/select_- Please select -BisexualGayHetero S_d0c270'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Create Person - SDICMS/select_- Please select -AnyAsianBlackColour_ee2822'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Create Person - SDICMS/select_- Please select -DivorcedLiving with_a7bd96'), 
    '5', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Create Person - SDICMS/select_- Please select -AetheistAfrican rel_031447'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Page_Create Person - SDICMS/input__chosen-search-input default'))

WebUI.click(findTestObject('Object Repository/Page_Create Person - SDICMS/li_Chronic Illness'))

WebUI.click(findTestObject('Object Repository/Page_Create Person - SDICMS/input__chosen-search-input default'))

WebUI.click(findTestObject('Object Repository/Page_Create Person - SDICMS/li_Chronic Illness'))

WebUI.click(findTestObject('Object Repository/Page_Create Person - SDICMS/a_Cancel'))

WebUI.closeBrowser()

