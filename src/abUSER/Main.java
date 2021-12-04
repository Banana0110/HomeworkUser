package abUSER;


public class Main {

    public static void main(String[] args) {
        Display display = new Display(322, "USA", "Yellow");
        User user = new User("Аттокур Малчинский", "Kudaimenisaktait@tamak.kg", 33, "Nukurakyrgyzbala312", true);
        System.out.println(user);
        System.out.println(display);
        String[] responses = {"Жашы Пазитивныйкен", "Нигатив турбайбы"};
        System.out.println(responses[(user.getAge() >> 31) & 1]);
    }
}
