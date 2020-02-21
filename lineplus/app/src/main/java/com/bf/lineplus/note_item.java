package com.bf.lineplus;

public class note_item {
	String date;
	String title;
	String contents;
	String[] imagelist;
	note_item(String _date,String _title,String _contents,String[]  _imagelist){
		date = _date;
		title = _title;
		contents = _contents;
		imagelist = _imagelist;

	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public String getContents() {
		return contents;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setImagelist(String[] imagelist) {
		this.imagelist = imagelist;
	}

	public String[] getImagelist() {
		return imagelist;
	}

	public void setcontents(String contents) {
		this.contents = contents;
	}

}
