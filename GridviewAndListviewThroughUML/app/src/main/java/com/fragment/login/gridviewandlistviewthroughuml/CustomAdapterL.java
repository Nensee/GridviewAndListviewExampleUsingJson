package com.fragment.login.gridviewandlistviewthroughuml;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by nensee on 2/13/17.
 */
public class CustomAdapterL extends BaseAdapter {

    Context context;
    ArrayList<Quotes> posts;
    LayoutInflater layoutInflater;


    CustomAdapterL(Context context, ArrayList<Quotes> posts)
    {
        this.context=context;
        this.posts=posts;
    }

    @Override
    public int getCount() {
        return posts.size();
    }

    @Override
    public Object getItem(int position) {
        return posts.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }



    static class ViewHolder
    {
        TextView id;
        TextView cat_id;
        TextView quotes;


    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        ViewHolder holder;
        
       
        if(convertView==null) {
            holder = new ViewHolder();

            convertView = LayoutInflater.from(context).inflate(R.layout.listview, parent, false);
            holder.id = (TextView) convertView.findViewById(R.id.textvw3);
            holder.cat_id = (TextView) convertView.findViewById(R.id.textvw4);
            holder.quotes=(TextView)convertView.findViewById(R.id.textvw5);

            convertView.setTag(holder);
        }
        else
        {
            holder=(ViewHolder)convertView.getTag();
        }
        holder.quotes.setText("Quotes: "+posts.get(position).getQuotes());


        return convertView;

    }
}
