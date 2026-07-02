package com.daaw;

import java.io.IOException;

/* JADX INFO: renamed from: com.daaw.sB1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8127sB1 implements InterfaceC7467pp2 {
    protected int zza = 0;

    public abstract int a(InterfaceC7500pw2 interfaceC7500pw2);

    public final byte[] c() {
        try {
            int iZzf = zzf();
            byte[] bArr = new byte[iZzf];
            AbstractC5392iR1 abstractC5392iR1Y = AbstractC5392iR1.y(bArr, 0, iZzf);
            b(abstractC5392iR1Y);
            abstractC5392iR1Y.z();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a byte array threw an IOException (should never happen).", e);
        }
    }
}
