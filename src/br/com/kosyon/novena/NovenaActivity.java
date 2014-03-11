package br.com.kosyon.novena;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class NovenaActivity extends Activity {
	
	private Button btnPrayers;
	private Button btnHymns;
	private Button btnConsecration;
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_novena);
        
        btnPrayers =(Button) findViewById(R.id.btnPrayers);
        btnHymns =(Button) findViewById(R.id.btnHymns);
        btnConsecration =(Button) findViewById(R.id.btnConsagration);
        
        btnPrayers.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(NovenaActivity.this, PrayersActivity.class);
				startActivity(intent);
				Toast.makeText(getApplicationContext(), btnPrayers.getText(), Toast.LENGTH_LONG).show();
			}
		});
        
         
        btnHymns.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(NovenaActivity.this, HymnsActivity.class);
				startActivity(intent);
				
				Toast.makeText(getApplicationContext(), btnHymns.getText(), Toast.LENGTH_LONG).show();
			
			}
		});
      

        btnConsecration.setOnClickListener(new OnClickListener() {
	
        	@Override
			public void onClick(View v) {
				Intent intent = new Intent(NovenaActivity.this, ConsecrationActivity.class);
				startActivity(intent);
				Toast.makeText(getApplicationContext(), btnConsecration.getText(), Toast.LENGTH_LONG).show();
			}
		});
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.novena, menu);
        return true;
    }
    
    
}
