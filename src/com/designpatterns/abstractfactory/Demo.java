package com.designpatterns.abstractfactory;

public class Demo {

	/**
	 * Application picks the factory type and creates it in run time (usually at
	 * initialization stage), depending on the configuration or environment
	 * variables.
	 */
	private static Application configureApplication() {
		Application app;
		GUIFactory factory;
		String osName = System.getProperty("os.name").toLowerCase();
		System.out.println(osName);
		if (osName.equals("windows")) {
			factory = new WindowsFactory();
			app = new Application(factory);
		} else {

			factory = new MacOSFactory();
			app = new Application(factory);

		}
		return app;
	}

	public static void main(String[] args) {
		Application app = configureApplication();
		app.paint();
	}
}
