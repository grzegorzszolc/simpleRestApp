package weatherApp.models;

import jdk.internal.net.http.common.Pair;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Weather {

    @Id
    public ObjectId id;

    double temp;
    Pair<Double,Double> coords;
    int humidity;
    double tempMax;
    double tempMin;

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public Pair<Double, Double> getCoords() {
        return coords;
    }

    public void setCoords(Pair<Double, Double> coords) {
        this.coords = coords;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
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

    public Weather(ObjectId id, double temp, Pair<Double, Double> coords, int humidity, double tempMax, double tempMin) {
        this.id = id;
        this.temp = temp;
        this.coords = coords;
        this.humidity = humidity;
        this.tempMax = tempMax;
        this.tempMin = tempMin;
    }
}
