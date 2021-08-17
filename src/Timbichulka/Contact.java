package Timbichulka;

public class Contact {
    private String name;
    private String phonenumber;

    public Contact(String name, String phonenumber) {
        this.name = name;
        this.phonenumber = phonenumber;
    }

    public String getName() {
        return name;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public static Contact contact(String name, String phonenumber){
        return new Contact(name, phonenumber);
    }
}
