import java.util.Scanner;
import java.util.ArrayList;

public class Exercício_7 {
    public static void main(String[] args){
        String senha, login;
        int tentativa=0;

        class Usuario {
            public String login;
            public String senha;
        
            public Usuario (String login, String senha) {
                this.login = login;
                this.senha = senha;
            }
        
        }
        
        var usuario1 = new Usuario ("Samuel", "1234");
        var usuario2 = new Usuario ("predo", "predrotas");
        var usuario3 = new Usuario ("tamarindo", "tamariel");
        
        var usuarios = new ArrayList<Usuario>();
        usuarios.add (usuario1);
        usuarios.add (usuario2);
        usuarios.add (usuario3);
        
        var input = new Scanner (System.in);
        do {
            System.out.println ("Digite seu login: ");
            login = input.next ();
            System.out.println ("Digite sua senha: ");
            senha = input.next ();
        
            for (Usuario usuario : usuarios) {
                if (login.equals (usuario.login) && senha.equals (usuario.senha)) {
                    System.out.println ("Você está conectado!");
                    System.exit(0);
                }
            }
        
            System.out.println ("Login ou Senha erada! Tente novamente!");
        
            tentativa++;
        } while (tentativa < 3);
        System.out.println ("Você excedeu o limite de tentativas!");
    }
}
       