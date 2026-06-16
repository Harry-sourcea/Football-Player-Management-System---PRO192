
public class MatchRecord {
    private String matchID;
    private String date;
    private String opponentTeam;
    private String matchType;

    public MatchRecord(String matchID, String date, String opponentTeam, String matchType) {
        this.matchID = matchID;
        this.date = date;
        this.opponentTeam = opponentTeam;
        this.matchType = matchType;
    }

    public String getMatchID() { return matchID; }
    public String getDate() { return date; }
    public String getOpponentTeam() { return opponentTeam; }
    public String getMatchType() { return matchType; }

    public String toCSV() {
        return matchID + "," + date + "," + opponentTeam + "," + matchType;
    }

    @Override
    public String toString() {
        return String.format("%-6s %-12s %-20s %s", matchID, date, opponentTeam, matchType);
    }
}
