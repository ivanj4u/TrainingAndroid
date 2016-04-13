package training.id.co.pegadaian.training.fragment;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import training.id.co.pegadaian.training.activity.AfterLogin;
import training.id.co.pegadaian.training.R;
import training.id.co.pegadaian.training.exception.LoginFailedException;
import training.id.co.pegadaian.training.listener.FragmentListener;
import training.id.co.pegadaian.training.rest.PembayaranRestClient;

/**
 * Created by EJM TI on 4/11/2016.
 */
public class FragmentLogin extends Fragment implements FragmentListener {

    private static final String TAG = "Login";
    private PembayaranRestClient client = new PembayaranRestClient();

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
        final EditText txtPassword = (EditText) view.findViewById(R.id.txtPassword);

        final Button btnLogin = (Button) view.findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                new AsyncTask<String, Void, Boolean>() {
                    ProgressDialog progressDialog;
                    String errorMessage;

                    @Override
                    protected void onPreExecute() {
                        progressDialog = ProgressDialog.show(getContext(),
                                "Login", "Logging in", true);
                        btnLogin.setEnabled(false);
                    }

                    @Override
                    protected Boolean doInBackground(String... params) {
                        try {
                            Log.d(TAG, "Login : "+params);
                            client.login(params[0], params[1]);
                            return true;
                        } catch (LoginFailedException err){
                            errorMessage = err.getMessage();
                            Log.d(TAG, "Login error : "+err.getMessage());
                            return false;
                        }
                    }

                    @Override
                    protected void onPostExecute(Boolean sukses) {
                        btnLogin.setEnabled(true);
                        progressDialog.dismiss();
                        Log.d(TAG, "Login sukses : "+sukses);
                        if(sukses) {
                            Intent setelahLoginActivity
                                    = new Intent(getContext(), AfterLogin.class);
                            startActivity(setelahLoginActivity);
                        } else {
                            Toast.makeText(getContext(), errorMessage, Toast.LENGTH_LONG)
                                    .show();
                        }
                    }
                }.execute(txtUserName.getText().toString(), txtPassword.getText().toString());
            }
        });
    }
}
