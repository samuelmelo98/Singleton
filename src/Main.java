public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance("instancia - 01");
        Singleton singleton1 = Singleton.getInstance("inatancia - 02");
        System.out.println(singleton.getValue());

        System.out.println(singleton1.getValue());

        System.out.println(singleton == singleton1);
        System.gc();

    }
}
