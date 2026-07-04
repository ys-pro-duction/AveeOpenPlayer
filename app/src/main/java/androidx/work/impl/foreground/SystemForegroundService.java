package androidx.work.impl.foreground;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.work.impl.foreground.a;
import com.daaw.AbstractC1772Od0;
import com.daaw.AbstractServiceC2098Rb0;

/* JADX INFO: loaded from: classes.dex */
public class SystemForegroundService extends AbstractServiceC2098Rb0 implements a.b {
    public static final String G = AbstractC1772Od0.f("SystemFgService");
    public static SystemForegroundService H = null;
    public Handler C;
    public boolean D;
    public androidx.work.impl.foreground.a E;
    public NotificationManager F;

    public class a implements Runnable {
        public final /* synthetic */ int B;
        public final /* synthetic */ Notification C;
        public final /* synthetic */ int D;

        public a(int i, Notification notification, int i2) {
            this.B = i;
            this.C = notification;
            this.D = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (Build.VERSION.SDK_INT >= 29) {
                SystemForegroundService.this.startForeground(this.B, this.C, this.D);
            } else {
                SystemForegroundService.this.startForeground(this.B, this.C);
            }
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ int B;
        public final /* synthetic */ Notification C;

        public b(int i, Notification notification) {
            this.B = i;
            this.C = notification;
        }

        @Override // java.lang.Runnable
        public void run() {
            SystemForegroundService.this.F.notify(this.B, this.C);
        }
    }

    public class c implements Runnable {
        public final /* synthetic */ int B;

        public c(int i) {
            this.B = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            SystemForegroundService.this.F.cancel(this.B);
        }
    }

    private void f() {
        this.C = new Handler(Looper.getMainLooper());
        this.F = (NotificationManager) getApplicationContext().getSystemService("notification");
        androidx.work.impl.foreground.a aVar = new androidx.work.impl.foreground.a(getApplicationContext());
        this.E = aVar;
        aVar.m(this);
    }

    @Override // androidx.work.impl.foreground.a.b
    public void b(int i, int i2, Notification notification) {
        this.C.post(new a(i, notification, i2));
    }

    @Override // androidx.work.impl.foreground.a.b
    public void d(int i, Notification notification) {
        this.C.post(new b(i, notification));
    }

    @Override // androidx.work.impl.foreground.a.b
    public void e(int i) {
        this.C.post(new c(i));
    }

    @Override // com.daaw.AbstractServiceC2098Rb0, android.app.Service
    public void onCreate() {
        super.onCreate();
        H = this;
        f();
    }

    @Override // com.daaw.AbstractServiceC2098Rb0, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.E.k();
    }

    @Override // com.daaw.AbstractServiceC2098Rb0, android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.D) {
            AbstractC1772Od0.c().d(G, "Re-initializing SystemForegroundService after a request to shut-down.", new Throwable[0]);
            this.E.k();
            f();
            this.D = false;
        }
        if (intent == null) {
            return 3;
        }
        this.E.l(intent);
        return 3;
    }

    @Override // androidx.work.impl.foreground.a.b
    public void stop() {
        this.D = true;
        AbstractC1772Od0.c().a(G, "All commands completed.", new Throwable[0]);
        if (Build.VERSION.SDK_INT >= 26) {
            stopForeground(true);
        }
        H = null;
        stopSelf();
    }
}
