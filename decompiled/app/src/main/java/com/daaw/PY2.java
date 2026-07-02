package com.daaw;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
public final class PY2 {
    public C4867gZ2 a = null;
    public Z23 b = null;
    public Integer c = null;

    public /* synthetic */ PY2(OY2 oy2) {
    }

    public final PY2 a(Integer num) {
        this.c = num;
        return this;
    }

    public final PY2 b(Z23 z23) {
        this.b = z23;
        return this;
    }

    public final PY2 c(C4867gZ2 c4867gZ2) {
        this.a = c4867gZ2;
        return this;
    }

    public final RY2 d() throws GeneralSecurityException {
        Z23 z23;
        Y23 y23B;
        C4867gZ2 c4867gZ2 = this.a;
        if (c4867gZ2 == null || (z23 = this.b) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (c4867gZ2.b() != z23.a()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (c4867gZ2.g() && this.c == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.a.g() && this.c != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.a.f() == C4299eZ2.e) {
            y23B = Y23.b(new byte[0]);
        } else if (this.a.f() == C4299eZ2.d || this.a.f() == C4299eZ2.c) {
            y23B = Y23.b(ByteBuffer.allocate(5).put((byte) 0).putInt(this.c.intValue()).array());
        } else {
            if (this.a.f() != C4299eZ2.b) {
                throw new IllegalStateException("Unknown HmacParameters.Variant: ".concat(String.valueOf(this.a.f())));
            }
            y23B = Y23.b(ByteBuffer.allocate(5).put((byte) 1).putInt(this.c.intValue()).array());
        }
        return new RY2(this.a, this.b, y23B, this.c, null);
    }
}
