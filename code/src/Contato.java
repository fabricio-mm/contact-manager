import java.util.HashSet;
import java.util.Objects;
public class Contato {
    public String nome;
    public String email;

    public Contato(String nome, String email){
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }
    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null && getClass() != obj.getClass()) return false;
        Contato contato = (Contato) obj;
        return nome.equals(contato.nome) && email.equals(contato.email);
    }
    @Override
    public int hashCode(){
        return  Objects.hash(nome, email);
    }

    @Override
    public String toString() {
        return "Contato { Nome= '" + nome + "' Email= '" + email + "' }";
    }

}
