package testsolarsystem;

import java.awt.Graphics;
import java.awt.Image;

import cn.jiansuyan.game1.GameUtil;

public class Stars {
	Image img;
	double x,y;
	double width,heigth;
	
	public Stars(){
		
	}
	
	public Stars(Image img){
		this.img = img;
		this.width = img.getWidth(null);
		this.heigth = img.getHeight(null);
	}
	
	public void draw(Graphics g){
		g.drawImage(img,(int)x, (int)y, null);
		
	}
	
	public Stars(Image img, double x, double y) {
		this(img);
		this.x = x;
		this.y = y;

	}
	
	public Stars(String imgpath, double x, double y){
		this(GameUtil.getImage(imgpath), x, y);
		
		
	}
}
