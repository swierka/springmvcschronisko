package com.javastart.schronisko;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AnimalController {

    @Autowired AnimalRepository animalRepository;

    @RequestMapping("/zwierzak")
    public String singleAnimal(@RequestParam Long id, Model model) {

        Animal animal = animalRepository.findById(id);

        model.addAttribute("animal", animal);

        return "animal";
    }

    @GetMapping("/dodajZwierzaka")
    public String addAnimal(Model model) {

        Animal pustyZwierzak = new Animal();
        model.addAttribute("toBedzieNowyZwierzak", pustyZwierzak);

        return "addAnimal";
    }

    @PostMapping("/dodajProszeNowegoZwierzaka")
    @ResponseBody
    public String dodawanieZwierzaka(Animal wypelnionyZwierzak) {

        animalRepository.addAnimal(wypelnionyZwierzak);

        return "Dodano!";
    }


}
