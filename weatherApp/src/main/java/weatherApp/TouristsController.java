package weatherApp;


import weatherApp.models.Tourist;
import weatherApp.repository.TouristRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/tourist")
public class TouristsController {
    @Autowired
    private TouristRepository repository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Tourist> getAllTourists() {
        return repository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Tourist getTouristById(@PathVariable("id") ObjectId id) {
        return repository.findById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void modifyTouristById(@PathVariable("id") ObjectId id, @Valid @RequestBody Tourist tourist) {
        tourist.setId(id);
        repository.save(tourist);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Tourist createTourist(@Valid @RequestBody Tourist tourist) {
        tourist.setId(ObjectId.get());
        repository.save(tourist);
        return tourist;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteTourist(@PathVariable ObjectId id) {
        repository.delete(repository.findById(id));
    }
}