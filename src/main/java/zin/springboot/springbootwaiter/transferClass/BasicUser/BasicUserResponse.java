package zin.springboot.springbootwaiter.transferClass.BasicUser;

import lombok.Builder;
import lombok.Data;
import zin.springboot.springbootwaiter.model.BasicUser;
import zin.springboot.springbootwaiter.transferClass.ResponseWaiter;

@Data
public class BasicUserResponse extends ResponseWaiter<BasicUser> {

    private String nome;

    private String email;

    public BasicUserResponse() {
    }

    public BasicUserResponse(Long id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    

    


    
}
