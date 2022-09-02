package in.binplus.exclusivevideoapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

import in.binplus.exclusivevideoapp.Adapters.HomeAdapter;
import in.binplus.exclusivevideoapp.Adapters.RelatedProductAdapter;
import in.binplus.exclusivevideoapp.Model.HomeModel;
import in.binplus.exclusivevideoapp.Model.RelatedProductModel;
import in.binplus.exclusivevideoapp.Utils.LoadingBar;

public class DetailActivity extends AppCompatActivity {

    RecyclerView rec_related_products;
    RelatedProductAdapter relatedProductAdapter;
    ArrayList<RelatedProductModel> relatedProductModels;
    TextView tv_title,addComment;
    LoadingBar loadingBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        tv_title = findViewById(R.id.txtTitle);
        tv_title.setText("Product Name");
        addComment = findViewById(R.id.addComment);
        loadingBar = new LoadingBar();
        rec_related_products = findViewById(R.id.rec_related_products);
        rec_related_products.setLayoutManager(new LinearLayoutManager(this));
        relatedProductModels = new ArrayList<>();
        relatedProductModels.add(new RelatedProductModel());
        relatedProductModels.add(new RelatedProductModel());
        relatedProductModels.add(new RelatedProductModel());
        relatedProductModels.add(new RelatedProductModel());
        relatedProductAdapter = new RelatedProductAdapter(this,relatedProductModels);
        rec_related_products.setAdapter(relatedProductAdapter);
        addComment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadingBar.showDialog(getApplicationContext(),"in progress");
            }
        });
    }
}