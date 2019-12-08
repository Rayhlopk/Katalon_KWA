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

Mobile.tap(findTestObject('App/Onboarding/android.widget.Button0 - 3'), 0)

Mobile.tap(findTestObject('App/Onboarding/android.widget.Button0 - 3'), 0)

Mobile.tap(findTestObject('App/Onboarding/android.widget.Button0 - 3'), 0)

Mobile.tap(findTestObject('App/Onboarding/android.widget.Button0 - 3'), 0)

Mobile.tap(findTestObject('App/Onboarding/android.widget.Button0 - 3'), 0)

Mobile.tap(findTestObject('App/Onboarding/android.widget.Button0 - 3'), 0)

Mobile.tap(findTestObject('App/Onboarding/android.widget.Button0 - 3'), 0)

Mobile.tap(findTestObject('App/Onboarding/android.widget.Button0 - 3'), 0)

Mobile.tap(findTestObject('App/Onboarding/android.widget.Button0 - 3'), 0)

Mobile.tap(findTestObject('App/Onboarding/android.widget.Button0 - 3'), 0)

Mobile.tap(findTestObject('App/Onboarding/android.widget.Button0 - 3'), 0)

Mobile.tap(findTestObject('App/Onboarding/android.widget.Button0 - 3'), 0)

Mobile.tap(findTestObject('App/Onboarding/android.widget.TextView0 - CREATE NEW WALLET'), 0)

Mobile.tap(findTestObject('App/Onboarding/android.widget.TextView0 - CREATE'), 0)

Mobile.tap(findTestObject('App/General/button SKIP'), 0)

Mobile.scrollToText('MANAGE ASSETS', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('App/General/android.widget.TextView0 - MANAGE ASSETS'), 0)

Mobile.tap(findTestObject('App/General/android.widget.TextView0 - ADD NEW ASSET'), 0)

Mobile.tap(findTestObject('App/General/android.widget.EditText0 - Address'), 0)

Mobile.sendKeys(findTestObject('App/General/android.widget.EditText0 - Address'), GlobalVariable.omix_address)

Mobile.tap(findTestObject('App/General/android.widget.TextView0 - ADD ASSET'), 0)

Mobile.tap(findTestObject('App/General/android.widget.Button0 - VIEW ASSET'), 0)

Mobile.closeApplication()

