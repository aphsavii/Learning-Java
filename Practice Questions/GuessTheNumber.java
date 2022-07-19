import java.util.Scanner;

class Game {
    private int score = 0, random;

    Game() {
        random = (int) (Math.random() * 100);
    }

    public void getScore() {
        System.out.println("Hurray !!! You guessed the number in " + score + " attempt");
    }

    public void setScore() {
        score++;
    }

    public int getUserInput() {
        System.out.println("Enter a Number :");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        return input;
    }

    public boolean isCorrect(int num) {
        if (num == random) {
            return true;
        }
        return false;
    }

    public boolean isGreater(int num) {
        if (num > random) {
            return true;
        }
        return false;
    }

    public boolean isSmaller(int num) {
        if (num < random) {
            return true;
        }
        return false;
    }
}

public class GuessTheNumber {

    public static void main(String[] args) {
        int num;
        Game obj = new Game();
        while (true) {
            num = obj.getUserInput();
            if (obj.isCorrect(num)) {
                obj.setScore();
                obj.getScore();
                break;
            } else if (obj.isGreater(num)) {
                System.out.println("It's Greater than that ...");
            } else if (obj.isSmaller(num)) {
                System.out.println("It's Less than that ...");
            }
            obj.setScore();
        }
    }
}
