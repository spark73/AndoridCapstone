package com.example.a4155.ui.login;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.a4155.R;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.Task;

public class google_signin extends AppCompatActivity {
    private static final String TAG = "google_signin";
    private GoogleSignInClient gsc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google_signin);

        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestEmail().build();

        gsc = GoogleSignIn.getClient(this, gso);

        Intent signInIntent = gsc.getSignInIntent();
        startActivityForResult(signInIntent, 101);
    }

    @Override
    protected void onStart() {
        super.onStart();

        GoogleSignInAccount alreadyLoogedAccount = GoogleSignIn.getLastSignedInAccount(this);

        if (alreadyLoogedAccount != null) {
            Toast.makeText(this, "Already Logged In", Toast.LENGTH_SHORT).show();
            onLogin(alreadyLoogedAccount);
        } else {
            Log.d(TAG, "Not Logged In");
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == Activity.RESULT_OK) {
            switch (requestCode) {
                case 101:
                    try {
                        Task<GoogleSignInAccount> task = GoogleSignIn.getSignedInAccountFromIntent(data);
                        GoogleSignInAccount account = task.getResult(ApiException.class);
                        onLogin(account);
                    } catch (ApiException e) {
                        Log.v(TAG, "Sign-in result: failed code=" + e.getStatusCode());
                    }

                    break;
            }
        }
    }

    private void onLogin(GoogleSignInAccount gsa) {
        Intent intent = new Intent(this, SignUp.class);
        intent.putExtra("google_account", gsa);

        startActivity(intent);
        finish();
    }
}
