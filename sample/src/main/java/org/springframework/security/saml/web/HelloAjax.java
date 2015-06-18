package org.springframework.security.saml.web;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/ajax")
public class HelloAjax {

	@RequestMapping(value = "/hello")
	public String hello(
			@RequestHeader(value = "Accept") String accept,
			@RequestHeader(value = "Accept-Language") String acceptLanguage,
			@RequestHeader(value = "User-Agent", defaultValue = "foo") String userAgent,
			HttpServletResponse response) {

		System.out.println("accept: " + accept);
		System.out.println("acceptLanguage: " + acceptLanguage);
		System.out.println("userAgent: " + userAgent);

		return null;
	}

}
