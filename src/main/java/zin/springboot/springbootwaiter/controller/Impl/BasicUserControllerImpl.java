package zin.springboot.springbootwaiter.controller.Impl;

import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import zin.springboot.springbootwaiter.controller.BasicUserController;
import zin.springboot.springbootwaiter.repository.BasicUserRepository;
import zin.springboot.springbootwaiter.service.BasicUserService;
import zin.springboot.springbootwaiter.transferClass.BasicUser.BasicUserRequest;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/basicUser")
public class BasicUserControllerImpl {

   // @Autowired
    //private BasicUserRepository repository;

   // @Autowired
   // private BasicUserService service;

	@Autowired
    private BasicUserController controllerAssistant;

   
    
    @GetMapping("/{id}")
    public ResponseEntity<?> get(@PathVariable long id){
        try {
            return this.controllerAssistant.get(id);
        } catch (Exception e) {
            // TODO: handle exception
            return this.controllerAssistant.generateExceptionReturn(e, 404);
        }
    }

    @GetMapping
    public List<?> getList(){
    	try {
            return this.controllerAssistant.geList();

		} catch (Exception e) {
			// TODO: handle exception
			return this.controllerAssistant.generateExceptionListReturn(e, 404);
		}
    }

    @PostMapping
    public ResponseEntity<?> post(@RequestBody BasicUserRequest request){
        try {
            return this.controllerAssistant.post(request);            
        } catch (Exception e) {
            // TODO: handle exception
            return this.controllerAssistant.generateExceptionReturn(e, 400);

        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> put(@RequestBody BasicUserRequest request, @PathVariable Long id){
        try {
            return this.controllerAssistant.put(request, id);
        } catch (Exception e) {
            // TODO: handle exception
            return this.controllerAssistant.generateExceptionReturn(e, 400);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable long id){
        try {
            return this.controllerAssistant.delete(id);
        } catch (Exception e) {
            // TODO: handle exception
            return this.controllerAssistant.generateExceptionReturn(e, 404);
        }
    }








    
}
