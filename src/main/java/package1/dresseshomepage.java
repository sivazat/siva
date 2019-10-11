package package1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class dresseshomepage extends Basepage {
	@FindBy(xpath = "//*[@id=\'ul_layered_id_attribute_group_1\']/li[1]/label/a")
	private WebElement s;
	@FindBy(xpath = "//*[@id='ul_layered_id_attribute_group_1']/li[2]/label/a")
	private WebElement m;
	@FindBy(xpath = "//*[@id=\'ul_layered_id_attribute_group_1\']/li[3]/label/a")
	private WebElement l;
	
	
	//@FindBy(xpath = "//*[@id=\'center_column\']/h1/span[2]")
//private WebElement txtHeader;
	//@FindBys(@FindBy(xpath = "//*[@id=\'center_column\"]/h1/span[2]"))
//private List<WebElement> lstproducts;
	public dresseshomepage() {
		PageFactory.initElements(driver, this);
		
	}
	
	public WebElement s() {
		return s;
	}
		public WebElement m() {
		return m;
	}
		public WebElement l() {
		return l;
	}
	//public int getProductNumberFromHeader() {
		//String txt=txtHeader.getText();
		//String[] arr= txt.split(" ");
		//String value= arr[2];
		//int number= Integer.parseInt(value);
		//return number;
		
	//}
	//public int getProductcount() {
		//return lstproducts.size();
	//}
	
	
}
     