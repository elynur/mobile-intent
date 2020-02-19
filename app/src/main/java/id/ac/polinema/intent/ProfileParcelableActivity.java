package id.ac.polinema.intent;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import id.ac.polinema.intent.model.User;

public class ProfileParcelableActivity extends AppCompatActivity {

    private TextView username;
    private TextView name;
    private TextView age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_parcelable);

        // TODO: bind here
        username = findViewById(R.id.text_username);
        name = findViewById(R.id.text_name);
        age = findViewById(R.id.text_age);

        Bundle extras = getIntent().getExtras();
        User value = getIntent().getParcelableExtra("user");
        if (extras != null) {

            // TODO: display value here
            username.setText(value.getUsername());
            name.setText(value.getName());
            age.setText(String.valueOf(value.getAge()));
        }
    }
}
