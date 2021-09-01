package com.designpatterns.abstractfactory;

public class WindowsFactory implements GUIFactory  {

	@Override
    public Button createButton() {
        return new WindowsButton();
    }

	@Override
	public Checkbox createCheckbox() {
		// TODO Auto-generated method stub
		//return new WindowsCheckbox();
		return null;
	}

//    @Override
//    public Checkbox createCheckbox() {
//        return new WindowsCheckbox();
//    }
	
	
}
