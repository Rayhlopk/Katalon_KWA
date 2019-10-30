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

Mobile.tap(findTestObject('First tests/General/my wallets icon'), 0)

Mobile.tap(findTestObject('First tests/Wallets/android.widget.TextView0 - ADD NEW WALLET'), 0)

Mobile.tap(findTestObject('First tests/Wallets/android.widget.TextView0 - IMPORT'), 0)

Mobile.tap(findTestObject('First tests/General/android.widget.TextView0 - Address key mnemonic'), 0)

Mobile.tap(findTestObject('First tests/Wallets/(enter)android.widget.EditText0 - Address key mnemonic'), 0)

Mobile.sendKeys(findTestObject('First tests/Wallets/(enter)android.widget.EditText0 - Address key mnemonic'), GlobalVariable.mnemonic_dragon)

Mobile.tap(findTestObject('First tests/Wallets/(enter)android.widget.TextView0 - OK'), 0)

Mobile.tap(findTestObject('First tests/Wallets/(finish)android.widget.TextView0 - IMPORT'), 0)

Mobile.tap(findTestObject('First tests/General/android.widget.Button0 - GO TO WALLET'), 0)

Mobile.tap(findTestObject('First tests/General/my wallets icon'), 0)

Mobile.tap(findTestObject('First tests/Wallets/wallet menu'), 0)

Mobile.tap(findTestObject('First tests/Wallets/android.widget.TextView0 - Enable multi-address mode'), 0)

Mobile.tap(findTestObject('First tests/Wallets/android.widget.Button0 - ENABLE'), 0)

Mobile.tap(findTestObject('First tests/Wallets/android.widget.TextView0 - ADD NEW ADDRESS'), 0)

Mobile.tap(findTestObject('First tests/Wallets/my wallet back button'), 0)

Mobile.tap(findTestObject('First tests/Wallets/my wallets back button'), 0)

Mobile.tap(findTestObject('First tests/General/android.widget.Button0 - SEND'), 0)

Mobile.tap(findTestObject('First tests/Send/send - recipient'), 0)

Mobile.tap(findTestObject('First tests/Send/recipient - My Wallet 1'), 0)

Mobile.tap(findTestObject('First tests/Send/send - amount'), 0)

Mobile.sendKeys(findTestObject('First tests/Send/send - amount - paste'), '0.001')

not_run: Mobile.tap(findTestObject('First tests/Send/send button'), 0)

not_run: Mobile.tap(findTestObject('First tests/Navigate Back'), 0)

Mobile.tap(findTestObject('First tests/Send/send - back'), 0)

Mobile.tap(findTestObject('First tests/General/my wallets icon'), 0)

Mobile.tap(findTestObject('First tests/Wallets/wallet menu'), 0)

Mobile.tap(findTestObject('First tests/Wallets/android.widget.TextView0 - Disable multi-address mode'), 0)

Mobile.tap(findTestObject('First tests/Wallets/android.widget.Button0 - DISABLE'), 0)

Mobile.tap(findTestObject('First tests/Wallets/android.widget.TextView0 - Address 2'), 0)

Mobile.tap(findTestObject('First tests/Wallets/android.widget.Button0 - KEEP THIS ADDRESS'), 0)

Mobile.tap(findTestObject('First tests/Wallets/wallet menu'), 0)

Mobile.verifyElementExist(findTestObject('First tests/Wallets/android.widget.TextView0 - Enable multi-address mode'), 0)

