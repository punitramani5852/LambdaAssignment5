package com.knoldus;

import java.util.ArrayList;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) {



        GetDistinctStringsImpl obj = new GetDistinctStringsImpl();

        System.out.println(obj.get.distinctStrings(new ArrayList<>(Arrays.asList("java","scala","java","clojure","clojure"))));
        System.out.println(obj.get.distinctStrings(new ArrayList<>(Arrays.asList("the","three","the","three","the","three","an","an","a"))));




    }

}