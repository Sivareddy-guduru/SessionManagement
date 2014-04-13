package com.example.session;


import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Welcome extends Activity implements OnClickListener{
	public static final String MyPREFERENCES="mypreferences"; 
	public static final String name="nameKey";
	public static final String password="passkey";
	SharedPreferences sharedpreferences;
	private EditText name1;
	private EditText pass;
	private Button login;
	
	protected void onCreate(android.os.Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login);
		name1=(EditText) findViewById(R.id.editText1);
		pass=(EditText) findViewById(R.id.editText2);
		login=(Button) findViewById(R.id.button1);
		 sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
	login.setOnClickListener(this);
	}

	@Override
	public void onClick(View arg0) {
		String n1,n2;
		if((n1=name1.getText().toString())!=null){
			if((n2=pass.getText().toString())!=null){
				Editor editor=sharedpreferences.edit();
				editor.putString(name, n1);
				editor.putString(password, n2);
				editor.commit();
			}
		}
		finish();
		
	}

}
