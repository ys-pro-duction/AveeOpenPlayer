package com.daaw;

/* JADX INFO: renamed from: com.daaw.eq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4380eq {
    public boolean a;

    public synchronized void a() {
        while (!this.a) {
            wait();
        }
    }

    public synchronized boolean b() {
        boolean z;
        z = this.a;
        this.a = false;
        return z;
    }

    public synchronized boolean c() {
        if (this.a) {
            return false;
        }
        this.a = true;
        notifyAll();
        return true;
    }
}
