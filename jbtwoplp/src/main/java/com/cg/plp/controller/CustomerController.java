/*
 * package com.cg.plp.controller;
 * 
 * import java.util.List;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.web.bind.annotation.GetMapping; import
 * org.springframework.web.bind.annotation.PostMapping; import
 * org.springframework.web.bind.annotation.RequestMapping; import
 * org.springframework.web.bind.annotation.RequestParam; import
 * org.springframework.web.bind.annotation.RestController; import
 * org.springframework.web.servlet.ModelAndView;
 * 
 * import com.cg.CustomerProducts.model.Invice; import
 * com.cg.CustomerProducts.service.InvoiceServiceImpl; import
 * com.cg.plp.model.Customer; import com.cg.plp.model.Order; import
 * com.cg.plp.service.CartServiceImpl; import
 * com.cg.plp.service.CustomerServiceImpl; import
 * com.cg.plp.service.IOrderServiceImpl; import
 * com.cg.plp.service.IShippingServiceImpl;
 * 
 * public class CustomerController {
 * 
 * @RestController
 * 
 * @RequestMapping("/customer") public class Controller { String temp;
 * 
 * @Autowired private CustomerServiceImpl service;
 * 
 * @Autowired private IShippingServiceImpl service1;
 * 
 * @Autowired private CartServiceImpl service23;
 * 
 * @Autowired private IOrderServiceImpl service32;
 * 
 * @Autowired private InvoiceServiceImpl service45;
 * 
 * @PostMapping("/saveee") public ModelAndView save(@RequestParam String
 * customername,@RequestParam String customeraddress,@RequestParam String
 * email, @RequestParam String pass ) { Customer customerlist = new Customer();
 * customerlist.setCustomername(customername);
 * customerlist.setCustomeraddress(customeraddress);
 * customerlist.setEmail(email); customerlist.setPass(pass);
 * customerlist.setBalance(0);
 * 
 * service.save(customerlist); List<Customer> customerlist1 = service.findAll();
 * ModelAndView modelAndView = new ModelAndView("customerlist");
 * modelAndView.addObject("CUSTOMERLIST", customerlist1); return modelAndView; }
 * 
 * @PostMapping("/saveee1") public ModelAndView save() {
 * 
 * List<Customer> customerlist1 = service.findAll(); ModelAndView modelAndView =
 * new ModelAndView("customerlist"); modelAndView.addObject("CUSTOMERLIST",
 * customerlist1); return modelAndView; }
 * 
 * @PostMapping("/manager") public ModelAndView ManagerLogin(@RequestParam
 * String name, @RequestParam String password) { ModelAndView modelAndView;
 * String a = name; String b = password;
 * 
 * if (a.equals("Sreenath3") && b.equals("Sree@123")) { modelAndView = new
 * ModelAndView("addcustomer"); return modelAndView; } else { modelAndView = new
 * ModelAndView("managernotpresent"); } return modelAndView; }
 * 
 * @PostMapping("checkuser") public ModelAndView requestLogin(@RequestParam
 * String email, @RequestParam String password) { ModelAndView modelAndView;
 * temp=email;
 * 
 * Customer cust = service.findByEmailAndPass(email, password); if (cust ==
 * null) { modelAndView = new ModelAndView("noidfound"); return modelAndView; }
 * else { modelAndView = new ModelAndView("home"); return modelAndView; } }
 * 
 * @GetMapping("/balance") public ModelAndView getbalancefromemail() { Customer
 * customer = service.findByEmail(temp); int balance = customer.getBalance();
 * ModelAndView modelAndView = new ModelAndView("showbalance");
 * 
 * modelAndView.addObject("AA", balance); return modelAndView; }
 * 
 * @GetMapping("/addquery") public ModelAndView getqueryfromemail() { Customer
 * customer = service.findByEmail(temp);
 * 
 * ModelAndView modelAndView = new ModelAndView("showquery");
 * 
 * 
 * return modelAndView; }
 * 
 * 
 * @PostMapping("/cart") public ModelAndView CartAdd(@RequestParam Integer
 * productId,@RequestParam String productName,@RequestParam Integer
 * productPrice,@RequestParam Integer merchantId,@RequestParam Integer
 * discountedPrice,@RequestParam Integer quantity) { Invice cart=new Invice();
 * cart.setProductId(productId); cart.setProductName(productName);
 * cart.setProductPrice(productPrice); cart.setMerchantId(merchantId);
 * cart.setDiscountedPrice(discountedPrice); cart.setQuantity(quantity);
 * service23.save(cart); List<Invice> cart1=service23.findAll(); ModelAndView
 * modelAndView = new ModelAndView("cartsave"); modelAndView.addObject("AA",
 * cart1); return modelAndView;
 * 
 * }
 * 
 * @PostMapping("/order") public ModelAndView CartAdd(@RequestParam Integer
 * serial) { Invice cart2=service23.findById(serial); Order order=new Order();
 * String name=cart2.getProductName(); int quantity=cart2.getQuantity(); int
 * price=cart2.getProductPrice(); int
 * discountedprice=cart2.getDiscountedPrice();
 * 
 * order.setDiscountedprice(discountedprice); order.setProductprice(price);
 * order.setProductquantity(quantity); order.setProductname(name);
 * service32.save(order);
 * 
 * 
 * 
 * 
 * 
 * ModelAndView modelAndView = new ModelAndView("ordersave");
 * modelAndView.addObject("AA", order); return modelAndView;
 * 
 * }
 * 
 * }
 */