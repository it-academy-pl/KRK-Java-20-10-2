package pl.itacademy.lesson9;

public class SportDemo {
    public static void main(String[] args) {
        Football football = new Football("Clasa A");
        football.play();
        System.out.println(football.getName());
        System.out.println(football.getScore());

        Basketball basketball = new Basketball("NBA");
        System.out.println(basketball.getScore());

        System.out.println(" ===========================");

        SportGame[] games = new SportGame[2];
        games[0] = football;
        games[1] = basketball;
        printGamesScore(games);

        printScore(football, basketball, new SportGame("Baseball"));

        SportGame.toRedeclare();
        Football.toRedeclare();
    }

    public static void printGamesScore(SportGame[] games) {
        for(SportGame game : games) {
            System.out.println(game.getScore());
        }
    }

    public static void printScore(SportGame... games) {
        for(SportGame game : games) {
            System.out.println(game.getScore());
        }
    }
}
