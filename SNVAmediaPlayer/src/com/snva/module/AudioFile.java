package com.snva.module;

import java.util.ArrayList;
import java.util.List;

public class AudioFile implements AudioPlayFile {

	private List<String> supportedAudioFile;
	
	
	
	public AudioFile() {
		super();
		// 1. M4A audio file type · 2. FLAC · 3. MP3 · 4. MP4 · 5. WAV · 6. WMA · 7. AAC.
		
		this.supportedAudioFile = new ArrayList<>();
		
		this.supportedAudioFile.add("M4A");
		this.supportedAudioFile.add("FLAC");
		this.supportedAudioFile.add("MP3");
		this.supportedAudioFile.add("MP4");
		this.supportedAudioFile.add("WAV");
		this.supportedAudioFile.add("WMA");
		this.supportedAudioFile.add("AAC");
	}

	

	public AudioFile(List<String> supportedAudioFile) {
		super();
		this.supportedAudioFile = supportedAudioFile;
	}



	@Override
	public void playAudioFile(String file) {
		// TODO Auto-generated method stub
		
		String[] extension = file.trim().split("\\.");
		
		//System.out.println("the extension: "+file.trim().split("\\.")[1]);
		//System.out.println("the extension: "+extension[1]);
		
		if((extension.length > 1 )&& (this.supportedAudioFile.contains(extension[1].toUpperCase()))) {
			System.out.println("\nPlaying "+ file+" File");
		}
		else {
			System.out.println("\nFile "+ file+" not supported");
		}
	}

}
