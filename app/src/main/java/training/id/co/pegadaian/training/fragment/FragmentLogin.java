package training.id.co.pegadaian.training.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import training.id.co.pegadaian.training.AfterLogin;
import training.id.co.pegadaian.training.R;

/**
 * Created by EJM TI on 4/11/2016.
 */
public class FragmentLogin extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View fragmentView = inflater.inflate(R.layout.fragment_login, container,false);

        Button btnLogin = (Button) fragmentView.findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent AfterLogin = new Intent(getContext(), training.id.co.pegadaian.training.AfterLogin);
                startActivity(training.id.co.pegadaian.training.AfterLogin);
            }
        });
        return fragmentView;
    }
}
