package com.karonl.tambo;

import java.util.ArrayList;
import java.util.HashMap;
import android.content.Context;
import android.os.Handler;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.karonl.tambo.Calendar;

public class MyOnPageChangeListener implements OnPageChangeListener {

	private TextView vlistview;
	private Nweek wenk;
	private int prepage = 1000;
	private int nprepagenum = 0;
	private LinearLayout inner;
	public ArrayList<HashMap<String, String>> myArrayList= new ArrayList<HashMap<String, String>>();
	private String xin[] = {"һ","��","��","��","��","��","��","��","��","ʮ","ʮһ","ʮ��","ʮ��","ʮ��","ʮ��","ʮ��","ʮ��","ʮ��","ʮ��","��ʮ","��ʮһ","��ʮ��","��ʮ��","��ʮ��","��ʮ��"};
	private Handler handler=new Handler();  
	
	public MyOnPageChangeListener(Context context,TextView vlistview,ListView dummyList,LinearLayout inner){
		this.vlistview = vlistview;
		this.inner=inner;
		wenk = Calendar.wenkstatic;

	}
	
	@Override
	public void onPageSelected(int arg0) {
		
		wenk.setweek(arg0);
		vlistview.setText("��"+xin[arg0]+"��");
		
		Thread t2 = new freshUI(); 
        t2.start(); 
        
        Log.i("",wenk.getweek()+"/"+prepage+"/"+nprepagenum);//nprepagenum��ʼ��һ�ν���
        
		if((prepage+1)==wenk.getweek())MainActivity.titlemove(-10,0,-4,30);
		else if((prepage+1)!=wenk.getweek() && nprepagenum==prepage)MainActivity.titlemove(0,-10,30,-4);
        
		nprepagenum = arg0;
		if(prepage>999)prepage = nprepagenum;
	}

	@Override
	public void onPageScrolled(int arg0, float arg1, int arg2) {
	}

	@Override
	public void onPageScrollStateChanged(int arg0) {
	}
	
	public class freshUI extends Thread{ 
	    public void run() { 
	    	try {
                Thread.sleep(400);
               } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
               }
	    	handler.post(runnableUi);
	    }
	}
	Runnable runnableUi=new  Runnable(){  
        @Override  
        public void run() {  
            //���½���  
        	  
        	Calendar.update("",inner);
        }  
          
    }; 
	

}