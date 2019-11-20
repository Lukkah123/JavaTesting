package JavaGitTest;

public class Main {
    public static void main(String[] args) {
        System.out.println("Spindelmannen kan hoppa högt igen");
        System.out.println("Spindelmannen är röd");
        Epix henke = new Epix("Henke", 35);
        Test test = new Test(14);
        System.out.println(henke);
        System.out.println(test);
        FompesKlass fp = new FompesKlass("Blablublö");
        System.out.println(fp + "\n " + test + "Strange");
    }
}
