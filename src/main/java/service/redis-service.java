import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GenericModelService<T> {
    private final GenericModelRepository<T> repository;

    @Autowired
    public GenericModelService(GenericModelRepository<T> repository) {
        this.repository = repository;
    }

    public GenericModel<T> saveGenericModel(String key, T data) {
        GenericModel<T> model = new GenericModel<>(data);
        return repository.save(model);
    }

    public GenericModel<T> getGenericModel(String key) {
        return repository.findById(key).orElse(null);
    }

    public void deleteGenericModel(String key) {
        repository.deleteById(key);
    }
}