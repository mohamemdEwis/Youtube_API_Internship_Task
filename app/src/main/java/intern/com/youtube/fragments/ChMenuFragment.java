package intern.com.youtube.fragments;



import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;

import intern.com.youtube.MainActivity;
import intern.com.youtube.R;
import intern.com.youtube.adapters.ChannelsAdapterr;
/**
 * Created by mohammed Ewis on 25/03/20.
 */

public class ChMenuFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater,@Nullable ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_ChMenu, container, false);
        RecyclerView recyclerView = (RecyclerView)rootView.findViewById(R.id.ch_list);
        ChannelsAdapterr itemArrayAdapter = new ChannelsAdapterr();
       recyclerView.setAdapter(itemArrayAdapter);
        RecyclerView.LayoutManager layoutManager =new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        return rootView;
    }


}
