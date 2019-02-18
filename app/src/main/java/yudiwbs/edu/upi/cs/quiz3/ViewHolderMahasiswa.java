package yudiwbs.edu.upi.cs.quiz3;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class ViewHolderMahasiswa extends RecyclerView.ViewHolder {

    TextView tvNama, tvAlamat;

    public ViewHolderMahasiswa(@NonNull View itemView) {
        super(itemView);
        tvNama = (TextView) itemView.findViewById(R.id.tvNama);
        tvAlamat = (TextView) itemView.findViewById(R.id.tvAlamat);

    }
}
