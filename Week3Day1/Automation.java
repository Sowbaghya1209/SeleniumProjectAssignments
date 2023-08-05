package org.abst;

public class Automation extends MultipleLangauge implements TestTool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Automation obj = new Automation();
		System.out.println("---Interface implementation---");
		obj.java();
		obj.selenium();
		System.out.println("----Extending Abstract Class-----");
		obj.python();
		obj.ruby();
		
	}

	public void java() {
		// TODO Auto-generated method stub
		System.out.println("Language is Java");
	}

	public void selenium() {
		// TODO Auto-generated method stub
		System.out.println("Test tool of Java is Selenium");

	}

	@Override
	public void ruby() {
		// TODO Auto-generated method stub

		System.out.println("Selenium supports Ruby");
	}

}
