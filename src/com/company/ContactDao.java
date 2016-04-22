package com.company;
 //* Интерфейс для определения функций хранлиза данных о контактах

import java.util.LinkedList;
import java.util.List;

public interface ContactDao {
    // Добавление контакта - возвращает ID добавленного контакта
    public long addContact(Contact contact);
    //редактирование контакта
    public void updateContact(Contact contact);
    //удаление
    public void deleteContact(Long contactId);
    //получение контакта
    public Contact getContact(Long contactId);


    //cписок контактов
    public List<Contact> findContacts();
}
