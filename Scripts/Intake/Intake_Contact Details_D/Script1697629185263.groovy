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

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Intake_Contact Details_Deepika/Page_Home Page - SDICMS/a_Log in'))

WebUI.setText(findTestObject('Object Repository/Intake_Contact Details_Deepika/Page_Login - SDICMS/input_Username_Username'), 
    'Dkarthikeyan')

WebUI.setEncryptedText(findTestObject('Object Repository/Intake_Contact Details_Deepika/Page_Login - SDICMS/input_Password_Password'), 
    'aIXAl78w3oZthhrKd/GaoA==')

WebUI.click(findTestObject('Object Repository/Intake_Contact Details_Deepika/Page_Login - SDICMS/input_Change Password_ButtonSave'))

WebUI.click(findTestObject('Object Repository/Intake_Contact Details_Deepika/Page_Home Page - SDICMS/a_Module'))

WebUI.click(findTestObject('Object Repository/Intake_Contact Details_Deepika/Page_Home Page - SDICMS/a_Intake'))

WebUI.click(findTestObject('Object Repository/Intake_Contact Details_Deepika/Page_Intake Page - SDICMS/a_Create'))

WebUI.setText(findTestObject('Object Repository/Intake_Contact Details_Deepika/Page_Create Person - SDICMS/input__ReceptionRegister.Reason_For_Visit'), 
    'Test')

WebUI.selectOptionByValue(findTestObject('Object Repository/Intake_Contact Details_Deepika/Page_Create Person - SDICMS/select_- Please select -Walk-inIJS-HubTelep_93781e'), 
    '3', true)

WebUI.click(findTestObject('Object Repository/Intake_Contact Details_Deepika/Page_Create Person - SDICMS/span__glyphicon glyphicon-calendar'))

WebUI.click(findTestObject('Object Repository/Intake_Contact Details_Deepika/Page_Create Person - SDICMS/a_19'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Intake_Contact Details_Deepika/Page_Create Person - SDICMS/select_- Please select -Internal ReferralEx_4caf57'), 
    '2', true)

WebUI.setText(findTestObject('Object Repository/Intake_Contact Details_Deepika/Page_Create Person - SDICMS/input__Person.First_Name'), 
    'Test')

WebUI.setText(findTestObject('Object Repository/Intake_Contact Details_Deepika/Page_Create Person - SDICMS/input__Person.Last_Name'), 
    'Anwar')

WebUI.selectOptionByValue(findTestObject('Object Repository/Intake_Contact Details_Deepika/Page_Create Person - SDICMS/select_- Please select -Permanent ResidentR_c0f2b7'), 
    '3', true)

WebUI.setText(findTestObject('Object Repository/Intake_Contact Details_Deepika/Page_Create Person - SDICMS/input_ID Number_Person.Identification_Number'), 
    'Q2345678')

WebUI.setText(findTestObject('Object Repository/Intake_Contact Details_Deepika/Page_Create Person - SDICMS/input__Person.Date_Of_Birth'), 
    '10 Oct 2006')

WebUI.selectOptionByValue(findTestObject('Object Repository/Intake_Contact Details_Deepika/Page_Create Person - SDICMS/select_- Please select -FemaleMale'), 
    '2', true)

WebUI.click(findTestObject('Object Repository/Intake_Contact Details_Deepika/Page_Create Person - SDICMS/input__chosen-search-input default'))

WebUI.click(findTestObject('Object Repository/Intake_Contact Details_Deepika/Page_Create Person - SDICMS/li_Developmental Disability'))

WebUI.click(findTestObject('Intake_Passport1_Deepika/Page_Create Person - SDICMS/input__chosen-search-input default valid'))

WebUI.click(findTestObject('Object Repository/Intake_Contact Details_Deepika/Page_Create Person - SDICMS/li_Attention Deficit Hyperactivity  Disorde'))

WebUI.click(findTestObject('Object Repository/Intake_Contact Details_Deepika/Page_Create Person - SDICMS/a_Contact Details'))

WebUI.setText(findTestObject('Object Repository/Intake_Contact Details_Deepika/Page_Create Person - SDICMS/input_Phone Number_Person.Phone_Number'), 
    '012345678')

WebUI.setText(findTestObject('Object Repository/Intake_Contact Details_Deepika/Page_Create Person - SDICMS/input_Mobile Phone Number_Person.Mobile_Pho_afea20'), 
    '781918774')

WebUI.setText(findTestObject('Object Repository/Intake_Contact Details_Deepika/Page_Create Person - SDICMS/input_Email Address_Person.Email_Address'), 
    'test@gmail.com')

WebUI.selectOptionByValue(findTestObject('Object Repository/Intake_Contact Details_Deepika/Page_Create Person - SDICMS/select_- Please select -EmailMobileTelephone'), 
    '3', true)

WebUI.setText(findTestObject('Intake_Contact Details_Deepika/Page_Create Person - SDICMS/input_Address Line 1_PhysicalAddress.Address_Line_1'), 
    'Test')

WebUI.setText(findTestObject('Intake_Contact Details_Deepika/Page_Create Person - SDICMS/Page_Create Person - SDICMS/Page_Create Person - SDICMS/input_Address Line 2_PhysicalAddress.Address_Line_2'), 
    'Test')

WebUI.selectOptionByLabel(findTestObject('Intake_Contact Details_Deepika/Page_Create Person - SDICMS/Page_Create Person - SDICMS/Page_Create Person - SDICMS/Country'), 
    'South Africa', false)

WebUI.selectOptionByLabel(findTestObject('Intake_Contact Details_Deepika/Page_Create Person - SDICMS/Page_Create Person - SDICMS/Page_Create Person - SDICMS/Province'), 
    'Eastern Cape', false)

WebUI.selectOptionByLabel(findTestObject('Intake_Contact Details_Deepika/Page_Create Person - SDICMS/Page_Create Person - SDICMS/Page_Create Person - SDICMS/District'), 
    'Alfred Nzo', false)

WebUI.selectOptionByLabel(findTestObject('Intake_Contact Details_Deepika/Page_Create Person - SDICMS/Page_Create Person - SDICMS/Page_Create Person - SDICMS/Municipality'), 
    'Matatiele', false)

WebUI.selectOptionByLabel(findTestObject('Intake_Contact Details_Deepika/Page_Create Person - SDICMS/Page_Create Person - SDICMS/Page_Create Person - SDICMS/Town'), 
    'Bertievale', false)

WebUI.setText(findTestObject('Intake_Contact Details_Deepika/Page_Create Person - SDICMS/Page_Create Person - SDICMS/Page_Create Person - SDICMS/input_Address Line 1_PostalAddress.Address_Line_1'), 
    'Test')

WebUI.setText(findTestObject('Intake_Contact Details_Deepika/Page_Create Person - SDICMS/Page_Create Person - SDICMS/Page_Create Person - SDICMS/input_Address Line 2_PostalAddress.Address_Line_2'), 
    'Test')

WebUI.selectOptionByLabel(findTestObject('Intake_Contact Details_Deepika/Page_Create Person - SDICMS/Page_Create Person - SDICMS/Page_Create Person - SDICMS/Country1'), 
    'South Africa', false)

WebUI.selectOptionByLabel(findTestObject('Intake_Contact Details_Deepika/Page_Create Person - SDICMS/Page_Create Person - SDICMS/Page_Create Person - SDICMS/Province1'), 
    'Eastern Cape', false)

WebUI.selectOptionByLabel(findTestObject('Intake_Contact Details_Deepika/Page_Create Person - SDICMS/Page_Create Person - SDICMS/Page_Create Person - SDICMS/District1'), 
    'Alfred Nzo', false)

WebUI.selectOptionByLabel(findTestObject('Intake_Contact Details_Deepika/Page_Create Person - SDICMS/Page_Create Person - SDICMS/Page_Create Person - SDICMS/Municipality1'), 
    'Matatiele', false)

WebUI.selectOptionByLabel(findTestObject('Intake_Contact Details_Deepika/Page_Create Person - SDICMS/Page_Create Person - SDICMS/Page_Create Person - SDICMS/Town1'), 
    'Bertievale', false)

WebUI.takeScreenshotAsCheckpoint('Contact Details')

WebUI.click(findTestObject('Intake_Contact Details_Deepika/Page_Create Person - SDICMS/Page_Create Person - SDICMS/Page_Create Person - SDICMS/input_Second Fingerprint_ButtonSave'))

WebUI.closeBrowser()

