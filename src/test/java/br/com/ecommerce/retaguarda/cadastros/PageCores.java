package br.com.ecommerce.retaguarda.cadastros;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import br.com.ecommerce.config.pagebase.PageObjectGeneric;
import br.com.ecommerce.config.setup.Selenium;
import br.com.ecommerce.config.util.Log;

public class PageCores extends PageObjectGeneric<PageCores> {

	public PageCores() {
		PageFactory.initElements(Selenium.getDriver(), this);
	}

	@FindBy(xpath = "//*[@id='container']/header/div[2]/ul/li/a/span")
	WebElement user;
	
	public void sairDoSistema() {
		Log.info("Saindo do retaguarda...");
		waitAndClick(user);
	}
}
