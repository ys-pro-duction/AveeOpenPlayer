package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import androidx.profileinstaller.c;
import com.daaw.ExecutorC2748Xh0;

/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {

    public class a implements c.InterfaceC0025c {
        public a() {
        }

        @Override // androidx.profileinstaller.c.InterfaceC0025c
        public void a(int i, Object obj) {
            c.b.a(i, obj);
        }

        @Override // androidx.profileinstaller.c.InterfaceC0025c
        public void b(int i, Object obj) {
            c.b.b(i, obj);
            ProfileInstallReceiver.this.setResultCode(i);
        }
    }

    public static void a(c.InterfaceC0025c interfaceC0025c) {
        if (Build.VERSION.SDK_INT < 24) {
            interfaceC0025c.b(13, null);
        } else {
            Process.sendSignal(Process.myPid(), 10);
            interfaceC0025c.b(12, null);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Bundle extras;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
            c.j(context, new ExecutorC2748Xh0(), new a(), true);
            return;
        }
        if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                if ("WRITE_SKIP_FILE".equals(string)) {
                    c.k(context, new ExecutorC2748Xh0(), new a());
                    return;
                } else {
                    if ("DELETE_SKIP_FILE".equals(string)) {
                        c.c(context, new ExecutorC2748Xh0(), new a());
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
            a(new a());
            return;
        }
        if (!"androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) || (extras = intent.getExtras()) == null) {
            return;
        }
        String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
        a aVar = new a();
        if ("DROP_SHADER_CACHE".equals(string2)) {
            androidx.profileinstaller.a.b(context, aVar);
        } else {
            aVar.b(16, null);
        }
    }
}
