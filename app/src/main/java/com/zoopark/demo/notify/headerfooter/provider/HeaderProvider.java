package com.zoopark.demo.notify.headerfooter.provider;

import android.content.Context;

import com.zoopark.demo.R;
import com.zoopark.rv.base.provider.BaseSectionHeaderFooter;
import com.zoopark.rv.base.holder.BaseViewHolder;
import com.zoopark.rv.base.model.IndexPath;

public class HeaderProvider extends BaseSectionHeaderFooter<String> {

    private String mTitle;

    public HeaderProvider(Context context) {
        super(context);
    }

    @Override
    public int getLayout() {
        return R.layout.item_decoration_header;
    }

    @Override
    public void onBind(BaseViewHolder holder, IndexPath indexPath) {
        holder.setText(R.id.tv_title, mTitle);
    }

    @Override
    public void setData(String newData) {
        super.setData(newData);
        mTitle = newData;
    }
}
