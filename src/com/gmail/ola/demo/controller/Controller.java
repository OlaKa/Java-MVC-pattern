package com.gmail.ola.demo.controller;

import com.gmail.ola.demo.model.Model;
import com.gmail.ola.demo.view.LoginFormEvent;
import com.gmail.ola.demo.view.LoginListener;
import com.gmail.ola.demo.view.View;

public class Controller implements LoginListener {

	private View view;
	private Model model;

	public Controller(View view, Model model) {
		this.view = view;
		this.model = model;
	}

	@Override
	public void loginPerformed(LoginFormEvent event) {
		System.out.println("User logged in! " + event.getName() + " Password: " + event.getPassword());
	}
}
