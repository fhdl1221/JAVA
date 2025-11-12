package e.generic;

class Student<T> {
    private T score;
    private String name;

    public Student(String name, T score) {
        this.name = name;
        this.score = score;
    }

    public T getScore() {
        return score;
    }

    public String getName() {
        return name;
    }

    public boolean isPassing(double passingScore) {
        if(score instanceof Number) {
            double scoreValue = ((Number)score).doubleValue();
            return scoreValue > passingScore;
        }
        return false;
    }
}
public class StudentMain {
    public static void main(String[] args) {
        Student<Integer> s1 = new Student<Integer>("kim", 80);
        System.out.println(s1.isPassing(90));
        Student<Double> s2 = new Student<Double>("lee", 95.5);

        Student<Integer>[] students = new Student[3];
        students[0] = new Student<Integer>("A", 100);
        students[1] = new Student<Integer>("B", 80);
    }
}
