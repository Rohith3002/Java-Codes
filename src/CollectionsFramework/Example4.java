package CollectionsFramework;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
// import java.util.*; This is bad practice

public class Example4 {
    public static void main(String[] args) {
        List<String> courseList = new ArrayList<>();
        courseList.add("ATB");
        courseList.add("MTB");
        courseList.add("PyATB");
        courseList.add("LAPIB");
        courseList.add("SDET Blueprint");


        List numList = new ArrayList();
        numList.add(150.23);
        numList.add(100);
        numList.add(100);
        numList.add(399);

        courseList.addAll(numList);
        System.out.println(courseList);


        Iterator iterator = courseList.iterator();
        while(iterator.hasNext()){
//            courseList.add("GEN AI");
            System.out.println(iterator.next());
        }
        List<Integer> myMakrs = new ArrayList<>();
        myMakrs.add(91);
        myMakrs.add(87);
        myMakrs.add(80);
        Collections.sort(myMakrs);
        System.out.println(myMakrs);






    }
}