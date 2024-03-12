package zin.springboot.springbootwaiter.transferClass;

import zin.springboot.springbootwaiter.model.AbstractModel;

public abstract class ResponseWaiter<T extends AbstractModel> {

    protected Long id;

    public ResponseWaiter() {
    }

}
