package pt.aptoide.backupapps;

import android.app.Activity;
import android.os.Bundle;

import pt.aptoide.backupapps.analytics.Analytics;

/**
 * Created by neuro on 09-02-2016.
 */
public class BaseActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Analytics.Lifecycle.Activity.onCreate(this);
	}

	@Override
	protected void onStart() {
		super.onStart();
		Analytics.Lifecycle.Activity.onStart(this);
	}

	@Override
	protected void onResume() {
		super.onResume();
		Analytics.Lifecycle.Activity.onResume(this);
	}

	@Override
	protected void onPause() {
		Analytics.Lifecycle.Activity.onPause(this);
		super.onPause();
	}

	@Override
	protected void onStop() {
		Analytics.Lifecycle.Activity.onStop(this);
		super.onStop();
	}

	@Override
	protected void onDestroy() {
		Analytics.Lifecycle.Activity.onDestroy(this);
		super.onDestroy();
	}
}
