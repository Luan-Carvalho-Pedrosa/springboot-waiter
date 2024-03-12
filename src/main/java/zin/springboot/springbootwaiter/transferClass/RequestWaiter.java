package zin.springboot.springbootwaiter.transferClass;

public abstract class RequestWaiter<T extends DtoWaiter> {

    abstract public T convertToDTO();


    
} 