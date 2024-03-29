package com.tricheer.launcherk218.view;





import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;

import com.tricheer.launcher218.R;

public class MyToast {
		private static Toast toastStart;
	    private static TextView mTextView;  
	  
	    public static void showToast(Context context, String message) {  
	        //加载Toast布局  
	        View toastRoot = LayoutInflater.from(context).inflate(R.layout.dialog_fm, null);  
	        //初始化布局控件  
	        mTextView = (TextView) toastRoot.findViewById(R.id.message);  
	        //为控件设置属性  
	        mTextView.setText(message);  
	        //Toast的初始化  
	        if(toastStart==null){
	        	 toastStart = new Toast(context);
	        }
	         
	        //获取屏幕高度  
	        WindowManager wm = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);  
	        int height = wm.getDefaultDisplay().getHeight();  
	        //Toast的Y坐标是屏幕高度的1/3，不会出现不适配的问题  
	        toastStart.setGravity(Gravity.TOP, 0, height / 3);  
	        toastStart.setDuration(Toast.LENGTH_LONG);  
	        toastStart.setView(toastRoot);  
	        toastStart.show();  
	    }  
}  

