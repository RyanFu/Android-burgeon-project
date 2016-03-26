package com.tencent.tws.assistant.apidemos.actiontab;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.tencent.tws.assistant.apidemos.actiontab.TwsActionBarTabSecondCustom.ListItemInterface;
import com.tencent.tws.assistant.support.v4.app.Fragment;
import com.tencent.tws.assistant.widget.ListView;
import com.tencent.tws.devicemanager.R;

public class ListviewFragment extends Fragment implements ListItemInterface {
    String[] dataList;
    private ListView mListView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_section_dummy, container, false);
        dataList = getResources().getStringArray(R.array.date);
        mListView = (ListView) rootView.findViewById(R.id.listview);
        int listPadding = getResources().getDimensionPixelSize(R.dimen.tws_action_bar_height)
                + getResources().getDimensionPixelSize(R.dimen.tws_action_bar_tab_second_height)
                - getResources().getDimensionPixelSize(R.dimen.tws_action_bar_shadow_height);

        mListView.setAdapter(new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1, dataList));
        
        return rootView;
    }

    @Override
    public void onListItemTranslationChange(int lastPosition, int position, float positionOffset, int index) {
        if (mListView != null) {
            mListView.twsUpdateItemViewTranslation(lastPosition, position, positionOffset, index);
        }
    }
}
