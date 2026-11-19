package com.PomClass;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomClass {

		public WebDriver driver;
		
		public PomClass(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
			
		}
		
		@FindBy(xpath = "//button[@data-testid='header-signin-btn']")
		public WebElement siginbtn;
		
		@FindBy(xpath = "//input[@type='email']")
		public WebElement bizemail;
		
		@FindBy(id = "password")
		public WebElement bizpassword;
		
		@FindBy(xpath = "//button[@data-testid='login-submit-btn']")
		public WebElement bizsignin;
		
		@FindBy(xpath = "//a[@data-testid='nav-explore']")
		public WebElement clickExplore;
		
		@FindBy(xpath = "//button[@data-testid='user-menu-btn']")
		public WebElement profile;
		
		@FindBy(xpath = "//div[@data-testid='menu-business-dashboard']")
		public WebElement bizdashboard;
		
		@FindBy(xpath = "//a[@data-testid='biz-nav-add-business']")
		public WebElement addbusinessbtn;
		
		@FindBy(xpath = "//input[@data-testid='biz-name']")
		public WebElement bizname;
		
		@FindBy(xpath = "//textarea[@data-testid='biz-desc']")
		public WebElement bizdescrip;
		
		@FindBy(xpath = "(//button)[3]")
		public WebElement category;
		
		@FindBy(xpath = "//div[@role='option' and normalize-space()='Restaurants']")
		public WebElement catres;
		
		@FindBy(xpath = "//option[text()='Beauty & Spa']")
		public WebElement clickcategory;
		
		@FindBy(xpath = "(//button)[4]")
		public WebElement bizpricing;
		
		@FindBy(xpath = "//span[text()='$$$']")
		public WebElement clickprice;
		
		@FindBy(xpath = "//input[@data-testid='biz-phone']")
		public WebElement bizphone;
		
		@FindBy(xpath = "//input[@data-testid='biz-address']")
		public WebElement bizaddress;
		
        @FindBy(xpath = "//input[@type='email']")
        public WebElement bizaddemail;
        
        @FindBy(xpath = "//label[text()='Website']/following-sibling::input")
        public WebElement bizwebsite;
        
        @FindBy(xpath = "//input[@placeholder='Mon-Sun 9AM–9PM']")
        public WebElement bizhours;
        
        @FindBy(xpath = "//input[@data-testid='biz-services']")
        public WebElement bizservices;
        
        @FindBy(xpath = "//input[@data-testid='biz-city']")
        public WebElement bizcity;
        
        @FindBy(xpath = "//button[text()='Create business']")
        public WebElement createbiz;
        
        @FindBy(xpath = "//div[@data-testid='menu-logout']")
        public WebElement logout;
        
        @FindBy(xpath = "//div[text()='Business submitted — awaiting admin approval']")
        public WebElement businesssucessmsg;
        
        //admin 
        
        @FindBy(xpath = "//div[text()='Listing approved']")
        public WebElement businesapprovedmsg;
        
        @FindBy(xpath = "//input[@id='email']")
        public WebElement adminemail;
        
        @FindBy(xpath = "//input[@id='password']")
        public WebElement adminpassword;
        
		@FindBy(xpath = "//button[@data-testid='login-submit-btn']")
		public WebElement adminsubmit;
		
		@FindBy(xpath = "//button[@data-testid='user-menu-btn']")
		public WebElement adminprofile;
		
		@FindBy(xpath = "//div[@data-testid='menu-admin']")
		public WebElement adminbtnmenu;
		
		@FindBy(xpath = "//a[@data-testid='admin-nav-pending']")
		public WebElement pendingbutton;
		
		@FindBy(xpath = "//button[@data-testid='approve-biz-d81fcbe2-4a76-47ae-8bc6-40508c0283ad']")
		public WebElement approve;
		
        @FindBy(xpath = "//div[@data-testid='menu-logout']")
        public WebElement adminlogout;

		
        @FindBy(xpath = "//input[@id='email']")
        public WebElement cusemail;
        
        @FindBy(xpath = "//input[@id='password']")
        public WebElement cuspassword;
        
		@FindBy(xpath = "//button[@data-testid='login-submit-btn']")
		public WebElement cussubmit;
		
		@FindBy(xpath = "//a[text()='Explore']")
		public WebElement explorebtn;
		
		@FindBy(xpath = "//h1[text()='Abc hotel']")
		public WebElement businessdisplayed;
		
		@FindBy(xpath = "(//span[contains(@class,'text-xs font-semibold text-primary')][1])")
		public WebElement viewhotel;
		
		@FindBy(xpath = "//button[@data-testid='claim-business-btn']")
		public WebElement claimbtn;
		
		@FindBy(xpath = "//textarea[@data-testid='claim-reason']")
		public WebElement claimreason;
		
		@FindBy(xpath = "//button[@data-testid='claim-submit-btn']")
		public WebElement claimsubmit;
		
		@FindBy(xpath = "//div[text()='Claim submitted. Our team will review shortly.']")
		public WebElement claimsuccess;
		
		@FindBy(xpath = "//div[@data-testid='menu-admin']")
		public WebElement adminmenubtn;
		
		@FindBy(xpath = "//a[@data-testid='admin-nav-claims']")
		public WebElement claimsidebar;
		
		@FindBy(xpath = "//button[contains(@data-testid,'claim-approve-45d85ec0-4ed3')]")
		public WebElement claimapprove;
		
		@FindBy(xpath = "//div[text()='Approved']")
		public WebElement claimmsg;
		
		@FindBy(xpath = "//button[@data-testid='user-menu-btn']")
		public WebElement menuprofile;
		
		@FindBy(xpath = "//div[@data-testid='menu-notifications']")
		public WebElement notifications;
		
		@FindBy(xpath = "//div[normalize-space()='Your claim for 'Mira Studio' was approved. You are now the owner.']")
		public WebElement notifychanged;
		
		//claim
        @FindBy(xpath = "//input[@id='email']")
        public WebElement claimemail;
        
        @FindBy(xpath = "//input[@id='password']")
        public WebElement claimpassword;

		@FindBy(xpath = "//button[@data-testid='login-submit-btn']")
		public WebElement claimsigin;

		
		//user role 
		@FindBy(xpath = "//button[@data-testid='header-signin-btn']")
		public WebElement userrolesignin; 
		
		
        @FindBy(xpath = "//a[text()='Create one']")
        public WebElement createuser;
        
        @FindBy(xpath = "//input[@data-testid='register-name']")
        public WebElement regname;
        
        @FindBy(xpath = "//input[@data-testid='register-email']")
        public WebElement regemail;
        
        @FindBy(xpath = "//input[@data-testid='register-password']")
        public WebElement regpass;
        
        @FindBy(xpath = "//button[@data-testid='register-submit-btn']")
        public WebElement createaccbtn;
		
        @FindBy(xpath = "//div[text()='Welcome to Infoez!']")
        public WebElement accountsuccestext;
		
		
		@FindBy(xpath = "//button[@data-testid='user-menu-btn']")
		public WebElement menu;
		
		@FindBy(xpath = "//div[text()='customer']")
		public WebElement custtext;
		
        @FindBy(xpath = "//input[@id='email']")
        public WebElement adminrolema;
        
        @FindBy(xpath = "//input[@id='password']")
        public WebElement adminrolepassword;
        
		@FindBy(xpath = "//button[@data-testid='login-submit-btn']")
		public WebElement adminrolesubmit;
       
		@FindBy(xpath = "//div[@data-testid='menu-admin']")
		public WebElement adminmenu;
		
		@FindBy(xpath = "//a[@data-testid='admin-nav-users']")
		public WebElement users;
		
		@FindBy(xpath = "//div[normalize-space()='bharathi']/following-sibling::*//button[@role='combobox']")
		public WebElement categoryusers;
		
		@FindBy(xpath = "//div[text()='Role updated']")
		public WebElement roleupdate;
		
		@FindBy(xpath = "//span[text()='business_owner']")
		public WebElement rolechange;
		
		@FindBy(xpath = "//div[text()='business owner']")
		public WebElement rolecheck;
		
		
		@FindBy(xpath = "//button[@id='radix-:r3:']")
		public WebElement menudropprofile;
		
		@FindBy(xpath = "//div[@data-testid='menu-admin']")
		public WebElement admindropmenu;
		
		@FindBy(xpath = "//a[@data-testid='admin-nav-businesses']")
		public WebElement businessbtn;
		
		@FindBy(xpath = "//button[contains(@data-testid,'admin-verify-business-btn-857fc')]")
		public WebElement verifybtn;
		
		@FindBy(xpath = "//div[text()='Verified']")
		public WebElement verifyconfrm;
		
		@FindBy(xpath = "class=\"rounded-xl border border-border bg-card p-4 flex items-center justify-between\"")
		public List<WebElement> beforeadd;
		
		@FindBy(xpath = "//input[@data-testid='new-category-name']")
		public WebElement categoryname;
		
		@FindBy(xpath = "//button[@data-testid='new-category-add']")
		public WebElement addcategory;
		
		@FindBy(xpath = "//button[@data-testid=\"filter-category\"]")
		public WebElement allcategories;

		
		
		

}
