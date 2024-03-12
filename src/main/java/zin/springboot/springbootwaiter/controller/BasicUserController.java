package zin.springboot.springbootwaiter.controller;

import zin.springboot.springbootwaiter.model.BasicUser;
import zin.springboot.springbootwaiter.service.BasicUserService;
import zin.springboot.springbootwaiter.transferClass.BasicUser.BasicUserDto;
import zin.springboot.springbootwaiter.transferClass.BasicUser.BasicUserResponse;

public class BasicUserController extends ControllerAssistant<BasicUser, BasicUserResponse, BasicUserDto>  {

    public BasicUserController(BasicUserService service) {
        super(service);
        //TODO Auto-generated constructor stub
    }

    @Override
    protected BasicUserResponse convertDtoToResponse(BasicUserDto dto) {
        // TODO Auto-generated method stub
        return  new BasicUserResponse(dto.getId(), dto.getNome(), dto.getEmail());
    }

    
    
}
