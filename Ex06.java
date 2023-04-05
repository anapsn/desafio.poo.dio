package ex06;


public class Ex06 {

    public static void main(String[] args) {
        Banco p1 = new Banco();
        p1.setNumConta( 111);
        p1.setDono( "José");
        p1.abrirConta("CC");
        
        Banco p2 = new Banco();
        p2.setNumConta(123);
        p2.setDono("Maria");
        p2.abrirConta("CP");
        
        
        
        p1.depositar(100);
        p2.depositar(500);
        
        p2.sacar(100);
        
                
        p1.estadoAtual();
        p2.estadoAtual();
        
    }
    
}
