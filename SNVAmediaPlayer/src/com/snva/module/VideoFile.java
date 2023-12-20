package com.snva.module;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;



public class VideoFile implements VideoPlayFile{

	private List<String> supportedVideoFile;
	
	
	public VideoFile() {
		super();
		//WEBM ·.MPG, .MP2, .MPEG, .MPE, .MPV ·.OGG ·.MP4, .M4P, .M4V ·.AVI
		this.supportedVideoFile = new ArrayList<>();
		
		this.supportedVideoFile.add("WEBM");
		this.supportedVideoFile.add("MPG");
		this.supportedVideoFile.add("MP2");
		this.supportedVideoFile.add("MPEG");
		this.supportedVideoFile.add("MPE");
		this.supportedVideoFile.add("MPV");
		this.supportedVideoFile.add("OGG");
		this.supportedVideoFile.add("MP4");
		this.supportedVideoFile.add("M4P");
		this.supportedVideoFile.add("M4V");
		this.supportedVideoFile.add("AVI");
		
	}

	

	public VideoFile(List<String> supportedVideoFile) {
		super();
		this.supportedVideoFile = supportedVideoFile;
	}



	@Override
	public void playVideoFile(String file) {
		// TODO Auto-generated method stub
		
		String[] extension = file.trim().split("\\.");
		
		if((extension.length > 1 )&& (this.supportedVideoFile.contains(extension[1].toUpperCase()))) {
			System.out.println("\nPlaying "+ file+" File");
		}
		else {
			System.out.println("\nFile "+ file+" not supported");
		}
		
	}

}
