package monitorCore.Repository;

import monitorCore.Model.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

@NoRepositoryBean
public interface AnimalContestRepository<ID extends Serializable,T extends BaseEntity> extends JpaRepository<T,ID> {
}
