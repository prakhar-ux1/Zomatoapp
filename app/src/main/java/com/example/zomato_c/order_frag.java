package com.example.zomato_c;


import android.os.Bundle;


import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

/**
 * A simple {@link Fragment} subclass.
 */
public class  order_frag extends Fragment {



    public order_frag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_order_frag, container, false);
        Toolbar toolbar = (Toolbar)view.findViewById(R.id.toolbar_home);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);


        RecyclerView recyclerView=view.findViewById(R.id.recyleview);
        recyclerView.setHasFixedSize(true);
        String[] s1 = view.getResources().getStringArray(R.array.title);
        String[] s2 = view.getResources().getStringArray(R.array.Description);
        int image_res[]={
                R.drawable.a1,
                R.drawable.a2,
                R.drawable.a3,
                R.drawable.a4,R.drawable.a5,
                R.drawable.a6,
                R.drawable.a7,
                R.drawable.a8,
                R.drawable.a9,
                R.drawable.a10,
        };
        double rating[]={3.2,
                5,
                4.5,
                1.2,
                4.3,
                2.6,
                2.9,
                3.8,4.2,4.1
        };

        MyAdapter adapter=new MyAdapter(view.getContext(),s1,s2,image_res,rating);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        return view;

    }

}
