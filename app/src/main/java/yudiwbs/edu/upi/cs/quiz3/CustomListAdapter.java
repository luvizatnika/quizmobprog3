package yudiwbs.edu.upi.cs.quiz3;

import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomListAdapter extends RecyclerView.Adapter<CustomListAdapter.ViewHolderMahasiswa> {

    private Activity activity;
    private LayoutInflater inflater;
    private ArrayList<Mahasiswa> Items;

    public CustomListAdapter(Activity activity, ArrayList<Mahasiswa> Items){
        this.activity = activity;
        this.Items = Items;
    }


    @NonNull
    @Override
    public CustomListAdapter.ViewHolderMahasiswa onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.mahasiswa_row,parent,false);
        return new ViewHolderMahasiswa(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull final CustomListAdapter.ViewHolderMahasiswa holder, final int position) {
        final Mahasiswa m = Items.get(position);
        holder.tvNama.setText(m.get_nama());
        holder.tvAlamat.setText(m.get_alamat());
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getItemCount() {
        return Items.size();
    }

    public class ViewHolderMahasiswa extends RecyclerView.ViewHolder {

        TextView tvNama, tvAlamat;
        Mahasiswa m;

        public ViewHolderMahasiswa(@NonNull View itemView) {
            super(itemView);
            tvNama = itemView.findViewById(R.id.tvNama);
            tvAlamat = itemView.findViewById(R.id.tvAlamat);
        }
    }

    /*@Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (inflater == null)
            inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (convertView == null)
            convertView = inflater.inflate(R.layout.mahasiswa_row, null);

        TextView nama = (TextView) convertView.findViewById(R.id.tvNama);
        TextView alamat = (TextView) convertView.findViewById(R.id.tvAlamat);

        Mahasiswa m = Items.get(position);

        nama.setText("Nama :"+ m.get_nama());
        alamat.setText("Alamat :"+ m.get_alamat());


        return convertView;
    }*/
}
