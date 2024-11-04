package headfirst_examples.command;

public class SterioOffCommand implements Command{
    private Stereo stereo;

    public SterioOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }
}
