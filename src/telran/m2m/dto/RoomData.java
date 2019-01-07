package telran.m2m.dto;

/**
 * Data Transfer Object for the Room Data in the monitoring and control system for buildings
 * made for generation of imitation model to test the functionality of microservices project
 * @author Andrey Lavrinenko
 */
public class RoomData {

	/**
	 * Identification number of room data object
	 */
	public int id;

	/**
	 * Timestamp of room data object
	 */
	public long timestamp;

	/**
	 * Room object
	 */
	public Room room;

	public RoomData(int id, long timestamp, Room room) {
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
}
