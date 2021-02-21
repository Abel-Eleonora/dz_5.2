package academy.belhard.entity;

public class Person {

    //Создание полей класса
    protected String firstName;
    protected String lastName;


    // Создание конструктора
    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Этот метод склеивает имя и фамилию через пробел и возвращать это значение
    public String  getFullName(){
        return firstName + " " + lastName;
    }









}
