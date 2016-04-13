package training.id.co.pegadaian.training.service;

import android.os.Bundle;
import android.util.Log;

import com.google.android.gms.gcm.GcmListenerService;

/**
 * Created by ivan_j4u on 4/13/2016.
 */
public class TrainingGcmHandlerService extends GcmListenerService {

    private static final String TAG = "GcmReceiver";

    @Override
    public void onMessageReceived(String from, Bundle data) {
        Log.d(TAG, "From : "+from);
        Log.d(TAG, "Action : "+data.getString("action"));
        Log.d(TAG, "Content : "+data.getString("content"));
    }
}
