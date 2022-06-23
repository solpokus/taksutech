package id.ajr.taksutech.db.mysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

@NoRepositoryBean
interface BaseRepository<T, ID extends Serializable> extends JpaRepository<T, ID> {
}
