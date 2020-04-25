package net.ssssssss;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long TimeStart = System.currentTimeMillis();
		Tye t = new Tye(2000000);
		String[] r = t.get();
		long TimeEnd = System.currentTimeMillis();
		System.out.print("生成md5历时="+(TimeEnd-TimeStart)+"\n");
		
		new Test(r);
	}

}
