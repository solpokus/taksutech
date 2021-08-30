package id.ajr.taksutech.db.mysql.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import id.ajr.taksutech.db.mysql.model.TbMasterStatus;

public interface MasterStatusRepository extends JpaRepository<TbMasterStatus, Integer> {
//public interface MasterStatusRepository extends CrudRepository<TbMasterStatus, Integer>{
	
//	@Query(value = "select * from taksutech.tb_master_status where tbms_id (:tbmsId) order by tbms_id asc", nativeQuery = true)
//	List<TbMasterStatus> getById(Integer tbmsId);
	
//	Optional<TbMasterStatus> findByTbmsEn(String tbmsEn);
	
//	List<TbMasterStatus> findBytbmsEn(String tbmsEn);
	
//	TbMasterStatus findByTbmsId(Integer tbmsId);

}
