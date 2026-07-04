package com.daaw;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: com.daaw.eV2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4283eV2 {
    public C7093oV2 a = null;
    public Z23 b = null;
    public Integer c = null;

    public /* synthetic */ C4283eV2(AbstractC4005dV2 abstractC4005dV2) {
    }

    public final C4283eV2 a(Integer num) {
        this.c = num;
        return this;
    }

    public final C4283eV2 b(Z23 z23) {
        this.b = z23;
        return this;
    }

    public final C4283eV2 c(C7093oV2 c7093oV2) {
        this.a = c7093oV2;
        return this;
    }

    public final C4851gV2 d() throws GeneralSecurityException {
        Z23 z23;
        Y23 y23B;
        C7093oV2 c7093oV2 = this.a;
        if (c7093oV2 == null || (z23 = this.b) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (c7093oV2.a() != z23.a()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (c7093oV2.c() && this.c == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.a.c() && this.c != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.a.b() == C6535mV2.d) {
            y23B = Y23.b(new byte[0]);
        } else if (this.a.b() == C6535mV2.c) {
            y23B = Y23.b(ByteBuffer.allocate(5).put((byte) 0).putInt(this.c.intValue()).array());
        } else {
            if (this.a.b() != C6535mV2.b) {
                throw new IllegalStateException("Unknown AesGcmParameters.Variant: ".concat(String.valueOf(this.a.b())));
            }
            y23B = Y23.b(ByteBuffer.allocate(5).put((byte) 1).putInt(this.c.intValue()).array());
        }
        return new C4851gV2(this.a, this.b, y23B, this.c, null);
    }
}
