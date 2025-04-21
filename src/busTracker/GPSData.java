package busTracker;

public class GPSData {
    private String busID;
    private String timestamp;
    private double latitude;
    private double longitude;
    private double speed;

    //Constructor por defecto.
    public GPSData(String busID, String timestamp, double latitude, double longitude, double speed) {
        this.busID = busID;
        this.timestamp = timestamp;
        this.latitude = latitude;
        this.longitude = longitude;
        this.speed = speed;
    }

    public String getBusID() {
        return busID;
    }
    public String getTimestamp() {
        return timestamp;
    }
    public double getLatitude() {
        return latitude;
    }
    public double getLongitude() {
        return longitude;
    }
    public double getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return "busID: " + busID + ", \nlatitude: " + latitude + ", \nlongitude: " + longitude +  ", \ntimestamp: " + timestamp + ", \nspeed: " + speed;
    }
}

