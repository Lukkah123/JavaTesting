package JavaGitTest;

public class Test {
    private int number;

    public Test(int number) {
        this.number = number;
    }

    public int getNumber() {
        System.out.println("Simons ändring Size does not matter");
        return number;
    }

    @Override
    public String toString() {

        return "the number is: " + getNumber();
    }
}
