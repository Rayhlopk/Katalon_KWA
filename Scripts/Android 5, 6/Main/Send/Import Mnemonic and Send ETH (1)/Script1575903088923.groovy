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

Mobile.startApplication('/Users/polinakhomishina/Downloads/3.2.0-app-release.apk', true)

Mobile.tap(findTestObject('App/Onboarding/android.widget.Button0 - SKIP'), 0)

Mobile.tap(findTestObject('App/Onboarding/PIN button - 3'), 0)

Mobile.tap(findTestObject('App/Onboarding/PIN button - 3'), 0)

Mobile.tap(findTestObject('App/Onboarding/PIN button - 3'), 0)

Mobile.tap(findTestObject('App/Onboarding/PIN button - 3'), 0)

Mobile.tap(findTestObject('App/Onboarding/PIN button - 3'), 0)

Mobile.tap(findTestObject('App/Onboarding/PIN button - 3'), 0)

Mobile.tap(findTestObject('App/Onboarding/PIN button - 3'), 0)

Mobile.tap(findTestObject('App/Onboarding/PIN button - 3'), 0)

Mobile.tap(findTestObject('App/Onboarding/PIN button - 3'), 0)

Mobile.tap(findTestObject('App/Onboarding/PIN button - 3'), 0)

Mobile.tap(findTestObject('App/Onboarding/PIN button - 3'), 0)

Mobile.tap(findTestObject('App/Onboarding/PIN button - 3'), 0)

Mobile.tap(findTestObject('App/Onboarding/android.widget.Button0 - IMPORT WALLET'), 0)

Mobile.tap(findTestObject('App/General/Address key mnemonic'), 0)

Mobile.tap(findTestObject('App/Wallets/input - Address key mnemonic'), 0)

Mobile.sendKeys(findTestObject('App/Wallets/input - Address key mnemonic'), GlobalVariable.mnemonic_stone)

Mobile.tap(findTestObject('App/Wallets/wallet import - OK'), 0)

Mobile.tap(findTestObject('App/Wallets/button - finish IMPORT'), 0)

Mobile.tap(findTestObject('App/General/Button - GO TO WALLET'), 0)

Mobile.tap(findTestObject('App/General/MAIN - MY WALLETS'), 0)

Mobile.tap(findTestObject('App/Wallets/wallet menu'), 0)

Mobile.tap(findTestObject('App/Wallets/Enable multi-address mode'), 0)

Mobile.tap(findTestObject('App/Wallets/button - ENABLE'), 0)

Mobile.tap(findTestObject('App/Wallets/ADD NEW ADDRESS'), 0)

Mobile.tap(findTestObject('App/Wallets/my wallet back button'), 0)

Mobile.tap(findTestObject('App/Wallets/my wallets back button'), 0)

Mobile.tap(findTestObject('App/General/Button - SEND'), 0)

Mobile.tap(findTestObject('App/Send/send - recipient'), 0)

Mobile.tap(findTestObject('App/Send/recipient - My Wallet 1'), 0)

Mobile.tap(findTestObject('App/Send/send - amount'), 0)

Mobile.sendKeys(findTestObject('App/Send/send - amount - paste'), '0.001')

not_run: Mobile.tap(findTestObject('App/Send/send button'), 0)

not_run: Mobile.tap(findTestObject('App/General/Navigate Back'), 0)

Mobile.tap(findTestObject('App/Send/send - back'), 0)

Mobile.tap(findTestObject('App/General/MAIN - MY WALLETS'), 0)

Mobile.tap(findTestObject('App/Wallets/wallet menu'), 0)

Mobile.tap(findTestObject('App/Wallets/Disable multi-address mode'), 0)

Mobile.tap(findTestObject('App/Wallets/button - DISABLE'), 0)

Mobile.tap(findTestObject('App/Wallets/Address 2'), 0)

Mobile.tap(findTestObject('App/Wallets/button - KEEP THIS ADDRESS'), 0)

Mobile.tap(findTestObject('App/Wallets/wallet menu'), 0)

Mobile.verifyElementExist(findTestObject('App/Wallets/Enable multi-address mode'), 0)

Mobile.closeApplication()

