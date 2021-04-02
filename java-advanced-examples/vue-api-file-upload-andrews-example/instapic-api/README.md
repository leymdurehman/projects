# Instapic REST API

This project is being created to provide an example API that will allow people to upload images (and potentially other files) in a Spring MVC REST API.

## Key Notes

To implement your own REST API, you will need to follow the following steps:

- Modify the pom.xml file to include dependencies for commons-io and commons-fileupload.

```xml
		<dependency>
			<groupId>commons-fileupload</groupId>
			<artifactId>commons-fileupload</artifactId>
			<version>1.4</version>
		</dependency>
		<dependency>
			<groupId>commons-io</groupId>
			<artifactId>commons-io</artifactId>
			<version>2.6</version>
		</dependency>
```

- Next, you will need to add a bean configuration to the springmvc-servlet.xml file for the Multipart Resolver. This allows Spring MVC to respond to the `multipart/form-data` value that should be specified by the client in the Content-Type header.
- Additional notes are included in the PhotosController.java file. 