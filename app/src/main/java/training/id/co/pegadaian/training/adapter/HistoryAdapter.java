package training.id.co.pegadaian.training.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.List;

import training.id.co.pegadaian.training.R;
import training.id.co.pegadaian.training.domain.History;

/**
 * Created by ivan_j4u on 4/12/2016.
 */
public class HistoryAdapter extends ArrayAdapter<History> {

    public HistoryAdapter(Context context, int resource, List<History> objects) {
        super(context, resource, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.layout_history, parent, false);
        }

        History hist = (History) getItem(position);

        TextView lblUser = (TextView) convertView.findViewById(R.id.lblUser);
        TextView lblRekening = (TextView) convertView.findViewById(R.id.lblRekening);
        TextView txtTglTransaksi = (TextView) convertView.findViewById(R.id.txtTglTransaksi);
        TextView txtMutasiKeluar = (TextView) convertView.findViewById(R.id.txtMutasiKeluar);
        TextView txtMutasiMasuk = (TextView) convertView.findViewById(R.id.txtMutasiMasuk);
        TextView txtTotalTransaksi = (TextView) convertView.findViewById(R.id.txtTotalTransaksi);

        SimpleDateFormat sm = new SimpleDateFormat("dd-MM-yyyy");
        lblUser.setText(hist.getNamaNasabah());
        lblRekening.setText(hist.getNoRek());
        txtTglTransaksi.setText(sm.format(hist.getTglTransaksi()));
        txtMutasiKeluar.setText(String.valueOf(hist.getMutasiKeluar()));
        txtMutasiMasuk.setText(String.valueOf(hist.getMutasiMasuk()));
        txtTotalTransaksi.setText(String.valueOf(hist.getTotalTransaksi()));

        return convertView;
    }
}
