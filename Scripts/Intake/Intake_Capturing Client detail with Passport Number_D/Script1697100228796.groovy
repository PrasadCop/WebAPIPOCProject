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

WebUI.navigateToUrl('https://testportal.dsd.gov.za/SDICMS_TEST/User/Login')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Intake_Passport_Deepika/Page_Home Page - SDICMS/a_Log in'))

WebUI.setText(findTestObject('Intake_Passport_Deepika/Page_Login - SDICMS/input_Username_Username'), 'Dkarthikeyan')

WebUI.setText(findTestObject('Intake_Passport_Deepika/Page_Login - SDICMS/input_Password_Password'), 'Testcase@20')

WebUI.click(findTestObject('Intake_Passport_Deepika/Page_Login - SDICMS/input_Change Password_ButtonSave'))

WebUI.click(findTestObject('Intake_Passport_Deepika/Page_Home Page - SDICMS/a_Module'))

WebUI.click(findTestObject('Intake_Passport_Deepika/Page_Home Page - SDICMS/a_Intake'))

WebUI.click(findTestObject('Intake_Passport_Deepika/Page_Intake Page - SDICMS/a_Create'))

WebUI.setText(findTestObject('Intake_Passport_Deepika/Page_Create Person - SDICMS/input__ReceptionRegister.Reason_For_Visit'), 
    'Test')

WebUI.selectOptionByValue(findTestObject('Intake_Passport_Deepika/Page_Create Person - SDICMS/select_- Please select -Walk-inIJS-HubTelephonicEmailFaxOnline'), 
    '3', false)

WebUI.setText(findTestObject('Intake_Passport_Deepika/Page_Create Person - SDICMS/input__ReceptionRegister.Visit_Date'), 
    '16 Oct 2023')

WebUI.selectOptionByValue(findTestObject('Intake_Passport_Deepika/Page_Create Person - SDICMS/select_- Please select -Internal ReferralExternal Referral'), 
    '2', false)

WebUI.setText(findTestObject('Intake_Passport_Deepika/Page_Create Person - SDICMS/input__Person.First_Name'), 'Testing')

WebUI.setText(findTestObject('Intake_Passport_Deepika/Page_Create Person - SDICMS/input__Person.Last_Name'), 'Testing')

WebUI.selectOptionByValue(findTestObject('Intake_Passport_Deepika/Page_Create Person - SDICMS/select_- Please select -Permanent ResidentRefugee StatusSA CitizenStudy PermitTemporary ResidentUnknownVisitors Permit'), 
    '3', false)

WebUI.setText(findTestObject('Intake_Passport1_Deepika/Page_Create Person - SDICMS/input__Person.Date_Of_Birth'), '10 Oct 2023')

WebUI.setText(findTestObject('Intake_Passport_Deepika/Page_Create Person - SDICMS/input_ID Number_Person.Identification_Number'), 
    'N4778659')

WebUI.selectOptionByValue(findTestObject('Intake_Passport1_Deepika/Page_Create Person - SDICMS/select_- Please select -FemaleMale'), 
    '1', false)

WebUI.click(findTestObject('Intake_Passport1_Deepika/Page_1697527433495/Page_Create Person - SDICMS/input__chosen-search-input default'))

WebUI.takeScreenshotAsCheckpoint('Tested with Passport Number successfully')

WebUI.click(findTestObject('Intake_Passport1_Deepika/Page_Create Person - SDICMS/li_Not applicable'))

WebUI.click(findTestObject('Intake_Passport1_Deepika/Page_Create Person - SDICMS/input__chosen-search-input default valid'))

WebUI.click(findTestObject('Intake_Passport1_Deepika/Page_Create Person - SDICMS/li_Not applicable'))

WebUI.click(findTestObject('Intake_Passport2_Deepika/Page_Create Person - SDICMS/input_Second Fingerprint_ButtonSave'))

WebUI.closeBrowser()

