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

'Navigate to nutriclub production'
WebUI.navigateToUrl('https://www.nutriclub.co.id/')

'Accept cookie'
WebUI.click(findTestObject('Object Repository/Page_Nutriclub Dukung si Kecil jadi Pemenang/button_Aktifkan Semua Cookie'))

'Click button masuk'
WebUI.click(findTestObject('Object Repository/Page_Nutriclub Dukung si Kecil jadi Pemenang/a_Masuk'))

'Input phone number'
WebUI.setText(findTestObject('Object Repository/Page_Login Membership Nutriclub Akses Fitur_756b12/input_No Handphone_username'), 
    GlobalVariable.phoneNumber)

'Click button login'
WebUI.click(findTestObject('Object Repository/Page_Login Membership Nutriclub Akses Fitur_756b12/button_Masuk'))

'Verify error message "Kata Sandi harus diisi"'
WebUI.verifyElementText(findTestObject('Object Repository/Page_Login Membership Nutriclub Akses Fitur_756b12/div_Kata Sandi harus diisi'), 
    'Kata Sandi harus diisi')

'Close browser'
WebUI.closeBrowser()

