package com.google.gwt.sample.stockwatcher.client;

import java.util.ArrayList;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.sample.stockwatcher.client.panels.agentmengment.AgentsMenPan;
import com.google.gwt.sample.stockwatcher.client.panels.dataBase.DataBasePanel;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TabLayoutPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;


public class StockWatcher implements EntryPoint {
   
  private TabLayoutPanel tabPan=new TabLayoutPanel(1, Unit.CM);

  private FlowPanel 		floPan1=new FlowPanel(); 
  private FlowPanel 		floPan2=new FlowPanel(); 
  private FlowPanel 		floPan3=new FlowPanel(); 
  private TabLayoutPanel	dataBase=new DataBasePanel(); 
  private TabLayoutPanel	agents=new AgentsMenPan(); 
  
  private aaa  bind = new aaa("chad");

  /**
   * Entry point method.
   */
  public void onModuleLoad() {
	  
	agents.setPixelSize(1280,600);
	dataBase.setPixelSize(1280,600);
	  
    floPan1.add(dataBase);  
    floPan2.add(agents); 
    
    tabPan.add(floPan1,"database"); 
    tabPan.add(floPan2,"agent Mangement"); 
    tabPan.add(floPan3,"configuration");   
    
    tabPan.setPixelSize(1300,650);

    // Associate the Main panel with the HTML host page.
    RootPanel.get("stockList").add(tabPan);


    

    
    
  }
  
 
}