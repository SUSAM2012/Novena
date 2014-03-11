package br.com.kosyon.utilities;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import br.com.kosyon.novena.NovenaActivity;
import br.com.kosyon.novena.R;

public class MySplash extends Activity{
	
	private final int DURACAO_DA_TELA = 5000;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mysplash);
		
		new Handler().postDelayed(new Runnable() {
			
			@Override
			public void run() {
				
				Intent minhaAcao = new Intent(MySplash.this, NovenaActivity.class);
				MySplash.this.startActivity(minhaAcao);
				
				MySplash.this.finish();
			}
		} , DURACAO_DA_TELA);
	}
	


}
