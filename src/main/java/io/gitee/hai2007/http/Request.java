package io.gitee.hai2007.http;

import java.util.HashMap;

public class Request {

	HashMap<String, String> codeMap = new HashMap<String, String>();

	public Request(String code) {

		String[] codeArray = code.trim().split("\n");
		for (int index = 1; index < codeArray.length; index++) {
			String[] item = codeArray[index].split(": ");
			codeMap.put(item[0].trim(), item[1].trim());
		}

	}

	public String toString() {
		String codeStr = "{";

		for (String key : codeMap.keySet()) {
			codeStr += "\n  " + key + " : " + codeMap.get(key);
		}

		return codeStr + "\n}";
	}

	public String getValue(String keyName) {
		return codeMap.get(keyName);
	}

}
