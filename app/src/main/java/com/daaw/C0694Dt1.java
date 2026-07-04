package com.daaw;

import java.security.cert.X509Certificate;

/* JADX INFO: renamed from: com.daaw.Dt1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0694Dt1 extends AbstractC0798Et1 {
    public final byte[] C;

    public C0694Dt1(X509Certificate x509Certificate, byte[] bArr) {
        super(x509Certificate);
        this.C = bArr;
    }

    @Override // java.security.cert.Certificate
    public final byte[] getEncoded() {
        return this.C;
    }
}
