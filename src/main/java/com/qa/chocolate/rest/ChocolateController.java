package com.qa.chocolate.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qa.chocolate.domain.Chocolate;

@RestController
public class ChocolateController {

	private List<Chocolate> choco = new ArrayList<>();

	// response entity -> allows us to configure the status code of the response
	// (example in POST below)

	// CRUD

	// create - POST
	// Response to return instead of the default 200: 201 - created
	@PostMapping("/createChoco")
	public ResponseEntity<Chocolate> createChoco(@RequestBody Chocolate c) {
		// service -> create
		this.choco.add(c);
		Chocolate newChoco = this.choco.get(this.choco.size() - 1);// could also write this directly within response
																	// entity brackets below instead of creating the
																	// object
		return new ResponseEntity<Chocolate>(newChoco, HttpStatus.CREATED);
	}

	// insert into chocolate(name, brand, ...) values("dairy milk", "cadbury", ...)

	// read - GET
	@GetMapping("/getChoco")
	public List<Chocolate> getChoco() {
		return this.choco;
	}

	// read by ID - GET
	@GetMapping("/getOne/{id}")
	public Chocolate getOne(@PathVariable int id) {
		return this.choco.get(id);
	}

	// update - PUT/PATCH
	// create, read by id
	@PutMapping("/updateChoco/{id}")
	public Chocolate updateChoco(@PathVariable int id, @RequestBody Chocolate ch) {
		// remove existing choco with id
		// this.choco.remove(id);
		// add a new choco in its place
		// this.choco.add(id, ch);

		// combines remove and add which are commented out above
		this.choco.set(id, ch);
		// return updated choco
		return this.choco.get(id);
	}

	// delete - DELETE
	@DeleteMapping("/removeChoco/{id}")
	public Chocolate removeChoco(@PathVariable int id) {
		return this.choco.remove(id);
	}
}
