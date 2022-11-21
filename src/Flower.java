import java.text.DecimalFormat;

public class Flower {
    private String flowerColor;
    private String country;
    private double cost;
    int lifeSpan;

    Flower(String flowerColor, String country, double cost, int lifeSpan) {
        if (flowerColor == null || flowerColor.isBlank() || flowerColor.isEmpty()) {
            this.flowerColor = "белый";
        } else {
            this.flowerColor = flowerColor;
        }
        if (country == null || country.isBlank() || country.isEmpty()) {
            this.country = "Россия";
        } else {
            this.country = country;
        }
        if (cost <= 0) {
            this.cost = 1;
        } else {
            this.cost = cost;
        }
        if (lifeSpan <= 0) {
            System.out.println("Некорректное значение");
        } else {
            this.lifeSpan = lifeSpan;
        }
    }


    Flower(double cost, int lifeSpan) {
        this("белый", "Россия", cost, lifeSpan);
    }

    Flower(String country, double cost) {
        this("белый", country, cost, 3);
    }

    Flower(String country, double cost, int lifeSpan) {
        this("белый", country, cost, lifeSpan);
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        if (flowerColor == null || flowerColor.isBlank() || flowerColor.isEmpty()) {
            this.flowerColor = "белый";
        } else {
            this.flowerColor = flowerColor;
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country == null || country.isBlank() || country.isEmpty()) {
            this.country = "Россия";
        } else {
            this.country = country;
        }
    }

    public String getCost() {
        String formattedCost = String.format("%.2f", cost);
        return formattedCost;
    }

    public void setCost(double cost) {
        if (cost <= 0) {
            this.cost = 1;
        } else {
            this.cost = cost;
        }
    }

    public String toString() {
        return "цвет " + getFlowerColor() + ", страна " + getCountry() + ", стоимость " + getCost() + ", срок стояния " + lifeSpan;
    }
}
