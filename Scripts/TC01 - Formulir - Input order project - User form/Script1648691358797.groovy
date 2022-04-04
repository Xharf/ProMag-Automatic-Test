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

WebUI.navigateToUrl('https://acc-dev.outsystemsenterprise.com/ACCProMAGForm/Form.aspx')

WebUI.maximizeWindow()

WebUI.verifyElementPresent(findTestObject('Page_Form/Text - title - Formulir Order Techno'), 0)

WebUI.setText(findTestObject('Page_Form/input - Request Name'), requester_name)

WebUI.setText(findTestObject('Page_Form/input - Phone'), phone)

WebUI.setText(findTestObject('Page_Form/input - Email'), email)

if(project_section != '') {
	WebUI.selectOptionByValue(findTestObject('Page_Form/select - section'), project_section, false)	
}

WebUI.setText(findTestObject('Page_Form/input - Project Name'), project_name)

WebUI.setText(findTestObject('Page_Form/input - Project Description'), project_desc)

if(project_size != '') {
	WebUI.selectOptionByValue(findTestObject('Page_Form/select - Select Project Size'), project_size, false)
}

WebUI.setText(findTestObject('Page_Form/input - File Timeline'), file_timeline)

if(project_type != '') {
	WebUI.selectOptionByValue(findTestObject('Page_Form/select - Select Project Type'), project_type, false)	
}

WebUI.setText(findTestObject('Page_Form/input - request id project'), project_id)

WebUI.setText(findTestObject('Page_Form/input - Link Board PRJ (Monday)'), link_monday)

WebUI.setText(findTestObject('Page_Form/input - List Email'), list_email)

if (psa1 && psa1 != '0') {
    WebUI.click(findTestObject('Page_Form/checkbox - PSA - item 1'))
    WebUI.setText(findTestObject('Page_Form/input - PSA - Quantity - item 1'), psa_qty1)
}

if (psa2 && psa2 != '0') {
    WebUI.click(findTestObject('Page_Form/checkbox - PSA - item 2'))

    WebUI.setText(findTestObject('Page_Form/input - PSA - Quantity - item 2'), psa_qty2)
}

WebUI.scrollToElement(findTestObject('Page_Form/checkbox - PSA - item 1'), 0)

if (fe1 && fe1 != '0') {
    WebUI.click(findTestObject('Page_Form/checkbox - FE - item 1'))

    WebUI.setText(findTestObject('Page_Form/input - fe - Quantity - item 1'), fe_qty1)
}

if (fe2 && fe2 != '0') {
    WebUI.click(findTestObject('Page_Form/checkbox - FE - item 2'))

    WebUI.setText(findTestObject('Page_Form/input - fe - Quantity - item 2'), fe_qty1)
}

WebUI.scrollToElement(findTestObject('Page_Form/checkbox - FE - item 1'), 0)

if (be1 && be1 != '0') {
    WebUI.click(findTestObject('Page_Form/checkbox - BE - item 1'))

    WebUI.setText(findTestObject('Page_Form/input - BE - Quantity - item 1'), be_qty1)
}

if (be2 && be2 != '0') {
    WebUI.click(findTestObject('Page_Form/checkbox - BE - item 2'))

    WebUI.setText(findTestObject('Page_Form/input - BE - Quantity - item 2'), be_qty2)
}

WebUI.scrollToElement(findTestObject('Page_Form/checkbox - BE - item 1'), 0)

if (da1 && da1 != '0') {
    WebUI.click(findTestObject('Page_Form/checkbox - DA - item 1'))

    WebUI.setText(findTestObject('Page_Form/input - DA - Quantity - item 1'), da_qty1)
}

if (da2 && da2 != '0') {
    WebUI.click(findTestObject('Page_Form/checkbox - DA - item 2'))

    WebUI.setText(findTestObject('Page_Form/input - DA - Quantity - item 2'), da_qty2)
}

WebUI.scrollToElement(findTestObject('Page_Form/checkbox - DA - item 1'), 0)

if (qc1 && qc1 != '0') {
    WebUI.click(findTestObject('Page_Form/checkbox - QC - item 1'))

    WebUI.setText(findTestObject('Page_Form/input - QC - Quantity - item 1'), qc_qty1)
}

WebUI.click(findTestObject('Page_Form/button - Ok'))

if (requester_name == '') {
    WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Form/text - small - error - request name Required field'), 
        0)
}

if (phone == '') {
    WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Form/text - small - error - Required field phone'), 
        0)
}

if (email == '') {
    WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Form/text - small - error - Required field email'), 
        0)
}

if (project_section == '') {
    WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Form/text - small - error - Required field section'), 
        0)
}

if (project_name == '') {
    WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Form/text - small - error - Required field project name'), 
        0)
}

if (project_desc == '') {
    WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Form/text - small - error - Required field project description'), 
        0)
}

if (project_size == '') {
    WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Form/text - small - error - Required field project size'), 
        0)
}

if (project_type == '') {
    WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Form/text - small - error - Required field project type'), 
        0)
}

if (project_id == '') {
    WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Form/text - small - error - Required field request id project'), 
        0)
}

if (link_monday == '') {
    WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Form/text - small - error - Required field link board prj'), 
        0)
}

if (list_email == '') {
    WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Form/text - small - error - Required field email list'), 
        0)
}

if((
	requester_name == ''
	|| phone == ''
	|| email == ''
	|| project_section == ''
	|| project_name == ''
	|| project_desc == ''
	|| project_size == ''
	|| project_type == ''
	|| project_id == ''
	|| link_monday == ''
	|| list_email == '')
	|| (
		psa1 == false
		&& psa2 == false
		&& fe1 == false
		&& fe2 == false
		&& be1 == false
		&& be2 == false
		&& da1 == false
		&& da2 == false
		&& qc1 == false
	)
	|| !email.contains("@acc.co.id")
	) {
		if(!email.contains("@acc.co.id")) {
			WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Form/Text - alert - Email harus acc.co.id'), 0)
		} else {
			WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Form/text - alert - Somethink Went Wrong'), 0)			
		}
	} else {
		WebUI.verifyElementPresent(findTestObject('Page_Form/text - alert - Transaksi berhasil ditambah'), 0)		
	}
WebUI.closeBrowser()

