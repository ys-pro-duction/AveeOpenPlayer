package com.daaw;

import android.os.CancellationSignal;

/* JADX INFO: renamed from: com.daaw.ij, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5470ij {
    public boolean a;
    public Object b;
    public boolean c;

    public void a() {
        synchronized (this) {
            try {
                if (this.a) {
                    return;
                }
                this.a = true;
                this.c = true;
                Object obj = this.b;
                if (obj != null) {
                    try {
                        ((CancellationSignal) obj).cancel();
                    } catch (Throwable th) {
                        synchronized (this) {
                            this.c = false;
                            notifyAll();
                            throw th;
                        }
                    }
                }
                synchronized (this) {
                    this.c = false;
                    notifyAll();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
