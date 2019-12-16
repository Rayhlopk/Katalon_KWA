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

Mobile.tap(findTestObject('App/General/Button - SEND'), 0)

Mobile.tap(findTestObject('App/General/Button - UNLOCK FEATURES'), 0)

Mobile.sendKeys(findTestObject('App/General/Input - Backup phrase'), GlobalVariable.privkey_stone)

Mobile.tap(findTestObject('App/General/UNLOCK'), 0)

Mobile.tap(findTestObject('App/Onboarding/PIN button - 3'), 0)

Mobile.tap(findTestObject('App/Onboarding/PIN button - 3'), 0)

Mobile.tap(findTestObject('App/Onboarding/PIN button - 3'), 0)

Mobile.tap(findTestObject('App/Onboarding/PIN button - 3'), 0)

Mobile.tap(findTestObject('App/Onboarding/PIN button - 3'), 0)

Mobile.tap(findTestObject('App/Onboarding/PIN button - 3'), 0)

Mobile.tap(findTestObject('App/General/Button - GO TO SEND'), 0)

Mobile.tap(findTestObject('App/General/Navigate Back'), 0)

