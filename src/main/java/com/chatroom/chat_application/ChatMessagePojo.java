package com.chatroom.chat_application;

//This class will be used as a Model where all necessary variables 
//or data are declared, and this class will act as a payload that can be exchanged between client and server.
public class ChatMessagePojo {

	 private MessageType type;
	    private String content;
	    private String sender;

	    public enum MessageType {
	        CHAT,
	        JOIN,
	        LEAVE
	    }

	    public MessageType getType() {
	        return type;
	    }

	    public void setType(MessageType type) {
	        this.type = type;
	    }

	    public String getContent() {
	        return content;
	    }

	    public void setContent(String content) {
	        this.content = content;
	    }

	    public String getSender() {
	        return sender;
	    }

	    public void setSender(String sender) {
	        this.sender = sender;
	    }
	}
