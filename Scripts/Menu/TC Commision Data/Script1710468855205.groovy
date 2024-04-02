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

TestData Datahohendy = findTestData('Data Files/Tab Commision/Multinguna Commision')

for (int baris = 1; baris <= Datahohendy.getRowNumbers(); baris++)
{
	if (Datahohendy.getValue('Use', baris) == 'Yes')
	{
		WebUI.switchToDefaultContent()
		
		WebUI.delay(5)
		
		if (Datahohendy.getValue('Comiision Supplier', baris) == 'Ya' && Datahohendy.getValue('Use', baris) == 'Yes')
		{
			
			//println('Masuk')
			
			WebUI.dismissAlert(FailureHandling.OPTIONAL)
			
			WebUI.switchToDefaultContent()
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Commision data/Supplier Commission'))
			
			WebUI.delay(1)
			WebUI.doubleClick(findTestObject('Object Repository/Menu/Credit admin/Tab Commision data/Supplier Commission'))
			
			WebUI.delay(1)
			
			WebUI.sendKeys(findTestObject('Object Repository/Menu/Credit admin/Tab Commision data/Supplier Commission'),Datahohendy.getValue('SUPPLIER COMMISION AMOUNT', baris))
			
			WebUI.delay(1)
			

		}
		else
		{
			println('Delete')
			
			//WebUI.switchToDefaultContent()
			
			//WebUI.dismissAlert(FailureHandling.OPTIONAL)
					
			//WebUI.delay(1)
			
			//WebUI.scrollToElement(findTestObject('Object Repository/Menu/Credit admin/Tab Commision data/Del Supplier Commision'), 3)
			
			//WebUI.delay(1)
			
			//WebUI.switchToDefaultContent()
			//WebUI.switchToFrame(findTestObject('Menu/Credit admin/Tab Asset/iframe_Term  Condition_appForm'),0)
			
			//WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Commision data/Del Supplier Commision'))
			
			//WebUI.delay(1)
			
			WebUI.delay(2)
			
			//WebUI.switchToFrame(findTestObject('Menu/Credit admin/Tab Asset/iframe_Term  Condition_appForm'),0)
			
			WebUI.scrollToElement(findTestObject('Object Repository/Menu/Credit admin/Tab Commision data/Del Commision supplier'), 3)
			
			WebUI.delay(2)
			
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Commision data/Del Commision supplier'))
			
			WebUI.waitForAlert(10)
			
			//WebUI.delay(2)
			
			WebUI.acceptAlert(FailureHandling.OPTIONAL)
		}
		
		WebUI.switchToDefaultContent()
		
//		if (Datahohendy.getValue('Comiision Supplier Employee', baris) == 'Ya' && Datahohendy.getValue('Use', baris) == 'Yes')
//		{
//			
//			println('Masuk')
//			
//			WebUI.dismissAlert(FailureHandling.OPTIONAL)
//			
//			WebUI.switchToDefaultContent()
//			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Commision data/Employee Commission'))
//			
//			WebUI.delay(1)
//			WebUI.doubleClick(findTestObject('Object Repository/Menu/Credit admin/Tab Commision data/Employee Commission'))
//			
//			WebUI.delay(1)
//			
//			WebUI.sendKeys(findTestObject('Object Repository/Menu/Credit admin/Tab Commision data/Employee Commission'),Datahohendy.getValue('EMPLOYEE COMMISION AMOUNT', baris))
//			
//			WebUI.delay(1)
//			
//		}
//		else // yang delete ga tau kenapa tidak ke klik
//		{
//			
//			WebUI.switchToDefaultContent()
//			
//			WebUI.delay(2)
//			
//			WebUI.scrollToElement(findTestObject('Object Repository/Menu/Credit admin/Tab Commision data/Del Commsion employee'), 3)
//			
//			println('Kescroll')
//			
//			WebUI.delay(5)
//			
////			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Commision data/Del Commsion employee'))
////			
////			WebUI.delay(2)
//			
//			WebUI.switchToDefaultContent()
//			
//			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Commision data/Del Commsion employee'))
//			
//			println('Ke klik')
//			
//			WebUI.delay(3)
//						
//			WebUI.waitForAlert(10)
//			
//			println('Alret')
//						
//			WebUI.delay(3)
//						
//			WebUI.acceptAlert(FailureHandling.OPTIONAL)
//		}
		
		WebUI.delay(2)
		
		WebUI.switchToDefaultContent()
		
		WebUI.acceptAlert(FailureHandling.OPTIONAL)
		
		WebUI.delay(2)
		
		WebUI.acceptAlert(FailureHandling.OPTIONAL)
		
		WebUI.switchToDefaultContent()
		
		WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Commision data/Calculate Commision'))
		
		WebUI.delay(2)
		
		WebUI.acceptAlert(FailureHandling.OPTIONAL)
		
		WebUI.switchToDefaultContent()
		
		WebUI.delay(4)
		
		WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Commision data/SaveCont Commision'))
	
	}
}
