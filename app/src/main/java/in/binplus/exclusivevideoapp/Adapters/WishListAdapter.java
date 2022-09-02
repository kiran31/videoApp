package in.binplus.exclusivevideoapp.Adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import in.binplus.exclusivevideoapp.Model.DrawerModel;
import in.binplus.exclusivevideoapp.Model.WishListModel;
import in.binplus.exclusivevideoapp.R;


public class WishListAdapter extends RecyclerView.Adapter<WishListAdapter.ViewHolder> {
    Context context;
    ArrayList<WishListModel> list;

    public WishListAdapter(Context context, ArrayList<WishListModel> list) {
        this.context = context;
        this.list = list;

    }

    @NonNull
    @Override
    public WishListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.row_wishlist,null);
        return new ViewHolder(view);
    }

    @SuppressLint("ResourceAsColor")
    @Override
    public void onBindViewHolder(@NonNull WishListAdapter.ViewHolder holder, int position) {

        WishListModel model = list.get(position);

    }
    @Override
    public long getItemId(int position) {
        return position;
    }


    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}