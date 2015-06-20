package com.example.retroglide.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.retroglide.model.Dataset;
import com.example.retroglide.test.R;

import java.util.List;

/**
 * Created by dhiman_da on 6/20/2015.
 */
public class DataSetAdapter extends RecyclerView.Adapter<DataSetAdapter.DataSetViewHolder> {
    private List<Dataset> mDataSets;

    public DataSetAdapter(final List<Dataset> datasets) {
        mDataSets = datasets;
    }

    @Override
    public DataSetViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        final LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        final View view = inflater.inflate(R.layout.adapter_dataset, viewGroup, false);
        final DataSetViewHolder viewHolder = new DataSetViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(DataSetViewHolder dataSetViewHolder, int i) {
        Glide.with(dataSetViewHolder.mImageView.getContext()).load(mDataSets.get(i).curatorImageFile).fitCenter().into(dataSetViewHolder.mImageView);
        dataSetViewHolder.mTextView.setText(mDataSets.get(i).curatorHandle);
    }

    @Override
    public int getItemCount() {
        return mDataSets.size();
    }

    public static class DataSetViewHolder extends RecyclerView.ViewHolder {
        private ImageView mImageView;
        private TextView mTextView;

        public DataSetViewHolder(View itemView) {
            super(itemView);

            mImageView = (ImageView) itemView.findViewById(R.id.adapter_dataset_image_view);
            mTextView = (TextView) itemView.findViewById(R.id.adapter_dataset_text_view);
        }
    }
}
