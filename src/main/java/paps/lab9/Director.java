package paps.lab9;

public class Director {
    private String id;
    private static Director director;

    public static synchronized Director getDirectorInstance(String id) {
        if (director == null) {
            director = new Director(id);
        }
        return director;
    }

    private Director(String id) {
        this.id = id;
    };

    public void showInfo() {
        System.out.println(String.format("I'm the Director with id = \"%s\".", id));
    }
}
