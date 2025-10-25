import java.util.ArrayList;

public class Show {
    String title;
    int duration;
    Director director;
    ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = new ArrayList<>();
    }

    public void printListOfActors(){
        for (Actor actor : listOfActors){
            System.out.println(actor);
        }
        System.out.println("");
    }

    public void newActor(Actor actor){
        for (Actor actor1 : listOfActors){
            if (actor.equals(actor1)){
                System.out.println("Этот актер уже участвует в спектакле");
                return;
            }
        }
        listOfActors.add(actor);
        System.out.println("Актер " + actor + " добавлен в спектакль " + title);
    }

    public void replaceActor(Actor actor1, Actor actor2){
        boolean actorVerification = listOfActors.contains(actor1);
        if(actorVerification) {
            for (Actor actor : listOfActors) {
                if (actor.equals(actor1)) {
                    listOfActors.remove(actor1);
                    listOfActors.add(actor2);
                    System.out.println("В спектакле " + title + " Актер " + actor1 + " заменен на " + actor2);
                    return;
                }
            }

        } else {
            System.out.println(actor1 + " не играет в спектакле " + title);
        }
    }



}
