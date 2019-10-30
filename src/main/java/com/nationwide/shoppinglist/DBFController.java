package com.nationwide.shoppinglist;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DBFController {
	@Autowired
	private TestRepo repo;
	
	@CrossOrigin
	@GetMapping("/showall")
	public ArrayList<Test1> showAll(){
		return repo.findAll();
	}
	@GetMapping("/filterpurchased/{purchased}")
	public ArrayList<Test1>filteringDepartments(@PathVariable boolean purchased){
		return repo.findByPurchased(purchased);
	}
	
	@PostMapping("/save")
	public String saveData(@RequestBody Test1 Ref) {

			repo.save(Ref);
			return "Data saved.";
		}
//	@PostMapping("/save2/{item}/{quantity}/{price}/{total}/{purchased}")
//	public void saveData2(
//			@PathVariable String item,
//			@PathVariable int quantity,
//			@PathVariable float price,
//			@PathVariable float total,
//			@PathVariable boolean purchased) {
//		Test1 Ref = new Test1();
//		Ref.setItem(item);
//		Ref.setQuantity(quantity);
//		Ref.setPrice(price);
//		Ref.setTotal(total);
//		Ref.setPurchased(purchased);
//		repo.save(Ref);
//	}
	
//	@GetMapping("/sortbyhigh")
//	public ArrayList<Test1> sortByHigh(){
//		return repo.findByOrderByTotalAsc();
//	}
//	@GetMapping("/sortbylow")
//	public ArrayList<Test1> sortByLow(){
//		return repo.findByOrderByTotalDes();
//	}
//	@GetMapping("/showreg/{R}")
//	public School showRegno(@PathVariable int R) {
//		return repo.findByRegno(R);
//	}
//	@GetMapping("/findbyname/{N}")
//	public ArrayList<School> findByName(@PathVariable String N){
//		return repo.findByName(N);
//	}
//	@GetMapping("/filterdept1/{department}/{subject}")
//	public ArrayList<School>filteringDepartments(@PathVariable String department, @PathVariable String subject){
//		return repo.findByDeptAndSubject(department, subject);
//	}
//	@GetMapping("/findbyregormarks/{regormarks}")
//	public ArrayList<School>findByRegnoOrMarks(@PathVariable int reg, @PathVariable int marks){
//		return repo.findByRegnoOrMarks(reg, marks);
//	}
//	@GetMapping("/marksgreaterthan/{marks}")
//	public ArrayList<School>marksGreaterThan(@PathVariable int marks){
//		return repo.findByMarksGreaterThan(marks);
//	}
//	@GetMapping("/marksbetween/{marks1}/{marks2}")
//	public ArrayList<School>marksBetween(@PathVariable int marks1, @PathVariable int marks2){
//		return repo.findByMarksBetween(marks1, marks2);
//	}
//	@GetMapping("/marksgreaterthanequal/{marks}")
//	public ArrayList<School>marksGreaterThanEqual(@PathVariable int marks){
//		return repo.findByMarksGreaterThanEqual(marks);
//	}

//	Test1 s = repo.findByRegno(Ref.getRegno());
//	if(s != null) {
//		return "Sorry, this user already exists.";
//	}	
//	
//	if(Ref.getRegno()==15) {
//		return "Sorry, this user already exists.";
//	}
//	else {

//	}
}
