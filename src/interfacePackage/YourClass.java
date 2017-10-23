package interfacePackage;

public class YourClass implements MyInterface{
	
	public int getRandomNumber() {
		return new java.util.Random().nextInt(10);
	}
	
	public int getCeilNumber(double number) {
		return (int) (number + 1);
	}
}
