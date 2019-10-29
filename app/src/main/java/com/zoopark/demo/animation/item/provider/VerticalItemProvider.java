package com.zoopark.demo.animation.item.provider;

import android.content.Context;

import com.zoopark.demo.R;
import com.zoopark.rv.base.provider.BaseItemProvider;
import com.zoopark.rv.base.holder.BaseViewHolder;
import com.zoopark.rv.base.model.IndexPath;

import java.util.ArrayList;
import java.util.List;

public class VerticalItemProvider extends BaseItemProvider<List<Integer>> {

    private List<Integer> mData;

    public VerticalItemProvider(Context context) {
        super(context);
        mData = new ArrayList<>();
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    @Override
    public int getLayout() {
        return R.layout.item_element_vertical;
    }

    @Override
    public void onBind(BaseViewHolder holder, IndexPath indexPath) {
        holder.setText(R.id.button, String.valueOf(mData.get(indexPath.getRow())));
    }

    @Override
    public void setData(List<Integer> newData) {
        this.mData = newData;
    }
}
