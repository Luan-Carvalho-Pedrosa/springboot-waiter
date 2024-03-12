package zin.springboot.springbootwaiter.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import zin.springboot.springbootwaiter.model.BasicUser;
import zin.springboot.springbootwaiter.repository.BasicUserRepository;
import zin.springboot.springbootwaiter.transferClass.BasicUser.BasicUserDto;

@Service
public class BasicUserService extends ServiceAssistant<BasicUser, BasicUserDto> {

	@Autowired
    public BasicUserService(BasicUserRepository repository) {
        super(repository);
        //TODO Auto-generated constructor stub
    }

    @Override
    protected BasicUserDto convertModelToDTO(BasicUser model) {
        // TODO Auto-generated method stub
        BasicUserDto dto = new BasicUserDto();

        dto.setId(model.getId());
        dto.setEmail(model.getEmail());
        dto.setName(model.getName());
        dto.setPassworld(model.getPassworld());

        return dto;
    }

   
    
}
