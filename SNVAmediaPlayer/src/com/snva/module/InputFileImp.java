package com.snva.module;

import java.util.Scanner;

public class InputFileImp implements InputFile {

	@Override
	public void GetAndPlayFile() {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		String input;
		AudioPlayFile playAudioFile;
		VideoPlayFile playVideoFile;
		
		do {
		//System.out.println("-----------------------------------------------");
		System.out.println("---------Welcome to the SNVA Media Player---------");
		System.out.println("Please choose a Media file to play ");
		System.out.println("(1) For Audio File");
		System.out.println("(2) For Video File");
		System.out.println("--------------------------------------------------");
		
		input= scanner.nextLine();		
		
		switch(input.trim()){
			case "1":
				playAudioFile = new AudioFile();
				
				System.out.println("Please Enter an Audio File");
				input = scanner.nextLine();
				
				playAudioFile.playAudioFile(input);
				
				break;
				
			case "2":
				
				playVideoFile = new VideoFile();
				
				System.out.println("Please Enter a Video File");
				input = scanner.nextLine();
				
				playVideoFile.playVideoFile(input);
				
				
				break;
				
			default:
				System.out.println("Invalid Input");
		}
		
		System.out.println("\nEnter 'y' to play another file");
		
	}while(scanner.nextLine().trim().toLowerCase().equals("y"));
		
		System.out.println("-----Thank You For Using the SNVA Media Player-----");
	}

}
