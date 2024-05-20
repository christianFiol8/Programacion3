package controllers;

import view.OutView;

public class OutController {

	public OutView vista;
	
	public OutController() {
		// TODO Auto-generated constructor stub
		
		vista = new OutView();
		
	}
	
	public void login() {
		
		vista.login();
		
	}
	
	public void registro() {
		
		vista.registro();
		
	}

}
