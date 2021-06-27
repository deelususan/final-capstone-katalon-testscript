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

WebUI.navigateToUrl('http://localhost:4200/home')

WebUI.click(findTestObject('admin-crud/a_Admin Login'))

WebUI.setText(findTestObject('admin-crud/input_Username_username'), 'admin')

WebUI.setEncryptedText(findTestObject('admin-crud/input_Password_password'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('admin-crud/button_Login'))

WebUI.click(findTestObject('admin-crud/button_Add New'))

WebUI.setText(findTestObject('admin-crud/input_Cusine_cusine'), 'Indian')

WebUI.setText(findTestObject('admin-crud/input_Name_name'), 'This is a test')

WebUI.setText(findTestObject('admin-crud/input_Description_desc'), 'Test Description')

WebUI.setText(findTestObject('admin-crud/input_Price_price'), '15.00')

WebUI.click(findTestObject('admin-crud/button_Submit'))

WebUI.click(findTestObject('admin-crud/button_Delete'))

WebUI.click(findTestObject('admin-crud/h1_Tasty Lounge'))

WebUI.closeBrowser()

