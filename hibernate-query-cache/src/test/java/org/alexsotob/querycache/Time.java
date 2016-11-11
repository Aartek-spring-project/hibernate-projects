package org.alexsotob.querycache;

import java.io.PrintStream;

public class Time {

	
	private String name;
	private long initialTime;
	
	public Time(String name) {
		this.name = name;
		initialTime = System.currentTimeMillis();
	}
	
	public void miliseconds(PrintStream out) {
		out.println(name+": "+((System.currentTimeMillis() - initialTime))+" miliseconds.");
	}
	
}
