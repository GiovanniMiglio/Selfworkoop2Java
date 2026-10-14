package scuola;

public class Teacher extends  Person {
    private String subject;
    

    public Teacher(String name, String surname, int age, String subject) {
        super(name, surname, age);
        this.subject = subject;
    }


    @Override
    public void presentati() { 
        System.out.println("Buongiorno sono " + name + " " + surname + " e insegno " + subject );       
    }


    public String getSubject() {
        return subject;
    }


    public void setSubject(String subject) {
        this.subject = subject;
    }    
}
