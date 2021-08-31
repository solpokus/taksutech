package id.ajr.taksutech.controller;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/store")
@Api(description = "APIs eStore for Store Processing", tags = { "eStore" })
public class StoreController {
	
	@GetMapping("/")
	public HttpEntity healthCheck() {
		// TODO Auto-generated method stub
		return new ResponseEntity<>("eStore API", HttpStatus.OK);
	}
}
