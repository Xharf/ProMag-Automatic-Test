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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

WebUI.openBrowser('')

WebUI.callTestCase(findTestCase('Step as test case/login'), [('npk') : npk, ('password') : password], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Home/dropdown - Project Management'))

WebUI.click(findTestObject('Page_Home/anchor - Project Registered'))

WebUI.verifyElementPresent(findTestObject('Page_ProjectRegistered/text - title - Registered Project'), 0)

p_id = WebUI.getText(findTestObject('Page_ProjectRegistered/text - test data - id', [('row') : row]))

p_rname = WebUI.getText(findTestObject('Page_ProjectRegistered/text - test data - requestor', [('row') : row]))

WebUI.click(findTestObject('Page_ProjectRegistered/button - action - project info', [('row') : row]))

WebUI.scrollToElement(findTestObject('Page_ProjectForm/button - detail - cancel'), 0)

WebUI.click(findTestObject('Page_ProjectForm/button - detail - cancel'))

WebUI.click(findTestObject('Page_ProjectRegistered/button - action - copy template', [('row') : row]))

def text = WebUI.getText(findTestObject('Object Repository/Page_EmailTemp/textarea'))

if (!(text.contains(p_id))) {
    KeywordUtil.markFailedAndStop('Id is not visible or wrong value on template')
}

if (!(text.contains(p_rname))) {
    KeywordUtil.markFailedAndStop('requester name is not visible or wrong value on template')
}

WebUI.verifyElementClickable(findTestObject('Page_EmailTemp/button - copy'))

WebUI.click(findTestObject('Page_EmailTemp/button - cancel'))

WebUI.callTestCase(findTestCase('Step as test case/logout'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

