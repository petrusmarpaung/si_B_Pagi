

package com.evta.helloworld;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;


public class HelloActivity extends Activity {
	
	//Deklarasi Class Textview
	TextView nama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);
        
        //Instantsiasi Objek
        nama = (TextView)findViewById(R.id.txtNama);
        nama.setText("Evta Indra");
        
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.hello, menu);
        return true;
    }
    
}
