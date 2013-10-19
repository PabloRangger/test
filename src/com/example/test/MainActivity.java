package com.example.test;

import android.os.Bundle;
import android.view.*;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		
		return true;
	}
	
//	@Override
//	public boolean onOptionsItemSelected(MenuItem item) {
//	    // Handle presses on the action bar items
//	    switch (item.getItemId()) {
//	        case R.id.submit:
//	            if(checkUNPW()){
//	            	
//	            	setContentView(R.layout.activity_testaferlogin);
//	            	
//	           };
//	            return true;
//	        default:
//	            return super.onOptionsItemSelected(item);
//	    }
//	}
	
	public void submitclick(View view){
//		
//		EditText pw = new EditText(getBaseContext());
//		pw.setText("asdf");
//		EditText un = new EditText(getBaseContext());
//		un.setText("admin");
//		
//		EditText upw = (EditText)findViewById(R.id.Password);
//		EditText uun = (EditText)findViewById(R.id.Username);
//		
//		
//		
//		if( upw.getText() == pw.getText() && uun.getText() == un.getText()){
//			
			Intent intent = new Intent(this, Testaferlogin.class);
			startActivity(intent);
			
	//	}
	
		
	}
	

		


}
