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

Mobile.tap(findTestObject('App/General/MAIN - MY WALLETS'), 0)

Mobile.tap(findTestObject('App/Wallets/Wallet Menu'), 0)

Mobile.tap(findTestObject('App/Wallets/Wallet menu - Rename wallet'), 0)

Mobile.tap(findTestObject('App/Wallets/Import - Wallet Name - Clear'), 0)

Mobile.tap(findTestObject('App/Wallets/Rename screen - Wallet name'), 0)

Mobile.sendKeys(findTestObject('App/Wallets/Rename screen - Wallet name'), GlobalVariable.name_mnem)

Mobile.tap(findTestObject('App/Wallets/RENAME WALLET - SAVE'), 0)

Mobile.verifyElementExist(findTestObject('App/Wallets/snackbar - Wallet renamed'), 0)

