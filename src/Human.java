import java.time.LocalDate;

public class Human {

    int yearOfBirth;
    String name;
    String town;
    String jobTitle;

    public Human(int yearOfBirth, String name, String town, String jobTitle) {
        this.yearOfBirth = yearOfBirth;
        this.name = name;
        this.town = town;
        this.jobTitle = jobTitle;
    }

    public String toString() {
        return "Привет! Меня зовут " + name + ". Я из города " + town + ". Я родилась(ся) в " + yearOfBirth + " году." +
                " Я работаю на должности - " + jobTitle + ". Будем знакомы!";
    }
}
