package org.practice;

import java.net.URI;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;

public class FileSystemDemo {

	public static void main(String[] args) throws Exception {
		/*Case 1*/
		// Create a new file system by creating object of FileSystem class using getDefault() method
		FileSystem fileSystem = FileSystems.getDefault();
		System.out.println("FileSystem object created Succssfully : " + fileSystem);

		// Printing the underlying file stores of this FileSystem using for each loop
		for (FileStore store : fileSystem.getFileStores()) {
			System.out.println(store.toString());
		}
		
		// Printing the root directories of this FileSystem using for each loop
		for (Path root : fileSystem.getRootDirectories()) {
			System.out.println(root.toString());
		}
		
		/*Case 2*/
		Path zipPath = Paths.get("C:/Users/ujjwal/Downloads/Java 10 to 14.zip");
		URI uri = new URI("jar:file", zipPath.toUri().getPath(), null);
		FileSystem fileSystem2 = FileSystems.newFileSystem(uri, new HashMap<String,String>());
		if(fileSystem2.isOpen()) {
			System.out.println("File System is open");
		} else {
			System.out.println("File System is closed");
		}
		
		/*Case 3*/
		FileSystem fileSystem3 = FileSystems.getFileSystem(uri);
		System.out.println("FileSystem3 created : "+fileSystem3);
		
		for (FileStore store : fileSystem3.getFileStores()) {
			System.out.println(store.toString());
		}
		
		// Printing the root directories of this FileSystem using for each loop
		for (Path root : fileSystem3.getRootDirectories()) {
			System.out.println(root.toString());
		}
	}
}