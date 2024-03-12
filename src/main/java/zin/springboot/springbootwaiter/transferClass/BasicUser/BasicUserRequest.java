package zin.springboot.springbootwaiter.transferClass.BasicUser;

import lombok.Data;
import zin.springboot.springbootwaiter.transferClass.RequestWaiter;

@Data
public class BasicUserRequest extends RequestWaiter<BasicUserDto> {

    private String nome;

    private String email;

    private String senha;

    @Override
    public BasicUserDto convertToDTO() {
        return new BasicUserDto(this.nome, this.email, this.senha);
    }

  

   

   
    
}
