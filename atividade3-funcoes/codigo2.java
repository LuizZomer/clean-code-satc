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

        String winner;

        if (match.homeStats.goals > match.awayStats.goals) {
            winner = match.homeTeam;
        } else if (match.homeStats.goals < match.awayStats.goals) {
            winner = match.awayTeam;
        } else {
            winner = "Empate";
        }

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

    public static void main(String[] args) {

        TeamStatistics home = new TeamStatistics(2, 55, 10, 15, 3, 1);
        TeamStatistics away = new TeamStatistics(1, 45, 8, 12, 2, 0);

        Match match = new Match("Time A", "Time B", home, away);

        MatchManager manager = new MatchManager();

        manager.registerMatch(match);
        manager.generateReport(match);
    }
}