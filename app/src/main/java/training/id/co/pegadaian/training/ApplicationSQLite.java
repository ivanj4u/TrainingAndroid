package training.id.co.pegadaian.training;

import android.app.Application;
import android.util.Log;

import com.facebook.stetho.Stetho;

/**
 * Created by ivan_j4u on 4/13/2016.
 */
public class ApplicationSQLite extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        // Install SQLite
        Log.d("Install SQLite","Installing SQLite....");
        Stetho.initializeWithDefaults(this);
    }
}
