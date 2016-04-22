package com.company;

public class Contact {
    private String FirstName;
    private String LastName;
    private String numberPhone;
    private String email;
    private long contactId;

    public Contact() {
    }

    public Contact(String firstName, String lastName, String phone, String email) {
        this.FirstName = firstName;
        this.LastName = lastName;
        this.numberPhone = phone;
        this.email = email;
    }

    public Contact(Long contactId, String firstName, String lastName, String phone, String email) {
        this.contactId = contactId;
        this.FirstName = firstName;
        this.LastName = lastName;
        this.numberPhone = phone;
        this.email = email;
    }
    public String getFirstName(){
        return FirstName;
    }
    public String getEmail(){
        return email;
    }
    public String getLastName(){
        return LastName;
    }
    public String getNumberPhone(){
        return numberPhone;
    }
    public Long getContactId(){
        return contactId;
    }
    public void setFirstName(String firstName){
        this.FirstName=firstName;
    }
     public void setLastName(String lastName){
        this.LastName=lastName;
    }
     public void setNumberPhone(String numberPhone){
        this.numberPhone=numberPhone;
    }
     public void setEmail(String email){
        this.email=email;
    }
      public void setContactId(Long contactId){
        this.contactId=contactId;
    }
    //еще не понял что это запись или чтение из файла
    @Override
    public String toString(){
        return "Contact: \n"+"contactId "+contactId+"\n Phone number: "+numberPhone+"\n Emain: "+email+
                "\n FirstName: "+FirstName+"\n LastName: "+LastName;
    }
}
