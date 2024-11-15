package behavioral_patterns.state.transportation;

public class DirectionService {
    private TravelMode travelMode;
    private Transportation transportation;

    public Object getEta() {
        return transportation.getEta();
    }

    public Object getDirection() {
        return transportation.getDirection();
    }

    public TravelMode getTravelMode() {
        return travelMode;
    }

    public void setTravelMode(TravelMode travelMode) {
        this.travelMode = travelMode;
    }

    public Transportation getTransportation() {
        return transportation;
    }

    public void setTransportation(Transportation transportation) {
        this.transportation = transportation;
    }
}
