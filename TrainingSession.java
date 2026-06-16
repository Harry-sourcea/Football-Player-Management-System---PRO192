
public class TrainingSession {
    private String trainingID;
    private String date;
    private String location;
    private String topic;

    public TrainingSession(String trainingID, String date, String location, String topic) {
        this.trainingID = trainingID;
        this.date = date;
        this.location = location;
        this.topic = topic;
    }

    public String getTrainingID() { return trainingID; }
    public String getDate() { return date; }
    public String getLocation() { return location; }
    public String getTopic() { return topic; }

    public String toCSV() {
        return trainingID + "," + date + "," + location + "," + topic;
    }

    @Override
    public String toString() {
        return String.format("%-6s %-12s %-25s %s", trainingID, date, location, topic);
    }
}
