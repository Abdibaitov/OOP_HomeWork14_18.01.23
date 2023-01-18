public class Dancer extends Person{
    private String groupName;

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void Dancing(){
        System.out.println(getName()+" is dancing");
    }

    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }


    public Dancer() {

    }

    @Override
    public void Learn() {
        System.out.println(getName()+" is learning");
    }

    @Override
    public void walk() {
        System.out.println(getName()+" is walking");
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating");
    }
}
