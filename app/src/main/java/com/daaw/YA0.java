package com.daaw;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class YA0 extends InputStream implements CD, InterfaceC4466f80 {
    public InterfaceC1900Pj0 B;
    public final InterfaceC2896Ys0 C;
    public ByteArrayInputStream D;

    public YA0(InterfaceC1900Pj0 interfaceC1900Pj0, InterfaceC2896Ys0 interfaceC2896Ys0) {
        this.B = interfaceC1900Pj0;
        this.C = interfaceC2896Ys0;
    }

    @Override // com.daaw.CD
    public int a(OutputStream outputStream) {
        InterfaceC1900Pj0 interfaceC1900Pj0 = this.B;
        if (interfaceC1900Pj0 != null) {
            int iC = interfaceC1900Pj0.c();
            this.B.f(outputStream);
            this.B = null;
            return iC;
        }
        ByteArrayInputStream byteArrayInputStream = this.D;
        if (byteArrayInputStream == null) {
            return 0;
        }
        int iA = (int) ZA0.a(byteArrayInputStream, outputStream);
        this.D = null;
        return iA;
    }

    @Override // java.io.InputStream
    public int available() {
        InterfaceC1900Pj0 interfaceC1900Pj0 = this.B;
        if (interfaceC1900Pj0 != null) {
            return interfaceC1900Pj0.c();
        }
        ByteArrayInputStream byteArrayInputStream = this.D;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.available();
        }
        return 0;
    }

    public InterfaceC1900Pj0 c() {
        InterfaceC1900Pj0 interfaceC1900Pj0 = this.B;
        if (interfaceC1900Pj0 != null) {
            return interfaceC1900Pj0;
        }
        throw new IllegalStateException("message not available");
    }

    public InterfaceC2896Ys0 d() {
        return this.C;
    }

    @Override // java.io.InputStream
    public int read() {
        if (this.B != null) {
            this.D = new ByteArrayInputStream(this.B.h());
            this.B = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.D;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read();
        }
        return -1;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        InterfaceC1900Pj0 interfaceC1900Pj0 = this.B;
        if (interfaceC1900Pj0 != null) {
            int iC = interfaceC1900Pj0.c();
            if (iC == 0) {
                this.B = null;
                this.D = null;
                return -1;
            }
            if (i2 >= iC) {
                AbstractC10245zm abstractC10245zmC0 = AbstractC10245zm.c0(bArr, i, iC);
                this.B.i(abstractC10245zmC0);
                abstractC10245zmC0.X();
                abstractC10245zmC0.d();
                this.B = null;
                this.D = null;
                return iC;
            }
            this.D = new ByteArrayInputStream(this.B.h());
            this.B = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.D;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read(bArr, i, i2);
        }
        return -1;
    }
}
