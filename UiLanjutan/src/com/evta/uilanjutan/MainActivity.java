package com.evta.uilanjutan;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {
	
	Button b1, b2, b3, b4, b5;
	
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        b1 = (Button)findViewById(R.id.btToast);
        b2 = (Button)findViewById(R.id.btList);
        b3 = (Button)findViewById(R.id.btSpinner);
        b4 = (Button)findViewById(R.id.btLog);
        b5 = (Button)findViewById(R.id.btExit);
        
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


	@Override
	public void onClick(View arg0) {
		 switch (arg0.getId()){
         case R.id.btToast:
                 Toast.makeText(this, "This is TOAST Notification", Toast.LENGTH_SHORT).show();
                 break;
         case R.id.btList:
                 Intent b = new Intent(MainActivity.this,ListViewActivity.class);
                 startActivity(b);
                 break;
         case R.id.btSpinner:
                 Intent c = new Intent(MainActivity.this,SpinnerActivity.class);
                 startActivity(c);
                 break;
         case R.id.btLog:
                 Intent d = new Intent(MainActivity.this,FormActivity.class);
                 startActivity(d);
                 break;
         case R.id.btExit:
                 ShowExitDialog();                   
         }
		
	}


	private void ShowExitDialog() {
		   AlertDialog.Builder ad = new AlertDialog.Builder(this);
           ad.setTitle("Warning");
           ad.setMessage("Are You sure to exit");
           ad.setPositiveButton("yes", new DialogInterface.OnClickListener() {                      
                   @Override
                   public void onClick(DialogInterface arg0, int arg1) {
                          MainActivity.this.finish();
                   }
           });
           ad.setNegativeButton("no", new DialogInterface.OnClickListener() {                      
                   @Override
                   public void onClick(DialogInterface arg0, int arg1) {
                          arg0.dismiss();
                   }
           });
           ad.show();
		
	}
    
}
