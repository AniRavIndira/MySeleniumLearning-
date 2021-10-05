package week1.day2;

public class MyKids {

	public static void main(String[] args) {
		MyMobile obj =new MyMobile();
		System.out.println(obj.size);
		obj.makecall();
		//obj.payBills();-- this is private method of MyMobile java,so we cant acces from MyKids
	}
	}


