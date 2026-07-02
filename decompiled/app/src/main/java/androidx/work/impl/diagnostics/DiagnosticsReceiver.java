package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import com.daaw.AbstractC0329Ai1;
import com.daaw.AbstractC1772Od0;
import com.daaw.C1305Jq0;

/* JADX INFO: loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {
    public static final String a = AbstractC1772Od0.f("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        AbstractC1772Od0.c().a(a, "Requesting diagnostics", new Throwable[0]);
        try {
            AbstractC0329Ai1.d(context).b(C1305Jq0.d(DiagnosticsWorker.class));
        } catch (IllegalStateException e) {
            AbstractC1772Od0.c().b(a, "WorkManager is not initialized", e);
        }
    }
}
