package zin.springboot.springbootwaiter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import zin.springboot.springbootwaiter.model.BasicUser;
import zin.springboot.springbootwaiter.service.BasicUserService;
import zin.springboot.springbootwaiter.transferClass.BasicUser.BasicUserDto;
import zin.springboot.springbootwaiter.transferClass.BasicUser.BasicUserResponse;

@Controller
public class BasicUserController extends ControllerAssistant<BasicUser, BasicUserResponse, BasicUserDto>  {

	@Autowired
    public BasicUserController(BasicUserService service) {
        super(service);
        //TODO Auto-generated constructor stub
    }

    @Override
    protected BasicUserResponse convertDtoToResponse(BasicUserDto dto) {
        // TODO Auto-generated method stub
        return  new BasicUserResponse(dto.getId(), dto.getName(), dto.getEmail());
    }

    
    
}
