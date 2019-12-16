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

//Import menmonic with 3 words
Mobile.tap(findTestObject('App/General/MAIN - MY WALLETS'), 0)

Mobile.scrollToText('ADD NEW WALLET')

Mobile.tap(findTestObject('App/General/android 5 - Add new wallet'), 0)

Mobile.tap(findTestObject('App/Wallets/Add new wallet - IMPORT'), 0)

Mobile.tap(findTestObject('App/General/Address key mnemonic'), 0)

Mobile.tap(findTestObject('App/Wallets/input - Address key mnemonic'), 0)

Mobile.sendKeys(findTestObject('App/Wallets/input - Address key mnemonic'), mnem_3)

Mobile.tap(findTestObject('App/Wallets/wallet import - OK'), 0)

Mobile.tap(findTestObject('App/Wallets/button - finish IMPORT'), 0)

Mobile.tap(findTestObject('App/General/Button - GO TO WALLET'), 0)

Mobile.verifyElementExist(findTestObject('App/General/Button - SEND'), 0)

//Import menmonic with 6 words
Mobile.tap(findTestObject('App/General/MAIN - MY WALLETS'), 0)

Mobile.scrollToText('ADD NEW WALLET')

Mobile.tap(findTestObject('App/Wallets/ADD NEW WALLET'), 0)

Mobile.tap(findTestObject('App/Wallets/Add new wallet - IMPORT'), 0)

Mobile.tap(findTestObject('App/General/Address key mnemonic'), 0)

Mobile.tap(findTestObject('App/Wallets/input - Address key mnemonic'), 0)

Mobile.sendKeys(findTestObject('App/Wallets/input - Address key mnemonic'), mnem_6)

Mobile.tap(findTestObject('App/Wallets/wallet import - OK'), 0)

Mobile.tap(findTestObject('App/Wallets/button - finish IMPORT'), 0)

Mobile.tap(findTestObject('App/General/Button - GO TO WALLET'), 0)

Mobile.verifyElementExist(findTestObject('App/General/Button - SEND'), 0)

//Import menmonic with 9 words
Mobile.tap(findTestObject('App/General/MAIN - MY WALLETS'), 0)

Mobile.scrollToText('ADD NEW WALLET')

Mobile.tap(findTestObject('App/Wallets/ADD NEW WALLET'), 0)

Mobile.tap(findTestObject('App/Wallets/Add new wallet - IMPORT'), 0)

Mobile.tap(findTestObject('App/General/Address key mnemonic'), 0)

Mobile.tap(findTestObject('App/Wallets/input - Address key mnemonic'), 0)

Mobile.sendKeys(findTestObject('App/Wallets/input - Address key mnemonic'), mnem_9)

Mobile.tap(findTestObject('App/Wallets/wallet import - OK'), 0)

Mobile.tap(findTestObject('App/Wallets/button - finish IMPORT'), 0)

Mobile.tap(findTestObject('App/General/Button - GO TO WALLET'), 0)

Mobile.verifyElementExist(findTestObject('App/General/Button - SEND'), 0)

//Import menmonic with 12 words
Mobile.tap(findTestObject('App/General/MAIN - MY WALLETS'), 0)

Mobile.scrollToText('ADD NEW WALLET')

Mobile.tap(findTestObject('App/Wallets/ADD NEW WALLET'), 0)

Mobile.tap(findTestObject('App/Wallets/Add new wallet - IMPORT'), 0)

Mobile.tap(findTestObject('App/General/Address key mnemonic'), 0)

Mobile.tap(findTestObject('App/Wallets/input - Address key mnemonic'), 0)

Mobile.sendKeys(findTestObject('App/Wallets/input - Address key mnemonic'), mnem_12)

Mobile.tap(findTestObject('App/Wallets/wallet import - OK'), 0)

Mobile.tap(findTestObject('App/Wallets/button - finish IMPORT'), 0)

Mobile.tap(findTestObject('App/General/Button - GO TO WALLET'), 0)

Mobile.verifyElementExist(findTestObject('App/General/Button - SEND'), 0)

//Import menmonic with 15 words
Mobile.tap(findTestObject('App/General/MAIN - MY WALLETS'), 0)

Mobile.scrollToText('ADD NEW WALLET')

Mobile.tap(findTestObject('App/Wallets/ADD NEW WALLET'), 0)

Mobile.tap(findTestObject('App/Wallets/Add new wallet - IMPORT'), 0)

Mobile.tap(findTestObject('App/General/Address key mnemonic'), 0)

Mobile.tap(findTestObject('App/Wallets/input - Address key mnemonic'), 0)

Mobile.sendKeys(findTestObject('App/Wallets/input - Address key mnemonic'), mnem_15)

Mobile.tap(findTestObject('App/Wallets/wallet import - OK'), 0)

Mobile.tap(findTestObject('App/Wallets/button - finish IMPORT'), 0)

Mobile.tap(findTestObject('App/General/Button - GO TO WALLET'), 0)

Mobile.verifyElementExist(findTestObject('App/General/Button - SEND'), 0)

//Import menmonic with 18 words
Mobile.tap(findTestObject('App/General/MAIN - MY WALLETS'), 0)

Mobile.scrollToText('ADD NEW WALLET')

Mobile.tap(findTestObject('App/Wallets/ADD NEW WALLET'), 0)

Mobile.tap(findTestObject('App/Wallets/Add new wallet - IMPORT'), 0)

Mobile.tap(findTestObject('App/General/Address key mnemonic'), 0)

Mobile.tap(findTestObject('App/Wallets/input - Address key mnemonic'), 0)

Mobile.sendKeys(findTestObject('App/Wallets/input - Address key mnemonic'), mnem_18)

Mobile.tap(findTestObject('App/Wallets/wallet import - OK'), 0)

Mobile.tap(findTestObject('App/Wallets/button - finish IMPORT'), 0)

Mobile.tap(findTestObject('App/General/Button - GO TO WALLET'), 0)

Mobile.verifyElementExist(findTestObject('App/General/Button - SEND'), 0)

//Import menmonic with 21 words
Mobile.tap(findTestObject('App/General/MAIN - MY WALLETS'), 0)

Mobile.scrollToText('ADD NEW WALLET')

Mobile.tap(findTestObject('App/Wallets/ADD NEW WALLET'), 0)

Mobile.tap(findTestObject('App/Wallets/Add new wallet - IMPORT'), 0)

Mobile.tap(findTestObject('App/General/Address key mnemonic'), 0)

Mobile.tap(findTestObject('App/Wallets/input - Address key mnemonic'), 0)

Mobile.sendKeys(findTestObject('App/Wallets/input - Address key mnemonic'), mnem_21)

Mobile.tap(findTestObject('App/Wallets/wallet import - OK'), 0)

Mobile.tap(findTestObject('App/Wallets/button - finish IMPORT'), 0)

Mobile.tap(findTestObject('App/General/Button - GO TO WALLET'), 0)

Mobile.verifyElementExist(findTestObject('App/General/Button - SEND'), 0)

//Import menmonic with 24 words
Mobile.tap(findTestObject('App/General/MAIN - MY WALLETS'), 0)

Mobile.scrollToText('ADD NEW WALLET')

Mobile.tap(findTestObject('App/Wallets/ADD NEW WALLET'), 0)

Mobile.tap(findTestObject('App/Wallets/Add new wallet - IMPORT'), 0)

Mobile.tap(findTestObject('App/General/Address key mnemonic'), 0)

Mobile.tap(findTestObject('App/Wallets/input - Address key mnemonic'), 0)

Mobile.sendKeys(findTestObject('App/Wallets/input - Address key mnemonic'), mnem_24)

Mobile.tap(findTestObject('App/Wallets/wallet import - OK'), 0)

Mobile.tap(findTestObject('App/Wallets/button - finish IMPORT'), 0)

Mobile.tap(findTestObject('App/General/Button - GO TO WALLET'), 0)

Mobile.verifyElementExist(findTestObject('App/General/Button - SEND'), 0)

