package com.ianbrandt.sts.perf.test;

public class ParentBean implements Destroyable {

	public ParentBean() {

		System.out.println(toString() + " instantiated");
	}
}
