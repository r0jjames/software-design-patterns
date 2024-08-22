package creational_patterns.factory.solution;

public class ArabianScheduler extends Scheduler {
    @Override
    protected Calendar createCalendar() {
        return new ArabianCalendar();
    }
}
