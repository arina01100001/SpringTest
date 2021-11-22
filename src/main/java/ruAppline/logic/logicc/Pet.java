package ruAppline.logic.logicc;

public class Pet {
/*    {
        "name": "SomeName",
        "type": "SomeType",
        "age": "33"
    }*/

    private String name;
    private String type;
    private int age;

    public Pet(){
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Pet(String name, String type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;
    }
}
