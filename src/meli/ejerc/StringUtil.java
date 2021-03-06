package meli.ejerc;

public class StringUtil {
    // Retorna una cadena compuesta por n caracteres c
    // Ejemplo: replicate('x',5) ==> 'xxxxx'
    public static String replicate(char c,int n)
    {
        String cadena = "";
        for (int i = 0; i < n; i++) {
            cadena+=c;
        }
        return cadena;
    }

    // Retorna una cadena de longitud n, compuesta por s
    // y precedida de tantos caracteres c como sea necesario
    // para completar la longitud mencionada
    // Ejemplo lpad("5",3,'0') ==> "005"
    public static String lpad(String s, int n, char c)
    {
        String cadena ="";
        for (int i = 1; i < n ; i++) {
            cadena+=c;
        }
        cadena+=s;
        return cadena;
    }

    // Retorna un String[] conteniendo los elementos de arr
    // representados como cadenas de caracteres
    public static String[] toStringArray(int arr[])
    {
        String[] cadena = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            cadena[i] = Integer.toString(arr[i]);
        }
        return cadena;
    }

    // Retorna un int[] conteniendo los elementos de arr
    // representados como numeros enteros
    public static int[] toIntArray(String arr[])
    {
        int[] cadena  = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            cadena[i] = Integer.parseInt(arr[i]);
        }
        return cadena;




    }

    // Retorna la longitud del elemento con mayor cantidad
    // de caracteres del array arr
    public static int maxLength(String arr[])
    {
        int maxLong = 0 ;
        for (String s: arr) {
            if (s.length() >maxLong){
                maxLong = s.length();
            }
        }
        return maxLong;
    }

    // Completa los elemento del arr agregando caracteres c
    // a la izquierda, dejando a todos con la longitud del mayor
    public static void lNormalize(String arr[], char c)
    {
        int masLargo = maxLength(arr);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = lpad(arr[i],masLargo-arr[i].length()+1,c);
        }


    }
}
