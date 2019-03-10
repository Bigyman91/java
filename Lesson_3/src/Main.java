import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String[] words = {"дом", "фонарь", "аптека", "дом", "улица", "горы", "поле", "фонарь", "корова", "аптека", "дом", "фонарь"};
        HashMap<String, Integer> count = new HashMap<>();
        for (String i : words) {
            count.put(i, count.getOrDefault(i, 0) + 1);
        }
        System.out.println(count);


        Phonebook phonebook = new Phonebook();
        phonebook.add(654321654, "Иван");
        phonebook.add(542154121, "Иван");
        phonebook.add(315453221, "Никита");
        phonebook.add(543541212, "Василий");
        phonebook.add(325431151, "Надя");
        phonebook.add(612132523, "Надя");

        phonebook.get("Иван");
        phonebook.get("Никита");
        phonebook.get("Василий");
        phonebook.get("Надя");
        phonebook.get("Надежда");
    }
}
