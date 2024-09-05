package ex8;

public class TesteProfessor {
    public static void main(String[] args) {
        Professor professor = new Professor("Eduardo", "Matematica", 4000);
        System.out.println(professor);
        professor.darAula();
    }
}
