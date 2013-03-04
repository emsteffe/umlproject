package umlproject.controler;

import java.util.ArrayList;
import java.util.List;

import umlproject.model.StateData;
import umlproject.model.TransitionData;

class XMLControler {
	
	
	public String serialize(List<StateData> states){
		String toReturn = "";
		for(StateData state : states){
			toReturn = toReturn + state.toXML() + "\n";
		}
		return toReturn;
	}
	
	public static void main(String args[]){
		StateData state1 = new StateData(true, false, "start");
		StateData state2 = new StateData(false, false, "nor1");
		StateData state3 = new StateData(false, false, "nor2");
		StateData state4 = new StateData(false, true, "end1");
		
		TransitionData trans1 = new TransitionData("trans1", state1, state2, 
												"trigger1", "event1", "");
		TransitionData trans2 = new TransitionData("trans2", state2, state4, 
												"trigger2", "event2", "con1");
		TransitionData trans3 = new TransitionData("trans3", state1, state3,
												"trigger3", "event3", "con2");
		TransitionData trans4 = new TransitionData("trans4", state3, state2,
												"trigger4", "event4", "");
		TransitionData trans5 = new TransitionData("trans5", state3, state3,
												"trigger5", "event5", "");
		
		state1.addTransitionOut(trans1);
		state1.addTransitionOut(trans3);
		
		state2.addTransitionOut(trans2);
		
		state3.addTransitionOut(trans4);
		state4.addTransitionOut(trans5);
		
		state2.addAction("Arrive/action");
		
		ArrayList<StateData> test = new ArrayList<StateData>();
		
		test.add(state1);
		test.add(state2);
		test.add(state3);
		test.add(state4);
		
		XMLControler tester = new XMLControler();
		
		System.out.println(tester.serialize(test));
	}

}
