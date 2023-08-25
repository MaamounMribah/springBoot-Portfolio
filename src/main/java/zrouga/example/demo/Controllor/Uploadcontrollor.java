package zrouga.example.demo.Controllor;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import zrouga.example.demo.Services.CloudinaryService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class Uploadcontrollor {
	@Autowired
	CloudinaryService cloudinaryService;

	@PostMapping("/upload")
	public Object uploadexamen(@RequestParam("files") MultipartFile Files) throws IOException {
		@SuppressWarnings("rawtypes")
		Map result = cloudinaryService.upload(Files);
		Map<String, String> tempMap = new HashMap<String, String>();
		tempMap.put("url", result.get("url").toString());

		return tempMap;
	}}