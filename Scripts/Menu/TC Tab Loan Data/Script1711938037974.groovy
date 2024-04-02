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

// Baca semua kolom yang ada di data excel start in here
TestData Datahohendy = findTestData('Data Files/Loan Data/Multiguna Loan Data')

for (int baris = 1; baris <= Datahohendy.getRowNumbers(); baris++) {
    if (Datahohendy.getValue('Use', baris) == 'Yes') {
        // Baca semua kolom yang ada di data excel END in here
        WebUI.switchToDefaultContent()
		
		WebUI.delay(7)

        WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Loan Data/Add Loan data'))

        WebUI.delay(2)

        WebUI.switchToDefaultContent()

        WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Loan Data/Button Search Disburse to'),FailureHandling.OPTIONAL)

        WebUI.delay(1)

        WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Loan Data/Button Search Disburse to'),FailureHandling.OPTIONAL)

		WebUI.delay(1) 
		
		WebUI.setText(findTestObject('Object Repository/Menu/Credit admin/Tab Loan Data/input_Supplier Branch Name'), Datahohendy.getValue('Disburse', baris))
        		
		WebUI.delay(1)
        
		WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Loan Data/SEARCH Supplier Name'))
        		
		WebUI.delay(1)
        
		WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Loan Data/Select Supplier name'))
        			
		//WebUI.switchToFrame(findTestObject('Menu/Credit admin/Tab Asset/iframe_Term  Condition_appForm'),0)
               		
		WebUI.delay(2)
        		
		WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Loan Data/Bank ' + Datahohendy.getValue('Input Bank Account', baris)))
        		
		WebUI.delay(2)
		
        		if (Datahohendy.getValue('Input Bank Account', baris) == 'Ya' && Datahohendy.getValue('Use', baris) == 'Yes')
        		{
        			WebUI.switchToDefaultContent()
			
			        WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Loan Data/Button Search Bank Name'),FailureHandling.OPTIONAL)
			
					WebUI.delay(1) 
					
					WebUI.setText(findTestObject('Object Repository/Menu/Credit admin/Tab Loan Data/input_Bank Name'), Datahohendy.getValue('Bank Name', baris))
			        		
					WebUI.delay(1)
			        
					WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Loan Data/SEARCH Bank Name'))
			        		
					WebUI.delay(1)
			        
					WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Loan Data/Select Bank Name'))
					
					WebUI.delay(1)
					
					WebUI.setText(findTestObject('Object Repository/Menu/Credit admin/Tab Loan Data/input_Bank Branch'), Datahohendy.getValue('Bank Branch', baris))
					
					WebUI.delay(1)
					
					WebUI.setText(findTestObject('Object Repository/Menu/Credit admin/Tab Loan Data/input_Account Name'), Datahohendy.getValue('Account Name', baris))
					
					WebUI.delay(1)
					
					WebUI.setText(findTestObject('Object Repository/Menu/Credit admin/Tab Loan Data/input_Account No'), Datahohendy.getValue('Account No', baris))
					
        		} 
				
		WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Loan Data/input_Budget Plan Amount'))		
		WebUI.delay(1)
		WebUI.doubleClick(findTestObject('Object Repository/Menu/Credit admin/Tab Loan Data/input_Budget Plan Amount'))		
		WebUI.delay(1)		
		WebUI.sendKeys(findTestObject('Object Repository/Menu/Credit admin/Tab Loan Data/input_Budget Plan Amount'),Datahohendy.getValue('Budget Plan Amount', baris))
		WebUI.delay(1)
		
		WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Loan Data/input_Financing Amount'))
		WebUI.delay(1)
		WebUI.doubleClick(findTestObject('Object Repository/Menu/Credit admin/Tab Loan Data/input_Financing Amount'))
		WebUI.delay(1)
		WebUI.sendKeys(findTestObject('Object Repository/Menu/Credit admin/Tab Loan Data/input_Financing Amount'),Datahohendy.getValue('Financing Amount', baris))
		WebUI.delay(1)
		
		WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Loan Data/Notes'))
		WebUI.delay(1)
		WebUI.setText(findTestObject('Object Repository/Menu/Credit admin/Tab Loan Data/Notes'), Datahohendy.getValue('Notes', baris))
		WebUI.delay(1)
		
		
		WebUI.switchToDefaultContent()
		WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Loan Data/Save'))
		WebUI.delay(4)
	
		WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Loan Data/SaveCont'))
		WebUI.delay(4)
		
		
    }
}

