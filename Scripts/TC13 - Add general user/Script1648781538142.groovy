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

WebUI.callTestCase(findTestCase('Step as test case/login'), [('password') : password, ('npk') : npk], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Home/anchor - User Management'))

if(n_npk != '') {	
	if(WebUI.verifyTextPresent(n_npk, false, FailureHandling.OPTIONAL)) {
		npk_isUsed = true;
	}
}
WebUI.click(findTestObject('Page_UserManagement/button - create new user'))

WebUI.setText(findTestObject('Page_UserDetail/input - username'), n_username)

WebUI.setText(findTestObject('Page_UserDetail/input - npk'), n_npk)

WebUI.setText(findTestObject('Page_UserDetail/input - email'), n_email)

WebUI.setText(findTestObject('Page_UserDetail/input - phone'), n_phone)

if(n_role != '') {
	WebUI.selectOptionByValue(findTestObject('Object Repository/Page_UserDetail/select_- Select User Role -AdminUser'), n_role,true)
}

WebUI.setText(findTestObject('Page_UserDetail/input - password'), n_password )

if(n_active == '0') {
	WebUI.uncheck(findTestObject('Page_UserDetail/checkbox - active'))	
} else {
	WebUI.check(findTestObject('Page_UserDetail/checkbox - active'))	
}

WebUI.click(findTestObject('Page_UserDetail/button - save'))

if(n_username == '') {
	WebUI.verifyElementPresent(findTestObject('Object Repository/Page_UserDetail/text - error - small - username - Required field'), 0)
}

if(n_npk == '') {
	WebUI.verifyElementPresent(findTestObject('Object Repository/Page_UserDetail/text - error - small - npk - Required field'), 0)
}

if(n_email == '') {
	WebUI.verifyElementPresent(findTestObject('Object Repository/Page_UserDetail/text - error - small - email - Required field'), 0)
}

if(n_phone == '') {
	WebUI.verifyElementPresent(findTestObject('Object Repository/Page_UserDetail/text - error - small - phone - Required field'), 0)
}
if(n_role == '') {
	WebUI.verifyElementPresent(findTestObject('Object Repository/Page_UserDetail/text - error - small - role - Required field'), 0)
}

if(n_password == '') {
	WebUI.verifyElementPresent(findTestObject('Object Repository/Page_UserDetail/text - error - small - password - Required field'), 0)
}

if(npk_isUsed) {
	WebUI.verifyElementPresent(findTestObject('Object Repository/Page_UserDetail/text - alert - Npk sudah terdaftar'), 0)
} else if(!n_email.contains("@acc.co.id")) {
	WebUI.verifyElementPresent(findTestObject('Object Repository/Page_UserDetail/text - alert - Email harus acc.co.id(CREATE)'), 0)
} else if(
	n_username == ''
	|| n_npk == ''
	|| n_email == ''
	|| n_phone == ''
	|| n_role == ''
	|| n_password == ''
) {
	WebUI.verifyElementPresent(findTestObject('Object Repository/Page_UserDetail/text - alert - Isi semua data(CREATE)'), 0)
}

WebUI.callTestCase(findTestCase('Step as test case/logout'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

