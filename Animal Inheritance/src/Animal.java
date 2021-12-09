
public abstract class Animal {
	
	protected String name;
	public static String food;
	
	public abstract void bearsYoung();
	public void eats() 
		{System.out.println("The \"" + name + "\" is looking forward to eating some food " + food + ".");}
	public abstract void makesNoise();

}
