import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class les4 {
    public static void main(String[] args) {
        LinkedList<Integer> intList = new LinkedList<>();
        intList.add(5); intList.add(6); intList.add(e: 7); intList.add(8);
        intList.add(9); intList.add(10); intList.add(11); intList.add(12);
        System.out.println("Задан список: " + intList);
        intList = invertedList(intList);
        System.out.println("\"перевернутый” список: " + intList);
        System.out.println("\"перевернутый” 2вариант: ");
        reverseList(intList);
        System.out.println(intList);
        System.out.println("\"перевернутый” 3вариант: ");
        listReverse(intList);
        System.out.println(intList);

    }

    static LinkedList<Integer> invertedList(LinkedList<Integer> list){
        LinkedList<Integer> newList = new LinkedList<>();
        //забираем с конца списка, добавляя в начало нового
        while (!list.isEmpty()){
            newList.add(list.removeLast());
        }
        return newList;
    }

    static void reverseList(LinkedList<Integer> list){
        for (int i = 0, j=list.size()-1; i < list.size()/2; i++, j--) {
//            System.out.println("Меняем " + i + "на" + j);
            Integer temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
        }
    }

    static void  listReverse(List<Integer> list){
        ListIterator<Integer> fl = list.listIterator();
        ListIterator<Integer> pl = list.listIterator(list.size());
        for (int i=0; i<list.size()/2; i++) {
            Integer temp = fl.next();
            fl.set(pl.previous());
            pl.set(temp);
        }
    }

}