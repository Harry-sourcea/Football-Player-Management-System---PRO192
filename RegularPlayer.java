public class RegularPlayer extends Player {
 
    public RegularPlayer(String playerId, String fullName, int age, String nationality,
                         String position, int shirtNumber, double baseSalary, String status) {
        super(playerId, fullName, age, nationality, position, shirtNumber, baseSalary, status);
    }
 
    @Override
    public double calculateBonus() {
        return getBaseSalary() * 0.05; // 5% bonus for regular players
    }
    
}
