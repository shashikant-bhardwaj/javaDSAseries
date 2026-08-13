package CollectionFramework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetBasics {
    static void main() {

        HashSet<Student> set = new HashSet<>();

        Student s1 = new Student(1, "shashi");
        Student s2 = new Student(1, "shashi");
        Student s3 = new Student(1, "shashi");

        set.add(s1);
        set.add(s2);
        set.add(s3);

        System.out.println(set);




//        Set<Integer> set = new HashSet<>();
//        set.add(10);
//        set.add(10);
//        set.add(20);
//        set.add(20);
//        set.add(40);
//        System.out.println(set);

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);


        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);

        System.out.println(set1);
        set1.retainAll(set2);
        System.out.println(set1);

        //cotainsAll
        System.out.println(set1.contains(set2));
        System.out.println(set2.contains(set1));


        //LinkedHashSet
        Set<Integer> st = new LinkedHashSet<>();  // --> ismei order preserve hota hai
        st.add(20);
        st.add(15);
        st.add(10);
        st.add(10);
        st.add(20);
        st.add(20);
        st.add(40);
        st.add(40);

        System.out.println(st);


        // TreeSet
        Set<Integer> st2 = new TreeSet<>(); // --> ye set ko sorted return krta hai
        st2.add(20);
        st2.add(15);
        st2.add(10);
        st2.add(10);
        st2.add(20);
        st2.add(20);
        st2.add(40);
        st2.add(40);

        System.out.println(st2);



        //HashSet --> O(1)
        //LinkedHashSet --> addition = o(1) , removal = O(n) =access
        //TreeSet --> BST --> O(logn)

    }

}
