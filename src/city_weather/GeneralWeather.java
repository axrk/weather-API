package city_weather;

public class GeneralWeather {
    // Paramètres obligatoires
    private String type;
    private String description;

    // Constructeurs
    public GeneralWeather(String type, String description) {
        this.type = type;
        this.description = description;
    }

    // Getters et setters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}