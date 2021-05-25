package com.kalkulatorapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends Activity implements OnClickListener {
		Button bPlus, bMin, bMultiple, bDevide;
		EditText in1, in2, out;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        in1 = (EditText)findViewById(R.id.idSatu);
        in2 = (EditText)findViewById(R.id.idDua);
        out = (EditText)findViewById(R.id.idHasil);
        bPlus = (Button)findViewById(R.id.idBtTambah);
        bMin = (Button)findViewById(R.id.idBtKurang);
        bMultiple = (Button)findViewById(R.id.idBtKali);
        bDevide = (Button)findViewById(R.id.idBtBagi);
        bPlus.setOnClickListener(this);
        bMin.setOnClickListener(this);
        bMultiple.setOnClickListener(this);
        bDevide.setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

	@Override
	public void onClick(View arg0) {
		switch(arg0.getId()){
		case R.id.idBtTambah:
			String var_angka1 = in1.getText().toString();
			String var_angka2 = in2.getText().toString();
			if(!var_angka1.equals("")||!var_angka2.equals("")){
				String hsl = penjumlahan(var_angka1,var_angka2);
				out.setText(hsl);
			}
			else{
				Toast.makeText(this,"Error",Toast.LENGTH_SHORT).show();
			}
			break;
		case R.id.idBtKurang:
			String var_k1 = in1.getText().toString();
			String var_k2 = in2.getText().toString();
			if(!var_k1.equals("")||!var_k2.equals("")){
				String hsl = pengurangan(var_k1,var_k2);
				out.setText(hsl);
			}
			else{
				Toast.makeText(this,"Error",Toast.LENGTH_SHORT).show();
			}
			break;
		case R.id.idBtKali:
			String var_ka1 = in1.getText().toString();
			String var_ka2 = in2.getText().toString();
			if(!var_ka1.equals("")||!var_ka2.equals("")){
				String hsl = perkalian(var_ka1,var_ka2);
				out.setText(hsl);
			}
			else{
				Toast.makeText(this,"Error",Toast.LENGTH_SHORT).show();
			}
			break;
		case R.id.idBtBagi:
			String var_ba1 = in1.getText().toString();
			String var_ba2 = in2.getText().toString();
			if(!var_ba1.equals("")||!var_ba2.equals("")){
				String hsl = pembagian(var_ba1,var_ba2);
				out.setText(hsl);
			}
			else{
				Toast.makeText(this,"Error",Toast.LENGTH_SHORT).show();
			}
			break;
		}
		
	}
	private String pembagian(String var_ba1,String var_ba2){
		Double d1 = Double.parseDouble(var_ba1);
		Double d2 = Double.parseDouble(var_ba2);
		Double dHasil = d1/d2;
		String sHasil = String.valueOf(dHasil);
		return sHasil;
	}
	private String perkalian(String var_ka1,String var_ka2){
		Double d1 = Double.parseDouble(var_ka1);
		Double d2 = Double.parseDouble(var_ka2);
		Double dHasil = d1*d2;
		String sHasil = String.valueOf(dHasil);
		return sHasil;
	}
	private String pengurangan(String var_k1,String var_k2){
		Double d1 = Double.parseDouble(var_k1);
		Double d2 = Double.parseDouble(var_k2);
		Double dHasil = d1-d2;
		String sHasil = String.valueOf(dHasil);
		return sHasil;
	}
	private String penjumlahan(String var_angka1,String var_angka2){
		Double d1 = Double.parseDouble(var_angka1);
		Double d2 = Double.parseDouble(var_angka2);
		Double dHasil = d1+d2;
		String sHasil = String.valueOf(dHasil);
		return sHasil;
	}
    
}
