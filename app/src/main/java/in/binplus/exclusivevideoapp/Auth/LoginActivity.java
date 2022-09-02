package in.binplus.exclusivevideoapp.Auth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import in.binplus.exclusivevideoapp.MainActivity;
import in.binplus.exclusivevideoapp.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void intentRegister(View view)
    {
        startActivity(new Intent(this,RegisterActivity.class));
    }

    public void intentForgotPassword(View view)
    {
        startActivity(new Intent(this,ForgotPasswordActivity.class));
    }

    public void intentMain(View view)
    {
        startActivity(new Intent(this, MainActivity.class));
    }
}