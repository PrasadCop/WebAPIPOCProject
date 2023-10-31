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

WebUI.openBrowser('https://testportal.dsd.gov.za/SDICMS_TEST/User/Login')

WebUI.setText(findTestObject('Intake_OR/Search_No_Data_OR/Page_Login - SDICMS/input_Username_Username'), 'MSSekati')

WebUI.setText(findTestObject('Intake_OR/Search_No_Data_OR/Page_Login - SDICMS/input_Password_Password'), 'passworD123')

WebUI.click(findTestObject('Intake_OR/Search_No_Data_OR/Page_Login - SDICMS/input_Change Password_ButtonSave'))

WebUI.click(findTestObject('Intake_OR/Search_No_Data_OR/Page_Home Page - SDICMS/a_Module'))

WebUI.click(findTestObject('Intake_OR/Search_No_Data_OR/Page_Home Page - SDICMS/a_Intake'))

WebUI.click(findTestObject('Intake_OR/Search_No_Data_OR/Page_Intake Page - SDICMS/input_Date of Birth_ButtonFilter'))

WebUI.takeScreenshotAsCheckpoint('Intake')

