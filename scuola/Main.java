package scuola;

public class Main {
    public static void main(String[] args) {
        Teacher professor = new Teacher("Mario", "Rossi", 45, "matematica");
        Teacher professor2 = new Teacher("Giulio", "Roma", 37, "matematica");
        Student student = new Student("Andrea", "Pisacane", 16, 7.5);
        Student student2 = new Student("Claudia", "Mirto", 16, 9.5);
        Parent parent = new Parent("Carlo", "Pisacane", 47, "Andrea");
        Parent parent2 = new Parent("Guido", "Mirto", 57, "Claudia");
        
        Person[] persons = { professor, professor2, parent, parent2, student, student2 };
        
        for (int i = 0; i < persons.length; i++){
            persons[i].presentati();
        }
        
    }
}
