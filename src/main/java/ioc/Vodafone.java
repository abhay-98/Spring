package ioc;

public class Vodafone implements Sim {

@Override
	public void call() {
		System.out.println("this is a call from Vodafone");
		
	}
@Override
	public void data() {
		System.out.println("data from Vodafone");
	}
	
}
