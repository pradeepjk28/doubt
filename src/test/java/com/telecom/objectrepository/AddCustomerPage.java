package com.telecom.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.telecom.resources.CommonActions;

public class AddCustomerPage extends CommonActions {
	
	public AddCustomerPage() {
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//*[text()='Add Customer'])[1]")
	private WebElement customerButton;
	@FindBy(xpath = "//*[text()='Done']")
	private WebElement doneButton;
	@FindBy(id = "fname")
	private WebElement fname;
	@FindBy(id = "lname")
	private WebElement lname;
	@FindBy(id = "email")
	private WebElement email;
	@FindBy(xpath = "//*[@name='addr']")
	private WebElement address;
	@FindBy(id = "telephoneno")
	private WebElement telephone;
	@FindBy(xpath = "//*[@type='submit']")
	private WebElement submit;
	@FindBy(xpath = "(//table//tr//td)[3]")
	private WebElement customerID;
	public WebElement getSubmit() {
		return submit;
	}
	public void setSubmit(WebElement submit) {
		this.submit = submit;
	}
	public WebElement getCustomerButton() {
		return customerButton;
	}
	public void setCustomerButton(WebElement customerButton) {
		this.customerButton = customerButton;
	}
	public WebElement getDoneButton() {
		return doneButton;
	}
	public void setDoneButton(WebElement doneButton) {
		this.doneButton = doneButton;
	}
	public WebElement getFname() {
		return fname;
	}
	public void setFname(WebElement fname) {
		this.fname = fname;
	}
	public WebElement getLname() {
		return lname;
	}
	public void setLname(WebElement lname) {
		this.lname = lname;
	}
	public WebElement getEmail() {
		return email;
	}
	public void setEmail(WebElement email) {
		this.email = email;
	}
	public WebElement getAddress() {
		return address;
	}
	public void setAddress(WebElement address) {
		this.address = address;
	}
	public WebElement getTelephone() {
		return telephone;
	}
	public void setTelephone(WebElement telephone) {
		this.telephone = telephone;
	}
	public WebElement getCustomerID() {
		return customerID;
	}
	public void setCustomerID(WebElement customerID) {
		this.customerID = customerID;
	}
}
