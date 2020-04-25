package net.ssssssss;

public class Tye {
	private long count = 0;
	private long randomMax = 1;
	private long randomMin = 0;
	private long randomLong = 1;
	
	public Tye(long count) {
		this.count = count;
		this.set();
	}
	
	public void setCount(long count){
		this.count = count;
		this.set();
	}
	public String[] get() {
		long r = (long) (Math.random()*randomLong+this.randomMin);
		long rr = (long) (Math.random()*this.count);
		//rr+r ¹þÏ£ÖµÖÖ×Ó
		String[] result = {Md5.get(rr+r),r+"",r+this.count+""};
		return result;
	}
	private void set() {
		this.randomMax = Long.MAX_VALUE-this.count;
		String minStr = "1";
		long i = this.randomMax;
		while ((i = i / 10) != 0) {
			minStr+="0";
        }
		this.randomMin = Long.valueOf(minStr);
		this.randomLong = (randomMax-this.randomMin);
	}
	
	
}
