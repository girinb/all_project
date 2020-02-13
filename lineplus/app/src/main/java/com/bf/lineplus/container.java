package com.bf.lineplus;

import android.view.ViewGroup;

import android.content.Intent;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

public class container extends RecyclerView.Adapter<container.ItemViewHolder> {
	private ArrayList<note_item> mItems;

	container(ArrayList<note_item> items) {
		mItems = items;
	}


	@Override
	public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
		View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
		final ItemViewHolder tempholder = new ItemViewHolder(view);
		tempholder.itemView.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {

			}
		});

//        view.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.mContext, search.class);
//                int itemPosition = parent.getChildPosition(v);
//                String item = mList.get(itemPosition);
//                Toast.makeText(MainActivity.mContext, item, Toast.LENGTH_LONG).show();
//
//                MainActivity.mContext.startActivity(intent);
//            }
//        });
		return new ItemViewHolder(view);
}

	@Override
	public void onBindViewHolder(final ItemViewHolder holder, int position) {
		note_item item = mItems.get(position);
		holder.tv_title.setText(item.getTitle());
		if(item.getImagelist().size() == 0)
		{
			holder.iv_thumbnail.setVisibility(View.GONE);
		}


		holder.shell_layout.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
//				TextView temptv = v.findViewById(R.id.shell_layout).findViewById(R.id.textView_name);
//				Intent intent = new Intent(MainActivity.mContext, search.class);
//				intent.putExtra("title", temptv.getText());
//				MainActivity.mContext.startActivity(intent);
			}
		});
	}


	@Override
	public int getItemCount() {
		return mItems.size();
	}

	class ItemViewHolder extends RecyclerView.ViewHolder {
		private TextView tv_title;
		private ViewGroup shell_layout;
		private TextView tv_subject;
		private ImageView iv_thumbnail;
		ItemViewHolder(View itemView) {
			super(itemView);
			tv_title= itemView.findViewById(R.id.tv_title);
			tv_subject= itemView.findViewById(R.id.tv_subject);
			iv_thumbnail  =itemView.findViewById(R.id.iv_thumbnail);
			shell_layout = itemView.findViewById(R.id.cv_item_layout);

//			nameTv = itemView.findViewById(R.id.textView_name);
//			nameTv.setTypeface(Typeface.createFromAsset(MainActivity.mContext.getAssets(), "font/NEXEN TIRE_Bold.ttf"));
//			shell_layout = itemView.findViewById(R.id.shell_layout);
		}
	}
}
