package net.ssssssss;

public class Test {
	public Test(String[] r) {
		long TimeStart = System.currentTimeMillis();
		System.out.print("\n��ʼʱ��="+TimeStart+"\n");
		for(long i=Long.parseLong(r[1]); i<=Long.parseLong(r[2]);i++) {
			if(Md5.get(i).equals(r[0])) {
				System.out.print("ƥ�䵽��ͬ\n");
				long TimeEnd = System.currentTimeMillis();
				System.out.print("����ʱ��="+TimeEnd+"\n");
				System.out.print("����ʱ��="+(TimeEnd-TimeStart)+"\n");
				return;
			}
		}
		System.out.print("�޷�ƥ�䵽��ͬ\n");
		long TimeEnd = System.currentTimeMillis();
		System.out.print("����ʱ��="+TimeEnd+"\n");
		System.out.print("����ʱ��="+(TimeEnd-TimeStart)+"\n");
	}
}
