package com.example.stockinventorymanagement;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PinAdapterClass extends RecyclerView.Adapter<PinAdapterClass.ViewHolder> {

    List<PinModelClass> pin;
    Context context;
    DatabaseHelperpin databaseHelperClass;

    public PinAdapterClass(List<PinModelClass> pin, Context context) {
        this.pin = pin;
        this.context = context;
        databaseHelperClass = new DatabaseHelperpin(context);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.employee_item_list2,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
        final PinModelClass pinModelClass = pin.get(position);

        holder.textViewID.setText(Integer.toString(pinModelClass.getId()));
        holder.editText_Date.setText(pinModelClass.getDate());
        holder.editText_Pnames.setText(pinModelClass.getPnames());
        holder.editText_Transtype.setText(pinModelClass.getTranstype());
        holder.editText_Cs.setText(pinModelClass.getCs());
        holder.editText_Q.setText(pinModelClass.getQ());

        holder.button_Edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringDate = holder.editText_Date.getText().toString();
                String stringPnames = holder.editText_Pnames.getText().toString();
                String stringTranstype = holder.editText_Transtype.getText().toString();
                String stringCs = holder.editText_Cs.getText().toString();
                String stringQ = holder.editText_Q.getText().toString();

                databaseHelperClass.updatePin(new PinModelClass(pinModelClass.getId(),stringDate,stringPnames,stringTranstype,stringCs,stringQ));
                notifyDataSetChanged();
                ((Activity) context).finish();
                context.startActivity(((Activity) context).getIntent());
            }
        });

        holder.button_delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                databaseHelperClass.deletePin(pinModelClass.getId());
                pin.remove(position);
                notifyDataSetChanged();
            }
        });

    }

    @Override
    public int getItemCount() {
        return pin.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView textViewID;
        EditText editText_Date;
        EditText editText_Pnames;
        EditText editText_Transtype;
        EditText editText_Cs;
        EditText editText_Q;
        Button button_Edit;
        Button button_delete;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textViewID = itemView.findViewById(R.id.text_id);
            editText_Date = itemView.findViewById(R.id.edittext_date);
            editText_Pnames = itemView.findViewById(R.id.edittext_pinput);
            editText_Transtype = itemView.findViewById(R.id.edittext_transtypeinput);
            editText_Cs = itemView.findViewById(R.id.edittext_csinput);
            editText_Q= itemView.findViewById(R.id.edittext_qinput);

            button_delete = itemView.findViewById(R.id.button_delete);
            button_Edit = itemView.findViewById(R.id.button_edit);

        }
    }
}
