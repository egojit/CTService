package com.hongwan.ctservice;


import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class LoginActivity extends TabActivity {
	@Override
	 public void onCreate(Bundle savedInstanceState) {
	     super.onCreate(savedInstanceState);
	     setContentView(R.layout.activity_login);//这里使用了上面创建的xml文件（Tab页面的布局）
	     Resources res = getResources(); 
	     TabHost tabHost = getTabHost();  // The activity TabHost
	     TabSpec spec;
	     Intent intent;  // Reusable Intent for each tab
//	 
	   //第一个TAB
	     intent = new Intent(this,ParticalAccountLoginActivity.class);
	     spec = tabHost.newTabSpec("Tab1")//新建一个 Tab
	     .setIndicator("帐号登录")//设置名称以及图标
	     .setContent(intent);//设置显示的intent，这里的参数也可以是R.id.xxx
	     tabHost.addTab(spec);//添加进tabHost
	     
	   //第二个TAB
	     intent = new Intent(this,ParticalPhoneLogin.class);//第二个Intent用作Tab1显示的内容
	     spec = tabHost.newTabSpec("tab3")//新建一个 Tab
	     .setIndicator("电话登录", res.getDrawable(android.R.drawable.ic_menu_camera))//设置名称以及图标
	     .setContent(intent);//设置显示的intent，
	     tabHost.addTab(spec);//添加进tabHost
//	 
//	     
	     intent = new Intent(this,ParticalCardLogin.class);//第二个Intent用作Tab1显示的内容
	     spec = tabHost.newTabSpec("tab2")//新建一个 Tab
	     .setIndicator("卡号登录")//设置名称以及图标
	     .setContent(intent);//设置显示的intent，
	     tabHost.addTab(spec);//添加进tabHost
	     

	 
	     tabHost.setCurrentTab(1);
 }
}
