package de.uni_potsdam.hpi.metanome.frontend.client;


import java.util.ArrayList;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;

import de.uni_potsdam.hpi.metanome.frontend.client.tabs.AlgorithmTab;
import de.uni_potsdam.hpi.metanome.frontend.server.InputParameter;

/**
 * A UI Widget that allows to choose a JAR containing the algorithm to use
 */
public class JarChooser extends HorizontalPanel {

	private Label label;
	private ListBox listbox;
	private Button button;
	
	public JarChooser(String[] jarFilenames){
		super();
		
		this.label = new Label("Choose your algorithm:");
		this.add(label);
		
		this.listbox = new ListBox();
		for (String filename : jarFilenames){
			this.listbox.addItem(filename);
		}
		this.add(listbox);
		
		this.button = new Button("OK", new JarChooserClickHandler());
		this.add(button);
	}

	public void submit(){
		String selectedValue = listbox.getValue(listbox.getSelectedIndex());
		//TODO: load needed Parameters into paramList
		ArrayList<InputParameter> paramList = new ArrayList<InputParameter>();
//		
//    	paramList.add(new InputParameter("filename", Type.STRING));
//    	paramList.add(new InputParameter("Omit warnings", Type.BOOL));
//    	paramList.add(new InputParameter("Number of Runs", Type.INT));
    	
		((AlgorithmTab) this.getParent()).addParameterTable(paramList);
	}
	
	public int getListItemCount() {
		return this.listbox.getItemCount();
	}
}