
import java.util.HashMap;
import java.util.Map;

public class AttendanceRecord {
    private String trainingID;
    // Map: playerID -> "Present" or "Absent"
    private Map<String, String> attendanceMap;

    public AttendanceRecord(String trainingID) {
        this.trainingID = trainingID;
        this.attendanceMap = new HashMap<>();
    }

    public String getTrainingID() { return trainingID; }
    public Map<String, String> getAttendanceMap() { return attendanceMap; }

    public void setAttendance(String playerID, String status) {
        attendanceMap.put(playerID, status);
    }

    public int getPresentCount() {
        int count = 0;
        for (String s : attendanceMap.values()) if ("Present".equals(s)) count++;
        return count;
    }

    public int getAbsentCount() {
        int count = 0;
        for (String s : attendanceMap.values()) if ("Absent".equals(s)) count++;
        return count;
    }

    // Serialize to CSV lines: trainingID,playerID,status
    public String toCSVLines() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : attendanceMap.entrySet()) {
            sb.append(trainingID).append(",").append(entry.getKey()).append(",").append(entry.getValue()).append("\n");
        }
        return sb.toString();
    }
}
