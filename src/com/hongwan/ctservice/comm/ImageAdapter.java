package com.hongwan.ctservice.comm;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {

	private Context mContext;   
    private ImageView[] imgItems; 
    private int[] focusImageIds={0,0,0,0,0};
    private int selResId;
    
	//构造函数
    public ImageAdapter(Context c,int[] picIds,int[] focPicIds,int width,int height,int selResId){
		    mContext = c;   
	        this.selResId=selResId;  
	        imgItems=new ImageView[picIds.length];  
	        for(int i=0;i<picIds.length;i++)  
	        {
	            imgItems[i] = new ImageView(mContext);   
	            imgItems[i].setLayoutParams(new GridView.LayoutParams(width, height));//设置ImageView宽高   
	            imgItems[i].setAdjustViewBounds(false);   
	            imgItems[i].setScaleType(ImageView.ScaleType.CENTER_CROP);   
	            imgItems[i].setPadding(2, 2, 2, 2);   
	            imgItems[i].setImageResource(picIds[i]);
	            imgItems[i].setId(picIds[i]);
	        }  
	        for(int i=0;i<focPicIds.length;i++)  
	        {
	        	focusImageIds[i]=focPicIds[i];
	        }  
	}
    /**  
     * 设置选中的效果  
     */    
    public void SetFocus(int index)    
    {    
        for(int i=0;i<imgItems.length;i++)    
        {    
            if(i!=index)    
            {    
                imgItems[i].setBackgroundResource(0);//恢复未选中的样式  
            }
        }
        imgItems[index].setBackgroundResource(focusImageIds[index]);//设置选中的样式  
        
    }    
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ImageView imageView;   
        if (convertView == null) {   
            imageView=imgItems[position];  
        } else {   
            imageView = (ImageView)convertView;   
        }   
        return imageView;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return imgItems.length; 
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return imgItems[arg0];
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

}
