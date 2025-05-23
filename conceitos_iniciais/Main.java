package conceitos_iniciais;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        int x = 5;
        x = 10;

        // tipo nome = valor;

        var nomeVariavel = "Luiz";
        // var entende o tipo da variavel pelo valor

        // Tipos de dados

        // inteiros = 100, 200 etc
        // byte -> 8bits -> -128 até 127
        // short -> 16bits -> -32768 a 32767
        // int -> 32bits -> -2.147.483.648 a 2.147.483.647
        // long -> 64bits -> numeros maiores

        // Decimais
        // float -> 32bits precisão simples
        // double -> 64bits precisão dupla

        // String e char, char apenas possui 1 letra,
        // normalmente declarado com aspas simples

        // Boolean = true ou false

        long l = 1000000L;
        float f = 12.3f;
        char c = 'A';
        String str = "AOBA";
        boolean b = false;

        if(str.isBlank()){
            System.out.println("||True||");
        }
        else if (str == "AOBA") {
            System.out.println("||AOBA||");
        } else{
            System.out.println("||False||");
        }

        int[] arrayInteiros = { 1,2,3 };
        System.out.println(arrayInteiros[2]);

        ArrayList<String> Lista = new ArrayList<>();

        Lista.add("Teste");
        Lista.add("Bomdia");
        Lista.add("Boanoite");
        Lista.add("AAAAAA");

        //System.out.println(Lista.get(2));
        // Lista.remove(2);
        //System.out.println(Lista.get(2));
        // Lista.remove("Teste");
        //System.out.println(Lista.get(0));

        for(int i = 0; i < 4; i++){
            System.out.println(Lista.get(i));
        }

        for (String palavra : Lista){
            System.out.println("Palavra: " + palavra);
        }

        double resultado = 1.0;
        int resInt = (int) resultado;
        System.out.println(resInt);

        String numero = "10";

        int numeroInt = Integer.parseInt(numero);

        String numeroString = String.valueOf(numeroInt);

    }
}
