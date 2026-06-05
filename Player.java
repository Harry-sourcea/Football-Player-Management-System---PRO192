public abstract class Player {
    private String playerId;
    private String fullname;
    private int age;
    private String nationality;
    private String position;
    private int shirtNumber;
    private double baseSalary;
    private String status;

    public Player() {
    }

    public Player(String playerId, String fullname, int age, String nationality, String position, int shirtNumber, double baseSalary, String status) {
        this.playerId = playerId;
        this.fullname = fullname;
        this.age = age;
        this.nationality = nationality;
        this.position = position;
        this.shirtNumber = shirtNumber;
        this.baseSalary = baseSalary;
        this.status = status;
    }
    
    public abstract double calculateBonus();
 
    public double calculateMonthlySalary() {
        return baseSalary + calculateBonus();
    }
 
    public void displayInfo() {
        System.out.println("ID: " + playerId + ", Name: " + fullname +
                ", Position: " + position + ", Salary: " + calculateMonthlySalary());
    }

    public String getPlayerId() {
        return playerId;
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getShirtNumber() {
        return shirtNumber;
    }

    public void setShirtNumber(int shirtNumber) {
        this.shirtNumber = shirtNumber;
    }
 
    public double getBaseSalary() { 
        return baseSalary; 
    }
    
    public String getStatus() { 
        return status; 
    }
 
    public void setStatus(String status) { 
        this.status = status; 
    }
    
    public void setBaseSalary(double baseSalary) { 
        this.baseSalary = baseSalary; 
    }
    
}
