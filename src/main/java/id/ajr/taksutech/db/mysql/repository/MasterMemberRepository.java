package id.ajr.taksutech.db.mysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import id.ajr.taksutech.db.mysql.model.TbMasterMember;

public interface MasterMemberRepository extends JpaRepository<TbMasterMember, Integer> {

}
