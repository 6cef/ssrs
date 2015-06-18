package org.springframework.security.saml.web;

import java.security.Principal;

import javax.servlet.http.HttpServletRequest;

import org.springframework.security.web.util.RequestMatcher;

public class ServicesRequestMatcher implements RequestMatcher {

	@Override
	public boolean matches(HttpServletRequest req) {
		Principal p = req.getUserPrincipal();
		System.out.println(req.getUserPrincipal().getName());
		return false;
	}
}