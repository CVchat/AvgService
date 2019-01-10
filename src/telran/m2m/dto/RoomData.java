package telran.m2m.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Data Transfer Object for the Room Data in the monitoring and control system for buildings
 * made for generation of imitation model to test the functionality of microservices project
 *
 * @author Andrey Lavrinenko
 */
@Document("RoomData")
public class RoomData {

    /**
     * Identification number of room data object
     */
    @Id
    public int id;

    /**
     * Timestamp of room data object
     */
    public long timestamp;

    /**
     * Room object
     */
    public Room room;

    @JsonCreator
    public RoomData(@JsonProperty("id") int id,
                    @JsonProperty("timestamp") long timestamp,
                    @JsonProperty("room") Room room) {
        this.id = id;
        this.timestamp = timestamp;
        this.room = room;
    }

    public RoomData() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    @Override
    public String toString() {
        return "RoomData{" +
                "id=" + id +
                ", timestamp=" + timestamp +
                ", room=" + room +
                '}';
    }
}
