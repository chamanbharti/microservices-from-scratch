package com.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.CatalogItem;


@RestController
@RequestMapping("/catalog")
public class MovieCatalogController {

	@GetMapping("/{userId}")
	List<CatalogItem> getCatalog(@PathVariable("userId") String userId){
		return Collections.singletonList(
					new CatalogItem("Hello world", "Test", "4")	
				);
	}
}
