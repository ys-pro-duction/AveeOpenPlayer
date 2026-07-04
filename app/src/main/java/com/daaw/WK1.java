package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class WK1 extends IT1 {
    public final Object c = new Object();
    public final C3407bL1 d;
    public boolean e;

    public WK1(C3407bL1 c3407bL1) {
        this.d = c3407bL1;
    }

    public final void g() {
        synchronized (this.c) {
            try {
                if (this.e) {
                    return;
                }
                this.e = true;
                e(new TK1(this), new ET1());
                e(new UK1(this), new VK1(this));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
