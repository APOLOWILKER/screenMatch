public class Movie {
    String nameMovie;
    int releaseYear;
    boolean isIncludedPlan;
    private double sumEvaluations;
    private int totalEvaluation;
    int minutesDuration;

    // Métodos sem retorno
    void displayTechnicalSheet(){
        System.out.println("Movie Name: " + nameMovie);
        System.out.println("Release Year: " + releaseYear);
        System.out.println("Include you Plan? : " + isIncludedPlan);
        System.out.println("Total evaluation: " + getTotalEvaluation());
        System.out.println("Time Duration: " + minutesDuration + " minutes");
    }

    int getTotalEvaluation(){
        return totalEvaluation;
    }

    void evaluate(double note){
        sumEvaluations += note;
        totalEvaluation++;
    }

    // metodo com retorno
    double getAverageReviews(){
        return sumEvaluations / totalEvaluation;
    }
}
