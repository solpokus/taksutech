package id.ajr.taksutech.db.mysql.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import id.ajr.taksutech.db.mysql.model.TbMasterStatus;

@Repository
public interface MasterStatusRepository extends BaseRepository<TbMasterStatus, Integer> {
//public interface MasterStatusRepository extends CrudRepository<TbMasterStatus, Integer>{
	
//	@Query(value = "select * from taksutech.tb_master_status where tbms_id (:tbmsId) order by tbms_id asc", nativeQuery = true)
//	List<TbMasterStatus> getById(Integer tbmsId);
	
//	Optional<TbMasterStatus> findByTbmsEn(String tbmsEn);
	
//	List<TbMasterStatus> findBytbmsEn(String tbmsEn);
	
//	TbMasterStatus findByTbmsId(Integer tbmsId);

}
