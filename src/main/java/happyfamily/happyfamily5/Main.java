package happyfamily.happyfamily5;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<String> habits = new HashSet<>(Arrays.asList("Eat", "Drink", "Sleep"));
        Set<Pet> pets = new HashSet<>();
        Pet cat = new DomesticCat("Graf", 3, 30, habits);
        Pet dog = new Dog("Rex", 3, 24, habits);
        Pet fish = new Fish("Tuna", 6, 18, habits);

        pets.add(cat);
        pets.add(dog);
        pets.add(fish);


        Map<String, String> schedule_F = new HashMap<>();
        schedule_F.put(DayOfWeek.MONDAY.name(), "Swimming");
        schedule_F.put(DayOfWeek.TUESDAY.name(), "Camping");
        schedule_F.put(DayOfWeek.WEDNESDAY.name(), "Billiard");
        schedule_F.put(DayOfWeek.THURSDAY.name(), "Football");
        schedule_F.put(DayOfWeek.FRIDAY.name(), "Movie");
        schedule_F.put(DayOfWeek.SATURDAY.name(), "Concert");
        schedule_F.put(DayOfWeek.SUNDAY.name(), "Walking");

        Map<String, String> schedule_M = new HashMap<>();
        schedule_M.put(DayOfWeek.MONDAY.name(), "Cleaning");
        schedule_M.put(DayOfWeek.THURSDAY.name(), "Sewing");
        schedule_M.put(DayOfWeek.WEDNESDAY.name(), "Yoga");
        schedule_M.put(DayOfWeek.THURSDAY.name(), "Exercising");
        schedule_M.put(DayOfWeek.FRIDAY.name(), "Movie");
        schedule_M.put(DayOfWeek.SATURDAY.name(), "Shopping");
        schedule_M.put(DayOfWeek.SUNDAY.name(), "Walking");

        List<Human> children1 = new ArrayList<>();
        Human mother1 = new Woman("Mary", "Johnson", 1980, 100, schedule_M);
        Human father1 = new Man("Adam", "Johnson", 1970, 100, schedule_F);


        Human son1 = new Man("Tom", "Johnson", 2000, 90, schedule_F);
        Human daughter1 = new Woman("Alice", "Johnson", 2002, 90, schedule_M);
        Human mother2 = new Woman("Mary", "Johnson", 1980);
        Human father2 = new Man("Adam", "Johnson", 1970);
        Human son2 = new Man("Tom", "Johnson", 2000);
        Human daughter2 = new Woman("Alice", "Johnson", 2002);
        List<Human> children2 = new ArrayList<>();
        children2.add(son2);
        children2.add(daughter2);
        Family johnson1 = new Family(mother1, father1, children1, pets);
        johnson1.addChild(son1);
        johnson1.addChild(daughter1);
        Family johnson2 = new Family(mother2, father2, children2);
        System.out.println(johnson1.toString());
        System.out.println(johnson2);



    }

}





