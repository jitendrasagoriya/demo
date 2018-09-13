package com.jitendra.example.jitendrarest.endpoint;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping(value="api/")
public class HomeEndpoint {
	
	    @GetMapping(path="name")
		public String getText() {
			return "jitendra";
		}

}
