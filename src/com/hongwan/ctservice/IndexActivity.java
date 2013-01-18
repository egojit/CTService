package com.hongwan.ctservice;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class IndexActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_index);
        
        // set button click event handler
        final ButtonClickHander handlerButtonClick = new ButtonClickHander();
        findViewById(R.id.imageButtonCLCX).setOnClickListener(handlerButtonClick);
		findViewById(R.id.imageButtonBXBJ).setOnClickListener(handlerButtonClick);
		findViewById(R.id.imageButtonCTSC).setOnClickListener(handlerButtonClick);
		findViewById(R.id.imageButtonJSCX).setOnClickListener(handlerButtonClick);
		findViewById(R.id.imageButtonJTZX).setOnClickListener(handlerButtonClick);
		findViewById(R.id.imageButtonTHSJ).setOnClickListener(handlerButtonClick);
	}
	
	private class ButtonClickHander implements OnClickListener {

		@Override
		public void onClick(View view) {
			Intent intent;
			switch (view.getId()) {
			// 保险报警
			case R.id.imageButtonBXBJ:
				break;
			// 车辆查询
			case R.id.imageButtonCLCX:
			{
				intent=new Intent(IndexActivity.this,CarSearchActivity2.class);
				startActivity(intent);
				break;
			}
			// 畅通商城
			case R.id.imageButtonCTSC:
			{
				// 用于测试人员信息界面
				intent = new Intent(IndexActivity.this, InfoActivity.class);
				startActivity(intent);
				break;
			}
			// 驾驶查询
			case R.id.imageButtonJSCX:
				break;
			// 交通资讯
			case R.id.imageButtonJTZX:
				break;
			// 特惠商家
			case R.id.imageButtonTHSJ:
			{
				intent = new Intent(IndexActivity.this, LoginActivity.class); 
		        startActivity(intent); 
				break;}
			}
		}
		
	}

}
