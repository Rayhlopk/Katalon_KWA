import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

//Import menmonic with passphrase
Mobile.tap(findTestObject('App/General/MAIN - MY WALLETS'), 0)

Mobile.scrollToText('ADD NEW WALLET')

Mobile.tap(findTestObject('App/Wallets/ADD NEW WALLET'), 0)

Mobile.tap(findTestObject('App/Wallets/Add new wallet - IMPORT'), 0)

Mobile.tap(findTestObject('App/General/android.widget.TextView0 - Address key mnemonic'), 0)

Mobile.tap(findTestObject('App/Wallets/input - Address key mnemonic'), 0)

Mobile.sendKeys(findTestObject('App/Wallets/input - Address key mnemonic'), mnemonic)

Mobile.tap(findTestObject('App/Wallets/Import - Advanced'), 0)

Mobile.tap(findTestObject('App/Wallets/Import - Advanced - Passphrase'), 0)

Mobile.sendKeys(findTestObject('App/Wallets/Import - Advanced - Passphrase'), passphrase)

Mobile.scrollToText('Derivation path', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('App/Wallets/Import - Advanced - clear derivation'), 0)

Mobile.tap(findTestObject('App/Wallets/Import - Advanced - Derivation'), 0)

Mobile.sendKeys(findTestObject('App/Wallets/Import - Advanced - Derivation'), derivation_path)

Mobile.tap(findTestObject('App/Wallets/wallet import - OK'), 0)

Mobile.tap(findTestObject('App/Wallets/button - finish IMPORT'), 0)

Mobile.tap(findTestObject('App/General/android.widget.Button0 - GO TO WALLET'), 0)

//Check sure that address on Receive screen equals expected
Mobile.tap(findTestObject('App/General/android.widget.Button0 - RECEIVE'), 0)

Mobile.verifyElementText(findTestObject('App/Wallets/Receive - your address'), address_passphrase_derivation)

Mobile.pressBack()

