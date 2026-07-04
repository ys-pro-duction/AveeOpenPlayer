package com.daaw;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class QC2 {
    public static QC2 e;
    public final Handler a = new Handler(Looper.getMainLooper());
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    public final Object c = new Object();
    public int d = 0;

    public QC2(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new C6459mC2(this, null), intentFilter);
    }

    public static synchronized QC2 b(Context context) {
        try {
            if (e == null) {
                e = new QC2(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return e;
    }

    public static /* synthetic */ void c(QC2 qc2, int i) throws Throwable {
        synchronized (qc2.c) {
            try {
                if (qc2.d == i) {
                    return;
                }
                qc2.d = i;
                for (WeakReference weakReference : qc2.b) {
                    Zs3 zs3 = (Zs3) weakReference.get();
                    if (zs3 != null) {
                        zs3.a.j(i);
                    } else {
                        qc2.b.remove(weakReference);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int a() {
        int i;
        synchronized (this.c) {
            i = this.d;
        }
        return i;
    }

    public final void d(final Zs3 zs3) {
        for (WeakReference weakReference : this.b) {
            if (weakReference.get() == null) {
                this.b.remove(weakReference);
            }
        }
        this.b.add(new WeakReference(zs3));
        this.a.post(new Runnable() { // from class: com.daaw.sA2
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                zs3.a.j(this.B.a());
            }
        });
    }
}
