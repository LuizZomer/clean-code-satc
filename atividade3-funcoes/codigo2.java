class TeamStatistics {
    int goals;
    int ballPossession;
    int shots;
    int fouls;
    int yellowCards;
    int redCards;

    public TeamStatistics(int goals, int ballPossession, int shots, int fouls,
                          int yellowCards, int redCards) {
        this.goals = goals;
        this.ballPossession = ballPossession;
        this.shots = shots;
        this.fouls = fouls;
        this.yellowCards = yellowCards;
        this.redCards = redCards;
    }
}

class Match {
    String homeTeam;
    String awayTeam;
    TeamStatistics homeStats;
    TeamStatistics awayStats;

    public Match(String homeTeam, String awayTeam,
                 TeamStatistics homeStats, TeamStatistics awayStats) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homeStats = homeStats;
        this.awayStats = awayStats;
    }
}

class MatchResult {
    private Match match;

    public MatchResult(Match match) {
        this.match = match;
    }

    public String determineWinner() {
        int homeGoals = match.homeStats.goals;
        int awayGoals = match.awayStats.goals;

        if (homeGoals > awayGoals) return match.homeTeam;
        if (homeGoals < awayGoals) return match.awayTeam;
        return "Empate";
    }
}

public class MatchManager {

    public void registerMatch(Match match) {
        System.out.println("Partida Registrada:");
        System.out.println(match.homeTeam + " " + match.homeStats.goals +
                " x " + match.awayStats.goals + " " + match.awayTeam);

        System.out.println("Posse de Bola: " + match.homeStats.ballPossession +
                "% - " + match.awayStats.ballPossession + "%");

        System.out.println("Chutes: " + match.homeStats.shots +
                " - " + match.awayStats.shots);

        System.out.println("Faltas: " + match.homeStats.fouls +
                " - " + match.awayStats.fouls);

        System.out.println("Cartões Amarelos: " + match.homeStats.yellowCards +
                " - " + match.awayStats.yellowCards);

        System.out.println("Cartões Vermelhos: " + match.homeStats.redCards +
                " - " + match.awayStats.redCards);
    }

    public void generateReport(Match match) {
        MatchResult result = new MatchResult(match);
        String winner = result.determineWinner();

        System.out.println("=== Relatório da Partida ===");
        System.out.println("Vencedor: " + winner);
        System.out.println("Posse de Bola: " + match.homeStats.ballPossession +
                "% - " + match.awayStats.ballPossession + "%");

        System.out.println("Total de Chutes: " +
                (match.homeStats.shots + match.awayStats.shots));

        System.out.println("Total de Faltas: " +
                (match.homeStats.fouls + match.awayStats.fouls));

        System.out.println("Total de Cartões: " +
                (match.homeStats.yellowCards + match.awayStats.yellowCards +
                 match.homeStats.redCards + match.awayStats.redCards));
    }
}