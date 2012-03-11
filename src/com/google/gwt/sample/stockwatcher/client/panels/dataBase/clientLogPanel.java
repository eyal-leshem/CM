package com.google.gwt.sample.stockwatcher.client.panels.dataBase;




import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;

import sun.management.Agent;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.sample.stockwatcher.shared.AgentData;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.ToggleButton;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;


public class clientLogPanel extends FlowPanel {
	
	//panels for this page 
	private VerticalPanel			mainPanel=new VerticalPanel();
	private HorizontalPanel 		firstLine=new HorizontalPanel(); 
	private ScrollPanel				tableContiener=new ScrollPanel();
	
	//table wiget 
	private FlexTable				logDataTable=new FlexTable(); 
	
	//first line wiget 
	private Label  					id= new Label("ID:"); 
	private TextBox 				enterID=new TextBox();
	private Button					go=new Button("go"); 
	private Button					export= new Button("export");
	private Button					markAll=new Button("mark all");
	
	private AgentData				data=new AgentData(); 
							
	
	
	
	public clientLogPanel() {
		super(); 
		makeFirstLine(); 
		this.add(mainPanel); 
		mainPanel.add(firstLine);
		makeTable(); 
		mainPanel.add(tableContiener);
		
		
		
		
	}

	private void makeTable() {
		tableContiener.setSize("1200px","500px"); 
		tableContiener.setStyleName("clinetLogTableConteiner"); 
		tableContiener.add(logDataTable); 
	    logDataTable.setText(0, 0, "date");
	    logDataTable.setText(0, 1, "log");
	    logDataTable.setText(0, 2, "mark for export");
	    logDataTable.getCellFormatter().addStyleName(0, 0, "clientLogDate"); 
	    logDataTable.getCellFormatter().addStyleName(0, 1, "clientLogLog");
	    logDataTable.getCellFormatter().addStyleName(0, 2, "clientLogExport");
	    
		
		
	}
	
	
	private void makeFirstLine() {
		HorizontalPanel idPart=new HorizontalPanel(); 
		id.addStyleName("clinetLogId"); 
		idPart.addStyleName("clientLogExportPanel");
		idPart.add(id); 
		idPart.add(enterID); 
		HorizontalPanel  leftPart=new HorizontalPanel(); 
		leftPart.addStyleName("clientLogLeftPart");
		leftPart.add(idPart); 
		go.addStyleName("clientLogGo");
		leftPart.add(go); 
		firstLine.add(leftPart);
		firstLine.add(markAll);
		firstLine.add(export); 
		
		go.addClickHandler(new ClickHandler() {
		   	@Override
			public void onClick(ClickEvent event) {
				addAgentData(); 			
			}
		});
		
		markAll.addClickHandler(new ClickHandler(){			
			@Override
			public void onClick(ClickEvent event) {
				markAll(); 
				
			}
		});
		
	
		
	}
	
	private void addAgentData() {
		   int 	row=1;
		   boolean	even=false;
		 
		 	//here we need to get the data from the server 
		    // this code souldn't exisist in the real program 
			DateFormat df = DateFormat.getDateInstance();
		    for(int i=0; i<40 ; i++){
		        data.addData(df.format(new Date()), "bla bla bla ...."); 
		    }
		    
		    //code that will exisist in the real program 
		    
		    ArrayList<ArrayList<String>> arrData=data.getData();		  
		    
		    for(ArrayList<String> arr: arrData){		   	
		    	logDataTable.setText(row, 0, arr.get(0)); 
		    	logDataTable.setText(row, 1, arr.get(1));
		    	logDataTable.setWidget(row, 2,new CheckBox());
		    	logDataTable.getWidget(row, 2).setStyleName("clientLogMark");
		    	if(even){
		    		logDataTable.getRowFormatter().addStyleName(row,"clientRowEven");
		    		even=false; 
		    	}
		    	else {
		    		logDataTable.getRowFormatter().addStyleName(row,"clientRowOdd");
		    		even=true; 
		    	}
		    	
		    	
		    	row++;
		    }
		    
		    
		    
		    

	 }

	private void markAll() {
		int numRows=logDataTable.getRowCount()-1; 
		
		for(int i=0; i<numRows; i++){
			CheckBox c= (CheckBox) logDataTable.getWidget(i+1,2);
			c.setValue(true); 
		}
	}
}
