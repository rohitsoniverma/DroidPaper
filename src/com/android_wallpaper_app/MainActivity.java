package com.android_wallpaper_app;

import java.io.IOException;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener {

	ImageView display;
	int toPhone;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
		
		setContentView(R.layout.activity_main);
	
	
	  display = (ImageView) findViewById(R.id.IVDisplay);
      ImageView	image1 = (ImageView) findViewById(R.id.IVimage1);
      ImageView	image2 = (ImageView) findViewById(R.id.IVimage2);
      ImageView	image3 = (ImageView) findViewById(R.id.IVimage3);
      ImageView	image4 = (ImageView) findViewById(R.id.IVimage4);
      ImageView	image5 = (ImageView) findViewById(R.id.IVimage5);
      Button setWall = (Button) findViewById(R.id.bSet);
      toPhone = R.drawable.a;
      
      image1.setOnClickListener(this);
      image2.setOnClickListener(this);
      image3.setOnClickListener(this);
      image4.setOnClickListener(this);
      image5.setOnClickListener(this);
      setWall.setOnClickListener(this);
	
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()){
		
		case R.id.IVimage1:
			display.setImageResource(R.drawable.a);
			toPhone = R.drawable.a;
			break;
			
		case R.id.IVimage2:
			display.setImageResource(R.drawable.b);
			toPhone = R.drawable.b;
			break;
			
		case R.id.IVimage3:
			display.setImageResource(R.drawable.c);
			toPhone = R.drawable.c;
			break;
			
		case R.id.IVimage4:
			display.setImageResource(R.drawable.d);
			toPhone = R.drawable.d;
			break;
			
		case R.id.IVimage5:
			display.setImageResource(R.drawable.e);
			toPhone = R.drawable.e;
			break;
			
		case R.id.bSet:
			Toast.makeText(getApplicationContext(), "Wallpaper Set", Toast.LENGTH_SHORT).show();
			Bitmap whatever = BitmapFactory.decodeStream(getResources().openRawResource(toPhone));
				try {
					getApplicationContext().setWallpaper(whatever);
				}
				catch(IOException e){
					e.printStackTrace();
				}
			break;
		}
		
	    
	}
	
	
	
}
	
	
