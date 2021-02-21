package academy.belhard;


import academy.belhard.entity.User;

public class Main {

    public static void main(String[] args) {
        User user1 = new User("Eleonora", "Abel", "e.abel@gmail.com", "1234");
        user1.getFullInfo();
        user1.isPasswordCorrect("12345");





    }
}
