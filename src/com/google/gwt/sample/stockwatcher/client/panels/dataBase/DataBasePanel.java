package com.google.gwt.sample.stockwatcher.client.panels.dataBase;

import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.TabLayoutPanel;

public class DataBasePanel extends TabLayoutPanel {
	
	private FlowPanel clientLog=new clientLogPanel(); 
	private FlowPanel vailds=new FlowPanel(); 
	private FlowPanel acts=new FlowPanel();
	private FlowPanel privateKeys=new FlowPanel(); 
	private FlowPanel advanced= new FlowPanel(); 

	public DataBasePanel(double barHeight, Unit barUnit) {
		super(barHeight, barUnit);
		this.add(clientLog,"client log"); 
		this.add(vailds,"Valid  certificates");
		this.add(acts,"Activities"); 
		this.add(privateKeys,"private keys"); 
		this.add(advanced,"Advanced Search"); 
		this.setPixelSize(5000, 900);
	}

	public DataBasePanel() {
		super(0.8, Unit.CM); 
		this.add(clientLog,"client log"); 
		this.add(vailds,"Valid  certificates");
		this.add(acts,"Activities"); 
		this.add(privateKeys,"private keys"); 
		this.add(advanced,"Advanced Search"); 
		this.setPixelSize(5000, 900);
	
	}



}
