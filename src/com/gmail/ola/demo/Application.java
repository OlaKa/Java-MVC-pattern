package com.gmail.ola.demo;

import javax.swing.SwingUtilities;

import com.gmail.ola.demo.controller.Controller;
import com.gmail.ola.demo.model.Model;
import com.gmail.ola.demo.view.View;

public class Application {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				runApp();
			}
		});

	}

	public static void runApp() {
		Model model = new Model();
		View view = new View(model);
		Controller controller = new Controller(view, model);

		view.setLoginListener(controller);
	}

}
