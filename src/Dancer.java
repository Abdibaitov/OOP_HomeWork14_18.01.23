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

}
