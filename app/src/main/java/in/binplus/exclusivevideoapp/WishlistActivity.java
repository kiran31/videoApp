package in.binplus.exclusivevideoapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

import in.binplus.exclusivevideoapp.Adapters.RelatedProductAdapter;
import in.binplus.exclusivevideoapp.Adapters.WishListAdapter;
import in.binplus.exclusivevideoapp.Model.RelatedProductModel;
import in.binplus.exclusivevideoapp.Model.WishListModel;

public class WishlistActivity extends AppCompatActivity {

    RecyclerView rec_wish;
    WishListAdapter wishListAdapter;
    ArrayList<WishListModel> wishListModels;
    TextView tv_title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wishlist);
        tv_title = findViewById(R.id.txtTitle);
        tv_title.setText("Wish List");
        rec_wish = findViewById(R.id.rec_wishlist);
        rec_wish.setLayoutManager(new LinearLayoutManager(this));
        wishListModels = new ArrayList<>();
        wishListModels.add(new WishListModel());
        wishListModels.add(new WishListModel());
        wishListModels.add(new WishListModel());
        wishListModels.add(new WishListModel());
        wishListAdapter = new WishListAdapter(this,wishListModels);
        rec_wish.setAdapter(wishListAdapter);
    }
}