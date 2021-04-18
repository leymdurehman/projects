package com.techelevator.instapic.api.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.nio.file.Paths;

import org.apache.commons.io.FileUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.web.util.UriComponentsBuilder;

import com.techelevator.instapic.api.model.MyObject;

@RestController
@CrossOrigin
@RequestMapping("/api/photos")
public class PhotosController {

	// This makes the POST:/api/photos endpoint accept the Content-Type header value
	// multipart/form-data
	@PostMapping(consumes = "multipart/form-data")
	public ResponseEntity<Void> uploadPhoto(@RequestParam("file") MultipartFile file) throws Exception {

		// Generate the location where the file will be stored. This will create a folder called temp/uploads in the home directory of the user. (~)
		// Eventually, this should be referenced from a properties/configuration file, but this will suffice for our example.
		String filePath = Paths.get(getUploadsDirectory().getPath(), file.getOriginalFilename()).toString();
		
		// The InputStream will be used to read the uploaded file, and the output stream will be used to save the file to disk.
		try (InputStream in = file.getInputStream();
				OutputStream out = new FileOutputStream(filePath)) {
			// Copy the input file to the output file.
			FileCopyUtils.copy(in, out);
		} catch (IOException ex) {
			throw ex;
		}

		// Specify the location where the new image can be accessed from. This builds up
		// the URI based on the path of the current request.
		URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/" + file.getOriginalFilename()).build()
				.toUri();
		UriComponentsBuilder.fromUri(uri);
		
		// Return the created status code with the Location header pointing to location
		// of the new file.
		return ResponseEntity.created(uri).build();
	}
	
	@PostMapping(consumes = "multipart/form-data", path = "/with-data")
	public ResponseEntity<Void> addPhotoWithData(@RequestPart("test") MyObject test,
			@RequestParam("file") MultipartFile file) {
		// Specify the location where the new image can be accessed from. This builds up
		// the URI based on the path of the current request.
		System.out.println(test.getId() + " " + test.getName());
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/").build()
				.toUri();
		UriComponentsBuilder.fromUri(uri);

		// Return the created status code with the Location header pointing to location
		// of the new file.
		return ResponseEntity.created(uri).build();
	}

	private File getUploadsDirectory() throws FileNotFoundException {
		String uploadsPath = Paths.get(FileUtils.getUserDirectoryPath(), "temp", "uploads").toString();
		File dir = new File(uploadsPath);
		if (!dir.exists()) {
			dir.mkdirs();
		}
		return dir;
	}

}
