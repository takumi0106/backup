package com.internousdev.webproj2.action;

import com.internousdev.webproj2.dao.InquiryCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class InquiryCompleteAction extends ActionSupport {

	private String name;
	private String qtype;
	private String body;

	public String execute(){
		String ret =ERROR;
		InquiryCompleteDAO dao=new InquiryCompleteDAO();
		dao.insert(name, qtype, body);
		return SUCCESS;
	}

	public String getName() {
		return name;
	}

	public void setName(String name){
		this.name=name;
	}

	public String getQtype() {
		return qtype;
	}

	public void setQtype(String qtype) {
		this.qtype=qtype;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body=body;
	}

}
