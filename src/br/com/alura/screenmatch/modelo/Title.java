package br.com.alura.screenmatch.modelo;

public class Title {
    // atributo
    // Atributtos só são visiveis e publicos por padrão para classes do mesmo pacote.
    public String nameTitle;
    private int releaseYear;
    private boolean isIncludedPlan;
    private double sumEvaluations;
    private int totalEvaluation;
    private int minutesDuration;

    // Métodos sem retorno
    public void displayTechnicalSheet(){
        System.out.println("Name : " + nameTitle);
        System.out.println("Release Year: " + releaseYear);
        System.out.println("Include you Plan? : " + isIncludedPlan);
        System.out.println("Total evaluation: " + getTotalEvaluation());
        System.out.println("Time Duration: " + minutesDuration + " minutes");
    }

    public int getTotalEvaluation(){
        return totalEvaluation;
    }

    public String getNameTitle() {
        return nameTitle;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public boolean isIncludedPlan() {
        return isIncludedPlan;
    }

    public double getSumEvaluations() {
        return sumEvaluations;
    }

    public int getMinutesDuration() {
        return minutesDuration;
    }

    public void setIncludedPlan(boolean includedPlan) {
        isIncludedPlan = includedPlan;
    }

    public void setMinutesDuration(int minutesDuration) {
        this.minutesDuration = minutesDuration;
    }


    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setNameTitle(String nameTitle) {
        this.nameTitle = nameTitle;
    }

    public void evaluate(double note){
        sumEvaluations += note;
        totalEvaluation++;
    }

    // metodo com retorno
    public double getAverageReviews(){
        return sumEvaluations / totalEvaluation;
    }
}
