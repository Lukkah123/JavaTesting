package JavaGitTest;

public class Epix {
    private String name;
    private int age;

    public Epix(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Epix{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
