package com.ianbrandt.sts.perf.test;

public class TestBean extends Destroyable {

	public TestBean(ParentBean parentBean) {

		System.out.println(toString() + " instantiated with " + parentBean);
	}
}
