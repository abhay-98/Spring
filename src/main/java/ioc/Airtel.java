package ioc;

public class Airtel implements Sim {

@Override
	public void call() {
		System.out.println("this is a call from Airtel");
		
	}
@Override
	public void data() {
		System.out.println("data from Airtel");
	}
	
}
