package com.capg.day3;


//Write A Abstract class or interface and Abstract class to demonstrate the following
//.1 Laptop
//2. Mobile
//3. Car
//4. TV
//5. Student 

//Mobile is concept
//SendSMS
//Calling

//Apple
//implement SendSMS
//Calling

//Abc from Mobile
//implement SendSMS
//implement Calling
//Unimplement Brand()

interface Mobile {
	public void sendSMS();

	public void calling();
}

class Apple implements Mobile {

	@Override
	public void sendSMS() {
		// TODO Auto-generated method stub
		System.out.println("Send Sms on Web");
	}

	@Override
	public void calling() {
		// TODO Auto-generated method stub
		System.out.println("VOIP 5g Calling");
	}

}

class Samsung implements Mobile {

	@Override
	public void sendSMS() {
		// TODO Auto-generated method stub
		System.out.println("Sending netword Sms");
	}

	@Override
	public void calling() {
		// TODO Auto-generated method stub
		System.out.println("4G Calling");
	}

}

abstract class Abc implements Mobile {

	@Override
	public void sendSMS() {
		// TODO Auto-generated method stub
		System.out.println("Send SMS");
	}

	@Override
	public void calling() {
		// TODO Auto-generated method stub
		System.out.println("calling");
	}

	abstract void brand();

}

class Oppo extends Abc {

	@Override
	void brand() {
		System.out.println("Oppo Mobile");
		// TODO Auto-generated method stub

	}

}

class ViVO extends Abc {

	@Override
	void brand() {
		System.out.println("ViVo Mobile");
		// TODO Auto-generated method stub

	}

}

class Micrmax extends Abc {

	@Override
	void brand() {
		System.out.println("Maximax Mobile");
		// TODO Auto-generated method stub

	}

}


public class MyAbstractionRealTimeExample {

	public static void main(String[] args) {
		Micrmax micrmax=new Micrmax();
		micrmax.calling();
		micrmax.sendSMS();
		micrmax.brand();
		
		
		Oppo oppo=new Oppo();
		oppo.calling();
		oppo.sendSMS();
		oppo.brand();
	}

}
