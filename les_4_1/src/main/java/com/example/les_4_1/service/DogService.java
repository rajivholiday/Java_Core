package com.example.les_4_1.service;

import com.example.les_4_1.entity.Dog;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class DogService {
    private ArrayList<Dog> dogs = new ArrayList<>();

    public Dog create(int id, String color, String name, int age) {
        Dog dog = fillData(id, color, name, age);
        dogs.add(dog);
        return dog;
    }

    public Dog fillData(int id, String color, String name, int age) {
        Dog dog = new Dog();
        dog.setId(id);
        dog.setColor(color);
        dog.setName(name);
        dog.setAge(age);
        return dog;
    }

    public Dog getDog(int id) {
        for (Dog d : dogs)
            if (d.getId() == id) {
                return d;
            }
        return null;
    }

    public String delete(int id) {
        for (Dog d : dogs)
            if (d.getId() == id) {
                dogs.remove(d);
            }
        return "Dog was deleted";
    }

    public Dog update(int id, String color, String name, int age) {
        Dog d = fillData(id, color, name, age);
        for (int i = 0; i < dogs.size(); i++) {
            if (dogs.get(i).getId() == id) {
                dogs.add(i, d);
            }
        }
        return d;

    }

}
