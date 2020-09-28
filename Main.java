package org.ANshu;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static ArrayList<String> listname=new ArrayList<>();
    public static void main(String[] args) {

        listname.add("ANshu");
        listname.add("Alok");
        listname.add("Ankit");
        listname.add("Sudhir");
        listname.add("Raju");
        listname.add("Sunny");
        listname.add("Mrigank");

        Main app=new Main();
        app.displaylist(listname);
        app.removeNamebyposition(0);
        System.out.println("After removing");
        app.displaylist(listname);
        System.out.println(listname.get(0));
        System.out.println("After removing");
        app.removeNamebyString("Alok");
        app.displaylist(listname);
        app.modifyName(1,"Aloknath");
        app.displaylist(listname);
        int post=app.search("Raju");
        System.out.println(post);

    }
    void displaylist(ArrayList<String> names){
        for(String name:names);
        System.out.println(names);
    }
    void removeNamebyposition(int position)
    {
         listname.remove(position);
    }
    void removeNamebyString(String name)
    {
            listname.remove(name);

    }
    void modifyName(int position, String newname)
    {
    listname.set(position,newname);
    }
    int search(String name)
    {
        return listname.indexOf(name);
    }
}
