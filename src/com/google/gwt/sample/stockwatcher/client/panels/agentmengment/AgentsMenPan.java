package com.google.gwt.sample.stockwatcher.client.panels.agentmengment;

import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.TabLayoutPanel;

public class AgentsMenPan extends TabLayoutPanel {

	private FlowPanel ActiveAgents=new FlowPanel(); 
	private FlowPanel updateKey =new FlowPanel(); 
	
	public AgentsMenPan(double barHeight, Unit barUnit) {
		super(barHeight, barUnit);
		// TODO Auto-generated constructor stub
	}
	
	public AgentsMenPan(){
		super(0.8, Unit.CM);
		this.add(ActiveAgents,"active / crashed agents"); 
		this.add(updateKey,"update key/certificate");
		this.setPixelSize(5000, 900);
	}



}
