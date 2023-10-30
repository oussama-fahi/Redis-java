import java.io.Serializable;

public class GenericModel<T> implements Serializable {
    private T data;

    public GenericModel(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}