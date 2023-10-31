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

WebUI.setText(findTestObject('Object Repository/Page_Intake Page - SDICMS/input_Names_Search_First_Name'), 'Koko')

WebUI.click(findTestObject('Object Repository/Page_Intake Page - SDICMS/input_Date of Birth_ButtonFilter'))

WebUI.click(findTestObject('Object Repository/Page_Intake Page - SDICMS/a_Accept'))

WebUI.click(findTestObject('Object Repository/Page_Edit Assessment - SDICMS/a_Referral to SWS'))

WebUI.click(findTestObject('Object Repository/Page_Edit Assessment - SDICMS/button_Supervisor - Case Manager Allocation'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Edit Assessment - SDICMS/select_- Please select -Aanthony BouwerAaro_c3d6b1'), 
    '12026', true)

WebUI.click(findTestObject('Object Repository/Page_Edit Assessment - SDICMS/input__IntakeAssessment.Date_Allocated'))

WebUI.click(findTestObject('Object Repository/Page_Edit Assessment - SDICMS/a_9'))

WebUI.click(findTestObject('Object Repository/Page_Edit Assessment - SDICMS/input__IntakeAssessment.Date_Due'))

WebUI.click(findTestObject('Object Repository/Page_Edit Assessment - SDICMS/a_31'))

WebUI.setText(findTestObject('Object Repository/Page_Edit Assessment - SDICMS/textarea_Supervisor Comments_IntakeAssessme_8b24ac'), 
    'test')

WebUI.click(findTestObject('Object Repository/Page_Edit Assessment - SDICMS/input_Supervisor Comments_ButtonSave'))

WebUI.click(findTestObject('Object Repository/Page_Edit Assessment - SDICMS/a_Log off'))

WebUI.closeBrowser()

