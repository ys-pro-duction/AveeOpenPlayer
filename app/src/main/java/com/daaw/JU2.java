package com.daaw;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
public final class JU2 {
    public TU2 a = null;
    public Z23 b = null;
    public Integer c = null;

    public /* synthetic */ JU2(IU2 iu2) {
    }

    public final JU2 a(Integer num) {
        this.c = num;
        return this;
    }

    public final JU2 b(Z23 z23) {
        this.b = z23;
        return this;
    }

    public final JU2 c(TU2 tu2) {
        this.a = tu2;
        return this;
    }

    public final LU2 d() throws GeneralSecurityException {
        Z23 z23;
        Y23 y23B;
        TU2 tu2 = this.a;
        if (tu2 == null || (z23 = this.b) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (tu2.b() != z23.a()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (tu2.d() && this.c == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.a.d() && this.c != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.a.c() == RU2.d) {
            y23B = Y23.b(new byte[0]);
        } else if (this.a.c() == RU2.c) {
            y23B = Y23.b(ByteBuffer.allocate(5).put((byte) 0).putInt(this.c.intValue()).array());
        } else {
            if (this.a.c() != RU2.b) {
                throw new IllegalStateException("Unknown AesEaxParameters.Variant: ".concat(String.valueOf(this.a.c())));
            }
            y23B = Y23.b(ByteBuffer.allocate(5).put((byte) 1).putInt(this.c.intValue()).array());
        }
        return new LU2(this.a, this.b, y23B, this.c, null);
    }
}
