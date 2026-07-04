package com.daaw;

import com.daaw.OX;
import com.google.android.exoplayer2.metadata.Metadata;
import java.io.EOFException;

/* JADX INFO: loaded from: classes.dex */
public final class PX {
    public final C2584Vs0 a = new C2584Vs0(10);

    public Metadata a(InterfaceC9001vJ interfaceC9001vJ, OX.b bVar) throws Throwable {
        Metadata metadataC = null;
        int i = 0;
        while (true) {
            try {
                interfaceC9001vJ.k(this.a.a, 0, 10);
                this.a.J(0);
                if (this.a.A() != OX.c) {
                    break;
                }
                this.a.K(3);
                int iW = this.a.w();
                int i2 = iW + 10;
                if (metadataC == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(this.a.a, 0, bArr, 0, 10);
                    interfaceC9001vJ.k(bArr, 10, iW);
                    metadataC = new OX(bVar).c(bArr, i2);
                } else {
                    interfaceC9001vJ.h(iW);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        interfaceC9001vJ.i();
        interfaceC9001vJ.h(i);
        return metadataC;
    }
}
