package Main.java.list.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidado {
    //atributo
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidado() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for(Convidado c : convidadoSet) {
            if(c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidado(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidado conjuntoConvidado = new ConjuntoConvidado();
        System.out.println(" Existem " + conjuntoConvidado.contarConvidados() + " convidados dentro do set de convidados ");
    }
}
