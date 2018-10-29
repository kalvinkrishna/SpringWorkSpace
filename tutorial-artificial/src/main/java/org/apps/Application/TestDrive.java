package org.apps.Application;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class TestDrive {
	@RequestMapping(value="/path", method=RequestMethod.GET)
	public String coba() {
		return "coba";
	}
}
