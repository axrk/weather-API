package city_weather;

import com.google.gson.annotations.SerializedName;

public class Wind {
    // Paramètres obligatoires
    private double speed;

    @SerializedName("deg")
    private double direction;

    // Paramètres optionnels
    private double gust = 0;

    // Constructeurs
    public Wind(double speed, double direction, double gust) {
        this.speed = speed;
        this.direction = direction;
        this.gust = gust;
    }

    // Getters et setters
    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getDirection() {
        return direction;
    }

    public void setDirection(double direction) {
        this.direction = direction;
    }

    public double getGust() { return gust; }

    public void setGust(double gust) {
        this.gust = gust;
    }

}
