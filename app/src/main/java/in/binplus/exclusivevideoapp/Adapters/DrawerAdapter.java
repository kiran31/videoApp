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
import in.binplus.exclusivevideoapp.R;


public class DrawerAdapter extends RecyclerView.Adapter<DrawerAdapter.ViewHolder> {
    Context context;
    ArrayList<DrawerModel> list;

    public DrawerAdapter(Context context, ArrayList<DrawerModel> list) {
        this.context = context;
        this.list = list;

    }

    @NonNull
    @Override
    public DrawerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.row_drawer,null);
        return new ViewHolder(view);
    }

    @SuppressLint("ResourceAsColor")
    @Override
    public void onBindViewHolder(@NonNull DrawerAdapter.ViewHolder holder, int position) {

        DrawerModel model = list.get(position);

        holder.img_drawer.setImageDrawable(context.getResources().getDrawable(model.getImageId()));
        holder.txt_drawer.setText(model.getTitle());

        if (model.isChecked())
        {
            holder.txt_drawer.setTextColor(context.getResources().getColor(R.color.teal_700));
            holder.img_drawer.setColorFilter(ContextCompat.getColor(context,R.color.teal_700));
        }
        else
        {
            holder.txt_drawer.setTextColor(context.getResources().getColor(R.color.black));
            holder.img_drawer.setColorFilter(ContextCompat.getColor(context,R.color.black));
        }


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
        ImageView img_drawer;
        TextView txt_drawer;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            img_drawer = itemView.findViewById(R.id.img_drawer);
            txt_drawer = itemView.findViewById(R.id.text_drawer);
        }
    }
}