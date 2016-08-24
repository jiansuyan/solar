package testsolarsystem;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import util.GameUtil;

public class Planet extends Stars{
	// ����ͼƬ �����ꡣ��������ĳ����Բ���У����ᣬ���ᣬ�ٶȣ�����ĳ��Star���� 
	double longAxis;  //��Բ�ĳ���
	double shortAxis; //��Բ�Ķ���
	double speed;
	Stars center; 
	double degree;
	boolean satellite;
	
	public void draw(Graphics g){
		super.draw(g);
		if(!satellite){
			drawTrace(g);
		}
		
		
		//������Բ���� 
		move();
	}
	
	public void drawTrace(Graphics g){
		double ovalX, voalY, ovalWidth, ovalHeight;
		
		ovalWidth = longAxis * 2;
		ovalHeight = shortAxis * 2;
		ovalX = center.x + center.width/2 - longAxis;
		voalY = center.y + center.heigth/2 - shortAxis;
		
		Color c = g.getColor();
		g.setColor(Color.blue);
		g.drawOval((int)ovalX,(int)voalY, (int)ovalWidth, (int)ovalHeight);
		g.setColor(c);
	}
	
	public void move(){
		x = center.x + longAxis*Math.cos(degree);
		y = center.y + shortAxis*Math.sin(degree);
		
		degree += speed;
	}
	
	public Planet(Stars center,String imgpath, double longAxis, double shortAxis, double speed ){
		super(GameUtil.getImage(imgpath));
		this.center = center;
		this.x = (center.x + center.width/2) + longAxis;
		this.y = (center.y + center.heigth/2) + + shortAxis;
	//	this.img = GameUtil.getImage(imgpath);
		
		this.longAxis = longAxis;
		this.shortAxis = shortAxis;
		this.speed = speed;
		
		this.width = img.getWidth(null);
		this.heigth = img.getHeight(null);
	}
	
	public Planet(Stars center,String imgpath, double longAxis, double shortAxis, double speed, boolean satellite ){
		this(center,imgpath,longAxis,shortAxis,speed);
		this.satellite = satellite;
	}
	
	public Planet(Image img, double x, double y) {
		super(img, x, y);
	}	
	public Planet(String imgpath, double x, double y) {
		super(imgpath, x, y);
	}
}
