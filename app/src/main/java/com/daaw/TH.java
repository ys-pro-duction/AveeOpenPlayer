package com.daaw;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class TH implements InterfaceC3516bk0 {
    @Override // com.daaw.InterfaceC3516bk0
    public Metadata a(C4073dk0 c4073dk0) {
        ByteBuffer byteBuffer = c4073dk0.D;
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        C2584Vs0 c2584Vs0 = new C2584Vs0(bArrArray, iLimit);
        String strR = c2584Vs0.r();
        String strR2 = c2584Vs0.r();
        long jZ = c2584Vs0.z();
        return new Metadata(new EventMessage(strR, strR2, AbstractC6280lb1.T(c2584Vs0.z(), 1000L, jZ), c2584Vs0.z(), Arrays.copyOfRange(bArrArray, c2584Vs0.c(), iLimit), AbstractC6280lb1.T(c2584Vs0.z(), 1000000L, jZ)));
    }
}
