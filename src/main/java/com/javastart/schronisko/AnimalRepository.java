package com.javastart.schronisko;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AnimalRepository {

    private List<Animal> animals;

    public AnimalRepository() {
        animals = new ArrayList();
        animals.add(new Animal("Reksio"));
        animals.add(new Animal("Klakier"));
        animals.add(new Animal("Mruczek"));
        animals.add(new Animal("Kasztan"));
        animals.add(new Animal("Mops"));
        animals.add(new Animal("Szczurek"));
        animals.add(new Animal("Grunio"));
    }

}
