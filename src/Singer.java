public class Singer extends Person{
    private String bandName;

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    public void Singing(){
        System.out.println(getName()+" is singing");
    }

    public void PlayGitar(){
        System.out.println(getName()+" is playing gitar");
    }

    @Override
    public void Learn() {
        System.out.println(getName()+" is singing");
    }

    @Override
    public void walk() {
        System.out.println(getName()+" is walking");
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating");
    }

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;

    }

    public Singer() {

    }
}
