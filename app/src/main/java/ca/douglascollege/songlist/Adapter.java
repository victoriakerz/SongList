package ca.douglascollege.songlist;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Adapter extends BaseAdapter {
    List<String> mySongList = new ArrayList<>();
    List<Integer> mySongImages = new ArrayList<>();
    Context context;

    public Adapter(Context anyContext, List<String> anyList, List<Integer> anyPics){
        context = anyContext;
        mySongList = anyList;
        mySongImages = anyPics;
    }
    @Override
    public int getCount() {
        return mySongList.size(); //returns number of items in list
    }

    @Override
    public Object getItem(int position) {
        return mySongList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null){
            LayoutInflater myLayoutInflater = LayoutInflater.from(context);
            convertView = myLayoutInflater.inflate(R.layout.external_layout, parent, false);
        }
        TextView txtViewItem = convertView.findViewById(R.id.listViewSongs);
        txtViewItem.setText(mySongList.get(position));
        Drawable img = parent.getResources().getDrawable(mySongImages.get(position));
        img.setBounds(0,0,80,80);
        txtViewItem.setCompoundDrawables(img, null,null,null);
        txtViewItem.setCompoundDrawablePadding(16);
        txtViewItem.setGravity(Gravity.CENTER_VERTICAL | Gravity.LEFT);
        return convertView;
    }
}
