package testsolarsystem;

import java.awt.Graphics;
import java.awt.Image;

import cn.jiansuyan.game1.GameUtil;
import util.Constant;
import util.MyFrame;

/*
 * 太阳系的主窗口
 */

public class Solar extends MyFrame{
	Image bg = GameUtil.getImage("images/solar-bg.jpg");
	Stars sun = new Stars("images/sun_02.jpg",Constant.GAME_WIDTH/2,Constant.GAME_HEIGHT/2);
	Planet earth = new Planet(sun,"images/star_earth.jpg",150,100,0.1);
	Planet mars = new Planet(sun,"images/mars.jpg",100,80,0.2);
	Planet moon = new Planet(earth,"images/moon.jpg",60, 50, 0.3,true);
	
	public void paint(Graphics g){
		g.drawImage(bg,0,0,null);
		sun.draw(g);
		earth.draw(g);
		mars.draw(g);
		moon.draw(g);
	}
	
	public static void main(String[] args){
		new Solar().launchFrame();
	}
}
