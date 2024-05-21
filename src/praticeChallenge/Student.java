package praticeChallenge;

public class Student {
    private String name;
    private double[] notas;

    public String getName() {
        return name;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public void calcAverageNotes(){
        if(notas.length == 0) {
            System.out.println("Student " + name + " has no grades to calculate an average.");
            return;
        }

        double sum = 0.0;
        for (double nota : notas) {
            sum += nota;
        }

        double average = sum / notas.length;
        System.out.println(name + "'s average grade: " + average);
    }
}
