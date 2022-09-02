package in.binplus.exclusivevideoapp.Adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import in.binplus.exclusivevideoapp.Model.RelatedProductModel;
import in.binplus.exclusivevideoapp.R;


public class RelatedProductAdapter extends RecyclerView.Adapter<RelatedProductAdapter.ViewHolder> {
    Context context;
    ArrayList<RelatedProductModel> list;

    public RelatedProductAdapter(Context context, ArrayList<RelatedProductModel> list) {
        this.context = context;
        this.list = list;

    }

    @NonNull
    @Override
    public RelatedProductAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.row_drawer,null);
        return new ViewHolder(view);
    }

    @SuppressLint("ResourceAsColor")
    @Override
    public void onBindViewHolder(@NonNull RelatedProductAdapter.ViewHolder holder, int position) {

        RelatedProductModel model = list.get(position);


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
