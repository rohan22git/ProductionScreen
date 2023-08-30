package com.bgc.controller;


import java.io.File;
import java.io.IOException;
import java.security.Timestamp;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.bgc.model.FileInfo;
import com.bgc.model.Screenmodel;
import com.bgc.repository.Screenrepository;
import com.bgc.service.Screenservice;

@RestController
public class Screencontroller {
	@Autowired
	private Screenservice screenservice;
	
	@Autowired
	private Screenrepository screenrepository;
	
//	@PostMapping("/display")
//	public Screenmodel scontroller(@RequestBody Screenmodel scmodel) {
//		 //return "CREATED TABLE dbo_product_classification_lookup and details are added";
//		return screenservice.scontroller(scmodel);
//	}
	
	
	@PostMapping("/display")
	public String scontroller(  Screenmodel scmodel) {  //@RequestBody Screenmodel scmodel
		try {
			screenservice.scontroller(scmodel);
			return "CREATED TABLE dbo_product_classification_lookup and details are added";
		//return screenservice.scontroller(scmodel);
	}catch(Exception e) {
		System.out.println("FAILED CREATING TABLE dbo.product_classification_lookup"+e.getMessage());
		}
		return null;
	}
	
	
	@GetMapping("/getdata")
	public List<Screenmodel>getDetails(){
		return screenservice.getAllData();
		
	}
	
	 @PutMapping("/{id}")
	public ResponseEntity<Screenmodel>updateForm(@PathVariable Integer id, @RequestBody Screenmodel scmodel){
		 Screenmodel updateForm = screenrepository.findById(id).orElseThrow();
		 updateForm.setProductSubType(scmodel.getProductSubType());
		 updateForm.setAmountType(scmodel.getAmountType());
		 updateForm.setTargetSystem(scmodel.getTargetSystem());
		 updateForm.setTargetTradeSubType(scmodel.getTargetTradeSubType());
		 
		 screenrepository.save(updateForm);		 
		return ResponseEntity.ok(updateForm);
		
	}
	
	@Controller
	public class ScreenPage {
		@GetMapping("/screen")
		public String bgc() {
			return "screen.html"; 				
		}
	}
//	@PostMapping(value="/getFileInfo", consumes = MediaType.MULTIPART_FORM_DATA_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
//	public FileInfo getFileInfo(@RequestParam("file") MultipartFile userfile) throws IOException {
//		FileInfo fileInfo = new FileInfo();
//		fileInfo.setFileName(userfile.getOriginalFilename());
//		fileInfo.setContentType(userfile.getContentType());
//		fileInfo.setFileLength(userfile.getSize());
//		fileInfo.setFileEmpty(userfile.isEmpty());
//		fileInfo.setReadble(userfile.getResource().isReadable());
//		fileInfo.setFileData(userfile.getBytes());
//			
//		return fileInfo;
//	}
	
	@PostMapping(value="/fileUpload",consumes=MediaType.MULTIPART_FORM_DATA_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public FileInfo fileUploadController(@RequestParam("file") MultipartFile userfile) throws IOException {
		
		FileInfo fileInfo = new FileInfo();
		fileInfo.setFileName(userfile.getOriginalFilename());
		fileInfo.setContentType(userfile.getContentType());
		fileInfo.setFileLength(userfile.getSize());
		fileInfo.setFileEmpty(userfile.isEmpty());
		fileInfo.setReadble(userfile.getResource().isReadable());
		fileInfo.setFileData(userfile.getBytes());
		
		try {
		String filepath="D:\\FilesStores\\";   //stores the file in that path 
		String filename =userfile.getOriginalFilename();
		String entireFilePath=filepath+filename;
		File f= new File(entireFilePath); // If file already exist in server take backup and upload new file
		long timestamp =System.currentTimeMillis()/1000L;
		String newFileName = entireFilePath.replace(".", "_"+timestamp+".");
		File dempfile = new File(newFileName);
		f.renameTo(dempfile);	
		userfile.transferTo(f); // Uploaded file comes here for that path
		fileInfo.setFileUploadStatus("SUCCESS");
		}catch (Exception e) {
			System.out.println(e);
			fileInfo.setFileUploadStatus("Failed due to"+e.getMessage());
		}
		return fileInfo;
	}
	
	
}
 