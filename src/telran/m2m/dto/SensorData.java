package telran.m2m.dto;

public class SensorData {
public int id;
public long timestamp;
public int number;
public int getId() {
	return id;
}
public long getTimestamp() {
	return timestamp;
}
public int getNumber() {
	return number;
}
public SensorData() {
}
public SensorData(int id, long timestamp, int number) {
	super();
	this.id = id;
	this.timestamp = timestamp;
	this.number = number;
}

}
