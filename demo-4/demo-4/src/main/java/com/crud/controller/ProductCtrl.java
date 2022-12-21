package com.crud.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.model.Product;
import com.crud.repository.ProductDao;

@Controller
//@RestController
//@RequestMapping("/")
public class ProductCtrl {

	@Autowired
	private ProductDao productDao;

	// Get all products
	@GetMapping("/products")
	public String getProducts(Model m) {
		m.addAttribute("products", this.productDao.findAll());
		return "index";
	}

//	// Get a product
//	@GetMapping("products/{id}")
//	public Optional<Product> getProduct(@PathVariable int id){
//		return this.productDao.findById(id);
//	}

	// Add product form
	@GetMapping("/products/new")
	public String addProductForm(Model m) {
		Product product = new Product();
		m.addAttribute("product", product);
		return "add";
	}

	// Add a product
	@PostMapping("/products")
	public String addProduct(@ModelAttribute Product product) {
		productDao.save(product);
		return "redirect:/products";
	}

//	// Update a product
//	@PutMapping("products")
//	public Product updateProduct(@RequestBody Product product) {
//		this.productDao.save(product);
//		return product;
//	}
//	
//	// Delete a product
//	@DeleteMapping("products/{id}")
//	public String deleteProduct(@PathVariable int id) {
//		this.productDao.deleteById(id);
//		return "Successfully Deleted !!!";
//	}

}
