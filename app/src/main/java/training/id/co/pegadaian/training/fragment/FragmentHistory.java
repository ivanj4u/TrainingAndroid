package training.id.co.pegadaian.training.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import training.id.co.pegadaian.training.R;
import training.id.co.pegadaian.training.adapter.HistoryAdapter;
import training.id.co.pegadaian.training.dao.HistoryDao;

/**
 * Created by ivan_j4u on 4/12/2016.
 */
public class FragmentHistory extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fr_history, container, false);

        HistoryAdapter adapter = new HistoryAdapter(getContext(), R.layout.layout_history, HistoryDao.getHistory());

        ListView listView = (ListView) view.findViewById(R.id.listHistory);
        listView.setAdapter(adapter);

        return view;
    }
}
