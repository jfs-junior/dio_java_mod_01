package br.com.jfs_junior.exercicios;

/**
 * <strong>ESTRUTURA DE DADOS EM NÓ</strong><br>
 *
 * Prática do conceito de estruturação de dados em nós.
 * Os valores estão alinhados sempre ao próximo nó de dados.
 */
public class EstruturaDeDadosNos {

    private String conteudo;
    private EstruturaDeDadosNos proximoNo;

    public EstruturaDeDadosNos(String dados) {
        this.conteudo = dados;
        this.proximoNo = null;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public EstruturaDeDadosNos getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(EstruturaDeDadosNos proximoNo) {
        this.proximoNo = proximoNo;
    }

    @Override
    public String toString() {
        return conteudo + " -0- " + proximoNo;
    }
}
