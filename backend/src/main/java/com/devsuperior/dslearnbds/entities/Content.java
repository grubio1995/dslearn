package com.devsuperior.dslearnbds.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_content")
public class Content extends Lesson {
	private static final long serialVersionUID = 1L;

	private String textConent;
	private String videoUri;

	public Content() {
	}

	public Content(Long id, String title, Integer position, Section section, String textConent, String videoUri) {
		super(id, title, position, section);
		this.textConent = textConent;
		this.videoUri = videoUri;
	}

	public String getTextConent() {
		return textConent;
	}

	public void setTextConent(String textConent) {
		this.textConent = textConent;
	}

	public String getVideoUri() {
		return videoUri;
	}

	public void setVideoUri(String videoUri) {
		this.videoUri = videoUri;
	}

}
