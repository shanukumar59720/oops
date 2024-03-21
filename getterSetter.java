class Person{
    private String name;

    //Getter
    public String getName() {
        return name;
    }

    //Setter
    public void setName(String newName){
        this.name = newName;

    }
}

public class getterSetter {
    public static void main(String[] args) {
        Person obj = new Person();
        obj.setName("Shanu");
        System.out.println(obj.getName());
    }
}
