package com.capgemini.shoppingclient.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.capgemini.shoppingclient.entities.Item;
import com.capgemini.shoppingclient.entities.Product;

@Controller
public class ShoppingClientController {

	List<Item> cartItems = new ArrayList<>();
	Random r;

	public ShoppingClientController() {
		super();
		r = new Random();
	}
	
	@GetMapping("/addtocart")
	public String addToCart(@RequestParam int productId, HttpServletRequest request) {
		HttpSession session;
		session = request.getSession();
		session.setAttribute("customerId", 12345);
		Item item = new Item(r.nextInt(50)+500, productId, 1, 100);
		cartItems.add(item);
		session.setAttribute("itemNum", cartItems.size());
		return "index";
	}
	
	@GetMapping("/cart")
	public String showCart(Model model,HttpServletRequest request) {
		HttpSession session;
		session = request.getSession();
		//session.setAttribute("customerId", 12345);
		//Item item = new Item(r.nextInt(50)+500, productId, 1, 100);
		//cartItems.add(item);
		//session.setAttribute("itemNum", cartItems.size());
		session.setAttribute("cartItems", cartItems);
		return "cart";
	}
	
	
	
	
	
}
