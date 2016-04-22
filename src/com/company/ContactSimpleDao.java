package com.company;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class ContactSimpleDao implements ContactDao {
        private final List<Contact> cont=new ArrayList<Contact>();

   private Long generateContID(){
       Long contactID=Math.round(Math.random()*1000+System.currentTimeMillis());
       while (getContact(contactID) !=null){
           contactID=Math.round(Math.random()*1000+System.currentTimeMillis());}
return contactID;
       }
    @Override
    public long addContact(Contact contact) {
        Long id=generateContID();
        contact.setContactId(id);
       cont.add(contact);
        return id;    }
    @Override
    public void updateContact(Contact contact) {
        Contact oldContact=getContact(contact.getContactId());
        if(oldContact !=null){
            oldContact.setFirstName(contact.getFirstName());
            oldContact.setLastName(contact.getLastName());
            oldContact.setNumberPhone(contact.getNumberPhone());
            oldContact.setEmail(contact.getEmail());
        }    }
    @Override
    public void deleteContact(Long contactId) {
        Iterator<Contact> it=cont.iterator();
        it.hasNext();        {
            Contact cn=it.next();
            if(cn.getContactId().equals(contactId)){
                it.remove();
            }        }    }
    @Override
    public Contact getContact(Long contactId) {
       for (Contact contac:cont){
           if(contac.getContactId().equals(contactId)){
               return contac;
           }       }
        return null;    }
    @Override
    public List<Contact> findContacts() {
        return cont;
    }
}
