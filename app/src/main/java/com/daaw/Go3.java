package com.daaw;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class Go3 extends AbstractC7918rT {
    public final HashMap f = new HashMap();
    public final Context g;
    public volatile Handler h;
    public final An3 i;
    public final C0784Eq j;
    public final long k;
    public final long l;
    public volatile Executor m;

    public Go3(Context context, Looper looper, Executor executor) {
        An3 an3 = new An3(this, null);
        this.i = an3;
        this.g = context.getApplicationContext();
        this.h = new HandlerC4026da3(looper, an3);
        this.j = C0784Eq.b();
        this.k = 5000L;
        this.l = 300000L;
        this.m = executor;
    }

    @Override // com.daaw.AbstractC7918rT
    public final void c(C9671xi3 c9671xi3, ServiceConnection serviceConnection, String str) {
        AbstractC7506py0.m(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f) {
            try {
                Mk3 mk3 = (Mk3) this.f.get(c9671xi3);
                if (mk3 == null) {
                    throw new IllegalStateException("Nonexistent connection status for service config: " + c9671xi3.toString());
                }
                if (!mk3.h(serviceConnection)) {
                    throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + c9671xi3.toString());
                }
                mk3.f(serviceConnection, str);
                if (mk3.i()) {
                    this.h.sendMessageDelayed(this.h.obtainMessage(0, c9671xi3), this.k);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.daaw.AbstractC7918rT
    public final boolean e(C9671xi3 c9671xi3, ServiceConnection serviceConnection, String str, Executor executor) {
        boolean zJ;
        AbstractC7506py0.m(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f) {
            try {
                Mk3 mk3 = (Mk3) this.f.get(c9671xi3);
                if (executor == null) {
                    executor = this.m;
                }
                if (mk3 == null) {
                    mk3 = new Mk3(this, c9671xi3);
                    mk3.d(serviceConnection, serviceConnection, str);
                    mk3.e(str, executor);
                    this.f.put(c9671xi3, mk3);
                } else {
                    this.h.removeMessages(0, c9671xi3);
                    if (mk3.h(serviceConnection)) {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=" + c9671xi3.toString());
                    }
                    mk3.d(serviceConnection, serviceConnection, str);
                    int iA = mk3.a();
                    if (iA == 1) {
                        serviceConnection.onServiceConnected(mk3.b(), mk3.c());
                    } else if (iA == 2) {
                        mk3.e(str, executor);
                    }
                }
                zJ = mk3.j();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zJ;
    }
}
