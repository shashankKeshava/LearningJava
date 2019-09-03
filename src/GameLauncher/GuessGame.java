package GameLauncher;

public class GuessGame {
    Player p1;
    Player p2;
    Player p3;

    public void startGame() {
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int targetGuess = (int) (Math.random() * 10);
        System.out.println("The number to be guessed: " + targetGuess);

        int guessP1 = 0;
        int guessP2 = 0;
        int guessP3 = 0;

        boolean isP1Right = false;
        boolean isP2Right = false;
        boolean isP3Right = false;

        while (true) {
            p1.guess();
            p2.guess();
            p3.guess();

            guessP1 = p1.number;
            System.out.println("Player 1 guessed:" + guessP1);
            guessP2 = p2.number;
            System.out.println("Player 2 guessed:" + guessP2);
            guessP3 = p3.number;
            System.out.println("Player 3 guessed:" + guessP3);

            if (guessP1 == targetGuess) {
                isP1Right = true;
            }

            if (guessP2 == targetGuess) {
                isP2Right = true;
            }

            if (guessP3 == targetGuess) {
                isP3Right = true;
            }

            if (isP1Right || isP2Right || isP3Right) {
                System.out.println("We have a winner!!!");
                System.out.println("Player 1 got it right? " + guessP1);
                System.out.println("Player 2 got it right? " + guessP2);
                System.out.println("Player 3 got it right? " + guessP3);
                System.out.println("GAME OVER.....");
                break;
            } else {
                System.out.println("We have to try again :( ");
            }
        }
    }
}
