package com.transport.www;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TransportController
{
	@GetMapping("/Transport")
	public String getDetails(TransportModell  tm)
	{
		return "form.html";
	}
}
