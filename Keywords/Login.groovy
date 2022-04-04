import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.util.KeywordUtil

import internal.GlobalVariable

public class Login {

	@Keyword
	def static void loginIntoApp(String url, String npk, String password) {
		WebUI.maximizeWindow()
		try {
			KeywordUtil.logInfo("Navigate to url login")
			WebUI.navigateToUrl(url)
			WebUI.maximizeWindow()

			KeywordUtil.logInfo("Fill NPK")
			WebUI.sendKeys(findTestObject('Page_Login/input - NPK2'), npk)
			KeywordUtil.logInfo("Fill Password")
			WebUI.sendKeys(findTestObject('Object Repository/Page_Login/input - Password'), password)
			KeywordUtil.logInfo("Click login button")
			WebUI.click(findTestObject('Page_Login/button - Login2'))

			KeywordUtil.logInfo("Verify alert success")
			WebUI.verifyElementText(findTestObject('Page_Home/Text - Login Sukses'), )
			WebUI.click(findTestObject('Page_Home/button - close login alert'), 'Login Sukses')

			KeywordUtil.markPassed("Login Successfull")
		} catch (Exception e) {
			KeywordUtil.markFailed("Fail to Login")
		}
	}
}
