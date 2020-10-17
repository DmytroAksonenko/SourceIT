package com.aksonenko.mockito;

public class Email {

	String msgContent;
	String emailAddress;

	public void setContent(String msgContent) {
		this.msgContent = msgContent;
	}
	public String getContent() {
		return this.msgContent;
	}

	public void setAddressee(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getAddressee() {
		return this.emailAddress;
	}

}
