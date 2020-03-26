package com.parkjsdev.jsonapireader;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

public class EmptyRecyclerView extends RecyclerView.Adapter<EmptyViewHolder> {
    @Override
    public EmptyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(EmptyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}