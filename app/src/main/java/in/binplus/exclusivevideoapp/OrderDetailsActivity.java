package in.binplus.exclusivevideoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import in.binplus.exclusivevideoapp.Utils.LoadingBar;

public class OrderDetailsActivity extends AppCompatActivity {

    TextView tv_title;
    LoadingBar loadingBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_details);
        tv_title =  findViewById(R.id.txtTitle);
        tv_title.setText("Order Summary");
        loadingBar=new LoadingBar();
    }
    public void onBack(View view)
    {
        //startActivity(new Intent(this,OtpValidateActivity.class));
        loadingBar.showDialog(getApplicationContext(),"hi");
    }
    public void onConfirm(View view)
    {
        //startActivity(new Intent(this,OtpValidateActivity.class));
        loadingBar.showDialog(getApplicationContext(),"hi");
    }
}