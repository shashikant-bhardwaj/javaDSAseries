package CollectionFramework;

import java.util.*;

public class Main {
 public static void main() {
        // List orr Collection -> interface

      //ArrayList -> concrete class
      ArrayList<Integer> list =  new ArrayList<>();
      //add
      list.add(10);
      list.add(20);
      list.add(30);
      System.out.println(list);
      list.add(40);
      System.out.println(list);

      list.remove(0);     // for removing first element from list you can also use removeFirst();
      System.out.println(list);

      //addAll
      List<Integer> list2 = new ArrayList<>();
      list2.add(101);
      list2.add(102);
      list2.add(103);
      list2.add(20);

      list.addAll(list2);
      System.out.println(list);
      list.removeAll(list2);
      System.out.println(list);

      System.out.println(list.size());

      System.out.println("printing list2" + list2);
      list2.clear();
      System.out.println(list2.size());
      System.out.println(list2);

      // i eant to travel list using iterator
      Iterator<Integer> iterator = list.iterator();
      while(iterator.hasNext()) {
           System.out.println("Element" + iterator.next());
      }

      //list specific method
      List<Integer> list3 = new ArrayList<>();
      list3.add(11);
      list3.add(12);
      list3.add(13);
      System.out.println(list3.get(2));
      System.out.println("Before set" + list3);
      list3.set(0, 100);
      System.out.println("After set" + list3);

      //toArray
      Object[] arr = list3.toArray();
      for(Object Obj: arr){
           System.out.println(Obj);
      }
      System.out.println(arr);
      //contains()
      System.out.println(list3.contains(100));

      list.add(12);
      list.add(6);
      list.add(29);
//      Collections.sort(list);  //--> ascending order
      System.out.println("printing entire list " + list);
      Collections.sort(list, Collections.reverseOrder());  //--> descending order
      System.out.println("priting entire list " + list);

      // how to clone a list
      ArrayList<Integer> newlist = (ArrayList<Integer>) list.clone();
      System.out.println("printing entire new list " +newlist);

      //ensure capacity()
      ArrayList<Integer> list4 = new ArrayList<>();
      list4.ensureCapacity(100);

      // isEmpty()
      System.out.println(list4.isEmpty());
      System.out.println(newlist.isEmpty());

      //indexOf()
      System.out.println(newlist.indexOf(40));

 // LinkedList

      LinkedList<Integer> linkedList = new LinkedList<>();
      //add
      linkedList.add(10);
      linkedList.add(20);
      linkedList.add(30);
      linkedList.add(10);
      linkedList.add(40);
      linkedList.add(10);
      System.out.println(linkedList.lastIndexOf(10));

      //addFirst and addLast
      linkedList.remove(3);
      linkedList.remove(3);
      linkedList.remove(3);
      System.out.println("printing original linkedList:" + linkedList);
      linkedList.addFirst(9);
      System.out.println("printing original linkedList:" + linkedList);
      linkedList.addLast(10);
      System.out.println("printing original linkedList:" + linkedList);
      linkedList.removeFirst();
      System.out.println("printing original linkedList:" + linkedList);
      linkedList.removeLast();
      System.out.println("printing original linkedList:" + linkedList);



    }
}
