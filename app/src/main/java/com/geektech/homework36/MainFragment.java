package com.geektech.homework36;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class MainFragment extends Fragment implements ClickListener {

    private RecyclerView recyclerView;
    private NameAdapter adapter;
    private ArrayList<Model> model;
    public static final String BUNDLE_KEY = "key.bundle";


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        loadData();
        recyclerView = view.findViewById(R.id.recycler);
        adapter = new NameAdapter(model,this::click);
        recyclerView.setAdapter(adapter);
    }

    private void loadData() {
        model = new ArrayList<>();
        model.add(new Model(R.drawable.ic_africa,"Africa"));
        model.add(new Model(R.drawable.ic_asia,"Asia"));
        model.add(new Model(R.drawable.ic_australia,"Australia"));
        model.add(new Model(R.drawable.ic_europe,"Europe"));
        model.add(new Model(R.drawable.ic_north_america,"North America"));
        model.add(new Model(R.drawable.ic_south_america,"South America"));

    }

    @Override
    public void click(Model model) {
        Bundle bundle = new Bundle();
        bundle.putString(BUNDLE_KEY,model.getName());
        Fragment fragment = new SecondFragment();
        fragment.setArguments(bundle);

        requireActivity().getSupportFragmentManager().beginTransaction().
                replace(R.id.container1,fragment).addToBackStack(null).commit();
    }
}