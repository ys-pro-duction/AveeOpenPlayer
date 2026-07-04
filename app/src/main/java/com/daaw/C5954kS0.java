package com.daaw;

/* JADX INFO: renamed from: com.daaw.kS0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C5954kS0 {
    public boolean a = false;

    public synchronized void a() {
        this.a = true;
        notifyAll();
    }

    public synchronized void b() {
        while (!this.a) {
            wait();
        }
    }
}
