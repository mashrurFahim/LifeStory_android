package com.example.fahim.lifestory.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.fahim.lifestory.R;
import com.example.fahim.lifestory.model.DemoData;
import com.example.fahim.lifestory.model.ListItem;

import java.util.List;

import static com.example.fahim.lifestory.R.drawable.like;
import static com.example.fahim.lifestory.R.id.activity_main;
import static com.example.fahim.lifestory.R.id.profile_name;
import static com.example.fahim.lifestory.R.id.status_bar;
import static com.example.fahim.lifestory.R.id.timestamp;

/**
 * Created by Fahim on 2/12/2017.
 */

public class StoryItemAdapter extends RecyclerView.Adapter<StoryItemAdapter.ItemHolder> {

    private List<ListItem> listData;
    private LayoutInflater inflater;
    private Context mContext;

    public StoryItemAdapter(List<ListItem> listData, Context c){
        mContext = c;
        this.inflater = LayoutInflater.from(c);
        this.listData = listData;

    }
    @Override
    public ItemHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.list_item, parent, false);
        return new ItemHolder(view);
    }

    @Override
    public void onBindViewHolder(ItemHolder holder, int position) {
        holder.bindTo(listData.get(position), position);
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    class ItemHolder extends RecyclerView.ViewHolder {

        private ImageView profileImage;
        private TextView profileName;
        private TextView tvCategory;
        private TextView statusTime;
        private TextView profileStatus;
        private ImageView statusImage;
        private TextView likeCount;
        private View container;

        public ItemHolder(View itemView) {
            super(itemView);
            profileImage = (ImageView) itemView.findViewById(R.id.profile_image);
            profileName = (TextView) itemView.findViewById(R.id.profile_name);
            tvCategory = (TextView) itemView.findViewById(R.id.status_type);
            statusTime = (TextView) itemView.findViewById(R.id.timestamp);
            profileStatus = (TextView) itemView.findViewById(R.id.status_bar);
            statusImage = (ImageView) itemView.findViewById(R.id.status_image);
            likeCount = (TextView) itemView.findViewById(R.id.likes);
            container = itemView.findViewById(R.id.activity_main);
        }

        public void bindTo(final ListItem item, final int position) {

            profileImage.setImageResource(item.getProfileImage());
            profileName.setText(item.getProfileName());
            tvCategory.setCompoundDrawablesWithIntrinsicBounds(item.getCatagoryIconId(), 0, 0, 0);
            tvCategory.setText(item.getCatagoryStatus());
            statusTime.setText(item.getStatusTime());
            profileStatus.setText(item.getProfileStatus());

            switch (item.getCatagoryStatus()) {
                case "Festival":
                    statusImage.setVisibility(View.VISIBLE);
                    statusImage.setImageResource(R.drawable.bosonto_utsab);
                    break;
                case "Travel":
                    statusImage.setVisibility(View.VISIBLE);
                    statusImage.setImageResource(R.drawable.default_map);
                    break;
                case "Plan":
                    statusImage.setVisibility(View.VISIBLE);
                    statusImage.setImageResource(R.drawable.weekend_plan);
                    break;
                default:
                    statusImage.setVisibility(View.GONE);
            }

            likeCount.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    if(DemoData.like_update[position].equals("Unlike")) {
                        ((TextView)v).setCompoundDrawablesWithIntrinsicBounds(R.drawable.like,0,0,0);
                        ((TextView)v).setText("Like");
                        DemoData.like_update[position] = "Like";
                        DemoData.like_icon[position] = R.drawable.like;
                    }
                    else {
                        ((TextView)v).setCompoundDrawablesWithIntrinsicBounds(R.drawable.like_pressed,0,0,0);
                        ((TextView)v).setText("Unlike");
                        DemoData.like_update[position] = "Unlike";
                        DemoData.like_icon[position] = R.drawable.like_pressed;
                    }
                }

            });
        }
    }
}
