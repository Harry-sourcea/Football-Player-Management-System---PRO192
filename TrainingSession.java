import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TrainingSession {
    private String trainingId;
    private LocalDate date;
    private String location;
    private String topic;
    private List<Player> attendees;
 
    public TrainingSession(String trainingId, LocalDate date, String location, String topic) {
        this.trainingId = trainingId;
        this.date = date;
        this.location = location;
        this.topic = topic;
        this.attendees = new ArrayList<>();
    }
 
    public void addAttendee(Player player) {
        attendees.add(player);
    }
 
    public void displayTrainingInfo() {
        System.out.println("Training ID: " + trainingId + ", Date: " + date +
                ", Location: " + location + ", Topic: " + topic +
                ", Attendees: " + attendees.size());
    }
 
    // Getters
    public String getTrainingId() { return trainingId; }
    public LocalDate getDate() { return date; }
    public String getLocation() { return location; }
    public String getTopic() { return topic; }
    public List<Player> getAttendees() { return attendees; }
}
