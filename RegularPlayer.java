
public class RegularPlayer extends Player {
    public RegularPlayer(String playerID, String fullName, int age, String nationality,
                         String position, int shirtNumber, double baseSalary, String status) {
        super(playerID, fullName, age, nationality, position, shirtNumber, baseSalary, "Regular Player", status);
    }

    @Override
    public double calculateBonus(int monthlyPerformancePoints) {
        return 0; // BR26: Regular Player bonus = 0 VND
    }
}
