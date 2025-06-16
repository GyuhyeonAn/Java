public class Person {
    protected String id;
    protected String name;
    protected String status;
    protected String birthDate;
    protected String contact;

    public Person() {
        id = "";
        name = "";
        status = "";
        birthDate = "";
        contact = "";
    }

    public Person(String id, String name, String status, String birthDate, String contact) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.birthDate = birthDate;
        this.contact = contact;
    }

    public void printInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Status: " + status);
        System.out.println("Birth Date: " + birthDate);
        System.out.println("Contact: " + contact);
    }


}
