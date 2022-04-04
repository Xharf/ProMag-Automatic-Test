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

WebUI.click(findTestObject('Page_Home/anchor - Project Rejected'))

WebUI.verifyElementPresent(findTestObject('Page_ProjectRejected/text - title - Rejected Project'), 0)

WebUI.verifyElementNotPresent(findTestObject('Page_ProjectRegistered/text - No items to show'), 0)

WebUI.verifyElementText(findTestObject('Page_ProjectRegistered/text - 1record'), '1 record')

WebUI.click(findTestObject('Page_ProjectRegistered/button - action - delete'))

WebUI.verifyElementPresent(findTestObject('Page_ProjectRegistered/text - delete - confirm Are You Sure to delete this Item'), 
    0)

WebUI.click(findTestObject('Page_ProjectRegistered/button - delete - cancel'))

WebUI.verifyElementText(findTestObject('Page_ProjectRegistered/text - 1record'), '1 record')

WebUI.click(findTestObject('Page_ProjectRegistered/button - action - delete'))

WebUI.verifyElementPresent(findTestObject('Page_ProjectRegistered/text - delete - confirm Are You Sure to delete this Item'), 
    0)

WebUI.click(findTestObject('Page_ProjectRegistered/button - delete - delete'))

WebUI.verifyElementPresent(findTestObject('Page_ProjectRegistered/text - alert - Transaksi sudah dihapus'), 0)

WebUI.verifyElementPresent(findTestObject('Page_ProjectRegistered/text - No items to show'), 0)

WebUI.callTestCase(findTestCase('Step as test case/logout'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

