package com.ianbrandt.sts.perf.test;

public class TestBean implements Destroyable {

	public TestBean(ParentBean parentBean) {

		System.out.println(toString() + " instantiated with " + parentBean);
	}
}
