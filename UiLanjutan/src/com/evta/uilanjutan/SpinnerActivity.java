package com.evta.uilanjutan;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;


public class SpinnerActivity extends Activity {
	
	Spinner sp;
    String item[] = {"Nasi Goreng", "Mie Goreng", "Mie Rebus","Soto Medan","Soto Ayam","Sop Ayam","Ayam Goreng"};  

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_spinner);
		
		 sp =(Spinner)findViewById(R.id.spinner1);
		 
		 ArrayAdapter<String> array_item = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,item);
         sp.setAdapter(array_item);
         
         sp.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				 Toast.makeText(SpinnerActivity.this, "Kamu Memilih" +item[arg2], Toast.LENGTH_SHORT).show();
				
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				 Toast.makeText(SpinnerActivity.this, "Nothing Selected", Toast.LENGTH_SHORT).show(); 
				
			}
        	 
		});
		
	}	

}
