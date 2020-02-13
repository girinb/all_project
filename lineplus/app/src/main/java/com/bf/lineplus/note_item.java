package com.bf.lineplus;

import java.util.ArrayList;

public class note_item {
	String title;
	String subject;
	ArrayList<String> imagelist;
	note_item(String _title,String _subject,ArrayList<String> _imagelist){
		title = _title;
		subject = _subject;
		imagelist = _imagelist;

	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public ArrayList<String> getImagelist() {
		return imagelist;
	}

	public String getSubject() {
		return subject;
	}

	public void setImagelist(ArrayList<String> imagelist) {
		this.imagelist = imagelist;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

}
