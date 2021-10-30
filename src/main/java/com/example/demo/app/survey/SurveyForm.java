package com.example.demo.app.survey;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class SurveyForm {

	@Size(min = 1, max = 150, message = "150以下の数値で登録してください。")
	@NotNull
	private String age;

	@Size(min = 1, max = 5, message = "1～5以下の数値で登録してください。")
	@NotNull
	private String satisfaction;
	
	@Size(min = 1, max = 200, message = "200文字以内で登録してください。")
	@NotNull
	private String comment;

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getSatisfaction() {
		return satisfaction;
	}

	public void setSatisfaction(String satisfaction) {
		this.satisfaction = satisfaction;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

}
