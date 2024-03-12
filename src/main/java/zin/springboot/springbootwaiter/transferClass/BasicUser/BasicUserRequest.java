package zin.springboot.springbootwaiter.transferClass.BasicUser;

import lombok.Data;
import zin.springboot.springbootwaiter.transferClass.RequestWaiter;

@Data
public class BasicUserRequest extends RequestWaiter<BasicUserDto> {

    private String name;

    private String email;

    private String passworld;

    @Override
    public BasicUserDto convertToDTO() {
        return new BasicUserDto(this.name, this.email, this.passworld);
    }

  

   

   
    
}
