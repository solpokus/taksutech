package id.ajr.taksutech.member.process;

import java.util.Date;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import id.ajr.taksutech.db.mysql.model.TbMasterMember;
import id.ajr.taksutech.db.mysql.repository.MasterMemberRepository;
import id.ajr.taksutech.member.model.ResponseGetMember;

@Service
public class MemberProcess {

	private Gson gson = new GsonBuilder().create();

	private static final Logger logger = LogManager.getLogger(MemberProcess.class);

	@Autowired
	MasterMemberRepository masterMemberRepository;

	public ResponseGetMember getMemberById(Integer tbmmId) {

		ResponseGetMember responseGetMember = new ResponseGetMember();

		Optional<TbMasterMember> optMasterMember = dbFindMasterMemberById(tbmmId);

		TbMasterMember masterMember = new TbMasterMember();
		masterMember = optMasterMember.get();

		responseGetMember.setTbmm_create_date(masterMember.getTbmm_create_date());
		responseGetMember.setTbmm_update_date(masterMember.getTbmm_update_date());
		responseGetMember.setTbmm_status(masterMember.getTbmm_status());
		responseGetMember.setTbmm_email(masterMember.getTbmm_email());
		responseGetMember.setTbmm_firstname(masterMember.getTbmm_firstname());
		responseGetMember.setTbmm_lastname(masterMember.getTbmm_lastname());
		responseGetMember.setTbmm_gender(masterMember.getTbmm_gender());
		responseGetMember.setTbmm_phone(masterMember.getTbmm_phone());
		responseGetMember.setTbmm_dob(masterMember.getTbmm_dob());
		responseGetMember.setTbmm_last_login(masterMember.getTbmm_last_login());

		return responseGetMember;
	}

	private Optional<TbMasterMember> dbFindMasterMemberById(Integer tbms_id) {
		return masterMemberRepository.findByTbmmId(tbms_id);
	}

	public void saveNewMember() {
		saveOrUpdateMember();
	}

	private void saveOrUpdateMember() {
		TbMasterMember masterMember = new TbMasterMember();

		masterMember.setTbmm_status(1);
		masterMember.setTbmm_email("member5@gmail.com");
		masterMember.setTbmm_firstname("member");
		masterMember.setTbmm_lastname("5");
		masterMember.setTbmm_gender("M");
		masterMember.setTbmm_phone("082189234555");
		masterMember.setTbmm_dob(new Date());

		masterMemberRepository.saveAndFlush(masterMember);
	}

}
