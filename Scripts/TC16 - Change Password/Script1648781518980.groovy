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

WebUI.callTestCase(findTestCase('Step as test case/login'), [('npk') : npk, ('password') : password], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('Page_Home/card - user profile'))

WebUI.click(findTestObject('Page_Home/button - Change Password'))

WebUI.verifyTextPresent('Change Password User', true)

WebUI.click(findTestObject('Page_UserChangePassword/button - cancel'))

WebUI.callTestCase(findTestCase('Step as test case/logout'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Step as test case/login'), [('npk') : npk, ('password') : password], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('Page_Home/card - user profile'))

WebUI.click(findTestObject('Page_Home/button - Change Password'))

WebUI.verifyTextPresent('Change Password User', true)

WebUI.click(findTestObject('Page_UserChangePassword/button - save'))

WebUI.verifyElementPresent(findTestObject('Page_UserChangePassword/text - alert - Old Password Tidak Sesuai'), 0)

WebUI.verifyElementPresent(findTestObject('Page_UserChangePassword/text - small - error - confirm new password Required field'), 
    0)

WebUI.verifyElementPresent(findTestObject('Page_UserChangePassword/text - small - error - new password Required field'), 
    0)

WebUI.verifyElementPresent(findTestObject('Page_UserChangePassword/text - small - error - old password Required field'), 
    0)

WebUI.setText(findTestObject('Page_UserChangePassword/input - old password'), password)

WebUI.setText(findTestObject('Page_UserChangePassword/input - new password'), new_password)

WebUI.setText(findTestObject('Page_UserChangePassword/input - confirm new password'), new_cpassword)

WebUI.click(findTestObject('Page_UserChangePassword/button - save'))

WebUI.verifyElementPresent(findTestObject('Page_Home/text - alert - User berhasil diubah'), 0)

WebUI.mouseOver(findTestObject('Page_Home/card - user profile'))

WebUI.click(findTestObject('Page_Home/button - Change Password'))

WebUI.setText(findTestObject('Page_UserChangePassword/input - old password'), password)

WebUI.click(findTestObject('Page_UserChangePassword/button - save'))

WebUI.verifyElementPresent(findTestObject('Page_UserChangePassword/text - alert - Old Password Tidak Sesuai'), 0)

WebUI.verifyElementPresent(findTestObject('Page_UserChangePassword/text - small - error - new password Required field'), 
    0)

WebUI.verifyElementPresent(findTestObject('Page_UserChangePassword/text - small - error - old password Required field'), 
    0)

WebUI.callTestCase(findTestCase('Step as test case/logout'), [:], FailureHandling.STOP_ON_FAILURE)

