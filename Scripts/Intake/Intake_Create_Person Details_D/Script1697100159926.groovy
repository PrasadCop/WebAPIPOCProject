import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://testportal.dsd.gov.za/SDICMS_TEST/')

WebUI.click(findTestObject('null'))

WebUI.setText(findTestObject('null'), 'Dkarthikeyan')

WebUI.setEncryptedText(findTestObject('null'), 
    'aIXAl78w3oZthhrKd/GaoA==')

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.setText(findTestObject('null'), 
    'Test')

WebUI.selectOptionByValue(findTestObject('null'), 
    '3', true)

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.selectOptionByValue(findTestObject('null'), 
    '2', true)

WebUI.setText(findTestObject('null'), 
    'Deepika')

WebUI.setText(findTestObject('null'), 
    'Karthikeyan')

WebUI.selectOptionByValue(findTestObject('null'), 
    '1', true)

WebUI.setText(findTestObject('null'), 
    'N7062563')

WebUI.click(findTestObject('null'))

WebUI.selectOptionByValue(findTestObject('null'), 
    '', true)

WebUI.click(findTestObject('null'))

WebUI.selectOptionByValue(findTestObject('null'), 
    '2', true)

WebUI.selectOptionByValue(findTestObject('null'), 
    '88', true)

WebUI.selectOptionByValue(findTestObject('null'), 
    '2', true)

WebUI.selectOptionByValue(findTestObject('null'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('null'), 
    '2', true)

WebUI.selectOptionByValue(findTestObject('null'), 
    '2', true)

WebUI.selectOptionByValue(findTestObject('null'), 
    '2', true)

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.closeBrowser()

