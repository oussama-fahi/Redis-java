import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenericModelRepository<T> extends CrudRepository<GenericModelRepository<T>, String> {
    // Vous pouvez ajouter des méthodes spécifiques au besoin.
}