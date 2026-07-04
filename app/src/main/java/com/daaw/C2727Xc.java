package com.daaw;

import java.util.Arrays;

/* JADX INFO: renamed from: com.daaw.Xc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2727Xc extends AbstractC7664qZ {
    public final int B;
    public final TC C;
    public final byte[] D;
    public final byte[] E;

    public C2727Xc(int i, TC tc, byte[] bArr, byte[] bArr2) {
        this.B = i;
        if (tc == null) {
            throw new NullPointerException("Null documentKey");
        }
        this.C = tc;
        if (bArr == null) {
            throw new NullPointerException("Null arrayValue");
        }
        this.D = bArr;
        if (bArr2 == null) {
            throw new NullPointerException("Null directionalValue");
        }
        this.E = bArr2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC7664qZ) {
            AbstractC7664qZ abstractC7664qZ = (AbstractC7664qZ) obj;
            if (this.B == abstractC7664qZ.l() && this.C.equals(abstractC7664qZ.k())) {
                boolean z = abstractC7664qZ instanceof C2727Xc;
                if (Arrays.equals(this.D, z ? ((C2727Xc) abstractC7664qZ).D : abstractC7664qZ.g())) {
                    if (Arrays.equals(this.E, z ? ((C2727Xc) abstractC7664qZ).E : abstractC7664qZ.h())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.daaw.AbstractC7664qZ
    public byte[] g() {
        return this.D;
    }

    @Override // com.daaw.AbstractC7664qZ
    public byte[] h() {
        return this.E;
    }

    public int hashCode() {
        return ((((((this.B ^ 1000003) * 1000003) ^ this.C.hashCode()) * 1000003) ^ Arrays.hashCode(this.D)) * 1000003) ^ Arrays.hashCode(this.E);
    }

    @Override // com.daaw.AbstractC7664qZ
    public TC k() {
        return this.C;
    }

    @Override // com.daaw.AbstractC7664qZ
    public int l() {
        return this.B;
    }

    public String toString() {
        return "IndexEntry{indexId=" + this.B + ", documentKey=" + this.C + ", arrayValue=" + Arrays.toString(this.D) + ", directionalValue=" + Arrays.toString(this.E) + "}";
    }
}
