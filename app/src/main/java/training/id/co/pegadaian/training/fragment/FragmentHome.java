package training.id.co.pegadaian.training.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import training.id.co.pegadaian.training.R;

/**
 * Created by EJM TI on 4/11/2016.
 */
public class FragmentHome extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fr_home, container, false);
    }
}
