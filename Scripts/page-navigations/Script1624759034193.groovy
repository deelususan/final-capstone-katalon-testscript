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

WebUI.maximizeWindow()

WebUI.click(findTestObject('navigations/h1_Tasty Lounge'))

WebUI.click(findTestObject('navigations/a_About Us'))

WebUI.verifyElementPresent(findTestObject('navigations/h1_Tasty Lounge'), 0)

WebUI.click(findTestObject('navigations/img'))

WebUI.click(findTestObject('navigations/a_View Menu (current)'))

WebUI.click(findTestObject('navigations/h1_Tasty Lounge'))

WebUI.click(findTestObject('navigations/a_Butter Chicken'))

WebUI.click(findTestObject('navigations/a_Back to Menu'))

WebUI.click(findTestObject('navigations/a_New User Registration'))

WebUI.click(findTestObject('navigations/input_First Name_fname'))

WebUI.click(findTestObject('navigations/h1_Tasty Lounge'))

WebUI.click(findTestObject('navigations/a_User Login'))

WebUI.click(findTestObject('navigations/h4_User Login'))

WebUI.click(findTestObject('navigations/a_Admin Login'))

WebUI.click(findTestObject('navigations/h4_Administrative Login'))

WebUI.click(findTestObject('navigations/img_1'))

WebUI.closeBrowser()

