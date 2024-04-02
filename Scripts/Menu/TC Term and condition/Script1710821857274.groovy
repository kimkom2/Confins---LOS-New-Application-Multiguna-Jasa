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

//TestData Datahohendy = findTestData('null')


        WebUI.switchToDefaultContent()

        def CEK1 = WebUI.getText(findTestObject('Object Repository/Menu/Credit admin/Tab Term condition/NO 1'),FailureHandling.OPTIONAL)

        if (CEK1.contains('Yes')) 
		{
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Term condition/CEK NO 1'),FailureHandling.OPTIONAL)
        }
		
		WebUI.delay(2)
		
		def CEK2 = WebUI.getText(findTestObject('Object Repository/Menu/Credit admin/Tab Term condition/NO 2'),FailureHandling.OPTIONAL)
		
		if (CEK2.contains('Yes'))
		{
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Term condition/CEK NO 2'),FailureHandling.OPTIONAL)
		}
		
		WebUI.delay(2)
		
		def CEK3 = WebUI.getText(findTestObject('Object Repository/Menu/Credit admin/Tab Term condition/NO 3'),FailureHandling.OPTIONAL)
		
		if (CEK3.contains('Yes'))
		{
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Term condition/CEK NO 3'),FailureHandling.OPTIONAL)
		}
		
		WebUI.delay(2)
		
		def CEK4 = WebUI.getText(findTestObject('Object Repository/Menu/Credit admin/Tab Term condition/NO 4'),FailureHandling.OPTIONAL)
		
		if (CEK4.contains('Yes'))
		{
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Term condition/CEK NO 4'),FailureHandling.OPTIONAL)
		}
		
		WebUI.delay(2)
		
		def CEK5 = WebUI.getText(findTestObject('Object Repository/Menu/Credit admin/Tab Term condition/NO 5'),FailureHandling.OPTIONAL)
		
		if (CEK5.contains('Yes'))
		{
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Term condition/CEK NO 5'),FailureHandling.OPTIONAL)
		}
		
		WebUI.delay(2)

        def CEK6 = WebUI.getText(findTestObject('Object Repository/Menu/Credit admin/Tab Term condition/NO 6'),FailureHandling.OPTIONAL)

        if (CEK6.contains('Yes')) 
		{
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Term condition/CEK NO 6'),FailureHandling.OPTIONAL)
        } 
		
		WebUI.delay(2)
		
		def CEK7 = WebUI.getText(findTestObject('Object Repository/Menu/Credit admin/Tab Term condition/NO 7'),FailureHandling.OPTIONAL)
		
		if (CEK7.contains('Yes'))
		{
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Term condition/CEK NO 7'),FailureHandling.OPTIONAL)
		}
		
		WebUI.delay(2)
		
		def CEK8 = WebUI.getText(findTestObject('Object Repository/Menu/Credit admin/Tab Term condition/NO 8'),FailureHandling.OPTIONAL)
		
		if (CEK8.contains('Yes'))
		{
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Term condition/CEK NO 8'),FailureHandling.OPTIONAL)
		}
		
		WebUI.delay(2)
		
		def CEK9 = WebUI.getText(findTestObject('Object Repository/Menu/Credit admin/Tab Term condition/NO 9'),FailureHandling.OPTIONAL)
		
		if (CEK9.contains('Yes'))
		{
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Term condition/CEK NO 9'),FailureHandling.OPTIONAL)
		}
		
		WebUI.delay(2)
		
		def CEK10 = WebUI.getText(findTestObject('Object Repository/Menu/Credit admin/Tab Term condition/NO 10'),FailureHandling.OPTIONAL)
		
		if (CEK10.contains('Yes'))
		{
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Term condition/CEK NO 10'),FailureHandling.OPTIONAL)
		}
		
		WebUI.delay(2)
		
		def CEK11 = WebUI.getText(findTestObject('Object Repository/Menu/Credit admin/Tab Term condition/NO 11'),FailureHandling.OPTIONAL)
		
		if (CEK11.contains('Yes'))
		{
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Term condition/CEK NO 11'),FailureHandling.OPTIONAL)
		}
		
		WebUI.delay(2)
		
		def CEK12 = WebUI.getText(findTestObject('Object Repository/Menu/Credit admin/Tab Term condition/NO 12'),FailureHandling.OPTIONAL)
		
		if (CEK12.contains('Yes'))
		{
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Term condition/CEK NO 12'),FailureHandling.OPTIONAL)
		}
		
		WebUI.delay(2)
		
		def CEK13 = WebUI.getText(findTestObject('Object Repository/Menu/Credit admin/Tab Term condition/NO 13'),FailureHandling.OPTIONAL)
		
		if (CEK13.contains('Yes'))
		{
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Term condition/CEK NO 13'),FailureHandling.OPTIONAL)
		}
		
		WebUI.delay(2)
		
		def CEK14 = WebUI.getText(findTestObject('Object Repository/Menu/Credit admin/Tab Term condition/NO 14'),FailureHandling.OPTIONAL)
		
		if (CEK14.contains('Yes'))
		{
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Term condition/CEK NO 14'),FailureHandling.OPTIONAL)
		}
		
		def CEK15 = WebUI.getText(findTestObject('Object Repository/Menu/Credit admin/Tab Term condition/NO 15'),FailureHandling.OPTIONAL)
		
		if (CEK15.contains('Yes'))
		{
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Term condition/CEK NO 15'),FailureHandling.OPTIONAL)
		}
		
		def CEK16 = WebUI.getText(findTestObject('Object Repository/Menu/Credit admin/Tab Term condition/NO 16'),FailureHandling.OPTIONAL)
		
		if (CEK16.contains('Yes'))
		{
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Term condition/CEK NO 16'),FailureHandling.OPTIONAL)
		}
		
		def CEK17 = WebUI.getText(findTestObject('Object Repository/Menu/Credit admin/Tab Term condition/NO 17'),FailureHandling.OPTIONAL)
		
		if (CEK17.contains('Yes'))
		{
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Term condition/CEK NO 17'),FailureHandling.OPTIONAL)
		}
		
		def CEK18 = WebUI.getText(findTestObject('Object Repository/Menu/Credit admin/Tab Term condition/NO 18'),FailureHandling.OPTIONAL)
		
		if (CEK18.contains('Yes'))
		{
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Term condition/CEK NO 18'),FailureHandling.OPTIONAL)
		}
		
		WebUI.switchToDefaultContent()
		
		WebUI.scrollToElement(findTestObject('Object Repository/Menu/Credit admin/Tab Term condition/Save Term Condition'), 2)
		
		WebUI.delay(2)
		
		WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Term condition/Save Term Condition'),FailureHandling.OPTIONAL)
		
		WebUI.delay(4)
		
		WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Term condition/Submit'),FailureHandling.OPTIONAL)
		

