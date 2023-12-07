package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //Biblioteca java.util
            //Array list
                //Da pra colocar string, int, double no mesmo array list
                    //Arraylist itens = new ArrayList();
                    //itens.add(7);
                    //intens.add("Anna");
                    //intens.add("10.4");
                //O tamanho to array list vai aparecendo conforme adicionamos itens
                //Para varre o array list fazemos assim
                    /*for (int i = 0; i < intens.size(); i++) {
                        System.out.println(itens.get(i));
                      }
                    */
                //Para remover:
                    //itens.remove(index);
                    //     ou
                    //itens.remove("Anna"); /* Removido pelo nome, mas se for um número inteiro ele confunde com o index */
            //Array list homogenio:
                //ArrayList <Integer> inteiros = new ArrayList<>();
                //ArrayList <Double> doubles = new ArrayList<>();

            //Existe um método que ordena o Array List
            //Collections.sort(inteiro); /* Pronto ordenado do menor pro maior */
            //Existe um também que ordena ao contrário
            //Collections.reverse(inteiros); /* Lembrando que pra ordenar ao contraio primeiro você ordena depois reverte */

            //Para saber os index das coisas
            //inteiros.indexOf(12);

            //Existe um metodo que verifica se está vazio ou não
            //inteiros.isEmpty();

            //Dar um clear nele
            //inteiros.clear();

        //Para comparar dois objetos que estão dentro de um array list temos que dar:
            //implements Comparable<conta> //na classe que será comparadada e com isso podemos organizar o arrayList de objetos
            //depois de implementar temos que complementar o metodo
                /*
                public int compareTo(nomeClasse o){
                    return Integer.compare(this.num, o.num)
                }
                 */
                /* Para Strings
                public int compareTo(nomeClasse o){
                    return nome.compare(o.nome)
                }
                 */



    }
}