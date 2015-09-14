package gab.activitylifecycle;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {
    private static final String TAG = MainActivity.class.toString();

    //Called when the activity is starting. This is where most initialization should go:
    // calling setContentView(int) to inflate the activity's UI,
    // using findViewById(int) to programmatically interact with widgets in the UI,
    // calling managedQuery(android.net.Uri, String[], String, String[], String) to retrieve cursors for data being displayed, etc.
    //
    //or when the activity is being re-initialized after previously being shut down, for instance after a change in screen orientation.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onCreate(Bundle)");
    }

    //Called after the activity has been stopped, just prior to it being started again.
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart()");
    }

    //Called just before the activity becomes visible to the user
    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart()");
    }

    //This method is called after onStart() when the activity is being re-initialized from a previously saved state, given here in savedInstanceState.
    //Most implementations will simply use onCreate(Bundle) to restore their state,
    // but it is sometimes convenient to do it here after all of the initialization has been done
    // or to allow subclasses to decide whether to use your default implementation.
    //The default implementation of this method performs a restore of any view state that had previously been frozen by onSaveInstanceState(Bundle).
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i(TAG, "onRestoreInstaceState(Bundle)");
    }

    //Called just before the activity starts interacting with the user.
    //At this point the activity is at the top of the activity stack, with user input going to it.
    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume()");
    }

    //Called when the system is about to start resuming another activity.
    //This method is typically used to commit unsaved changes to persistent data, stop animations and other things that may be consuming CPU, and so on.
    //It should do whatever it does very quickly, because the next activity will not be resumed until it returns.
    //Followed either by onResume() if the activity returns back to the front, or by onStop() if it becomes invisible to the user.
    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause()");
    }

    //This method is called before an activity may be killed so that when it comes back some time in the future it can restore its state.
    //when a user navigates back from activity B to activity A: there is no need to call onSaveInstanceState(Bundle) on B
    // because that particular instance will never be restored, so the system avoids calling it.
    //The default implementation takes care of most of the UI per-instance state for you by calling onSaveInstanceState() on each view
    // in the hierarchy that has an id, and by saving the id of the currently focused view (all of which is restored by
    // the default implementation of onRestoreInstanceState(Bundle)
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i(TAG, "onSaveInstanceState(Bundle)");
    }

    //Called when the activity is no longer visible to the user, because another activity has been resumed and is covering this one.
    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop()");
    }

    //The final call you receive before your activity is destroyed.
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy()");
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
