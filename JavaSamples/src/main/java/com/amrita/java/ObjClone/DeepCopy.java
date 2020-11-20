package com.amrita.java.ObjClone;

public class DeepCopy implements Cloneable {
	int i;

	@Override
	public String toString() {
		return "DeepCopy [i=" + i + "]";
	}
	
//	@Override
//	public DeepCopy clone()  {
//		return (DeepCopy)super.clone();
//	
	
//	}
	

	public static void main(String[] args) throws CloneNotSupportedException {
		DeepCopy dc = new DeepCopy();
		DeepCopy dc1 = new DeepCopy();
		dc.i=40;
		dc1.i=dc.i;
		System.out.println(dc.toString());
		System.out.println(dc1.toString());
		
		//cloning
		DeepCopy dc2=(DeepCopy)dc1.clone();
		System.out.println(dc.toString());
		System.out.println(dc2.toString());
	}
}
