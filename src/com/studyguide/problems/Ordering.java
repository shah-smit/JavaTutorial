package com.studyguide.problems;

public interface Ordering {
	abstract boolean compare(Object a, Object b);
	
	abstract boolean isValid();
}
