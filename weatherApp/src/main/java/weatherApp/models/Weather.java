package weatherApp.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Weather {

    @Id
    public ObjectId id;


    String coords;
    String cityName;
    double temp;
    double humidity;
    double tempMax;
    double tempMin;


    public Weather() {
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getCoords() {
        return coords;
    }

    public void setCoords(String coords) {
        this.coords = coords;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public double getTempMax() {
        return tempMax;
    }

    public void setTempMax(double tempMax) {
        this.tempMax = tempMax;
    }

    public double getTempMin() {
        return tempMin;
    }

    public void setTempMin(double tempMin) {
        this.tempMin = tempMin;
    }

    public Weather(ObjectId id, String coords, String cityName, double temp, double humidity, double tempMax, double tempMin) {
        this.id = id;
        this.coords = coords;
        this.cityName = cityName;
        this.temp = temp;
        this.humidity = humidity;
        this.tempMax = tempMax;
        this.tempMin = tempMin;
    }
}
