package com.example.session;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
	
	public static final String MyPREFERENCES="mypreferences"; 
	public static final String name="nameKey";
	public static final String password="passkey";
	SharedPreferences sharedpreferences;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.welocme_main);
		
		
	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		
 sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
		if(!sharedpreferences.contains(name)){
			Intent intent=new Intent(this, Welcome.class);
			startActivity(intent);
		}
		super.onResume();
	}

	

}
