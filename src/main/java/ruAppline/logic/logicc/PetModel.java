package ruAppline.logic.logicc;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class PetModel implements Serializable {
    private static final PetModel instance = new PetModel();

    private final Map<Integer, Pet> model;

    public  PetModel() {
        model = new HashMap<Integer, Pet>();
    }

    public static PetModel getInstance(){
        return instance;
    }

    public void add(int id, Pet pet){
        model.put(id, pet);
    }
    public  Pet getFromList(int id){
        return model.get(id);
    }

    public void Delete(Map<Integer, Pet> id){
        model.remove(id);
    }
    public void Put(int id, Pet pet){
        model.put(id, pet);
    }

    public Map<Integer, Pet> getAll(){
       return model;
    }

}
