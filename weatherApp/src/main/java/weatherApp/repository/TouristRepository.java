package weatherApp.repository;

import weatherApp.models.Tourist;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TouristRepository extends MongoRepository<Tourist, String> {
    Tourist findById(ObjectId id);
}
