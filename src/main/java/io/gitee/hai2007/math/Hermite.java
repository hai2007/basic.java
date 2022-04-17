package io.gitee.hai2007.math;

public class Hermite {

	// 张弛系数
	private float u = 0.5f;

	// 边界坐标
	private float a, b;

	// 暂存
	private float[] MR = new float[4];
	private boolean isSetP = false;

	public Hermite() {
	}

	public Hermite(float u) {
		this.u = u;
	}
	
	/**
	 * 设置点的位置
	 * @param x1  左边点的位置
	 * @param y1
	 * @param x2  右边点的位置
	 * @param y2
	 * @param s1 二个点的斜率
	 * @param s2
	 * @throws Exception
	 */
	public void setP(float x1, float y1, float x2, float y2, float s1, float s2) throws Exception {
		if (x1 < x2) {
			// 记录原始尺寸
			this.a = x1;
			this.b = x2;
			float p3 = this.u * s1, p4 = this.u * s2;
			// 缩放到[0,1]定义域
			y1 /= (x2 - x1);
			y2 /= (x2 - x1);
			// MR是提前计算好的多项式通解矩阵
			// 为了加速计算
			// 如上面说的
			// 统一在[0,1]上计算后再通过缩放和移动恢复
			// 避免了动态求解矩阵的麻烦
			this.MR[0] = 2f * y1 - 2f * y2 + p3 + p4;
			this.MR[1] = 3f * y2 - 3f * y1 - 2f * p3 - p4;
			this.MR[2] = p3;
			this.MR[3] = y1;

			this.isSetP = true;

		} else
			throw new Exception("The point x-position should be increamented!");
	}

	/**
	 * 根据x值返回y值
	 * @param x
	 * @return
	 * @throws Exception
	 */
	public float valueOf(float x) throws Exception {
		if (this.isSetP) {
			float sx = (x - a) / (b - a), sx2 = sx * sx, sx3 = sx * sx2;
			float sResult = sx3 * MR[0] + sx2 * MR[1] + sx * MR[2] + MR[3];
			return sResult * (b - a);
		} else
			throw new Exception("You shoud first set the position!");
	}

}
