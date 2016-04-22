package com.company;
//это хранилище здесь храниться вся инфа
public class ContactDaoFact {
    public static ContactDao getContactDao(){
        return new ContactSimpleDao();
        }
    }

