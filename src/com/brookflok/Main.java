package com.brookflok;

import com.brookflok.object.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        ArrayList<Odbrana> odbrana1 = new ArrayList<>();


        odbrana1.add(new Odbrana("Damir","Arnautovic",21,0));
        odbrana1.add(new Odbrana("Amna","Amna",21,1));
        odbrana1.add(new Odbrana("Zeki","Sefer",21,2));
        odbrana1.add(new Odbrana("J=suf","Jsuf",21,3));

        ArrayList<Odbrana> odbrana2 = new ArrayList<>();


        odbrana2.add(new Odbrana("Damir","Arnautovic",21,4));
        odbrana2.add(new Odbrana("Amna","Amna",21,5));
        odbrana2.add(new Odbrana("Zeki","Sefer",21,6));
        odbrana2.add(new Odbrana("J=suf","Jsuf",21,7));


        ArrayList<Napad> napad1 = new ArrayList<>();


        napad1.add(new Napad("Denis","Arnautovic",21,8));
        napad1.add(new Napad("Amna","Amna",21,9));
        napad1.add(new Napad("Leotar","Amna",21,22));


        ArrayList<Napad> napad2 = new ArrayList<>();

        napad2.add(new Napad("Damir","Arnautovic",21,10));
        napad2.add(new Napad("Amna","Amna",21,11));
        napad2.add(new Napad("Leotar","Amna",21,27));

        ArrayList<Vezni> vezni1 = new ArrayList<>();


        vezni1.add(new Vezni("Denis","Arnautovic",21,14));
        vezni1.add(new Vezni("Amna","Amna",21,12));
        vezni1.add(new Vezni("Amar","Amna",21,13));


        ArrayList<Vezni> vezni2 = new ArrayList<>();

        vezni2.add(new Vezni("Enis","Arnautovic",21,14));
        vezni2.add(new Vezni("Amna","Amna",21,12));
        vezni2.add(new Vezni("Amar","Amna",21,13));


        Golman golman1 = new Golman("Golko", "Golkovic", 32,44);
        Golman golman2 = new Golman("Golko", "Golkovic", 32,44);


        Tim tim1 = new Tim("Lavovi", napad1,vezni1,odbrana1,golman1);
        Tim tim2 = new Tim("Zebre", napad2,vezni2,odbrana2,golman2);

        int broj = (int) (Math.random() * 10);

        System.out.println(broj);




    }
}
