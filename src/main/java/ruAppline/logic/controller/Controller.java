package ruAppline.logic.controller;

import org.springframework.web.bind.annotation.*;
import ruAppline.logic.logicc.Pet;
import ruAppline.logic.logicc.PetModel;

import java.io.PrintWriter;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@RestController
public class Controller {
    private static final PetModel petModel = PetModel.getInstance();
    private static final AtomicInteger newID = new AtomicInteger(1);

    @PostMapping(value = "/createPet", consumes = "application/json")
    public String createPet(@RequestBody Pet pet) {
        petModel.add(newID.getAndIncrement(), pet);
        PrintWriter pw = new PrintWriter(System.out);
        if (petModel.getAll().size() == 1) {
            return "Vi sozdali pervogo domashnego pitomca";
        } else return "Vi sozdali pitomca!";
    }

    @GetMapping(value = "/getAll", produces = "application/json")
    public Map<Integer, Pet> getAll() {
        return petModel.getAll();
    }

    @GetMapping(value = "/getPet", consumes = "application/json", produces = "application/json")
    public Pet getPet( Map<String, Integer> id) {
        return petModel.getFromList(id.get("id"));
    }

    @DeleteMapping(value = "/deletePet", consumes = "application/json", produces = "application/json")
    public Map<Integer, Pet> deletePet( Map<Integer, Pet> id) {
        petModel.Delete(id);
        return null;
    }

    @PutMapping(value = "/replacePet", consumes = "application/json", produces = "application/json")
    public Map<Integer, Pet> putPet(@RequestBody int id, Pet pet) {
        petModel.Put(id,pet);
        return petModel.getAll();

}

}
