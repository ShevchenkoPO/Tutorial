package com.company;

import java.io.*;
<<<<<<< HEAD
import java.util.regex.Pattern;
import java.util.regex.Matcher;
=======
>>>>>>> refs/heads/branch_one
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.print("Input code string \n");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        try {
            str = in.readLine();
<<<<<<< HEAD
            TestRegexp.doMatch(str);
=======
>>>>>>> refs/heads/branch_one
            String strAfter = str.replace(";", "; \n");
            String strAfter2 = strAfter.replace("{", "{ \n");
            String strAfter3 = strAfter2.replace("}", "} \n");

<<<<<<< HEAD

=======
>>>>>>> refs/heads/branch_one
            System.out.println(strAfter3);
        }
        catch(Exception e) {
            System.out.println("> Test: " + e);
        }

       // System.out.print("> Test: " + str);

/*
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            System.out.print(sc.next());;
        } */
    }
<<<<<<< HEAD
}



=======

}
>>>>>>> refs/heads/branch_one
