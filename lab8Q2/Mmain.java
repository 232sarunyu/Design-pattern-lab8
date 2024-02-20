public class Mmain {
    public static void main(String[] args) {
        ballScore score = new ballScore();
        observer observer1 = new DisplayScore();
        observer observer2 = new DisplayScore();

        score.attach(observer1);
        score.attach(observer2);

        score.setScore(new score("Thai 1-0 UAE"));
        score.setScore(new score("Thai 2-0 UAE"));
    }
}
