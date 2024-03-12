package zin.springboot.springbootwaiter.transferClass.BasicUser;

import lombok.Data;
import zin.springboot.springbootwaiter.model.BasicUser;
import zin.springboot.springbootwaiter.transferClass.DtoWaiter;


@Data
public class BasicUserDto extends DtoWaiter<BasicUser> {

    private String nome;

    private String email;

    private String senha;

    public BasicUserDto() {
    }

    public BasicUserDto(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    @Override
    public BasicUser convertToModel() {
        BasicUser user = new BasicUser();
        user.setId(this.id);
        user.setNome(this.nome);
        user.setEmail(this.email);
        user.setSenha(this.senha);

        return user;
    }
    
}
