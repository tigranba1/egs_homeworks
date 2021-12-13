package com.java.egs.egs_homeworks.collections;

public class Main {
    public static void main(String[] args) {
        List arrayList = new ArrayList();
        arrayList.add("Tt");
        arrayList.add("Ti");
        arrayList.add("Tg");
        arrayList.add("Tr");
        arrayList.add("Ta");
        arrayList.add("last");
        arrayList.remove(2);
        for (int i = 0; i < arrayList.getSize(); i++) {
            System.out.println(arrayList.get(i));
        }
        System.out.println(arrayList.indexOf("Tra"));
    }
}
