package net.ssssssss;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long TimeStart = System.currentTimeMillis();
		Tye t = new Tye(2000000);
		String[] r = t.get();
		long TimeEnd = System.currentTimeMillis();
		System.out.print("����md5��ʱ="+(TimeEnd-TimeStart)+"\n");
		
		new Test(r);
	}

}
