package com.java.basics;

import java.util.ArrayList;
import java.util.List;

public enum TrafficSignal {

		RED("STOP"), GREEN("GO"), ORANGE("SLOW DOWN"); 
 
		private String action; 

		public String getAction() 
		{ 
			return this.action; 
		} 

		private TrafficSignal(String action) 
		{ 
			this.action = action; 
		}
		public static List<String> getValuesList() {
			List<String> signallist = new ArrayList<String>();
			for(TrafficSignal signal: TrafficSignal.values()) {
				signallist.add(signal.getAction());
			}
			return signallist;
		}
}
