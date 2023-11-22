package org.eclipse.acceleo.module.services;

import org.eclipse.uml2.uml.Class;

public class Refinement {
	
	private String[] cpeNames= {"ecostruxure_control_expert","ecostruxure_machine_expert","ecostruxure_opcua_server_expert"};
	
	
	
	public String refine(Class c, String versionNumber) {
		
		String result="";
		String formattedName = c.getName().replaceAll(" ", "_").toLowerCase();
		versionNumber = versionNumber.replaceAll("\\.","_");
		
		for(int i=0;i<cpeNames.length;i++) {
			String cpeName = cpeNames[i];
			if(cpeName.contains(formattedName)) {
				if(versionNumber.equals("0_0")) {
					result+="isA("+formattedName+", "+cpeName+").\n";
				}else {
					result+="isA("+formattedName+", "+cpeName+"_"+versionNumber+").\n";
				}
				
			}
		}
		
		return result;
	}

}
