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

'Open browser'
WebUI.openBrowser('')

'Full screen mode'
WebUI.maximizeWindow()

'Navigate to url nurticlub production'
WebUI.navigateToUrl(GlobalVariable.prodEnv)

'Accept cookie button'
WebUI.click(findTestObject('Object Repository/Page_Nutriclub Dukung si Kecil jadi Pemenang/button_Aktifkan Semua Cookie'))

'Click button masuk'
WebUI.click(findTestObject('Object Repository/Page_Nutriclub Dukung si Kecil jadi Pemenang/a_Masuk'))

'Click "Login Tanpa Password"'
WebUI.click(findTestObject('Object Repository/Page_Login Membership Nutriclub Akses Fitur_756b12/a_Masuk Tanpa Kata Sandi'))

'Input phone number'
WebUI.setText(findTestObject('Object Repository/Page_Login via Kode OTP ke Membership Nutriclub/input_No Handphone_username'), 
    GlobalVariable.phoneNumber)

'Click send OTP'
WebUI.click(findTestObject('Object Repository/Page_Login via Kode OTP ke Membership Nutriclub/button_Kirim OTP'))

WebUI.waitForElementClickable(findTestObject('Page_Membership Nutriclub Menang di Setiap Langkah/button_Verifikasi'), 0)

'Click button verifikasi'
WebUI.click(findTestObject('Object Repository/Page_Membership Nutriclub Menang di Setiap Langkah/button_Verifikasi'))

'Verify login successfully'
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Membership Dashboard/p_Login Berhasil'), 30)

'Verify text "Login Berhasil"'
WebUI.verifyElementText(findTestObject('Object Repository/Page_Membership Dashboard/p_Login Berhasil'), 'Login Berhasil')

'Click button exit popup'
WebUI.click(findTestObject('Object Repository/Page_Membership Dashboard/span_'))

'Close browser'
WebUI.closeBrowser()

