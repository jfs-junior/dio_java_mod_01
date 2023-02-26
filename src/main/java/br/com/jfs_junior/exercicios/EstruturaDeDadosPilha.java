package br.com.jfs_junior.exercicios;
public class EstruturaDeDadosPilha {

    private EstruturaDeDadosNos refNoEntradaPilha;

    public EstruturaDeDadosPilha () {
        this.refNoEntradaPilha = null;
    }

    public void push(EstruturaDeDadosNos novoNo) {
        EstruturaDeDadosNos refAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setProximoNo(refAuxiliar);
    }

    public EstruturaDeDadosNos pop() {
        if(!this.isEmpty()) {
            EstruturaDeDadosNos noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getProximoNo();
            return noPoped;
        }
        return null;
    }

    public EstruturaDeDadosNos top() {
        return refNoEntradaPilha;
    }

    public boolean isEmpty() {
        return refNoEntradaPilha == null;
    }

}
