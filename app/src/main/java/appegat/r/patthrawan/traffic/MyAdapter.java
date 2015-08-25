package appegat.r.patthrawan.traffic;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/**
 * Created by ADMIN-IT on 25/8/2558.
 */
public class MyAdapter extends BaseAdapter{
    //Explicit
    private Context objCOContext;
    private int[] iconInts;
    private String[] titleStrings;

    public MyAdapter(Context objCOContext, int[] iconInts, String[] titleStrings) {
        this.objCOContext = objCOContext;
        this.iconInts = iconInts;
        this.titleStrings = titleStrings;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        return null;
    }
}   //Main Class
