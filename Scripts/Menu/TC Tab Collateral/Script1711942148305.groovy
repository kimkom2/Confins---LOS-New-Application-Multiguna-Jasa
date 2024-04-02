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
TestData Datahohendy = findTestData('Data Files/Tab Asset/Multiguna Collateral')



for (int baris = 1; baris <= Datahohendy.getRowNumbers(); baris++) {
    if (Datahohendy.getValue('Use', baris) == 'Yes') {
        // Baca semua kolom yang ada di data excel END in here
		
        WebUI.switchToDefaultContent()
	
        WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Collateral Data/Add Collateral'))
		
		WebUI.delay(2)

        WebUI.switchToDefaultContent()

        WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Collateral Data/Search Collateral name'))
		
		WebUI.delay(1)

        WebUI.setText(findTestObject('Object Repository/Menu/Credit admin/Tab Collateral Data/input_Asset Name'), Datahohendy.getValue('Asset Name', baris))
		
		WebUI.delay(1)

        WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Collateral Data/SEARCH Asset Name'))

        WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Collateral Data/a_Select Asset Name'))
		
		WebUI.delay(25)
        
		WebUI.switchToDefaultContent()
				
		WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Collateral Data/Manufacturing Year'))

        WebUI.sendKeys(findTestObject('Object Repository/Menu/Credit admin/Tab Collateral Data/Manufacturing Year'), Datahohendy.getValue('Tahun kendaraan', baris))
		
		WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Collateral Data/Notes'))
		
		WebUI.delay(30)

				
		WebUI.switchToDefaultContent()
		
		WebUI.scrollToElement(findTestObject('Object Repository/Menu/Credit admin/Tab Collateral Data/Collateral Price'), 2)
		
		WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Collateral Data/Collateral Price'))
		
		WebUI.delay(2)
        
		WebUI.doubleClick(findTestObject('Object Repository/Menu/Credit admin/Tab Collateral Data/Collateral Price'))
		
		WebUI.delay(2)
		
		WebUI.sendKeys(findTestObject('Object Repository/Menu/Credit admin/Tab Collateral Data/Collateral Price'), Datahohendy.getValue('Collateral Price', baris))
		
		WebUI.delay(2)


		WebUI.setText(findTestObject('Object Repository/Menu/Credit admin/Tab Collateral Data/input_No Rangka'), Datahohendy.getValue('NO RANGKA', baris))
		WebUI.delay(1)
		WebUI.setText(findTestObject('Object Repository/Menu/Credit admin/Tab Collateral Data/input_No Mesin'), Datahohendy.getValue('NO MESIN', baris))
		WebUI.delay(1)
		WebUI.setText(findTestObject('Object Repository/Menu/Credit admin/Tab Collateral Data/input_License Plate No'), Datahohendy.getValue('NO RANGKA', baris))
		WebUI.delay(1)
									
		WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Collateral Data/Search Bpkb City Issuer'))
		WebUI.delay(1)
		WebUI.setText(findTestObject('Object Repository/Menu/Credit admin/Tab Collateral Data/input_City Name'), Datahohendy.getValue('City Name', baris))
		WebUI.delay(1)
		WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Collateral Data/a_SEARCH City name'))
		WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Collateral Data/a_Select City Name'))
			
			
		WebUI.switchToFrame(findTestObject('Menu/Credit admin/Tab Asset/iframe_Term  Condition_appForm'),0)
			
		WebUI.delay(2)
			
		WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Collateral Data/Asset Usesage/Asset ' + Datahohendy.getValue('Asset Use', baris)))
		WebUI.delay(1)
		WebUI.switchToDefaultContent()
			
			
		WebUI.setText(findTestObject('Object Repository/Menu/Credit admin/Tab Collateral Data/input_COLOR'), Datahohendy.getValue('WARNA', baris))
		WebUI.delay(1)
			
		WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Collateral Data/a_Save Collateral'))
		
    }
}

