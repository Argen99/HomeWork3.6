package com.geektech.homework36;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class NameAdapter extends RecyclerView.Adapter<NameAdapter.NameViewHolder> {

    private ArrayList<Model> data;
    private ClickListener onClick;

    public NameAdapter(ArrayList<Model> data, ClickListener onClick) {
        this.data = data;
        this.onClick = onClick;
    }

    @NonNull
    @Override
    public NameViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new NameViewHolder(LayoutInflater.from(parent.getContext()).
                inflate(R.layout.item_continents,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull NameViewHolder holder, int position) {
        holder.bind(data.get(position));

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class NameViewHolder extends RecyclerView.ViewHolder{

        private TextView tvName;
        private ImageView imageView;

        public NameViewHolder(@NonNull View itemView) {
           super(itemView);
           tvName = itemView.findViewById(R.id.tv_name);
           imageView = itemView.findViewById(R.id.image);
       }

        public void bind(Model model) {
            tvName.setText(model.getName());
            imageView.setImageResource(model.getImage());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    onClick.click(data.get(getLayoutPosition()));
                }
            });
        }
    }
}
