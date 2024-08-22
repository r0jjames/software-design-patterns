package creational_patterns.prototype.solution;

public class Audio implements Component {

    @Override
    public Component clone() {
        Audio newAudio = new Audio();
        return newAudio;
    }

    @Override
    public void render() {
        System.out.println("Audio rendering....");
    }
}
