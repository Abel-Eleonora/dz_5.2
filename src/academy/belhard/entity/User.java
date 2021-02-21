package academy.belhard.entity;

public class User extends Person {

    //Создание полей класса
    private String email;
    private String password;

    // Создание конструктора
    public User (String firstName, String lastName, String email, String password){
        super (firstName, lastName);
        this.email = email;
        this.password = password;
    }

    // Этот метод конкатенирует всю информацию о пользователе (кроме пароля)
    public String getFullInfo(){
        System.out.println("Имя: " + super.getFullName() + "\n" + "E-mail: " + email);
        return email;
    }

    // Этот метод принимает 1 аргумент типа String и возвращать true,
    // если строка-аргумент соответствует паролю пользователя, и false в обратном случае
    public boolean isPasswordCorrect(String password){
        System.out.println("Пароль соответствует паролю пользователя: " + this.password.equals(password));
        return true;
    }


}
