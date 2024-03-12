package zin.springboot.springbootwaiter.transferClass.BasicUser;

import lombok.Data;
import zin.springboot.springbootwaiter.model.BasicUser;
import zin.springboot.springbootwaiter.transferClass.DtoWaiter;


@Data
public class BasicUserDto extends DtoWaiter<BasicUser> {

    private String name;

    private String email;

    private String passworld;

    public BasicUserDto() {
    }

    public BasicUserDto(String name, String email, String passworld) {
        this.name = name;
        this.email = email;
        this.passworld = passworld;
    }

    @Override
    public BasicUser convertToModel() {
        BasicUser user = new BasicUser();
        user.setId(this.id);
        user.setName(this.name);
        user.setEmail(this.email);
        user.setPassworld(this.passworld);

        return user;
    }
    
}
