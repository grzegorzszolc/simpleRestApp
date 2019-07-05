package weatherApp.repository;

import weatherApp.models.Weather;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface WeatherRepository extends MongoRepository<Weather, String> {
    Weather findById(ObjectId id);
}
