public class Director extends Person {
    private int numberOfShows;

    public Director(String name, String surname, Gender gender, int numberOfShows) {
        super(name, surname, gender);
        this.numberOfShows = numberOfShows;
    }

    @Override
    public String toString() {
        return "Режиссер: " + name + " " + surname + ".";
    }

    public static void printDirector(String name, String surname, Gender gender, int numberOfShows) {
        Director director = new Director(name, surname, gender, numberOfShows);
        System.out.println(director);
    }
}
