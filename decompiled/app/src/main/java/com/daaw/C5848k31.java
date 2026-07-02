package com.daaw;

/* JADX INFO: renamed from: com.daaw.k31, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C5848k31 {
    public static final C5848k31 a = new C5848k31();
    public static final ThreadLocal b = AbstractC6136l31.a(new YZ0("ThreadLocalEventLoop"));

    public final NH a() {
        return (NH) b.get();
    }

    public final NH b() {
        ThreadLocal threadLocal = b;
        NH nh = (NH) threadLocal.get();
        if (nh != null) {
            return nh;
        }
        NH nhA = QH.a();
        threadLocal.set(nhA);
        return nhA;
    }

    public final void c() {
        b.set(null);
    }

    public final void d(NH nh) {
        b.set(nh);
    }
}
