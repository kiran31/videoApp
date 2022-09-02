package in.binplus.exclusivevideoapp.Auth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import in.binplus.exclusivevideoapp.R;
import in.binplus.exclusivevideoapp.Utils.LoadingBar;

public class ForgotPasswordActivity extends AppCompatActivity {

    LoadingBar loadingBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);
        loadingBar = new LoadingBar();
    }

    public void intentValidateOTP(View view)
    {
        startActivity(new Intent(this,OtpValidateActivity.class));
    }
    public void intentLost(View view)
    {
        //startActivity(new Intent(this,OtpValidateActivity.class));
        loadingBar.showDialog(getApplicationContext(),"hi");
    }
}