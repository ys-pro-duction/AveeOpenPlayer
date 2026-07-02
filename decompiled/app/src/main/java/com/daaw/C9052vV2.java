package com.daaw;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: com.daaw.vV2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9052vV2 {
    public JV2 a = null;
    public Z23 b = null;
    public Integer c = null;

    public /* synthetic */ C9052vV2(AbstractC8766uV2 abstractC8766uV2) {
    }

    public final C9052vV2 a(Integer num) {
        this.c = num;
        return this;
    }

    public final C9052vV2 b(Z23 z23) {
        this.b = z23;
        return this;
    }

    public final C9052vV2 c(JV2 jv2) {
        this.a = jv2;
        return this;
    }

    public final C9610xV2 d() throws GeneralSecurityException {
        Z23 z23;
        Y23 y23B;
        JV2 jv2 = this.a;
        if (jv2 == null || (z23 = this.b) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (jv2.a() != z23.a()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (jv2.c() && this.c == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.a.c() && this.c != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.a.b() == HV2.d) {
            y23B = Y23.b(new byte[0]);
        } else if (this.a.b() == HV2.c) {
            y23B = Y23.b(ByteBuffer.allocate(5).put((byte) 0).putInt(this.c.intValue()).array());
        } else {
            if (this.a.b() != HV2.b) {
                throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: ".concat(String.valueOf(this.a.b())));
            }
            y23B = Y23.b(ByteBuffer.allocate(5).put((byte) 1).putInt(this.c.intValue()).array());
        }
        return new C9610xV2(this.a, this.b, y23B, this.c, null);
    }
}
