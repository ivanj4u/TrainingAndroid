package training.id.co.pegadaian.training.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import training.id.co.pegadaian.training.AfterLogin;
import training.id.co.pegadaian.training.R;
import training.id.co.pegadaian.training.util.FragmentListener;

/**
 * Created by EJM TI on 4/11/2016.
 */
public class FragmentLogin extends Fragment implements FragmentListener {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View fragmentView = inflater.inflate(R.layout.fr_login, container,false);
        setListener(fragmentView);
        return fragmentView;
    }

    @Override
    public void setListener(View view) {
        final EditText txtUserName = (EditText) view.findViewById(R.id.txtUsername);
        EditText txtPassword = (EditText) view.findViewById(R.id.txtPassword);

        Button btnLogin = (Button) view.findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), AfterLogin.class);
                intent.putExtra("username", txtUserName.getText().toString());
                startActivity(intent);
            }
        });
    }
}
