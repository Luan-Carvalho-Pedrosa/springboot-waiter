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
    protected Long id;
	
    private String name;

    private String email;

    private String passworld;

    public BasicUser() {
        //TODO Auto-generated constructor stub
    }

    public BasicUser(String name, String email, String passworld) {
        this.name = name;
        this.email = email;
        this.passworld = passworld;
    }

    


    
}
