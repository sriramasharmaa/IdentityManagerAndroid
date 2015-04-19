package com.dotg.www.identitymanager.View;

import android.app.Activity;
import android.content.Context;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.dotg.www.identitymanager.Model.Beans.WebsiteDetailsBean;
import com.dotg.www.identitymanager.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kameshwarsheoran on 18/04/15.
 */
public class CustomListAdaptor extends BaseAdapter {
    private LayoutInflater inflater;
    private Activity activity;
    List<WebsiteDetailsBean> items;
    public CustomListAdaptor(Activity activity, List<WebsiteDetailsBean> items) {
        this.activity = activity;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();
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
        if (view == null) {
            inflater = (LayoutInflater) activity
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            view = inflater.inflate(R.layout.website_template, null);
        }


        return view;
    }
}
