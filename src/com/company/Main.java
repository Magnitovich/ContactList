package com.company;
//Contact используется как хранилище информации
//ContactManager удаление, добавление, редактирование, получение списка
//ContactDAO интерфейс. DAO — это Data Access Object — объект доступа к данным.

import java.util.List;

//currentTimeMillis время в миллисекундах
public class Main {

    public static void main(String[] args) {
	ContactManager cm=new ContactManager();
        Contact c1=new Contact("Alex", "Boolks", "7-900-8000-300", "e@i.ua");
        Contact c2 = new Contact("Сергей", "Иванов", "+7-911-890-7755", "ivanov@google.com");
        Contact c3 = new Contact("Татьяна", "Семенова", "+7-911-890-1164", "semenova@mail.ru");

        System.out.println("Add contact");
        Long cId1=cm.addContact(c1);
        Long cId2=cm.addContact(c2);
        Long cId3=cm.addContact(c3);
        List<Contact> result1 = cm.findContacts();
        for(Contact c : result1) {
            System.out.println(c);}

        System.out.println("UPDATE CONTACT ==============");
        Contact change = new Contact(cId1, "Алексей", "Соколов", "+7-911-890-7766", "sokolov@yandex.ru");
        cm.updateContact(change);
        List<Contact> result2 = cm.findContacts();
        for(Contact c : result2) {
            System.out.println(c);
        }

        System.out.println("DELETE CONTACT ==============");
        cm.deleteContact(cId1);
        List<Contact> result3 = cm.findContacts();
        for(Contact c : result3) {
            System.out.println(c);
        }

        System.out.println("GET CONTACT ==============");
        Contact contact = cm.getContact(cId2);
        System.out.println(contact);
    }
    }

