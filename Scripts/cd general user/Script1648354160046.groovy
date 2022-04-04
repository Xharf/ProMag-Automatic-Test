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

WebUI.navigateToUrl('https://acc-dev.outsystemsenterprise.com/ACCProMAG/')

WebUI.setText(findTestObject('Page_Login/input_NPK_OutSystemsUIWeb_wt13blockwtLoginO_f1e72f'), '11111')

WebUI.setEncryptedText(findTestObject('Page_Login/input_Password_OutSystemsUIWeb_wt13blockwtL_739edd'), 's/14GxQjHdgQbNAB/uCn+A==')

WebUI.click(findTestObject('Page_Login/input_Forgot password_OutSystemsUIWeb_wt13b_d529e0'))

WebUI.click(findTestObject('Page_Home/anchor - User Management'))

WebUI.click(findTestObject('Page_UserManagement/button - create new user'))

WebUI.setText(findTestObject('Page_UserDetail/input - username'), 'shaziawaludin')

WebUI.setText(findTestObject('Page_UserDetail/input - npk'), '91898')

WebUI.setText(findTestObject('Page_UserDetail/input - email'), 'shaziawaludin@acc.co.id')

WebUI.setText(findTestObject('Page_UserDetail/input - phone'), '085775406400')

WebUI.click(findTestObject('Object Repository/Page_UserDetail/select_- Select User Role -AdminUser'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_UserDetail/select_- Select User Role -AdminUser'), '1', 
    true)

WebUI.setEncryptedText(findTestObject('Page_UserDetail/input - password'), 
    'nwr9I1qT+J0GbQ++JlYjHw==')

WebUI.click(findTestObject('Page_UserDetail/checkbox - active'))

WebUI.click(findTestObject('Page_UserDetail/button - save'))

WebUI.click(findTestObject('Page_UserManagement/button - action - delete'))

WebUI.click(findTestObject('Page_UserManagement/button - delete - delete'))

WebUI.click(findTestObject('null'))

