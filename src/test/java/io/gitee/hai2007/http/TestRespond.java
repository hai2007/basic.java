package io.gitee.hai2007.http;

public class TestRespond {

	public static void main(String[] args) {

		Respond respond = new Respond();

		respond.setHeader("Content-Type", "text/html; charset=utf-8");
		respond.setHeader("Access-Control-Allow-Origin", "*");

		System.out.println(respond.getValue("<h2>你好呀，浏览器~</h2>"));

	}

}
