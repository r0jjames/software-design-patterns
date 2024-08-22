package creational_patterns.prototype.solution;

public class Clip implements Component {


    @Override
    public Component clone() {
        Clip newClip = new Clip();
        return newClip;
    }

    @Override
    public void render() {
        System.out.println("Clip rendering....");
    }

}
