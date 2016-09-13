package com.java.dumps;

public class Candidate {
String name;

Candidate(String name) throws Exception{
	if (name == null) {
		throw new MissingInfoException();
	}
	else
		throw new AgeOutOfRangeException();
		
}
}
