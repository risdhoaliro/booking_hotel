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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.traveloka.com/en-id/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Hotels/Page_Traveloka - Southeast Asias Leading Tr_13aaf0/div_Hotels'))

WebUI.setText(findTestObject('Object Repository/Hotels/Page_Traveloka - Southeast Asias Leading Tr_13aaf0/input_City, destination, or hotel name_css-_ed80f1'), 
    'Yogyakarta')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Hotels/Page_Traveloka - Southeast Asias Leading Tr_13aaf0/mark_Yogyakarta'))

WebUI.click(findTestObject('Object Repository/Hotels/Page_Traveloka - Southeast Asias Leading Tr_13aaf0/input_Check-in_css-11aywtz r-cwxd7f r-13awg_adcfb8'))

WebUI.click(findTestObject('Object Repository/Hotels/Page_Traveloka - Southeast Asias Leading Tr_13aaf0/div_25'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Hotels/Page_Traveloka - Southeast Asias Leading Tr_13aaf0/div_1 night'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Hotels/Page_Traveloka - Southeast Asias Leading Tr_13aaf0/div_Adult_css-1dbjc4n r-1awozwy r-1ihkh82 r_b626ab'))

WebUI.click(findTestObject('Hotels/Page_Traveloka - Southeast Asias Leading Tr_13aaf0/button_tambah_adults'))

WebUI.click(findTestObject('Object Repository/Hotels/Page_Traveloka - Southeast Asias Leading Tr_13aaf0/div_Done'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Hotels/Page_Traveloka - Southeast Asias Leading Tr_13aaf0/div_Search Hotels'))

WebUI.setText(findTestObject('Object Repository/Hotels/Page_Hotel in Yogyakarta from 25-Apr-2023 u_46979f/input_Must travel in these uncertain times _90870f'), 
    'The 101 Yogyakarta')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Hotels/Page_Hotel in Yogyakarta from 25-Apr-2023 u_46979f/div_THE 1O1 Yogyakarta Tugu Hotel'))

WebUI.waitForElementPresent(findTestObject('Hotels/Page_Room rate THE 1O1 Yogyakarta Tugu Hote_e79332/Title_THE 1O1 Yogyakarta Tugu Hotel'), 
    0)

WebUI.verifyElementText(findTestObject('Hotels/Page_Room rate THE 1O1 Yogyakarta Tugu Hote_e79332/Title_THE 1O1 Yogyakarta Tugu Hotel'), 
    'THE 1O1 Yogyakarta Tugu Hotel')

WebUI.scrollToElement(findTestObject('Hotels/Page_Room rate THE 1O1 Yogyakarta Tugu Hote_e79332/Title_Deluxe Balcony City View'), 
    0)

WebUI.verifyElementText(findTestObject('Hotels/Page_Room rate THE 1O1 Yogyakarta Tugu Hote_e79332/Title_Deluxe Balcony City View'), 
    'Deluxe Balcony City View')

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Hotels/Page_Room rate THE 1O1 Yogyakarta Tugu Hote_e79332/Scroll_Seeroom'), 0)

WebUI.doubleClick(findTestObject('Object Repository/Hotels/Page_Room rate THE 1O1 Yogyakarta Tugu Hote_e79332/Button_Book Now'))

WebUI.click(findTestObject('Object Repository/Hotels/Page_Cheap Flights Traveloka - Search Disco_91fa1a/h1_Hotel Booking'))

WebUI.click(findTestObject('Object Repository/Hotels/Page_Cheap Flights Traveloka - Search Disco_91fa1a/h3_Fill in contact and guest details below'))

WebUI.click(findTestObject('Object Repository/Hotels/Page_Cheap Flights Traveloka - Search Disco_91fa1a/div_Continue to Review'))

WebUI.click(findTestObject('Object Repository/Hotels/Page_Cheap Flights Traveloka - Search Disco_91fa1a/div_The data you have entered is invalid. P_1c2d78'))

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('Hotels/Page_Cheap Flights Traveloka - Search Disco_91fa1a/popup_The data you have entered'), 
    'The data you have entered is invalid. Please try again.')

WebUI.click(findTestObject('Object Repository/Hotels/Page_Cheap Flights Traveloka - Search Disco_91fa1a/div_Close'))

WebUI.setText(findTestObject('Object Repository/Hotels/Page_Cheap Flights Traveloka - Search Disco_91fa1a/input_concat(Contact, , s name)_css-11aywtz_4274ec'), 
    'Risdho Aliro')

WebUI.setText(findTestObject('Hotels/Page_Cheap Flights Traveloka - Search Disco_91fa1a/field_nomorhp'), '81377805669')

WebUI.setText(findTestObject('Hotels/Page_Cheap Flights Traveloka - Search Disco_91fa1a/field_email'), 'risdhoaliro@gmail.com')

WebUI.click(findTestObject('Object Repository/Hotels/Page_Cheap Flights Traveloka - Search Disco_91fa1a/div_High Floor'))

WebUI.click(findTestObject('Object Repository/Hotels/Page_Cheap Flights Traveloka - Search Disco_91fa1a/div_Continue to ReviewContinue to Review'))

WebUI.verifyElementText(findTestObject('Hotels/Page_Cheap Flights Traveloka - Search Disco_91fa1a/title_Were almost finished'), 
    'We\'re almost finished!')

WebUI.click(findTestObject('Object Repository/Hotels/Page_Cheap Flights Traveloka - Search Disco_91fa1a/btn_OKOK'))

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('Hotels/Page_Cheap Flights Traveloka - Search Disco_91fa1a/text_Your ticketvoucher will be sent to your'), 
    'Your ticket/voucher will be sent to your email and the summary will be sent to your mobile number.')

WebUI.click(findTestObject('Object Repository/Hotels/Page_Cheap Flights Traveloka - Search Disco_91fa1a/btn_Yes, all is correct'))

WebUI.verifyElementText(findTestObject('Hotels/Page_Book THE 1O1 Yogyakarta Tugu Hotel, Je_452ba6/title_Please review your booking details'), 
    'Please Review Your Booking')

WebUI.verifyElementPresent(findTestObject('Hotels/Page_Book THE 1O1 Yogyakarta Tugu Hotel, Je_452ba6/title_THE 1O1 Yogyakarta Tugu Hotel'), 
    0)

WebUI.click(findTestObject('Object Repository/Hotels/Page_Book THE 1O1 Yogyakarta Tugu Hotel, Je_452ba6/btn_Continue to Payment'))

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('Hotels/Page_Cheap Flights Tickets Traveloka - Onli_2df141/title_Payment'), 'Payment')

WebUI.click(findTestObject('Object Repository/Hotels/Page_Cheap Flights Tickets Traveloka - Onli_2df141/btn_Alfamart'))

WebUI.click(findTestObject('Object Repository/Hotels/Page_Cheap Flights Tickets Traveloka - Onli_2df141/div_Pay with Alfamart'))

WebUI.click(findTestObject('Object Repository/Hotels/Page_Cheap Flights Tickets Traveloka - Onli_2df141/h2_Show Payment Code to Alfamart Cashier'))

WebUI.click(findTestObject('Object Repository/Hotels/Page_Cheap Flights Tickets Traveloka - Onli_2df141/div_Payment Code Alfamart'))

