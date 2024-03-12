package zin.springboot.springbootwaiter.transferClass.BasicUser;

import lombok.Builder;
import lombok.Data;
import zin.springboot.springbootwaiter.model.BasicUser;
import zin.springboot.springbootwaiter.transferClass.ResponseWaiter;

@Data
public class BasicUserResponse extends ResponseWaiter<BasicUser> {

    private Long id;

    private String name;

    private String email;

    public BasicUserResponse() {
    }

    public BasicUserResponse(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    

    


    
}
