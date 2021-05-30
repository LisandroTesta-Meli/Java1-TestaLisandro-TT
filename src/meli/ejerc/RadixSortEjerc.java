package meli.ejerc;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;


public class RadixSortEjerc {
    public static void radixSort(int []arr)
    {
        String[] sarr = StringUtil.toStringArray(arr);
        StringUtil.lNormalize(sarr,'0');
        int max = StringUtil.maxLength(sarr);
        ArrayList<String> arraux = new ArrayList<>();
        for (int i = 0; i < sarr.length; i++) {
            arraux.add(sarr[i]);
        }
        for (int i = max ; i > 0 ; i--) {
            HashMap<Character, ArrayList<String>> hmap = new HashMap<>();
            for (String s:arraux) {
                char a = s.charAt(i-1);
                ArrayList<String> pepe = hmap.get(a);
                if( pepe == null ){
                    pepe = new ArrayList<>();
                }
                pepe.add(s);
                hmap.put(a,pepe);
            }
            arraux = new ArrayList<>();
            for (HashMap.Entry<Character,ArrayList<String>> set : hmap.entrySet()) {
                for (String s: set.getValue()) {
                    arraux.add(s);
                }
            }
        }
        for (int i = 0; i < arraux.size() ; i++) {
            arr[i] = Integer.parseInt(arraux.get(i));
        }
    }

    public static void main(String[] args)
    {
        int arr[]={16223,898,13,906,235,23,9,1532,6388,2511,8};
        radixSort(arr);

        System.out.println("-----");
		for(int i=0; i<arr.length;i++)
		{
			System.out.print(arr[i]+(i<arr.length-1?",":""));
		}
		/*

        //Probando todos los metodos de StringUtil

        //replicate:
        // Retorna una cadena compuesta por n caracteres c
        // Ejemplo: replicate('x',5) ==> 'xxxxx'
        System.out.println("Replicate:  ");
        System.out.println(StringUtil.replicate('x',5));
        System.out.println("----------");

        //lpad
        // Retorna una cadena de longitud n, compuesta por s
        // y precedida de tantos caracteres c como sea necesario
        // para completar la longitud mencionada
        // Ejemplo lpad("5",3,'0') ==> "005"
        System.out.println("lpad:  ");
        System.out.println(StringUtil.lpad("5",3,'0'));
        System.out.println("----------");

        //toStringArray
        // Retorna un String[] conteniendo los elementos de arr
        // representados como cadenas de caracteres
        int[] intarr={3,2,4};
        String[] strarr = StringUtil.toStringArray(intarr);
        System.out.println("toStringArray:  ");
        for (String s: strarr) {
            System.out.println(s.getClass().getName());
        }
        System.out.println("----------");

        //toIntArray
        // Retorna un int[] conteniendo los elementos de arr
        // representados como numeros enteros
        String[] strarr1={"3","4","5"};
        int[] intarr1 = StringUtil.toIntArray(strarr1);
        System.out.println("toIntArray:  ");
        for (int s: intarr1) {
            System.out.println(s-1);
        }
        System.out.println("----------");

        //maxLength
        // Retorna la longitud del elemento con mayor cantidad
        // de caracteres del array arr
        String[] cadena = {"Juan","Roman","Riquelme"};
        System.out.println("maxLength:  ");
        System.out.println("La palabra mas larga tiene "+StringUtil.maxLength(cadena) +" caracteres");
        System.out.println("----------");

        //lNormalize
        // Completa los elemento del arr agregando caracteres c
        // a la izquierda, dejando a todos con la longitud del mayor
        String[] cadena1 = {"Arroooz","arroz","AAAAAAAAARROZ","ars","PAAAAAAAASOOOOOOOOOOOOOO"};
        System.out.println("lNormalize:  ");
        System.out.println("Antes de organizarla:");
        for (String s: cadena1) {
            System.out.println(s);
        }
        System.out.println("-----");
        System.out.println("Despues de organizarla:");
        StringUtil.lNormalize(cadena1,'a');
        for (String s: cadena1) {
            System.out.println(s);
        }
        System.out.println("----------");
        */


    }
}
