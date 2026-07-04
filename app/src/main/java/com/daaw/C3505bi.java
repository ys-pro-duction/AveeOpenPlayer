package com.daaw;

import java.util.Queue;

/* JADX INFO: renamed from: com.daaw.bi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3505bi {
    public static final C3505bi b = new C3505bi();
    public final Queue a = AbstractC6559mb1.d(0);

    public static C3505bi a() {
        return b;
    }

    public byte[] b() {
        byte[] bArr;
        synchronized (this.a) {
            bArr = (byte[]) this.a.poll();
        }
        return bArr == null ? new byte[65536] : bArr;
    }

    public boolean c(byte[] bArr) {
        boolean z = false;
        if (bArr.length != 65536) {
            return false;
        }
        synchronized (this.a) {
            try {
                if (this.a.size() < 32) {
                    this.a.offer(bArr);
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }
}
