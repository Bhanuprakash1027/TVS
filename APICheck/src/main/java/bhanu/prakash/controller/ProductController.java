package bhanu.prakash.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import bhanu.prakash.model.Product;
import bhanu.prakash.service.IproductService;

@RequestMapping("/Product")
@RestController
public class ProductController {

	@Autowired
	private IproductService service;
	
	@PostMapping("/save")
	public ResponseEntity<String> saveproduct(
			@RequestBody Product product
			)
	{ ResponseEntity<String> resp = null;
	try {
		
	} catch (Exception e) {
		e.printStackTrace();
	}
		return resp;
	}
}
