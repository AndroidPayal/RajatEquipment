package com.cluebix.payal.rajatequipment.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.cluebix.payal.rajatequipment.Model.ListItem;
import com.cluebix.payal.rajatequipment.R;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;


public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {

    private Context context;
    private  List<ListItem> listItems;
    private ArrayList<String> photoIdArray;

    public MainAdapter(Context context, List listItems, ArrayList photoIdArray) {
        this.context = context;
        this.listItems = listItems;
        this.photoIdArray = photoIdArray;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.main_adapter,parent,false);
      return new ViewHolder(view);
    }

    public void notifyData(List<ListItem> listItem2)
    {
        this.listItems=listItem2  ;
        notifyDataSetChanged();
    }

    @Override
    public void onBindViewHolder(MainAdapter.ViewHolder holder, int position) {
        ListItem item = listItems.get(position);
        holder.p_name.setText(item.getP_name());
        holder.p_image.setImageResource(item.getP_imageId());
    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
       public TextView p_name;
        public CircleImageView p_image;

        public ViewHolder(View itemView) {
            super(itemView);
            p_name = itemView.findViewById(R.id.main_name);
            p_image = itemView.findViewById(R.id.main_image);
        }
    }
}
