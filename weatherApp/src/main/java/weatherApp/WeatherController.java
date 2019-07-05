package weatherApp;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import weatherApp.models.Weather;
import weatherApp.repository.WeatherRepository;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/weather")
public class WeatherController {

    @Autowired
    private WeatherRepository repository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Weather> getAllWeathers() {
        return repository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Weather getWeatherById(@PathVariable("id") ObjectId id) {
        return repository.findById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void modifyWeatherById(@PathVariable("id") ObjectId id, @Valid @RequestBody Weather weather) {
        weather.setId(id);
        repository.save(weather);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Weather createWeather(@Valid @RequestBody Weather weather) {
        weather.setId(ObjectId.get());
        repository.save(weather);
        return weather;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteWeather(@PathVariable ObjectId id) {
        repository.delete(repository.findById(id));
    }
}
