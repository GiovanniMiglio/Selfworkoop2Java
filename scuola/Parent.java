package scuola;

public class Parent extends Person {
    private String childName;

    public Parent(String name, String surname, int age, String childName) {
        super(name, surname, age);
        this.childName = childName;
    }

    public String getChildName() {
        return childName;
    }

    public void setChildName(String childName) {
        this.childName = childName;
    }

    @Override
    public void presentati() {
        System.out.println("Buongiorno sono " + name + " " + surname + " e sono il genitore dell'alunno " + childName);
    }

}
