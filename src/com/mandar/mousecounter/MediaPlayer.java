package com.mandar.mousecounter;

import java.io.File;

import uk.co.caprica.vlcj.component.EmbeddedMediaPlayerComponent;
import uk.co.caprica.vlcj.runtime.RuntimeUtil;

import com.sun.jna.NativeLibrary;

public class MediaPlayer {

	private EmbeddedMediaPlayerComponent mousePlayer;
	private File file = new File("/Applications");
	private File mediaFile = new File("~/Downloads/news_interview.wmv");
	
	MediaPlayer(){
		System.out.println(file.getAbsolutePath());
		NativeLibrary.addSearchPath(RuntimeUtil.getLibVlcLibraryName(), file.getAbsolutePath());
		mousePlayer = new EmbeddedMediaPlayerComponent();
	}
	
	public void playVideos(){
	
	}
}
