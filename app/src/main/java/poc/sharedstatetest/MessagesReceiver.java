package poc.sharedstatetest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class MessagesReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("MessagesReceiver", "onReceive");
        String value = intent.getStringExtra("value");
        DataMediator.VALUE = value;
        Log.d("MessagesReceiver", value);
    }
}