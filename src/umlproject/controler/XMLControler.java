package umlproject.controler;

import java.util.ArrayList;
import java.util.List;

import umlproject.model.StateData;
import umlproject.model.TransitionData;

public class XMLControler {
	
	public XMLControler(){}
	
	public String serialize(List<StateData> states){
		String toReturn = "";
		for(StateData state : states){
			toReturn = toReturn + state.toXML() + "\n";
		}
		return toReturn;
	}
	
	

}
