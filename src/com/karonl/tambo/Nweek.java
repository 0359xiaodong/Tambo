package com.karonl.tambo;

import java.util.ArrayList;
import java.util.HashMap;

public class Nweek {
	private int xing = 0;
	private int arg = 0;
	private int page = 0;
	private int tempa = 0;
	private String contents = "��ѧӢ�� IV^xx1x2x3x4x5x6x7x8x9x10x11x12x13x14x15x16x17x^09:00 - 10:20#unity3D ��Ϸ���^xx1x2x3x4x5x6x7x8x9x10x11x12x13x14x15x16x17x^09:00 - 10:20#Ƕ��ʽϵͳԭ��^01xx1x2x3x4x5x6x7x8x9x10x11x12x13x14x15x16x17x^09:00 - 10:20#�������������^01xx1x2x3x4x5x6x7x8x9x10x11x12x13x14x15x16x17x^09:00 - 10:20#####Ƕ��ʽϵͳԭ��^xx1x2x3x4x5x6x7x8x9x10x11x12x13x14x15x16x17x^10:40 - 12:00#�������������^xx1x2x3x4x5x6x7x8x9x10x11x12x13x14x15x16x17x^10:40 - 12:00#��ѧӢ�� IV^xx1x2x3x4x5x6x7x8x9x10x11x12x13x14x15x16x17x^10:40 - 12:00#Linux����ϵͳ����(˫��)^03xx2x4x6x8x10x12x14x16x^10:40 - 12:00##########��ҳ��ƻ���^xx1x2x3x4x5x6x7x8x9x10x11x12x13x14x15x16x17x^14:00 - 15:20####unity3D ��Ϸ���^xx1x2x3x4x5x6x7x8x9x10x11x12x13x14x15x16x17x^14:00 - 15:20###��ҳ��ƻ���^xx1x2x3x4x5x6x7x8x9x10x11x12x13x14x15x16x17x^15:30 - 16:50########Linux����ϵͳ����(����)^xx1x3x5x7x9x11x13x15x17x^17:00 - 18:20########���������� II^xx1x2x3x4x5x^19:00 - 20:20#####";
	private String[] aArr = {};
	
	public void setweek(int a){
		arg = a;
		
	}
	public int getweek(){
		tempa = arg+1;
		return tempa;
	}
	public void setxing(int b){
		xing = b;
	}
	public int getxing(){
		return xing;
	}
	public void setpage(int c){
		page = c;
	}
	public int getpage(){
		return page;
	}
	
	public ArrayList<HashMap<String, String>> getcontents(ArrayList<HashMap<String, String>> d ) {
		// TODO Auto-generated method stub
		if(aArr.length<1){
		aArr = (contents+"0").split("\\#"); 
		}
		
		for(int n=0;n<7;n++){
		    String strs[]=aArr[xing+n*7].split("\\^");
		    if(strs[0].equals("")){}
		    else{
		    int temp = arg +1;
		    if(strs[1].contains("x"+temp+"x")){
			HashMap<String, String> map = new HashMap<String, String>();
			map.put("time", strs[0]);
			map.put("time2", strs[2]);
			map.put("time3", strs[2]);
			d.add(map);	
		    }
		    }
		 
	 }
			return d;
	}

}
