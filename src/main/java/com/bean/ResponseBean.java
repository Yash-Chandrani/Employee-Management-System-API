package com.bean;

public class ResponseBean<T> {
	T data;//generic
	int status;
	String msg;
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public static<T> ResponseBean<T> data(T data, String msg, int status) {
		// TODO Auto-generated method stub
		ResponseBean <T> rb=new ResponseBean<>();
		rb.setData(data);
		rb.setMsg(msg);
		rb.setStatus(status);
		return rb;
	}
	
	
}
