package com.muhuk.csfj.part.ii;

public class ExtendTrait implements ScalaTrait {
	public int foo(int j) {
		return j * 10;
	}

	public int bar(int k) {
		return ScalaTrait$class.bar(this, k);
	}
}
