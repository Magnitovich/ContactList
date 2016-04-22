package com.company;

import java.util.List;

public class ContactManager {

    private ContactDao dao;
    public ContactManager(){
        dao=ContactDaoFact.getContactDao();}
  //добавление контакта -возвращает ID добавленного контакта
    public Long addContact(Contact contact){
        return dao.addContact(contact);
    }
    //редактирование контакта
    public void updateContact(Contact contact){
        dao.updateContact(contact);
    }
    // Удаление контакта по его ID
    public void deleteContact(Long contactId) {
        dao.deleteContact(contactId);
    }

    // Получение одного контакта
    public Contact getContact(Long contactId) {
        return dao.getContact(contactId);
    }

    // Получение списка контактов
    public List<Contact> findContacts() {
        return dao.findContacts();
}}
