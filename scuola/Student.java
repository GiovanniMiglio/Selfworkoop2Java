package scuola;

public class Student extends Person{
    private double average;

    public Student(String name, String surname, int age, double average) {
        super(name, surname, age);
        this.average = average;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    @Override
    public void presentati() {
        System.out.println("Buongiorno sono " + name +" "+ surname + " e la mia media voti e' " + average );
        
    }
    

}
