package com.example.demo.controller;

import java.io.File;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import com.example.demo.repository.DanhsachDAO;
import com.example.demo.entity.Danhsach;
import com.example.demo.entity.ReadFromExcelFile;
import com.example.demo.entity.MyFile;

@Controller
public class upLoad {
	
	@RequestMapping(value = "/uploadFile",method = RequestMethod.GET)
	private String quanlytaikhoan() {
		return "index";
	}
	
	@RequestMapping(value = "/uploadFile", method = RequestMethod.POST)
	public String uploadFile(MyFile myFile, Model model) {
		 try {
	            MultipartFile multipartFile = myFile.getMultipartFile();
				String fileName = "C:/Users/Trung Chien/Desktop/" + multipartFile.getOriginalFilename(); 
				List<Danhsach> listBooks = new ReadFromExcelFile().readBooksFromExcelFile(fileName);
	            
				DanhsachDAO bookDAO = new DanhsachDAO();
	            
	            bookDAO.insertListBooks(listBooks);
	 	        model.addAttribute("message1", "Upload Thanh cong");
	 	       	 System.out.print("Thành công");       	     
		} catch (Exception e) {
			//e.printStackTrace();
			model.addAttribute("message1",  "Upload Thất bại");
			System.out.print("Thất bại");
		}
		 return "Result";
	}
	
}