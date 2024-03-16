package com.yatakeke.playwright;

import com.yatakeke.playwright.repositories.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class AnimalController {

    private final AnimalRepository _animalRepository;

    @Autowired
    public AnimalController(AnimalRepository animalRepository) {
        this._animalRepository = animalRepository;
    }

    @GetMapping("/animals")
    public String findAllAnimals(Model model) {

        var animals = this._animalRepository.findAll();
        model.addAttribute("animals", animals);
        return "animals";
    }
}
