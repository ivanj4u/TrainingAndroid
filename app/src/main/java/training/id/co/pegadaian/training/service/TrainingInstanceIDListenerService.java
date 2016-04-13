package training.id.co.pegadaian.training.service;

import android.content.Intent;
import android.util.Log;

import com.google.android.gms.iid.InstanceIDListenerService;

/**
 * Created by ivan_j4u on 4/13/2016.
 */
public class TrainingInstanceIDListenerService extends InstanceIDListenerService {

    private final static String TAG = "PembayaranISDL";

    @Override
    public void onTokenRefresh() {
        // Fetch updated Instance ID token and notify our app's server of any changes (if applicable).
        Intent intent = new Intent(this, TrainingRegisterGcmService.class);
        startService(intent);
        Log.d(TAG, "Refreshing GCM Token");
    }
}
