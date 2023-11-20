package org.eclipse.acceleo.module.services;

import org.eclipse.uml2.uml.Class;

public class Refinement {
	
	private String[] cpeNames= {"ecostruxure_control_expert","ecostruxure_machine_expert","ecostruxure_opcua_server"};
	
	
	
	public String refine(Class c) {
		
		String result="";
		String formattedName = c.getName().replaceAll(" ", "_").toLowerCase();
		for(int i=0;i<cpeNames.length;i++) {
			String cpeName = cpeNames[i];
			if(cpeName.contains(formattedName)) {
				
				result+="isA("+formattedName+", "+cpeName+").\n";
			}
		}
		
		return result;
	}

}
