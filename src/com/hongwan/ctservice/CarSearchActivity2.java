package com.hongwan.ctservice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class CarSearchActivity2 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.activity_car_search2);
		
		SimpleAdapter adapter = new SimpleAdapter(this,getData(),R.layout.partical_car_search_list,
				new String[]{"title","info","img"},new int[]{R.id.textView2,R.id.textView1,R.id.imageView1});
		 ListView list = (ListView) findViewById(R.id.List);
		 list.setDividerHeight(0);
		 list.setAdapter(adapter);
        
	}

	
	private List<Map<String, Object>> getData() {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("title", "G1");
        map.put("info", "google 1");
        map.put("img", R.drawable.car_test);
        list.add(map);

 

        map = new HashMap<String, Object>();
        map.put("title", "G2");
        map.put("info", "google 2");
        map.put("img", R.drawable.car_test);
        list.add(map);

        return list;

    }
}