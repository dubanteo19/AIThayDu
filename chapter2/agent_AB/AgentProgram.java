package chapter2.agent_AB;

import chapter2.agent_AB.Environment.LocationState;

public class AgentProgram {

	public Action execute(Percept p) {// location, status
		Action re = null;
		if (p.getLocationState() == LocationState.DIRTY)
			re = Environment.SUCK_DIRT;
		else if (p.getAgentLocation() == Environment.LOCATION_A)
			re = Environment.MOVE_RIGHT;
		else
			re = Environment.MOVE_RIGHT;
		return re;
	}
}