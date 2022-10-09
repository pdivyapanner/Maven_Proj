package com.testng.features;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_Demo {
	@Test(groups = "socialmedia")
	private void facebook() {
		System.out.println("Facebook");
	}
	@Test(groups = "socialmedia")
	private void whatsapp(){
	
		System.out.println("Whatsapp");
	}
	@Test(groups = "socialmedia")
	private void reddit() {
		
		System.out.println("Reddit");
	}
	@Test(groups = "study")
	private void books() {
		
		System.out.println("books");
	}
	
	@Test(groups = "study")
	private void storybook() {
		System.out.println("StoryBooks");
	}
	@Test(alwaysRun = true,enabled = false)
	private void wynk() {
		
		System.out.println("Wynk");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
