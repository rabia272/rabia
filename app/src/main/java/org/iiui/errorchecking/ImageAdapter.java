package org.iiui.errorchecking;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.viewpager.widget.PagerAdapter;

public class ImageAdapter extends PagerAdapter {


    private Context mContext;
    private int[] mImageIds = new int[]{ R.drawable.imagebuilderpic3, R.drawable.imagebuilderpic2, R.drawable.imagebuilderpic4};
    ImageAdapter(Context context)
    {
        mContext = context;
    }
    @Override public int getCount()
    {
        return mImageIds.length;
    }
    @Override public boolean isViewFromObject(View view, Object object)
    {
        return view == object;
    }
    @Override
    public Object instantiateItem(ViewGroup container, int position)
    {
        ImageView imageView = new ImageView(mContext);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageResource(mImageIds[position]);
        container.addView(imageView, 0); return imageView;
    }
        @Override public void destroyItem(ViewGroup container, int position, Object object)
        {
            container.removeView((ImageView) object);
        }
}
