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

WebUI.click(findTestObject('Page_Home/dropdown - Project Management'))

WebUI.click(findTestObject('Page_Home/anchor - Project Registered'))

WebUI.verifyElementPresent(findTestObject('Page_ProjectRegistered/text - title - Registered Project'), 0)

WebUI.click(findTestObject('Page_ProjectRegistered/button - action - edit'))

WebUI.verifyElementPresent(findTestObject('Page_ProjectForm/text - title - Edit Order Techno'), 0)

WebUI.setText(findTestObject('Page_ProjectForm/input - Requester Name'), requester_name)

WebUI.setText(findTestObject('Page_ProjectForm/input - Phone'), phone)

WebUI.setText(findTestObject('Page_ProjectForm/input - Email'), email)

if (project_section != '') {
    WebUI.selectOptionByValue(findTestObject('Page_ProjectForm/select - Select Section'), project_section, false)
}

WebUI.setText(findTestObject('Page_ProjectForm/input - Project Name'), project_name)

WebUI.setText(findTestObject('Page_ProjectForm/input - Project Description'), project_desc)

if (project_size != '') {
    WebUI.selectOptionByValue(findTestObject('Page_ProjectForm/select - Select Project Size'), project_size, false)
}

WebUI.setText(findTestObject('Page_ProjectForm/input - File Timeline'), file_timeline)

if (project_type != '') {
    WebUI.selectOptionByValue(findTestObject('Page_ProjectForm/select - Select Project Type'), project_type, false)
}

WebUI.setText(findTestObject('Page_ProjectForm/input - Request ID Project'), project_id)

WebUI.setText(findTestObject('Page_ProjectForm/input - Link Board PRJ (Monday)'), link_monday)

WebUI.setText(findTestObject('Page_ProjectForm/input - List Email'), list_email)

if (project_type != '') {
    WebUI.selectOptionByValue(findTestObject('Page_ProjectForm/select - Pilih Status'), project_status, false)
}

if (psa1 && (psa1 != '0')) {
    WebUI.check(findTestObject('Page_ProjectForm/checkbox - PSA - item 1'))

    WebUI.setText(findTestObject('Page_ProjectForm/input - qty - psa1'), psa_qty1)
}

if (psa2 && (psa2 != '0')) {
    WebUI.check(findTestObject('Page_ProjectForm/checkbox - PSA - item 2'))

    WebUI.setText(findTestObject('Page_ProjectForm/input - qty - psa2'), psa_qty2)
}

WebUI.scrollToElement(findTestObject('Page_ProjectForm/checkbox - PSA - item 1'), 0)

if (fe1 && (fe1 != '0')) {
    WebUI.check(findTestObject('Page_ProjectForm/checkbox - FE - item 1'))

    WebUI.setText(findTestObject('Page_ProjectForm/input - qty - fe1'), fe_qty1)
}

if (fe2 && (fe2 != '0')) {
    WebUI.check(findTestObject('Page_ProjectForm/checkbox - FE - item 2'))

    WebUI.setText(findTestObject('Page_ProjectForm/input - qty - fe2'), fe_qty1)
}

WebUI.scrollToElement(findTestObject('Page_ProjectForm/checkbox - FE - item 1'), 0)

if (be1 && (be1 != '0')) {
    WebUI.check(findTestObject('Page_ProjectForm/checkbox - BE - item 1'))

    WebUI.setText(findTestObject('Page_ProjectForm/input - qty - be1'), be_qty1)
}

if (be2 && (be2 != '0')) {
    WebUI.check(findTestObject('Page_ProjectForm/checkbox - BE - item 2'))

    WebUI.setText(findTestObject('Page_ProjectForm/input - qty - be2'), be_qty2)
}

WebUI.scrollToElement(findTestObject('Page_ProjectForm/checkbox - BE - item 1'), 0)

if (da1 && (da1 != '0')) {
    WebUI.check(findTestObject('Page_ProjectForm/checkbox - DA - item 1'))

    WebUI.setText(findTestObject('Page_ProjectForm/input - qty - da1'), da_qty1)
}

if (da2 && (da2 != '0')) {
    WebUI.check(findTestObject('Page_ProjectForm/checkbox - DA - item 2'))

    WebUI.setText(findTestObject('Page_ProjectForm/input - qty - da2'), da_qty2)
}

WebUI.scrollToElement(findTestObject('Page_ProjectForm/checkbox - DA - item 1'), 0)

if (qc1 && (qc1 != '0')) {
    WebUI.check(findTestObject('Page_ProjectForm/checkbox - QC - item 1'))

    WebUI.setText(findTestObject('Page_ProjectForm/input - qty - qc1'), qc_qty1)
}

if (qc2 && (qc2 != '0')) {
    WebUI.check(findTestObject('Page_ProjectForm/checkbox - QC - item 2'))

    WebUI.setText(findTestObject('Page_ProjectForm/input - qty - qc2'), qc_qty2)
}

WebUI.click(findTestObject('Page_ProjectForm/button - edit - Ok'))

if (((((((((((((requester_name == '') || (phone == '')) || (email == '')) || (project_section == '')) || (project_name == 
'')) || (project_desc == '')) || (project_size == '')) || (project_type == '')) || (project_id == '')) || (link_monday == 
'')) || (list_email == '')) || (((((((((psa1 == false) && (psa2 == false)) && (fe1 == false)) && (fe2 == false)) && (be1 == 
false)) && (be2 == false)) && (da1 == false)) && (da2 == false)) && (qc1 == false))) || !(email.contains('@acc.co.id'))) {
    if (!(email.contains('@acc.co.id'))) {
        WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Form/Text - alert - Email harus acc.co.id'), 0)
    } else if (project_id == '') {
        WebUI.verifyElementPresent(findTestObject('Object Repository/Page_ProjectForm/text - alert - Harap isikan Request ID Project'), 
            0)
    } else {
        WebUI.verifyElementPresent(findTestObject('Object Repository/Page_ProjectForm/text - alert - SOMETHING WENT WRONG'), 
            0)
    }
} else {
    WebUI.verifyElementPresent(findTestObject('Page_ProjectForm/text - alert - Transaksi berhasil diupdate'), 0)
}

