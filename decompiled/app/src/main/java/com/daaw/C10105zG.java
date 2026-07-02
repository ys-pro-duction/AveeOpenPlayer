package com.daaw;

import java.util.Arrays;

/* JADX INFO: renamed from: com.daaw.zG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C10105zG {
    public final EG a;
    public final byte[] b;

    public C10105zG(EG eg, byte[] bArr) {
        if (eg == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.a = eg;
        this.b = bArr;
    }

    public byte[] a() {
        return this.b;
    }

    public EG b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10105zG)) {
            return false;
        }
        C10105zG c10105zG = (C10105zG) obj;
        if (this.a.equals(c10105zG.a)) {
            return Arrays.equals(this.b, c10105zG.b);
        }
        return false;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.a + ", bytes=[...]}";
    }
}
