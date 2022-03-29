package com.geektech.homework36;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;


public class SecondFragment extends Fragment implements ClickListener{

    private RecyclerView recyclerView;
    private NameAdapter adapter;
    private ArrayList<Model> data;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        recyclerView = view.findViewById(R.id.recycler2);

        loadDAta();

        adapter = new NameAdapter(data, this::click);
        recyclerView.setAdapter(adapter);


    }

    private void loadDAta() {
        data = new ArrayList<>();
        Bundle bundle = getArguments();

        if (getArguments() != null) {
            String asd = bundle.getString(MainFragment.BUNDLE_KEY);

            Toast.makeText(requireContext(), asd, Toast.LENGTH_SHORT).show();

            switch (asd){
                case "Africa":
                    data.add(new Model(R.drawable.ic_nigeria,"Nigeria"));
                    data.add(new Model(R.drawable.ic_tunisia,"Tunisia"));
                    data.add(new Model(R.drawable.ic_seychelles,"Seychelles"));
                    data.add(new Model(R.drawable.ic_somalia,"Somalia"));
                    data.add(new Model(R.drawable.ic_tunisia,"Tunisia"));
                    break;
                case "Asia":
                    data.add(new Model(R.drawable.ic_kyrgyzstan,"Kyrgyzstan"));
                    data.add(new Model(R.drawable.ic_kazakhstan,"Kazakhstan"));
                    data.add(new Model(R.drawable.ic_japan,"Japan"));
                    data.add(new Model(R.drawable.ic_kuwait,"Kuwait"));
                    data.add(new Model(R.drawable.ic_india,"India"));
                    break;
                case "Australia":
                    data.add(new Model(R.drawable.ic_palau,"Palau"));
                    data.add(new Model(R.drawable.ic_fiji,"Fiji"));
                    data.add(new Model(R.drawable.ic_new_zealand,"New Zealand"));
                    data.add(new Model(R.drawable.ic_micronesia,"Micronesia"));
                    data.add(new Model(R.drawable.ic_papua_new_guinea,"Papua New Guinea"));
                    break;
                case "Europe":
                    data.add(new Model(R.drawable.ic_italia,"Italy"));
                    data.add(new Model(R.drawable.ic_germany,"Germany"));
                    data.add(new Model(R.drawable.ic_switzerland,"Switzerland"));
                    data.add(new Model(R.drawable.ic_spain,"Spain"));
                    data.add(new Model(R.drawable.ic_finland,"Finland"));
                    break;
                case "North America":
                    data.add(new Model(R.drawable.ic_canada,"Canada"));
                    data.add(new Model(R.drawable.ic_nicaragua,"Nicaragua"));
                    data.add(new Model(R.drawable.ic_trinidad_and_tobago,"Trinidad and Tobago"));
                    data.add(new Model(R.drawable.ic_saint_lucia,"Saint Lucia"));
                    data.add(new Model(R.drawable.ic_montserrat,"Montserrat"));
                    break;
                case "South America":
                    data.add(new Model(R.drawable.ic_argentina,"Argentina"));
                    data.add(new Model(R.drawable.ic_brazil,"Brazil"));
                    data.add(new Model(R.drawable.ic_colombia,"Colombia"));
                    data.add(new Model(R.drawable.ic_chile,"Chile"));
                    data.add(new Model(R.drawable.ic_guyana,"Guyana"));
                    break;

            }
        }



    }

    @Override
    public void click(Model model) {

    }
}