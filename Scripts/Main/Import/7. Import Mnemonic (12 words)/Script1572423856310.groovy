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

Mobile.tap(findTestObject('Smoke test/General/MAIN - MY WALLETS'), 0)

Mobile.scrollToText('ADD NEW WALLET')

Mobile.tap(findTestObject('Smoke test/Wallets/ADD NEW WALLET'), 0)

Mobile.tap(findTestObject('Smoke test/Wallets/Add new wallet - IMPORT'), 0)

Mobile.tap(findTestObject('Smoke test/General/android.widget.TextView0 - Address key mnemonic'), 0)

Mobile.tap(findTestObject('Smoke test/Wallets/input - Address key mnemonic'), 0)

Mobile.sendKeys(findTestObject('Smoke test/Wallets/input - Address key mnemonic'), GlobalVariable.mnem12)

Mobile.tap(findTestObject('Smoke test/Wallets/wallet import - OK'), 0)

Mobile.tap(findTestObject('Smoke test/Wallets/button - finish IMPORT'), 0)

Mobile.tap(findTestObject('Smoke test/General/android.widget.Button0 - GO TO WALLET'), 0)

Mobile.verifyElementExist(findTestObject('Smoke test/General/android.widget.Button0 - SEND'), 0)

