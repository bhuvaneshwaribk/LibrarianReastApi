package com.bitlabs.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.bitlabs.demo.model.Book;
import com.bitlabs.demo.model.Student;
import com.bitlabs.demo.service.LibrarianService;


@RestController
@RequestMapping("/librarianService")
public class LibrarianController {

	@Autowired
	private RestTemplate restTemplate;
	@Autowired
	private LibrarianService librarianservice;
	
	
	@GetMapping("/getAllBook")
	public List<Book> getAllBook(){
		Book[] books=restTemplate.getForObject("http://bookservice/bookService/getAll",Book[].class);
		List al=Arrays.asList(books);
		return al;
	}
	
	@DeleteMapping("/deleteBook/{id}")
	public String delete(@PathVariable Integer id) {
		restTemplate.delete("http://bookservice/bookService/deleteBookById/"+id, String.class);
		return "deleted successfully";
		
	}
	
	@DeleteMapping("/deleteStudent/{id}")
	public String deleteStudent(@PathVariable Integer id) {
		restTemplate.delete("http://studentservice/studentService/deleteStudentById/"+id, String.class);
		return "deleted successfully";
		
	}
	
	@PostMapping("/addStudent")
	public String addStudent(@RequestBody Student student) {
		
		String result=restTemplate.postForObject("http://studentservice/studentService/addStudent", student, String.class);
	    return result;

	}
	
	@PostMapping("/addBook")
	public String addBook(@RequestBody Book book) {
		
		String result=restTemplate.postForObject("http://bookservice/bookService/addBook", book, String.class);
	    return result;

	}
}