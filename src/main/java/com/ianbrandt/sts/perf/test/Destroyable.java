package com.ianbrandt.sts.perf.test;

public interface Destroyable {

	default void destroy() {

		System.out.println(toString() + " destroyed");
	}
}
