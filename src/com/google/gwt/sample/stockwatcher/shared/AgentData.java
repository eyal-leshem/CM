package com.google.gwt.sample.stockwatcher.shared;

import java.util.ArrayList;

public class AgentData {
	
	ArrayList<ArrayList<String>> data;
	
	public AgentData() {
		data=new ArrayList<ArrayList<String>>();		
	}
	
	public void addData(String date,String log){
		ArrayList<String> arr=new ArrayList<String>(); 
		arr.add(date); 
		arr.add(log);
		data.add(arr);
	}
	
	public void changeAllData(ArrayList<ArrayList<String>> data){
		this.data=data; 
	}
	
	public ArrayList<ArrayList<String>> getData(){
		return data; 
	}

}
