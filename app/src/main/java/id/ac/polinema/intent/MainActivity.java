package id.ac.polinema.intent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void handleExplisitIntent(View view) {
        Intent intent =  new Intent(this, ExplicitIntentActivity.class);
        startActivity(intent);
    }

    public void handlxeExit(View view) {

        finish();
    }
}
