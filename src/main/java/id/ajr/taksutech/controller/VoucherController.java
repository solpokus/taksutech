package id.ajr.taksutech.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import id.ajr.taksutech.db.mysql.model.TbMasterStatus;
import id.ajr.taksutech.db.mysql.repository.MasterStatusRepository;
import id.ajr.taksutech.voucher.process.VoucherProcess;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("/voucher")
@Api(description = "APIs eVoucher for Voucher Processing", tags = { "eVoucher" })
public class VoucherController {

	private static final Logger logger = LogManager.getLogger(VoucherController.class);
	private Gson gson = new GsonBuilder().create();

	@Autowired
	VoucherProcess voucherProcess;
	

	@GetMapping("/")
	public HttpEntity healthCheck() {
		// TODO Auto-generated method stub
		return new ResponseEntity<>("eVoucher API", HttpStatus.OK);
	}

	@PostMapping("/getId")
	public HttpEntity getId(
			@ApiParam(value = "Request Id", required = true) @RequestHeader(value = "requestId", required = false) String requestId,
			@ApiParam(value = "Request Time", required = true) @RequestHeader(value = "requestTime", required = false) String requestTime,
			@ApiParam(value = "Status Id", required = true) @RequestHeader(value = "statusId", required = false) Integer statusId,
			@ApiParam(value = "English", required = true) @RequestHeader(value = "tbmsEn", required = false) String tbmsEn) {
		HttpStatus httpStatus = null;

		HttpEntity<ResponseBody> response = null;

		try {
			logger.info("Batch Publish Data Stock Start");

			voucherProcess.getStatus(statusId, tbmsEn);

			httpStatus = HttpStatus.OK;
//			return new ResponseEntity<>("eVoucher API", httpStatus);

		} catch (Exception e) {
			logger.error("Batch Publish Data Stock - Exception : " + e.getMessage());
			e.printStackTrace();

			httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
		}

		return new ResponseEntity<>("eVoucher API", httpStatus);
	}
}
