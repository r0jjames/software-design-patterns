package behavioral_patterns.state.solutions;

/*
In the Exercises project, look at the code in the state/DirectionService class.
This is the class that powers our mapping app. It provides two methods for calculating the estimated
time of arrival (ETA) and the direction between two points.  Identify the problems in this implementation.
Then, refactor the code to use the state pattern. What are the benefits of the new implementation?
 */
public class StateDemo {
    public static void main(String[] args) {
        var direction  = new DirectionService();
        direction.setTransportation(new Car());
        direction.getEta();
        direction.getDirection();
    }
}
