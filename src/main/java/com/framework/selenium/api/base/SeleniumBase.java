package com.framework.selenium.api.base;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.framework.selenium.api.design.Browser;
import com.framework.selenium.api.design.Element;
import com.framework.selenium.api.design.Locators;

public class SeleniumBase implements Browser, Element{

	public void executeTheScript(String js, WebElement ele) {
		// TODO Auto-generated method stub
		
	}

	public void click(WebElement ele) {
		// TODO Auto-generated method stub
		
	}

	public void append(WebElement ele, String data) {
		// TODO Auto-generated method stub
		
	}

	public void clear(WebElement ele) {
		// TODO Auto-generated method stub
		
	}

	public void clearAndType(WebElement ele, String data) {
		// TODO Auto-generated method stub
		
	}

	public String getElementText(WebElement ele) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getBackgroundColor(WebElement ele) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getTypedText(WebElement ele) {
		// TODO Auto-generated method stub
		return null;
	}

	public void selectDropDownUsingText(WebElement ele, String value) {
		// TODO Auto-generated method stub
		
	}

	public void selectDropDownUsingIndex(WebElement ele, int index) {
		// TODO Auto-generated method stub
		
	}

	public void selectDropDownUsingValue(WebElement ele, String value) {
		// TODO Auto-generated method stub
		
	}

	public boolean verifyExactText(WebElement ele, String expectedText) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean verifyPartialText(WebElement ele, String expectedText) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean verifyExactAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub
		return false;
	}

	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub
		
	}

	public boolean verifyDisplayed(WebElement ele) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean verifyDisappeared(WebElement ele) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean verifyEnabled(WebElement ele) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean verifySelected(WebElement ele) {
		// TODO Auto-generated method stub
		return false;
	}

	public String getPropertiesData(String filename, String key) {
		// TODO Auto-generated method stub
		return null;
	}

	public void startApp(String url, boolean headless) {
		// TODO Auto-generated method stub
		
	}

	public void startApp(String browser, boolean headless, String url) {
		// TODO Auto-generated method stub
		
	}

	public WebElement locateElement(Locators locatorType, String value) {
		// TODO Auto-generated method stub
		return null;
	}

	public WebElement locateElement(String value) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<WebElement> locateElements(Locators locatorType, String value) {
		// TODO Auto-generated method stub
		return null;
	}

	public void switchToAlert() {
		// TODO Auto-generated method stub
		
	}

	public void acceptAlert() {
		// TODO Auto-generated method stub
		
	}

	public void dismissAlert() {
		// TODO Auto-generated method stub
		
	}

	public String getAlertText() {
		// TODO Auto-generated method stub
		return null;
	}

	public void typeAlert(String data) {
		// TODO Auto-generated method stub
		
	}

	public void switchToWindow(int index) {
		// TODO Auto-generated method stub
		
	}

	public boolean switchToWindow(String title) {
		// TODO Auto-generated method stub
		return false;
	}

	public void switchToFrame(int index) {
		// TODO Auto-generated method stub
		
	}

	public void switchToFrame(WebElement ele) {
		// TODO Auto-generated method stub
		
	}

	public void switchToFrame(String idOrName) {
		// TODO Auto-generated method stub
		
	}

	public void defaultContent() {
		// TODO Auto-generated method stub
		
	}

	public boolean verifyUrl(String url) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean verifyTitle(String title) {
		// TODO Auto-generated method stub
		return false;
	}

	public void close() {
		// TODO Auto-generated method stub
		
	}

	public void quit() {
		// TODO Auto-generated method stub
		
	}

}
