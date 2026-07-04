package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import androidx.work.impl.background.systemalarm.d;
import com.daaw.AbstractC1772Od0;
import com.daaw.AbstractC4900gg1;
import com.daaw.AbstractServiceC2098Rb0;

/* JADX INFO: loaded from: classes.dex */
public class SystemAlarmService extends AbstractServiceC2098Rb0 implements d.c {
    public static final String E = AbstractC1772Od0.f("SystemAlarmService");
    public d C;
    public boolean D;

    @Override // androidx.work.impl.background.systemalarm.d.c
    public void a() {
        this.D = true;
        AbstractC1772Od0.c().a(E, "All commands completed in dispatcher", new Throwable[0]);
        AbstractC4900gg1.a();
        stopSelf();
    }

    public final void f() {
        d dVar = new d(this);
        this.C = dVar;
        dVar.m(this);
    }

    @Override // com.daaw.AbstractServiceC2098Rb0, android.app.Service
    public void onCreate() {
        super.onCreate();
        f();
        this.D = false;
    }

    @Override // com.daaw.AbstractServiceC2098Rb0, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.D = true;
        this.C.j();
    }

    @Override // com.daaw.AbstractServiceC2098Rb0, android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.D) {
            AbstractC1772Od0.c().d(E, "Re-initializing SystemAlarmDispatcher after a request to shut-down.", new Throwable[0]);
            this.C.j();
            f();
            this.D = false;
        }
        if (intent == null) {
            return 3;
        }
        this.C.a(intent, i2);
        return 3;
    }
}
