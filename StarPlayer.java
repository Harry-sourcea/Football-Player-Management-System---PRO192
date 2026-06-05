public class StarPlayer extends Player {
    public StarPlayer(String playerId, String fullName, int age, String nationality,
                      String position, int shirtNumber, double baseSalary, String status) {
        super(playerId, fullName, age, nationality, position, shirtNumber, baseSalary, status);
    }
 
    @Override
    public double calculateBonus() {
        return getBaseSalary() * 0.20; // 20% bonus for star players
    }
}
