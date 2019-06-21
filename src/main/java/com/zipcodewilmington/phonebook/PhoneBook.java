package com.zipcodewilmington.phonebook;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by leon on 1/23/18.
 */
public class PhoneBook {
    Map<String,List<String>> map;
    List<String> list = new ArrayList<>();

    public PhoneBook(Map<String, List<String>> map) {
        this.map = map;
    }

    public PhoneBook() {

        this(null);
    }

    public void add(String name, String phoneNumber) {
        list.add(phoneNumber);
        map.put(name,list);
    }

    public void addAll(String name, String... phoneNumbers) {
        for (String s: phoneNumbers
             ) {
            list.add(s);
        }
        map.put(name,list);
    }

    public void remove(String name) {
        map.remove(name);
    }

    public Boolean hasEntry(String name) {
        return map.containsKey(name);
    }

    public List<String> lookup(String name) {
        return map.get(name);
    }

    public String reverseLookup(String phoneNumber)  {
        for (Map.Entry <String,List<String>> entry: map.entrySet()
             ) {
            for (String number: entry
                 ) {

            }
        }

        return ;
    }

    public List<String> getAllContactNames() {
        return null;
    }

    public Map<String, List<String>> getMap() {
        return null;
    }
}
