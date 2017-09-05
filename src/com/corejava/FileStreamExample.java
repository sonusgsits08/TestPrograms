package com.corejava;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileStreamExample {
 public static void main(String[] args) {
	 String inputfileName ="input.csv";
	 String outputfileName ="output.csv";
	 Path path = Paths.get(inputfileName);
	 Path outputPath = Paths.get(outputfileName);
	 
	 try {
		Stream<String> streamLines =Files.lines(path);
		List<List<String>> strs =streamLines.map(line->Arrays.asList(line.split("\n"))).collect(Collectors.toList());
		System.out.println("===============Reading finished============");
		strs.forEach(str->{
			try {
				Files.write(outputPath, str.get(0).toString().getBytes(),StandardOpenOption.APPEND);
				Files.write(outputPath,"\n".getBytes(),StandardOpenOption.APPEND);
			} catch (Exception e) {
				System.out.println("Exception is"+e);
				e.printStackTrace();
			}
		});				
		System.out.println("===============Writing finished============");		
	} catch (IOException e) {
		e.printStackTrace();
	}
	 
}
}
