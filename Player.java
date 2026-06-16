
public abstract class Player {
    private String playerID;
    private String fullName;
    private int age;
    private String nationality;
    private String position;
    private int shirtNumber;
    private double baseSalary;
    private String playerType;
    private String status;

    public Player(String playerID, String fullName, int age, String nationality,
                  String position, int shirtNumber, double baseSalary, String playerType, String status) {
        this.playerID = playerID;
        this.fullName = fullName;
        this.age = age;
        this.nationality = nationality;
        this.position = position;
        this.shirtNumber = shirtNumber;
        this.baseSalary = baseSalary;
        this.playerType = playerType;
        this.status = status;
    }

    public abstract double calculateBonus(int monthlyPerformancePoints);

    public double calculateMonthlySalary(int monthlyPerformancePoints) {
        return baseSalary + calculateBonus(monthlyPerformancePoints);
    }

    // Getters
    public String getPlayerID() { return playerID; }
    public String getFullName() { return fullName; }
    public int getAge() { return age; }
    public String getNationality() { return nationality; }
    public String getPosition() { return position; }
    public int getShirtNumber() { return shirtNumber; }
    public double getBaseSalary() { return baseSalary; }
    public String getPlayerType() { return playerType; }
    public String getStatus() { return status; }

    // Setters
    public void setFullName(String fullName) { this.fullName = fullName; }
    public void setAge(int age) { this.age = age; }
    public void setNationality(String nationality) { this.nationality = nationality; }
    public void setPosition(String position) { this.position = position; }
    public void setShirtNumber(int shirtNumber) { this.shirtNumber = shirtNumber; }
    public void setBaseSalary(double baseSalary) { this.baseSalary = baseSalary; }
    public void setStatus(String status) { this.status = status; }

    public boolean isActive() { return "Active".equalsIgnoreCase(status); }

    public String toCSV() {
        return playerID + "," + fullName + "," + age + "," + nationality + "," +
               position + "," + shirtNumber + "," + baseSalary + "," + playerType + "," + status;
    }

    @Override
    public String toString() {
        return String.format("%-6s %-25s %-4d %-12s %-6d %-15s %s",
                playerID, fullName, age, position, shirtNumber, playerType, status);
    }
}
