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
import in.binplus.exclusivevideoapp.Model.HomeModel;
import in.binplus.exclusivevideoapp.R;


public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.ViewHolder> {
    Context context;
    ArrayList<HomeModel> list;

    public HomeAdapter(Context context, ArrayList<HomeModel> list) {
        this.context = context;
        this.list = list;

    }

    @NonNull
    @Override
    public HomeAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.row_home,null);
        return new ViewHolder(view);
    }

    @SuppressLint("ResourceAsColor")
    @Override
    public void onBindViewHolder(@NonNull HomeAdapter.ViewHolder holder, int position) {

        HomeModel model = list.get(position);


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