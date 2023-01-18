public class
Main {
    public static void main(String[] args) {
        System.out.println("-----Person-----");
        Person person = new Person("Bayel","IT developer");
  //      System.out.println("name: " + person.getName() + "\ndesignation: " + person.getDesignation());
        System.out.println(person);
        System.out.println("\n-----Programmer-----");
        Programmer programmer = new Programmer("Programmer","programmer","Google");
        System.out.println("name: " + programmer.getName() + "\ndesignation: " + programmer.getDesignation()+"\ncompanyName: "+programmer.getCompanyName());
        System.out.println("\n-----Dancer-----");
        Dancer dancer = new Dancer("Atay","kara-jorgo","MoscowDanceGroup");
        System.out.println("name: " + dancer.getName() + "\ndesignation: " + dancer.getDesignation()+"\nGroupName: "+dancer.getGroupName());
        System.out.println("\n-----Singer-----");
        Singer singer = new Singer("Singer","Rock","singerGroup");
        System.out.println("name: " + singer.getName() + "\ndesignation: " + singer.getDesignation()+"\nbandName: "+singer.getBandName());
        System.out.println();
        person.Learn();
        person.eat();
        person.walk();
        System.out.println();
        programmer.Learn();
        programmer.eat();
        programmer.walk();
        System.out.println();
        dancer.Learn();
        dancer.eat();
        dancer.walk();
        dancer.Dancing();
        System.out.println();
        singer.Learn();
        singer.eat();
        singer.walk();
        singer.PlayGitar();
        singer.Singing();
    }
}