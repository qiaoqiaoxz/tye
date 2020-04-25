package net.ssssssss;

public class Test {
	public Test(String[] r) {
		long TimeStart = System.currentTimeMillis();
		System.out.print("\n开始时间="+TimeStart+"\n");
		for(long i=Long.parseLong(r[1]); i<=Long.parseLong(r[2]);i++) {
			if(Md5.get(i).equals(r[0])) {
				System.out.print("匹配到相同\n");
				long TimeEnd = System.currentTimeMillis();
				System.out.print("结束时间="+TimeEnd+"\n");
				System.out.print("经理时间="+(TimeEnd-TimeStart)+"\n");
				return;
			}
		}
		System.out.print("无法匹配到相同\n");
		long TimeEnd = System.currentTimeMillis();
		System.out.print("结束时间="+TimeEnd+"\n");
		System.out.print("经理时间="+(TimeEnd-TimeStart)+"\n");
	}
}
