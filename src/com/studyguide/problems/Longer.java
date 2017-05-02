package com.studyguide.problems;

public class Longer implements Ordering{

	@Override
	public boolean compare(Object a, Object b) {
		if(a.toString().length() > b.toString().length()) return true;
		else return false;
	}

	@Override
	public boolean isValid() {
		// TODO Auto-generated method stub
		return false;
	}

}
