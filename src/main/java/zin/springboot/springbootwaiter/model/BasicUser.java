package zin.springboot.springbootwaiter.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class BasicUser extends AbstractModel {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String nome;

    private String email;

    private String senha;

    public BasicUser() {
        //TODO Auto-generated constructor stub
    }

    public BasicUser(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    


    
}
