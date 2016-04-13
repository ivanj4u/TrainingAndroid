package training.id.co.pegadaian.training.service;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

import com.google.android.gms.gcm.GoogleCloudMessaging;
import com.google.android.gms.iid.InstanceID;

import java.io.IOException;

import training.id.co.pegadaian.training.R;

/**
 * Created by ivan_j4u on 4/13/2016.
 */
public class TrainingRegisterGcmService extends IntentService {

    private final static String TAG = "RegIntentService";

    public TrainingRegisterGcmService() {
        super(TAG);
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        InstanceID instanceID = InstanceID.getInstance(this);
        String token = null;
        try {
            Log.d(TAG, "Memulai registasi GCM");
            token = instanceID.getToken(getString(R.string.api_sender_key),
                    GoogleCloudMessaging.INSTANCE_ID_SCOPE, null);
        } catch (IOException e) {
            Log.e(TAG, "GCM Registration gagal : "+e.getMessage());
        }
        Log.i(TAG, "GCM Registration Token: " + token);
    }
}
