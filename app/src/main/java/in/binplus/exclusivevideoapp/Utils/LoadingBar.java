package in.binplus.exclusivevideoapp.Utils;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.app.AlertDialog;
import com.google.android.material.button.MaterialButton;

import in.binplus.exclusivevideoapp.R;

public class LoadingBar {

    public void showDialog(Context context,String msg)
    {
        View dialogView = LayoutInflater.from(context).inflate(R.layout.layout_dialog, null, false);
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setView(dialogView);
        final AlertDialog alertDialog = builder.create();
        alertDialog.show();
        MaterialButton btnOk = dialogView.findViewById(R.id.btnOK);
        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertDialog.dismiss();
            }
        });
    }
}
