package com.daaw;

import com.daaw.Z41;
import com.google.android.exoplayer2.Format;
import java.io.EOFException;

/* JADX INFO: loaded from: classes.dex */
public final class JE implements Z41 {
    @Override // com.daaw.Z41
    public int b(InterfaceC9001vJ interfaceC9001vJ, int i, boolean z) throws EOFException {
        int iA = interfaceC9001vJ.a(i);
        if (iA != -1) {
            return iA;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.daaw.Z41
    public void c(C2584Vs0 c2584Vs0, int i) {
        c2584Vs0.K(i);
    }

    @Override // com.daaw.Z41
    public void d(Format format) {
    }

    @Override // com.daaw.Z41
    public void a(long j, int i, int i2, int i3, Z41.a aVar) {
    }
}
