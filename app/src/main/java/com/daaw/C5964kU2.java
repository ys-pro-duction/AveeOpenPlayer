package com.daaw;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: com.daaw.kU2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5964kU2 {
    public C10164zU2 a = null;
    public Z23 b = null;
    public Z23 c = null;
    public Integer d = null;

    public /* synthetic */ C5964kU2(AbstractC5685jU2 abstractC5685jU2) {
    }

    public final C5964kU2 a(Z23 z23) {
        this.b = z23;
        return this;
    }

    public final C5964kU2 b(Z23 z23) {
        this.c = z23;
        return this;
    }

    public final C5964kU2 c(Integer num) {
        this.d = num;
        return this;
    }

    public final C5964kU2 d(C10164zU2 c10164zU2) {
        this.a = c10164zU2;
        return this;
    }

    public final C6531mU2 e() throws GeneralSecurityException {
        Y23 y23B;
        C10164zU2 c10164zU2 = this.a;
        if (c10164zU2 == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        Z23 z23 = this.b;
        if (z23 == null || this.c == null) {
            throw new GeneralSecurityException("Cannot build without key material");
        }
        if (c10164zU2.a() != z23.a()) {
            throw new GeneralSecurityException("AES key size mismatch");
        }
        if (c10164zU2.b() != this.c.a()) {
            throw new GeneralSecurityException("HMAC key size mismatch");
        }
        if (this.a.g() && this.d == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.a.g() && this.d != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.a.f() == C8483tU2.d) {
            y23B = Y23.b(new byte[0]);
        } else if (this.a.f() == C8483tU2.c) {
            y23B = Y23.b(ByteBuffer.allocate(5).put((byte) 0).putInt(this.d.intValue()).array());
        } else {
            if (this.a.f() != C8483tU2.b) {
                throw new IllegalStateException("Unknown AesCtrHmacAeadParameters.Variant: ".concat(String.valueOf(this.a.f())));
            }
            y23B = Y23.b(ByteBuffer.allocate(5).put((byte) 1).putInt(this.d.intValue()).array());
        }
        return new C6531mU2(this.a, this.b, this.c, y23B, this.d, null);
    }
}
