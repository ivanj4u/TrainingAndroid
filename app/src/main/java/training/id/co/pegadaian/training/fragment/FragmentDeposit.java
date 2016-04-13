package training.id.co.pegadaian.training.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import training.id.co.pegadaian.training.R;
import training.id.co.pegadaian.training.listener.FragmentListener;

/**
 * Created by ivan_j4u on 4/11/2016.
 */
public class FragmentDeposit extends Fragment implements FragmentListener {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fr_deposit, container, false);
        setListener(view);
        return view;
    }

    @Override
    public void setListener(View view) {

    }
}
