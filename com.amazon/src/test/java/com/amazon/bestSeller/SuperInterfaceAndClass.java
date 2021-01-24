package com.amazon.bestSeller;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

public class SuperInterfaceAndClass implements SearchContext{
	// searh context is the super interface of selenium.
	public static void main(String[] args) {
		
	}

	@Override
	public List<WebElement> findElements(By by) {
		// it is for group of elements.
		return null;
	}

	@Override
	public WebElement findElement(By by) {
		// it is used for finding one element.
		return null;
	}
	
}
