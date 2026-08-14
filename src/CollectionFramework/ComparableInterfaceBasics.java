package CollectionFramework;

import java.util.*;

public class ComparableInterfaceBasics {
    static void main() {

        Integer[] arr = {5,1,7,2,8,4};
       Arrays.sort(arr, new ReverseComparator());
        for(int a : arr){
            System.out.println(a);
        }




//     List<Students> student = new ArrayList<>();
//
//     student.add(new Students(19,"shashi", 68));
//     student.add(new Students(23,"ankit", 65));
//     student.add(new Students(21,"abhay", 68));
//     student.add(new Students(17,"sushant", 59));
//
//
//        System.out.println(student);
//
//        Collections.sort(student, new Comparator<Students>() {
//            @Override
//            public int compare(Students o1, Students o2) {
//                return o1.weight - o2.weight;
//            }
//        });

        // sort method

//        Collections.sort(student,(o1, o2) -> o1.weight-o2.weight);
//        System.out.println(student);



//        Collections.sort(student, new WeightComparator());
//        System.out.println(student);






//        List<Integer> list = new ArrayList<>();
//        list.add(15);
//        list.add(8);
//        list.add(2);
//        list.add(90);
//        System.out.println(list);
//
//
//        Collections.sort(list);
//        System.out.println(list);
    }
}
