package com.hongwan.ctservice;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;

public class SplashActivity extends Activity {

	private Thread mSplashThread;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash);
        
        mSplashThread = new Thread() {
        	@Override
        	public void run() {
        		try {
        			synchronized(this) {
        				wait(3000);
        			}
        		} catch (InterruptedException ex) {
        		}
        		
        		finish();
        		
        		// Run main activity
        		Intent intent = new Intent(SplashActivity.this, IndexActivity.class);
        		startActivity(intent);
        	}
        };
        
        mSplashThread.start();
    }

	/* (non-Javadoc)
	 * @see android.app.Activity#onTouchEvent(android.view.MotionEvent)
	 */
	@Override
	public boolean onTouchEvent(MotionEvent event) {
		if (event.getAction() == MotionEvent.ACTION_DOWN) {
			synchronized(mSplashThread) {
				mSplashThread.notifyAll();
			}
		}
		
		return true;
	}
    
}
