package br.com.bytebank.banco.modelo;

public class GuardadorDeContas {

    private Object[] referencias;
    private int posicaoLivre;
    
    public GuardadorDeContas() {
        this.referencias = new Object[10];
        this.posicaoLivre = 0;
    }

    public void adiciona(Object ref) {
        this.referencias[this.posicaoLivre] = ref;
        this.posicaoLivre++;
    }

    public int getQuantidadeDeElementos() {
        return this.posicaoLivre;
    }

    public Object getReferencias(int pos) {
        return this.referencias[pos];
    }

    public Conta getReferencia(int i) {
        // TODO Auto-generated method stub
        return null;
    }
    
    
    
}
