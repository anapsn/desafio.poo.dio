
package ex06;


public class Banco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    
    
    public void estadoAtual(){
        System.out.println("Conta"  + this.getNumConta());
        System.out.println("Tipo"  + this.getTipo());
        System.out.println("Dono"  + this.getDono());
        System.out.println("Saldo"  + this.getSaldo());
        System.out.println("Status"  + this.getStatus());
    }
    
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        
        if("CC".equals(t)){
            this.setSaldo( 50);
        }else if("CP".equals(t)){
            this.setSaldo( 150);
        }
    }

    public void fecharConta(){
        if(this.getSaldo() > 0){
            System.out.println("Conta com dinheiro");
        }else if(this.getSaldo() < 0 ){
            System.out.println("conta em debito");
        }else {
            this.setStatus(false);
            System.out.println("conta encerrada com sucesso");
        }
    }
    
    public void depositar(float v){
        if(this.getStatus() == true){
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito realizado com sucesso" + this.getDono());
            }else{
                System.out.println("Impossivel depositar");
       
        }
    }
    
    public void sacar (float v){
        if(this.getStatus()){
        }if(this.getSaldo() >= v){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Saque realizado na conta" + this.getDono());
    }else{
            System.out.println("Saldo insuficiente para sacar");
        }
    }

    public void pagarMensal(){
        int v = 0;
        if("CC".equals(this.getTipo())){
            v = 0;
        }else if ("CP".equals(this.getTipo())){
            v = 20;
        }
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("mensalidade paga com sucesso" + this.getDono());
            
        }else {
            System.out.println("impossivel pagar conta fechada");
        }
    }

    public Banco() { // float saldo, boolean status
        this.saldo = 0;
        this.status = false;
    }

    public int getNumConta() {
        return numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDono() {
        return dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
    
    
    
}
