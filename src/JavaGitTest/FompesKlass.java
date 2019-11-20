package JavaGitTest;

public class FompesKlass {
    private String test;

    public FompesKlass(String test) {
        this.test = test;
    }

    public String getTest() {
        return test;
    }

    @Override
    public String toString() {
        return getTest();
    }
}
