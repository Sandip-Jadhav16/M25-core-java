package org.tnsindia.interfaceexamples;

public class Employee implements HR,Manager {

	@Override
	public void projectDiscussion() {
		System.out.println("About the project discussion");
		
	}

	@Override
	public void salarydiscussion() {
		System.out.println("About the salary discussion");
		
	}

	
	}

