package headfirst_examples.templatemethod.list;

import java.util.AbstractList;
import java.util.List;

public class MyStringList extends AbstractList<String> {
    private String[] myList;

    public MyStringList(String[] myList) {
        this.myList = myList;
    }

    @Override
    public String get(int index) {
        return myList[index];
    }

    @Override
    public int size() {
        return myList.length;
    }


    public String set(int index, String item) {
        String oldString = myList[index];
        myList[index] = item;
        return oldString;
    }

    public static void main(String[] args) {
        String[] ducks = {"Mallard duck", "Readhead Duck", "Rubber Duck", "Decoy Duck"};
        MyStringList ducksList = new MyStringList(ducks);
        List duckSublist = ducksList.subList(2, 3);
        System.out.println(duckSublist);
    }
}
