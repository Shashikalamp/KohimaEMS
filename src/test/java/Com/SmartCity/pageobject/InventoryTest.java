package Com.SmartCity.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class InventoryTest {
	WebDriver driver;
	WebDriver ldriver;
	public InventoryTest (WebDriver rdriver)
	{
		ldriver= rdriver;
		PageFactory.initElements(rdriver,this);
	}
	@FindBy(xpath ="/html/body/div/div/div/aside/div/div[2]/div/div[1]/ul/li[3]/span[2]/a")
	@CacheLookup
	WebElement Clickinventorybtn;
	// /html/body/div[1]/div/div/aside/div/div[2]/div/div[1]/ul/li[3]/span[2]/a
	/*	@FindBy(xpath="/html/body/div[1]/div/section/div/main/div/div/div/div/div[1]/div/div/div[2]/div/div/div/div/div/div/div[1]/div/div/div[1]/div/div[3]/div/div/div/div/span[3]/span[2]")
	@CacheLookup
	WebElement Clicknationbtn;
	@FindBy(xpath="/html/body/div[1]/div/section/div/main/div/div/div/div/div[1]/div/div/div[2]/div/div/div/div/div/div/div[1]/div/div/div[1]/div/div[3]/div/div/div/div[2]/span[3]/span[2]")
	@CacheLookup
	WebElement Clickstatebtn;*/
	@FindBy(xpath="/html/body/div/div/div/div/main/div/div/div/div/div[1]/div/div/div[2]/div/div/div/div/div/div/div[1]/div/div/div[1]/div/div[3]/div/div/div/div/span[3]/span[2]")
	@CacheLookup
	WebElement ClickKohimacitybtn;
	@FindBy(xpath="/html/body/div/div/div/div/main/div/div/div/div/div[1]/div/div/div[2]/div/div/div/div/div/div/div[1]/div/div/div[1]/div/div[3]/div/div/div/div[2]/span[3]/span[2]")
	@CacheLookup
	WebElement ClickHighSchoolwardbtn;
	@FindBy(xpath="/html/body/div/div/div/div/main/div/div/div/div/div[1]/div/div/div[2]/div/div/div/div/div/div/div[1]/div/div/div[1]/div/div[3]/div/div/div/div[3]/span[3]/span[2]")
	@CacheLookup
	WebElement ClickNH2streetbtn;
	@FindBy(xpath="/html/body/div/div/div/div/main/div/div/div/div/div[1]/div/div/div[2]/div/div/div/div/div/div/div[1]/div/div/div[1]/div/div[3]/div/div/div/div[4]/span[3]/span[2]")
	@CacheLookup
	WebElement ClickHighSchoolJunctionpolebtn;
	@FindBy(xpath="/html/body/div/div/div/div/main/div/div/div/div/div[1]/div/div/div[2]/div/div/div/div/div/div/div[1]/div/div/div[1]/div/div[3]/div/div/div/div[5]/span[3]/span[2]")
	@CacheLookup
	WebElement ClickESSHighSchoolJunctionbtn;

	@FindBy(xpath="/html/body/div[1]/div/div/div/main/div/div/div/div/div[1]/div/div/div[2]/div/div/div/div/div/div/div[1]/div/div/div[1]/div/div[3]/div/div/div/div[3]/span[3]/span[2]")
	@CacheLookup
	WebElement ClickDaklanewardbtn;
	@FindBy(xpath ="#rc-tabs-1-panel-1 > div > div > div > div > div:nth-child(1) > div > div > div.ant-col.ant-col-sm-12.ant-col-md-6.ant-col-lg-9.css-1mgxixm > div > div.rc-tree-list > div > div > div > div.rc-tree-treenode.rc-tree-treenode-switcher-open.rc-tree-treenode-selected.rc-tree-treenode-leaf-last > span.rc-tree-node-content-wrapper.rc-tree-node-content-wrapper-open.rc-tree-node-selected > span.rc-tree-iconEle.rc-tree-icon__customize > svg")
	@CacheLookup
	WebElement ClickDaklanNH2streetbtn;
	@FindBy(xpath="/html/body/div/div/div/div/main/div/div/div/div/div[1]/div/div/div[2]/div/div/div/div/div/div/div[1]/div/div/div[1]/div/div[3]/div/div/div/div[5]/span[3]/span[2]")
	@CacheLookup
	WebElement ClickPhoolBariJunctionpolebtn;
	@FindBy(xpath="/html/body/div/div/div/div/main/div/div/div/div/div[1]/div/div/div[2]/div/div/div/div/div/div/div[1]/div/div/div[1]/div/div[3]/div/div/div/div[6]/span[3]/span[2]")
	@CacheLookup
	WebElement ClickPhoolBariJunctionESSbtn;

	@FindBy(xpath="/html/body/div/div/div/div/main/div/div/div/div/div[1]/div/div/div[2]/div/div/div/div/div/div/div[1]/div/div/div[1]/div/div[3]/div/div/div/div[4]/span[3]/span[2]")
	@CacheLookup
	WebElement ClickMidLanewardbtn;
	@FindBy(xpath="/html/body/div/div/div/div/main/div/div/div/div/div[1]/div/div/div[2]/div/div/div/div/div/div/div[1]/div/div/div[1]/div/div[3]/div/div/div/div[5]/span[3]/span[2]")
	@CacheLookup
	WebElement ClickMidLaneNH2streetbtn;
	@FindBy(xpath="/html/body/div/div/div/div/main/div/div/div/div/div[1]/div/div/div[2]/div/div/div/div/div/div/div[1]/div/div/div[1]/div/div[3]/div/div/div/div[6]/span[3]/span[2]")
	@CacheLookup
	WebElement ClickBoxCuttingJunctionpolebtn;
	@FindBy(xpath="/html/body/div/div/div/div/main/div/div/div/div/div[1]/div/div/div[2]/div/div/div/div/div/div/div[1]/div/div/div[1]/div/div[3]/div/div/div/div[7]/span[3]/span[2]")
	@CacheLookup
	WebElement ClickBoxCuttingJunctionESSbtn;

	@FindBy(xpath="/html/body/div/div/div/div/main/div/div/div/div/div[1]/div/div/div[2]/div/div/div/div/div/div/div[1]/div/div/div[1]/div/div[3]/div/div/div/div[5]/span[3]/span[2]")
	@CacheLookup
	WebElement ClickPRHillwardbtn;
	@FindBy(css ="#rc-tabs-1-panel-1 > div > div > div > div > div:nth-child(1) > div > div > div.ant-col.ant-col-sm-12.ant-col-md-6.ant-col-lg-9.css-1mgxixm > div > div.rc-tree-list > div > div > div > div.rc-tree-treenode.rc-tree-treenode-switcher-open.rc-tree-treenode-selected.rc-tree-treenode-leaf-last > span.rc-tree-node-content-wrapper.rc-tree-node-content-wrapper-open.rc-tree-node-selected > span.rc-tree-title")
	@CacheLookup
	WebElement ClickPRHillNH2streetbtn;
	@FindBy(xpath="/html/body/div[1]/div/div/div/main/div/div/div/div/div[1]/div/div/div[2]/div/div/div/div/div/div/div[1]/div/div/div[1]/div/div[3]/div/div/div/div[7]/span[3]/span[2]")
	@CacheLookup
	WebElement ClickPoliceHeadQuarterspolebtn;
	@FindBy(xpath="/html/body/div[1]/div/div/div/main/div/div/div/div/div[1]/div/div/div[2]/div/div/div/div/div/div/div[1]/div/div/div[1]/div/div[3]/div/div/div/div[8]/span[3]/span[2]")
	@CacheLookup
	WebElement ClickPoliceHeadQuarterESSbtn;
	@FindBy(xpath="/html/body/div[1]/div/div/div/main/div/div/div/div/div[1]/div/div/div[1]/div[1]/div/div[2]/div")
	@CacheLookup
	WebElement ClickInventoryinfobtn;

	public void Clickoninventoryoption() {
		Clickinventorybtn.click();
	}


	public void ClickonKohimacityoption() {
		ClickKohimacitybtn.click();
	}
	public void ClickonHighSchoolWardoption() {
		ClickHighSchoolwardbtn.click();
	}
	public void ClickonHighSchoolNH2Streetoption() {
		ClickNH2streetbtn.click();
	}
	public void ClickonHighSchoolJunctionPoleoption() {
		ClickHighSchoolJunctionpolebtn.click();
	}

	public void ClickonESSHighSchoolJunctionoption() {
		ClickESSHighSchoolJunctionbtn.click();
	}

	public void ClickonDaklaneWardoption() {
		ClickDaklanewardbtn.click();
	}
	public void ClickonDaklanNH2Streetoption() {
		ClickDaklanNH2streetbtn.click();
	}
	public void ClickonPhoolBariJunctionPoleoption() {
		ClickPhoolBariJunctionpolebtn.click();
	}

	public void ClickonPhoolBariJunctionESSoption() {
		ClickPhoolBariJunctionESSbtn.click();
	}
	public void ClickonMidLanewardoption() {
		ClickMidLanewardbtn.click();
	}
	public void ClickonMidLaneNH2Streetoption() {
		ClickMidLaneNH2streetbtn.click();
	}
	public void ClickonBoxCuttingJunctionPoleoption() {
		ClickBoxCuttingJunctionpolebtn.click();
	}

	public void ClickonBoxCuttingJunctionESSoption() {
		ClickBoxCuttingJunctionESSbtn.click();
	}

	public void ClickonPRHillWardoption() {
		ClickPRHillwardbtn.click();
	}
	public void ClickonPRHillNH2Streetoption() {
		ClickPRHillNH2streetbtn.click();
	}
	public void ClickonPoliceHeadQuartersPoleoption() {
		ClickPoliceHeadQuarterspolebtn.click();
	}

	public void ClickonPoliceHeadQuartersESSoption() {
		ClickPoliceHeadQuarterESSbtn.click();
	}

	public void ClickonInventoryinfooption() {
		ClickInventoryinfobtn.click();
	}
}

