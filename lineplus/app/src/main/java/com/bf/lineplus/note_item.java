package com.bf.lineplus;

import java.util.ArrayList;

public class note_item {
	String title;
	String contents;
	ArrayList<String> imagelist;
	note_item(String _title,String _contents,ArrayList<String> _imagelist){
		title = _title;
		contents = _contents;
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

	public String getcontents() {
		return contents;
	}

	public void setImagelist(ArrayList<String> imagelist) {
		this.imagelist = imagelist;
	}

	public void setcontents(String contents) {
		this.contents = contents;
	}

}
