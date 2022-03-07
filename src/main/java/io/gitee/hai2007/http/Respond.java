package io.gitee.hai2007.http;

import java.util.HashMap;

public class Respond {

	HashMap<String, String> codeMap = new HashMap<String, String>();
	String lineSeparator = System.getProperty("line.separator", "\n");

	public Respond() {

	}

	public void setHeader(String key, String value) {
		codeMap.put(key, value);
	}

	public String toString() {
		String codeStr = "{";

		for (String key : codeMap.keySet()) {
			codeStr += "\n  " + key + " : " + codeMap.get(key);
		}

		return codeStr + "\n}";
	}

	public String getValue(String content) {
		String codeStr = "HTTP/1.1 200 OK";

		for (String key : codeMap.keySet()) {
			codeStr += lineSeparator + key + ":" + codeMap.get(key);
		}

		return codeStr + lineSeparator + lineSeparator + content + lineSeparator;
	}

}
