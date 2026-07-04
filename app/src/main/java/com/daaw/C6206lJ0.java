package com.daaw;

import com.daaw.InterfaceC5766jm;

/* JADX INFO: renamed from: com.daaw.lJ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C6206lJ0 {
    public long b = 0;
    public long c = -1;
    public final InterfaceC5766jm a = new InterfaceC5766jm.a();

    public static int b(int i) {
        return (i == 400 || i == 403 || i == 404) ? 1 : 0;
    }

    public boolean a() {
        return this.c <= this.a.a();
    }

    public void c() {
        this.b = 0L;
        this.c = -1L;
    }

    public void d(int i) {
        this.b++;
        if (b(i) == 1) {
            this.c = this.a.a() + 86400000;
            return;
        }
        this.c = this.a.a() + Math.min((long) (Math.pow(2.0d, this.b * ((Math.random() * 0.5d) + 1.0d)) * 1000.0d), 14400000L);
    }
}
