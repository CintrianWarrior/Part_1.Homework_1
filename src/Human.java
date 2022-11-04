import java.time.LocalDate;

public class Human {

    int yearOfBirth;
    String name;
    String town;
    String jobTitle;

    public Human(int yearOfBirth, String name, String town, String jobTitle) {
        if (yearOfBirth >= 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = 0;
        }

        if (name == null || name.length() == 0) {
            this.name = "Информация не указана";
        } else {
            this.name = name;
        }
        if (town == null || town.length() == 0) {
            this.town = "Информация не указана";
        } else {
            this.town = town;
        }

        if (jobTitle == null || jobTitle.length() == 0) {
            this.jobTitle = "Информация не указана";
        } else {
            this.jobTitle = jobTitle;
        }
    }

    public String toString() {
        return "Привет! Меня зовут " + name + ". Я из города " + town + ". Я родилась(ся) в " + yearOfBirth + " году." +
                " Я работаю на должности - " + jobTitle + ". Будем знакомы!";
    }
}
