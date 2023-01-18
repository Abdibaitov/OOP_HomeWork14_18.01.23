public class Programmer extends Person {
    private String companyName;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    public void Coding(){
        System.out.println(getName()+ "is coding");
    }

    public Programmer(String name, String designation) {
        super(name, designation);
    }

    @Override
    public void Learn() {
        super.Learn();
    }

    @Override
    public void walk() {
        super.walk();
    }

    @Override
    public void eat() {
        super.eat();
    }
}
