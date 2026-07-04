package com.daaw;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class Ze3 extends Qb3 {
    public static final WeakReference D = new WeakReference(null);
    public WeakReference C;

    public Ze3(byte[] bArr) {
        super(bArr);
        this.C = D;
    }

    @Override // com.daaw.Qb3
    public final byte[] Z2() {
        byte[] bArrA3;
        synchronized (this) {
            try {
                bArrA3 = (byte[]) this.C.get();
                if (bArrA3 == null) {
                    bArrA3 = a3();
                    this.C = new WeakReference(bArrA3);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bArrA3;
    }

    public abstract byte[] a3();
}
