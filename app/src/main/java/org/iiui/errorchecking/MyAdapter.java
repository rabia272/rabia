package org.iiui.errorchecking;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    String data1[];
    int images[];
    int images1[];
    Context context;
    private OnItemClickListener mListener;
    public interface OnItemClickListener{
        void onItemClick(int position);
    }
    public  void setOnItemClickListener(OnItemClickListener listener)
    {
        mListener=listener;
    }
    public MyAdapter(Context ct, String s1[], int img[], int img1[])
    {
         context=ct;
         data1=s1;
         images=img;
         images1=img1;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.my_row,parent,false);

        return new MyViewHolder(view,mListener);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
            holder.t1.setText(data1[position]);
            holder.img1.setImageResource(images[position]);
            holder.img2.setImageResource(images1[position]);


    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView t1;
        ImageView img1;
        ImageView img2;
        public MyViewHolder(@NonNull View itemView, final OnItemClickListener listener) {
            super(itemView);
            t1=itemView.findViewById(R.id.mytxtview);
            img1=itemView.findViewById(R.id.myimageview);
            img2=itemView.findViewById(R.id.imageView5);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                if(listener!=null)
                {
                    int position=getAdapterPosition();
                    if(position!=RecyclerView.NO_POSITION)
                    {
                        listener.onItemClick(position);
                    }
                }
                }
            });

        }
    }
}
