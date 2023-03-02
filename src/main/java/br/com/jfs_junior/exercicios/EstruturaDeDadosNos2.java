package br.com.jfs_junior.exercicios;

public class EstruturaDeDadosNos2 {

    private Object object;
    private No refNo;

    public EstruturaDeDadosNos2() {
    }
    public EstruturaDeDadosNos2(Object object) {
        this.refNo = null;
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public No getRefNo() {
        return refNo;
    }

    public void setRefNo(No refNo) {
        this.refNo = refNo;
    }

    @Override
    public String toString() {
        return "EstruturaDeDadosNos2{" +
                "object=" + object +
                '}';
    }
}
