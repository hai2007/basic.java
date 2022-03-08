package io.gitee.hai2007.collection;

public class TestJSON {
	public static void main(String[] args) {

		JSON json = new JSON("{key1:{},key2:\"value2\",key3:[{key4:123},12]}");
		System.out.println(json);

	}
}
