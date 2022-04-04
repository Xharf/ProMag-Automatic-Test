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
import groovy.ui.SystemOutputInterceptor as SystemOutputInterceptor
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.callTestCase(findTestCase('Step as test case/login'), [('password') : password, ('npk') : npk], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Home/dropdown - Master Management'))

if (role == 'admin') {
    WebUI.click(findTestObject('Page_Home/anchor - MasterCategory', [('url') : url]))

    WebUI.verifyElementText(findTestObject('Page_MasterPSA/text - header - Master Management Item'), ' Master Management')

    old_value = WebUI.getText(findTestObject('Page_MasterPSA/text - Test item editable row', [('row') : row]))

    WebUI.click(findTestObject('Page_MasterPSA/button - action - edit', [('row') : row]))

    WebUI.setText(findTestObject('Page_MasterPSA/input - edit - Item Name'), old_value + ' edited')

    WebUI.click(findTestObject('Page_MasterPSA/button - edit - cancel'))

    WebUI.verifyElementText(findTestObject('Page_MasterPSA/text - Test item editable row', [('row') : row]), old_value)

    WebUI.click(findTestObject('Page_MasterPSA/button - action - edit', [('row') : row]))

    WebUI.setText(findTestObject('Page_MasterPSA/input - edit - Item Name'), old_value + ' edited')

    WebUI.click(findTestObject('Page_MasterPSA/button - edit - edit'))

    WebUI.verifyElementText(findTestObject('Page_MasterPSA/text - Test item editable row', [('row') : row]), old_value + ' edited')
} else {
    WebUI.verifyElementHasAttribute(findTestObject('Page_Home/anchor - MasterCategory - disabled', [('text') : url]), 'disabled', 
        0)
}

WebUI.callTestCase(findTestCase('Step as test case/logout'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

