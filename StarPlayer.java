
public class StarPlayer extends Player {
    public StarPlayer(String playerID, String fullName, int age, String nationality,
                      String position, int shirtNumber, double baseSalary, String status) {
        super(playerID, fullName, age, nationality, position, shirtNumber, baseSalary, "Star Player", status);
    }

    @Override
    public double calculateBonus(int monthlyPerformancePoints) {
        // BR26: Star Player bonus = Monthly Performance Points x 500,000 VND
        return monthlyPerformancePoints * 500000.0;
    }
}
