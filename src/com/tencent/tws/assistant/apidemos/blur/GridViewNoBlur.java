/*
 * Copyright (C) 2014 Recruit Marketing Partners Co.,Ltd
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.tencent.tws.assistant.apidemos.blur;

import android.app.TwsActivity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.tencent.tws.assistant.widget.GridView;
import com.tencent.tws.devicemanager.R;

public class GridViewNoBlur extends TwsActivity {

	private GridViewAdapter mAdapter;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Window window = getWindow();
        window.requestFeature(Window.FEATURE_ACTION_BAR_OVERLAY);
        
		setContentView(R.layout.grid_view_demo);

		GridView gridView = (GridView) findViewById(R.id.HeaderFooterGridView);
		
		mAdapter = new GridViewAdapter(this);
		
		gridView.setHeaderBlankWithStatusbar(false);
		gridView.setFooterBlank(false);
		
		gridView.setAdapter(mAdapter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return super.onCreateOptionsMenu(menu);
	}
	
	private class GridViewAdapter extends BaseAdapter {

	    private final String[] CONTENTS = new String[]{
	            "Grid1", "Grid2", "Grid3", "Grid4", "Grid5", "Grid6",
	            "Grid1", "Grid2", "Grid3", "Grid4", "Grid5", "Grid6",
	            "Grid1", "Grid2", "Grid3", "Grid4", "Grid5", "Grid6",
	            "Grid1", "Grid2", "Grid3", "Grid4", "Grid5", "Grid6",
	            "Grid1", "Grid2", "Grid3", "Grid4", "Grid5", "Grid6",
	            "Grid1", "Grid2", "Grid3", "Grid4", "Grid5", "Grid6",
	            "Grid1", "Grid2", "Grid3", "Grid4", "Grid5", "Grid6",
	            "Grid1", "Grid2", "Grid3", "Grid4", "Grid5", "Grid6",
	            "Grid1", "Grid2", "Grid3", "Grid4", "Grid5", "Grid6",
	            "Grid1", "Grid2", "Grid3", "Grid4", "Grid5", "Grid6",
	            "Grid1", "Grid2", "Grid3", "Grid4", "Grid5", "Grid6",
	            "Grid1", "Grid2", "Grid3", "Grid4", "Grid5", "Grid6",
	            "Grid1", "Grid2", "Grid3", "Grid4", "Grid5", "Grid6",
	    };

	    private LayoutInflater mInflater;

	    public GridViewAdapter(Context context) {
	        mInflater = LayoutInflater.from(context);
	    }

	    @Override
	    public int getCount() {
	        return CONTENTS.length;
	    }

	    @Override
	    public Object getItem(int position) {
	        return CONTENTS[position];
	    }

	    @Override
	    public long getItemId(int position) {
	        return position;
	    }

	    @Override
	    public View getView(int position, View convertView, ViewGroup parent) {
	        ViewHolder holder;

	        if (convertView == null || convertView.getTag() == null || !(convertView.getTag() instanceof ViewHolder)) {
	            convertView = mInflater.inflate(R.layout.grid_item, null);
	            holder = new ViewHolder();
	            holder.mTextView = (TextView) convertView.findViewById(R.id.text);
	            convertView.setTag(holder);
	        } else {
	            holder = (ViewHolder) convertView.getTag();
	        }

	        holder.mTextView.setText(CONTENTS[position]);

	        return convertView;
	    }

	    private class ViewHolder {
	        TextView mTextView;
	    }

	}
}
