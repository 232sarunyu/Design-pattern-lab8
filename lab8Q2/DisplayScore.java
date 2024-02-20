public class DisplayScore implements observer {
    @Override
    public void update(score score) {
        System.out.println("Live result: " + score.getMatchResult());
    }
}
