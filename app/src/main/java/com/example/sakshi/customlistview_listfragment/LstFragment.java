package com.example.sakshi.customlistview_listfragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import static android.R.attr.name;
import static android.R.id.list;


public class LstFragment extends Fragment {
    ArrayList<Data> arrayList;
    ListView list ;

    public LstFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_lst, container, false);
        list = (ListView)v.findViewById(R.id.list);
        String facebook="Facebook is a popular free social networking website that allows registered users to create profiles, upload photos and video, send messages and keep in touch with friends, family and colleagues.";
        String  instagram = "nstagram is a mobile, desktop, and internet-based photo-sharing application and service that allows users to share pictures and videos either publicly or privately. ";
        String youtube= "Youtube is a video sharing website.";
        String name[] = new String[]{"Facebook","Instagram","Youtube"};
        String desc[] = new String[]{facebook,instagram,youtube};
        int id [] = new int[]{R.drawable.facebook,R.drawable.instagram,R.drawable.youtube};
        arrayList = new ArrayList();
        for(int i = 0 ; i<name.length;i++){
            Data data = new Data();
            data.setName(name[i]);
            data.setDesc(desc[i]);
            data.setId(id[i]);
            arrayList.add(data);
        }
      CustomAdapter adapter = new CustomAdapter(this,arrayList);
        list.setAdapter(adapter);
        return v;
    }
}
