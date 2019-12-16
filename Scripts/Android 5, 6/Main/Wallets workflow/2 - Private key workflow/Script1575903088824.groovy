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

//Import private key wallet
Mobile.tap(findTestObject('App/General/MAIN - MY WALLETS'), 0)

Mobile.scrollToText('ADD NEW WALLET')

Mobile.tap(findTestObject('App/General/android 5 - Add new wallet'), 0)

Mobile.tap(findTestObject('App/Wallets/Add new wallet - IMPORT'), 0)

Mobile.tap(findTestObject('App/General/Address key mnemonic'), 0)

Mobile.tap(findTestObject('App/Wallets/input - Address key mnemonic'), 0)

Mobile.sendKeys(findTestObject('App/Wallets/input - Address key mnemonic'), GlobalVariable.privkey_stone)

Mobile.tap(findTestObject('App/Wallets/wallet import - OK'), 0)

Mobile.tap(findTestObject('App/Wallets/button - finish IMPORT'), 0)

Mobile.tap(findTestObject('App/General/Button - GO TO WALLET'), 0)

Mobile.verifyElementExist(findTestObject('App/General/Button - SEND'), 0)

//Rename private key wallet
Mobile.tap(findTestObject('App/General/MAIN - MY WALLETS'), 0)

Mobile.tap(findTestObject('App/Wallets/Wallet 2 menu'), 0)

Mobile.tap(findTestObject('App/Wallets/Wallet menu - Rename wallet'), 0)

Mobile.tap(findTestObject('App/Wallets/Import - Wallet Name - Clear'), 0)

Mobile.tap(findTestObject('App/Wallets/Rename screen - Wallet name'), 0)

Mobile.sendKeys(findTestObject('App/Wallets/Rename screen - Wallet name'), GlobalVariable.name_mnem)

Mobile.tap(findTestObject('App/Wallets/RENAME WALLET - SAVE'), 0)

Mobile.verifyElementExist(findTestObject('App/Wallets/snackbar - Wallet renamed'), 0)

//Backup private key wallet
Mobile.tap(findTestObject('App/Wallets/Wallet 2 menu'), 0)

Mobile.tap(findTestObject('App/Wallets/Wallet menu - Backup wallet'), 0)

Mobile.tap(findTestObject('App/Onboarding/backup - checkbox 1'), 0)

Mobile.tap(findTestObject('App/Onboarding/backup - checkbox 2'), 0)

Mobile.tap(findTestObject('App/Onboarding/android.widget.Button0 - CONTINUE'), 0)

Mobile.tap(findTestObject('App/Onboarding/PIN button - 3'), 0)

Mobile.tap(findTestObject('App/Onboarding/PIN button - 3'), 0)

Mobile.tap(findTestObject('App/Onboarding/PIN button - 3'), 0)

Mobile.tap(findTestObject('App/Onboarding/PIN button - 3'), 0)

Mobile.tap(findTestObject('App/Onboarding/PIN button - 3'), 0)

Mobile.tap(findTestObject('App/Onboarding/PIN button - 3'), 0)

Mobile.tap(findTestObject('App/Onboarding/android.widget.Button0 - COPY TO CLIPBOARD'), 0)

Mobile.tap(findTestObject('App/Onboarding/android.widget.Button0 - DONE'), 0)

//Delete private key wallet
Mobile.tap(findTestObject('App/Wallets/Wallet 2 menu'), 0)

Mobile.tap(findTestObject('App/Wallets/Wallet menu - Delete wallet'), 0)

Mobile.waitForElementPresent(findTestObject('App/Wallets/button - Wallet - DELETE'), 0)

Mobile.tap(findTestObject('App/Wallets/button - Wallet - DELETE'), 0)

Mobile.verifyElementExist(findTestObject('App/Wallets/snackbar - Wallet deleted'), 0)

Mobile.pressBack()

