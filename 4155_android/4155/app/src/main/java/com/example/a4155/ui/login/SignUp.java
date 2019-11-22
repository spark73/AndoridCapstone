package com.example.a4155.ui.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import com.example.a4155.MainActivity;
import com.example.a4155.R;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

public class SignUp extends AppCompatActivity {
    private EditText name, email, street_address, city, zip_code;
    private Button register;
    private RadioButton deliverer, customer, restaurant;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        street_address = findViewById(R.id.street_address);
        city = findViewById(R.id.city);
        zip_code = findViewById(R.id.zip_code);
        register = findViewById(R.id.button_register);
        deliverer = findViewById(R.id.radio_deliverer);
        customer = findViewById(R.id.radio_customer);
        restaurant = findViewById(R.id.radio_restaurant);

        final Intent intent = new Intent(this, MainActivity.class);

        final Toast toast = Toast.makeText(this, "Welcome", Toast.LENGTH_SHORT);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toast.show();
                startActivity(intent);

            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();

        customer.toggle();

        setDataOnView();
    }

    private void setDataOnView() {
        Intent data = getIntent();
        GoogleSignInAccount gso = data.getParcelableExtra("google_account");

        if (gso != null) {
            if (gso.getGivenName() != null && gso.getFamilyName() != null)
                name.setText(gso.getGivenName() + " " + gso.getFamilyName());
        }

        email.setText(gso.getEmail());
    }


}
