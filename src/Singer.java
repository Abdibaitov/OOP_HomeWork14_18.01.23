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
}
