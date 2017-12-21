package com.recyclerview.header;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.recyclerview.header.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by nguyenvanlinh on 12/21/17.
 */

public class HeaderViewHolder extends RecyclerView.ViewHolder{
    @BindView(R.id.header_id)
    TextView headerTitle;
    public HeaderViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this,itemView);
    }
}