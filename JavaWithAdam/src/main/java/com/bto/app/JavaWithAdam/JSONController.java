//package com.bto.app.JavaWithAdam;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//@Controller
//@RequestMapping("/api/hello")
//public class JSONController {
//
//	@RequestMapping(value = "{name}", method = RequestMethod.GET)
//	public @ResponseBody
//	ApiName getNameInJSON(@PathVariable String name) {
//
//		ApiName nameFirst = new ApiName();
//		nameFirst.setName(name);
//
//		return nameFirst;
//
//	}
//
// }