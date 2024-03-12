package zin.springboot.springbootwaiter.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;


import zin.springboot.springbootwaiter.transferClass.DtoWaiter;
import zin.springboot.springbootwaiter.model.AbstractModel;

public abstract class ServiceAssistant<T extends AbstractModel, K extends DtoWaiter<T>> {

      protected JpaRepository<T, Long> repository;

      public ServiceAssistant(JpaRepository<T, Long> repository) {

        this.repository = repository;
      }

      public List<K> getAll(){

        List<T> models = this.repository.findAll();

        return this.convertList(models);
      }

      public K getById(Long id){

        Optional<T> modelOp = this.repository.findById(id);

        return this.convertOptionalToDTO(modelOp, false);
      }

      public K add(K dto){

        dto.setId(null);

        T model = dto.convertToModel();

        this.repository.save(model);

        dto.setId(model.getId());
        return dto;
      }

      public K update(Long id, K dto){

        dto.setId(id);

        T model = dto.convertToModel();

        this.repository.save(model);

        return dto;
      }

      public K delete(Long id){

        Optional<T> modelOp = this.repository.findById(id);

        if(!modelOp.isPresent()) return null;

        K dto =  this.convertOptionalToDTO(modelOp, true);

        this.repository.deleteById(id);

        return dto;
      }

      abstract protected K convertModelToDTO(T model);

      protected List<K> convertList(List<T> models) {

        List<K> DTOs = new ArrayList<K>();

        for(T model: models){

            K dto = this.convertModelToDTO(model);
            DTOs.add(dto);

        }

        return DTOs;
    }

    protected K convertOptionalToDTO(Optional<T> modelOp, Boolean confirmedPresence){

        if(!confirmedPresence){

            if(!modelOp.isPresent()) return null;
        }

        T model = modelOp.get();

        K dto = this.convertModelToDTO(model);
        
        return dto;
    }

    public JpaRepository getRepository() {

        return repository;
    }

   
}
    

