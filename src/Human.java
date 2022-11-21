import java.time.LocalDate;

public class Human {

    private int yearOfBirth;
    String name;
    private String town;
    String jobTitle;

    Human(int yearOfBirth, String name, String town, String jobTitle) {
        if (yearOfBirth <= 0) {
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = yearOfBirth;
        }
        if (name == null || name.isEmpty() || name.isBlank()) {
            this.name = "Информация не указана";
        } else {
            this.name = name;
        }
        if (jobTitle == null || jobTitle.isEmpty() || jobTitle.isBlank()) {
            this.jobTitle = "Информация не указана";
        } else {
            this.jobTitle = jobTitle;
        }
        if (town == null || town.isEmpty() || town.isBlank()) {
            this.town = "Информация не указана";
        } else {
            this.town = town;
        }
    }
    public String toString() {
        return "Привет! Меня зовут " + name + ". Я из города " + getTown() + ". Я родилась(ся) в " + getYearOfBirth() + " году." +
                " Я работаю на должности - " + jobTitle + ". Будем знакомы!";
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth <= 0) {
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = yearOfBirth;
        }
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        if (town == null || town.isEmpty() || town.isBlank()) {
            this.town = "Информация не указана";
        } else {
            this.town = town;
        }
    }
}
