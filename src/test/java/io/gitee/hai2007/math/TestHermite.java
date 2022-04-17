package io.gitee.hai2007.math;

public class TestHermite {

	public static void main(String[] args) throws Exception {

		Hermite hermite = new Hermite(1.0f);
		hermite.setP(0f, 1f, 3f, 28f, 0f, 27f);

		// 1
		System.out.println("x=0,y=" + hermite.valueOf(0f));
		// 2
		System.out.println("x=1,y=" + hermite.valueOf(1f));
		// 9
		System.out.println("x=2,y=" + hermite.valueOf(2f));
		// 28
		System.out.println("x=3,y=" + hermite.valueOf(3f));

	}

}
