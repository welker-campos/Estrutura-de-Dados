/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudospilha;

/**
 *
 * @author 31750771
 */
public class TadPilha {

    private int[] pilha;
    private int topo;

    public TadPilha(int tam) {
        pilha = new int[tam];
        topo = -1;
    }

    public boolean vazia() {
        return (topo == -1);
    }

    public boolean cheia() {
        return (topo == pilha.length - 1);
    }

    public boolean inserir(int valor) {
        if (cheia()) {
            return false;
        }
        topo++;
        pilha[topo] = valor;
        return true;
    }

    public String imprimir() {
        String volta = "";
        if (vazia()) {
            volta = "Pilha esta vazia";
            return volta;
        }
        for (int i = 0; i <= topo; i++) {
            volta+=pilha[i]+" ";

        }
        return volta;
    }

}
