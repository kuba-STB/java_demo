
public class MainApp {

    public static void main(String[] args) {

        // Exercise 1

        int[] tab = {1, 2, 3, 4, 5};

        // Variant 1
        int num = tab[0];
        tab[0] = tab[tab.length - 1];
        tab[tab.length - 1] = num;

        for (int i = 0; i < tab.length; i++){
            System.out.println(tab[i]);
        }

        // Variant 2
        int liczba1 = tab[0];
        int liczba2 = tab [tab.length - 1];
        tab[0] = liczba2;
        tab[tab.length - 1] = liczba1;

        for (int i = 0; i < tab.length; i++){
            System.out.println(tab[i]);
        }

        // Variant 3
        tab[tab.length - 1] = tab[tab.length - 1] + tab[0];
        tab[0] = tab[tab.length - 1] - tab[0];
        tab[tab.length - 1] = tab[tab.length - 1] - tab[0];


        for (int item : tab) {
            System.out.println(item);
        }

        // Exercise 2

        int[] array = {2, 2, 3, 4, 5, 7, 7, 7, 8, 8, 2};

        int even = 0;
        int odd = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                even += 1;
            } else {
                odd += 1;
            }
        }
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);

        // Exercise 3

        int[] tabela = {2, 4, 1, 9, 5, 2, 4, 0, 5, 8};
        // int[] tabela = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 0; i < tabela.length; i++) {
            int number = tabela[i];
            for (int j = i + 1; j < tabela.length; j++) {
                if (tabela[j] < number) {
                    number = tabela[j];
                    tabela[j] = tabela[i];
                    tabela[i] = number;
                }
            }
        }
        for (int z = 0; z < tabela.length; z++) {
            System.out.println(tabela[z]);
        }



        int[] tabelka = {2, 4, 1, 9, 5, 2, 4, 0, 5, 8};
        // int[] tabelka = {9, 8, 7, 6, 5, 4, 3, 2, 1};

        for (int i = 0; i < tabelka.length; i++){
            int number = tabelka[i];
            for (int j = i + 1; j < tabelka.length; j++){
                if (tabelka[j] > number) {
                    number = tabelka[j];
                    tabelka[j] = tabelka[i];
                    tabelka[i] = number;
                }
            }
        } for (int z = 0; z < tabelka.length; z++){
            System.out.println(tabelka[z]); }

    }


}