package com.javastart.schronisko;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AnimalRepository {

    private List<Animal> animals;

    public AnimalRepository() {
        animals = new ArrayList<>();
        animals.add(new Animal(7,"Grunio"));
        animals.add(new Animal(2, "Klakier"));
        animals.add(new Animal(5, "Mops"));
        animals.add(new Animal(3, "Mruczek"));
        animals.add(new Animal(1,"Reksio"));
        animals.add(new Animal(4, "Kasztan"));
        animals.add(new Animal(6, "Szczurek"));
    }

    public List<Animal> getAll() {
        return animals;
    }

    public Animal findById(Long id) {
        // TODO zwróć poprawnego zwierzaka
        return animals.get(0);
    }
}
