public class Programmer extends Person {
    private String companyName;

    public String getCompanyName() {
        return companyName;
    }

    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }

    public Programmer() {
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    public void Coding(){
        System.out.println(getName()+ "is coding");
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

    @Override
    public String toString() {
        return "Programmer{" +
                "companyName='" + companyName + '\'' +
                '}';
    }
}
