package id.ajr.taksutech.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import id.ajr.taksutech.member.model.ResponseGetMember;
import id.ajr.taksutech.member.process.MemberProcess;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("/member")
@Api(description = "APIs Member for Member Processing", tags = { "Member" })
public class MemberController {

	private static final Logger logger = LogManager.getLogger(MemberController.class);

	@Autowired
	MemberProcess memberProcess;

	@GetMapping("/")
	public HttpEntity healthCheck() {
		// TODO Auto-generated method stub
		return new ResponseEntity<>("Member API", HttpStatus.OK);
	}

	@GetMapping("/getMemberById")
	public HttpEntity getId(
			@ApiParam(value = "Request Id", required = true) @RequestHeader(value = "requestId", required = false) String requestId,
			@ApiParam(value = "Request Time", required = true) @RequestHeader(value = "requestTime", required = false) String requestTime,
			@ApiParam(value = "Member Id", required = true) @RequestHeader(value = "memberId", required = false) Integer memberId) {
		HttpStatus httpStatus = null;

		try {
			logger.info("Get Member by Id");

			ResponseGetMember response = memberProcess.getMemberById(memberId);

			httpStatus = HttpStatus.OK;

			return new ResponseEntity<>(response, httpStatus);

		} catch (Exception e) {
			logger.error("Get Member by Id - Exception : " + e.getMessage());
			e.printStackTrace();

			httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
		}

		return new ResponseEntity<>("eVoucher API", httpStatus);
	}
}
