package school.mjc.stage0.conditions.task3;

public class AliquotNumbers {
    public void isFirstAliquot(int first, int second) {
        if (second == 0) {
            System.out.println("Cannot divide by zero");
        } else if (second % first == 0) {
            System.out.println("Aliquot");
        } else {
            System.out.println("Not aliquot");
        }
    }
}
