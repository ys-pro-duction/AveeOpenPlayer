package com.daaw;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: com.daaw.oY2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7105oY2 {
    public EY2 a = null;
    public Z23 b = null;
    public Integer c = null;

    public /* synthetic */ C7105oY2(AbstractC6826nY2 abstractC6826nY2) {
    }

    public final C7105oY2 a(Z23 z23) {
        this.b = z23;
        return this;
    }

    public final C7105oY2 b(Integer num) {
        this.c = num;
        return this;
    }

    public final C7105oY2 c(EY2 ey2) {
        this.a = ey2;
        return this;
    }

    public final C7663qY2 d() throws GeneralSecurityException {
        Z23 z23;
        Y23 y23B;
        EY2 ey2 = this.a;
        if (ey2 == null || (z23 = this.b) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (ey2.b() != z23.a()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (ey2.e() && this.c == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.a.e() && this.c != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.a.d() == CY2.e) {
            y23B = Y23.b(new byte[0]);
        } else if (this.a.d() == CY2.d || this.a.d() == CY2.c) {
            y23B = Y23.b(ByteBuffer.allocate(5).put((byte) 0).putInt(this.c.intValue()).array());
        } else {
            if (this.a.d() != CY2.b) {
                throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: ".concat(String.valueOf(this.a.d())));
            }
            y23B = Y23.b(ByteBuffer.allocate(5).put((byte) 1).putInt(this.c.intValue()).array());
        }
        return new C7663qY2(this.a, this.b, y23B, this.c, null);
    }
}
