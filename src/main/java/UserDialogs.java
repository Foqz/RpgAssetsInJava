import java.util.Scanner;

public class UserDialogs {
    public UserOptions welcomeChoice() {
        InfoClass infoClass = new InfoClass();
        System.out.println("Welcome to Fix The Dungeon and Destroy The Dragons");
        infoClass.infoClassChoice();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String s = scanner.nextLine().toUpperCase();
            switch (s) {
                case "K":
                    return UserOptions.KNIGHT;
                case "M":
                    return UserOptions.MAGE;
                case "R":
                    return UserOptions.ROGUE;
                default:
                    System.out.println("Wrong data, try again");
            }
        }
    }
    public String userNameCreator(UserOptions classChoice) {
        Scanner scanner = new Scanner(System.in);
        if (classChoice == UserOptions.KNIGHT) {
            System.out.println("So you wanna be a knight... how predictable");
            System.out.println("Please enter your name");
            return "Sir " + scanner.nextLine();
        } else if (classChoice == UserOptions.MAGE) {
            System.out.println("So you wanna be a mage... we've got a genius here!");
            System.out.println("Please enter your name");
            return "Wizard " + scanner.nextLine();
        } else {
            System.out.println("So you wanna be a rogue... you little gangster !");
            System.out.println("Please enter your name");
            return "Bandit " + scanner.nextLine();
        }
    }
}
