package week5;

public class Score {
    String nameSdt;
    double scoreAssgnment;
    double scoreQuiz;
    double scoreMid;
    double scoreFinal;

    public Score(String nameSdt, double scoreAssgnment, double scoreQuiz, double scoreMid, double scoreFinal) {
        this.nameSdt = nameSdt;
        this.scoreAssgnment = scoreAssgnment;
        this.scoreQuiz = scoreQuiz;
        this.scoreMid = scoreMid;
        this.scoreFinal = scoreFinal;
    }

    public double calculateTotalScore() {
        return scoreAssgnment * 0.3 + scoreQuiz * 0.2 + scoreMid * 0.2 + scoreFinal * 0.3;
}
}
