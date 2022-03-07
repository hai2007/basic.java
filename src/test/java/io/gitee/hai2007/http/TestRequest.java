package io.gitee.hai2007.http;

public class TestRequest {

	public static void main(String[] args) {

		Request request = new Request(
				"GET /favicon.ico HTTP/1.1\nHost: 127.0.0.1:9999\nConnection: keep-alive\nsec-ch-ua: \" Not A;Brand\";v=\"99\", \"Chromium\";v=\"98\", \"Google Chrome\";v=\"98\"\nsec-ch-ua-mobile: ?0\nUser-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/98.0.4758.102 Safari/537.36\nsec-ch-ua-platform: \"Windows\"\nAccept: image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8\nSec-Fetch-Site: same-origin\nSec-Fetch-Mode: no-cors\nSec-Fetch-Dest: image\nReferer: http://127.0.0.1:9999/\nAccept-Encoding: gzip, deflate, br\nAccept-Language: zh-TW,zh;q=0.9,en-US;q=0.8,en;q=0.7,zh-CN;q=0.6");

		System.out.println(request);
		
	}

}
