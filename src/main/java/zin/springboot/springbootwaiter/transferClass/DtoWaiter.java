package zin.springboot.springbootwaiter.transferClass;

import zin.springboot.springbootwaiter.model.AbstractModel;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public abstract class DtoWaiter<T extends AbstractModel> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;

    abstract public T convertToModel();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    

    
}

    



    
   
