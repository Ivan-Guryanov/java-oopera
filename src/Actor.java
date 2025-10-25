import java.util.Objects;

public class Actor extends Person {
    int height;

    public Actor(String name, String surname, Gender gender, int height) {
        super(name, surname, gender);
        this.height = height;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // проверяем адреса объектов
        if (obj == null) return false; // проверяем ссылку на null
        if (this.getClass() != obj.getClass()) return false; // сравниваем классы
        Actor otherActor = (Actor) obj; // открываем доступ к полям другого объекта
        return Objects.equals(name, otherActor.name) && // проверяем все поля
                Objects.equals(surname, otherActor.surname) &&
                (gender == otherActor.gender) &&// нужно логическое «и»
                (height == otherActor.height); // примитивы сравниваем через ==
    }

    @Override
    public int hashCode() {
        int hash = 17;
        if (name != null) {
            hash = name.hashCode();
        }
        if (surname != null) {
            hash = hash + surname.hashCode();
        }
        if (gender != null) {
            hash = hash + gender.hashCode();
        }
        if (height != 0) {
            hash = hash + height;
        }
        return hash;
    }

    @Override
    public String toString() {
        return name + " " + surname + "(" + height + ")";
    }
}

