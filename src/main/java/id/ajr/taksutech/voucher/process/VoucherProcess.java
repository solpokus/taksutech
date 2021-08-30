package id.ajr.taksutech.voucher.process;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import id.ajr.taksutech.db.mysql.model.TbMasterStatus;
import id.ajr.taksutech.db.mysql.repository.MasterStatusRepository;

@Service
public class VoucherProcess {
	private Gson gson = new GsonBuilder().create();

	private static final Logger logger = LogManager.getLogger(VoucherProcess.class);
	
	@Autowired
	MasterStatusRepository masterStatusRepository;
	
	public void getStatus(Integer statusId, String tbmsEn) {

		Optional<TbMasterStatus> optMasterStatus = dbFindMasterStatusById(statusId);
		
		TbMasterStatus masterStatus = new TbMasterStatus();
		masterStatus = optMasterStatus.get();

		logger.info("masterStatus " + gson.toJson(masterStatus));

//		logger.info("masterStatus all " + gson.toJson(masterStatusRepository.findAll()));
		
		logger.info("masterStatus 1 " + getStatusById(1));
		
		
		
//		System.out.println("\nfindAll()");
//		masterStatusRepository.findAll().forEach(x -> System.out.println(x));
//
//		System.out.println("\nfindById(1)");
//		masterStatusRepository.findById(1).ifPresent(x -> System.out.println(x));
//
//		System.out.println("\nfindByName('Node')");
//		masterStatusRepository.findByTbmsEn("Node").forEach(x -> System.out.println(x));
	}
	
	private String getStatusById(Integer tbmsId) {
		Optional<TbMasterStatus> optMasterStatus = dbFindMasterStatusById(tbmsId);
		
		TbMasterStatus masterStatus = new TbMasterStatus();
		masterStatus = optMasterStatus.get();
		
		return masterStatus.getTbms_en();
		
	}
	
	private Optional<TbMasterStatus> dbFindMasterStatusById(Integer tbms_id) {
		return masterStatusRepository.findById(tbms_id);
	}

}
