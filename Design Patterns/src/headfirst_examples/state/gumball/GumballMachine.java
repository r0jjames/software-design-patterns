package headfirst_examples.state.gumball;

public class GumballMachine {

	State soldOutState;
	State noQuarterState;
	State hasQuarterState;
	State soldState;
	State currentState;
	int numGumBalls = 5;
	int count = 0;
  
	public GumballMachine(int count) {
		soldState = new SoldState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);
		this.count = numGumBalls;
		if (numGumBalls > 0) {
			currentState = noQuarterState;
		} else {
			currentState = soldOutState;
		}
	}
  
	public void insertQuarter() {
		currentState.insertQuarter();
	}

	public void ejectQuarter() {
		currentState.ejectQuarter();
	}
 
	public void turnCrank() {
		currentState.turnCrank();
		currentState.dispense();
	}

	public void releaseBall() {
		System.out.println("A gumball comes rolling out the slot...");
		if (count > 0) {
			count = count - 1;
		}
	}

	public State getCurrentState() {
		return currentState;
	}

	public void setCurrentState(State currentState) {
		this.currentState = currentState;
	}

	public State getSoldState() {
		return soldState;
	}

	public void setSoldState(State soldState) {
		this.soldState = soldState;
	}

	public State getHasQuarterState() {
		return hasQuarterState;
	}

	public void setHasQuarterState(State hasQuarterState) {
		this.hasQuarterState = hasQuarterState;
	}

	public State getNoQuarterState() {
		return noQuarterState;
	}

	public void setNoQuarterState(State noQuarterState) {
		this.noQuarterState = noQuarterState;
	}

	public State getSoldOutState() {
		return soldOutState;
	}

	public void setSoldOutState(State soldOutState) {
		this.soldOutState = soldOutState;
	}

	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nMighty Gumball, Inc.");
		result.append("\nJava-enabled Standing Gumball Model #2004\n");
		result.append("Inventory: " + count + " gumball");
		if (count != 1) {
			result.append("s");
		}
		result.append("\nMachine is ");
		if (currentState == soldOutState) {
			result.append("sold out");
		} else if (currentState == noQuarterState) {
			result.append("waiting for quarter");
		} else if (currentState == hasQuarterState) {
			result.append("waiting for turn of crank");
		} else if (currentState == soldState) {
			result.append("delivering a gumball");
		}
		result.append("\n");
		return result.toString();
	}
}


