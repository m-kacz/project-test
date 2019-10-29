package com.nationwide.shoppinglist;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@Repository
public interface TestRepo extends JpaRepository<Test1, Integer>{
	public ArrayList<Test1> findAll();
	public ArrayList<Test1> findByPurchased(boolean purchased);
//	public String saveData(Test1 Ref);
//	public ArrayList<Test1> findByOrderByTotalAsc();
//	public ArrayList<Test1> findByOrderByTotalDes();
//	public School findByRegno(int X);
//	public ArrayList<School> findByName(String X);
//	public ArrayList<School> findByDept(String Dept);
//	public ArrayList<School> findByDeptAndSubject(String Dept, String Subject);
//	public ArrayList<School> findByRegnoOrMarks(int regno, int marks);
//	public ArrayList<School> findByMarksGreaterThan(int m);
//	public ArrayList<School> findByMarksBetween(int m1, int m2);
//	public ArrayList<School> findByMarksGreaterThanEqual(int A);
}






//	public void saveData2(int regno, String name, int marks, String subject, String dept);
