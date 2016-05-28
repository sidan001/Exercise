/**
 * @Description: TODO
 */
package com.exercise.object;

/**
 *  长方形；矩形;
 * @author E-mail:liuchou.ewedata.com
 * @date 创建时间：2016年5月19日 下午4:59:45
 * @Description
 * @version 1.0
 * @since
 * 
 */
public class Rectangle {
	public int width = 0;
	public int height = 0;
	public Point origin;

	// four constructors
	public Rectangle() {
		origin = new Point(0, 0);
	}

	public Rectangle(Point p) {
		origin = p;
	}

	public Rectangle(int w, int h) {
		origin = new Point(0, 0);
		width = w;
		height = h;
	}

	public Rectangle(Point p, int w, int h) {
		origin = p;
		width = w;
		height = h;
	}

	// a method for moving the rectangle
	public void move(int x, int y) {
		origin.x = x;
		origin.y = y;
	}

	// a method for computing the area of the rectangle
	public int getArea() {
		return width * height;
	}
}
