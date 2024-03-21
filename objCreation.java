public class objCreation {
    int a = 2;  //default values
    String name = "John";
    public static void main(String[] args) {
        int num = 0;
        objCreation obj = new objCreation();
        objCreation obj1 = new objCreation();

        obj.name = "Shanu";
        System.out.println(obj.a);
        System.out.println(obj.name);
        System.out.println(obj1.a);
        System.out.println(obj1.name);
                
    }
    
}