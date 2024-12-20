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

'Open Browser'
WebUI.openBrowser('')

'Full screen mode'
WebUI.maximizeWindow()

'Navigate to url nutriclub production'
WebUI.navigateToUrl(GlobalVariable.prodEnv)

'Accept cookie button'
WebUI.click(findTestObject('Object Repository/Page_Nutriclub Dukung si Kecil jadi Pemenang/button_Aktifkan Semua Cookie'))

'Click button masuk'
WebUI.click(findTestObject('Object Repository/Page_Nutriclub Dukung si Kecil jadi Pemenang/a_Masuk'))

'Input phone number'
WebUI.setText(findTestObject('Object Repository/Page_Login Membership Nutriclub Akses Fitur_756b12/input_No Handphone_username'), 
    GlobalVariable.phoneNumber)

'Input password'
WebUI.setText(findTestObject('Object Repository/Page_Login Membership Nutriclub Akses Fitur_756b12/input_Kata Sandi_password'), 
    GlobalVariable.password)

'Click login button'
WebUI.click(findTestObject('Object Repository/Page_Login Membership Nutriclub Akses Fitur_756b12/button_Masuk'))

'Verify login successfully'
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Membership Dashboard/p_Login Berhasil'), 0)

'Verify text "Login Berhasil"'
WebUI.verifyElementText(findTestObject('Object Repository/Page_Membership Dashboard/p_Login Berhasil'), 'Login Berhasil')

'Click button exit popup'
WebUI.click(findTestObject('Object Repository/Page_Membership Dashboard/span_'))

'Close browser'
WebUI.closeBrowser()

