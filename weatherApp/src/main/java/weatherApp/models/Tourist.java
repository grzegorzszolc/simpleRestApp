package weatherApp.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Tourist {

    @Id
    public ObjectId _id;

    public String name;
    public String location;
    public String date;

    public Tourist() {
    }

    public Tourist(ObjectId _id, String name, String location, String date) {
        this._id = _id;
        this.name = name;
        this.location = location;
        this.date = date;
    }

    public String get_id() {
        return _id.toHexString();
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
