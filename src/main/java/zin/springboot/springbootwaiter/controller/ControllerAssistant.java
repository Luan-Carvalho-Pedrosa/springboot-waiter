package zin.springboot.springbootwaiter.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import zin.springboot.springbootwaiter.model.AbstractModel;
import zin.springboot.springbootwaiter.service.ServiceAssistant;
import zin.springboot.springbootwaiter.transferClass.ResponseWaiter;
import zin.springboot.springbootwaiter.transferClass.RequestWaiter;
import zin.springboot.springbootwaiter.transferClass.DtoWaiter;


public abstract class ControllerAssistant<T extends AbstractModel, K extends ResponseWaiter<T>, Q extends DtoWaiter<T>> {

    private ServiceAssistant<T, Q> service;

    public ControllerAssistant(ServiceAssistant<T, Q> service) {
        this.service = service;
    }

    public ResponseEntity<K> get(Long id){

        Q dto =  this.service.getById(id);

        K response = this.convertDtoToResponse(dto);

        return this.generateReturn(response, 200);
    }

    public List<K> geList(){
        List<Q> dtos = this.service.getAll();

        return this.convertList(dtos);
    }

    public ResponseEntity<K> post(RequestWaiter<Q> request){

        return this.generateReturn(this.service.add(request.convertToDTO()));

    }

    public ResponseEntity<K> put(RequestWaiter<Q> request, Long id){

        return this.generateReturn(this.service.update(id ,request.convertToDTO()));

    }

    public ResponseEntity<K> delete(Long id){

        return this.generateReturn(this.service.delete(id));

    }

    abstract protected K convertDtoToResponse(Q dto);

    protected List<K> convertList(List<Q> dtos){
        List<K> responses = new ArrayList<K>();

        for(Q dto: dtos){
            responses.add( this.convertDtoToResponse(dto));
        }

        return responses;

    }

    private ResponseEntity<K> generateReturn(K response, int status){

        return ResponseEntity.status(status).body(response);
    }

    private ResponseEntity<K> generateReturn(Q dto){

        K response = this.convertDtoToResponse(dto);
        
        return this.generateReturn(response, 200); 
    }

    public ResponseEntity<?> generateExceptionReturn(Exception e, int status){
        return ResponseEntity.status(status).body(e.getMessage());
    }
    
    public List<?> generateExceptionListReturn(Exception e, int status){
    	List<ResponseEntity> list = new ArrayList<ResponseEntity>();
    	list.add(this.generateExceptionReturn(e, status));
        return list;
    }
    
    



    

    
}
