public class ClassStatRoller {

    public static void main(String[] args) {
        UserDialogs userDialogs = new UserDialogs();
        UserOptions classChoice = userDialogs.welcomeChoice();
        String charName = userDialogs.userNameCreator(classChoice);




        BaseCharacter baseCharacter = new BaseCharacter();

    }
}
