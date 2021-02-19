
package org.iiui.errorchecking;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class Carservicesadapterclass extends RecyclerView.Adapter<Carservicesadapterclass.MyViewHolder> {
    CheckBox chk;
    String data1[];
    String prices[];

    Context context;

    public Carservicesadapterclass(Context ct, String s1[], String p[]) {
        context = ct;
        data1 = s1;
       prices=p;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.my_row, parent, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
      holder.t1.setText(data1[position]);
      holder.t2.setText(prices[position]);
    }



    @Override
    public int getItemCount() {
        return data1.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView t1;
        TextView t2;
        CheckBox c1;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            t1 =(TextView) itemView.findViewById(R.id.myCarServicetxtview);
            t2 = (TextView)itemView.findViewById(R.id.pricetextview);
            c1 = itemView.findViewById(R.id.mycheckbox);


        }
        }
    }



