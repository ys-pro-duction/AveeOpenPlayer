package com.daaw;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: renamed from: com.daaw.rU2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7925rU2 {
    public Integer a = null;
    public Integer b = null;
    public Integer c = null;
    public Integer d = null;
    public C8204sU2 e = null;
    public C8483tU2 f = C8483tU2.d;

    public /* synthetic */ C7925rU2(AbstractC7647qU2 abstractC7647qU2) {
    }

    public final C7925rU2 a(int i) throws InvalidAlgorithmParameterException {
        if (i != 16 && i != 24 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.a = Integer.valueOf(i);
        return this;
    }

    public final C7925rU2 b(C8204sU2 c8204sU2) {
        this.e = c8204sU2;
        return this;
    }

    public final C7925rU2 c(int i) throws InvalidAlgorithmParameterException {
        if (i < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; HMAC key must be at least 16 bytes", Integer.valueOf(i)));
        }
        this.b = Integer.valueOf(i);
        return this;
    }

    public final C7925rU2 d(int i) throws GeneralSecurityException {
        if (i < 12 || i > 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be between 12 and 16 bytes", Integer.valueOf(i)));
        }
        this.c = Integer.valueOf(i);
        return this;
    }

    public final C7925rU2 e(int i) throws GeneralSecurityException {
        if (i < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(i)));
        }
        this.d = Integer.valueOf(i);
        return this;
    }

    public final C7925rU2 f(C8483tU2 c8483tU2) {
        this.f = c8483tU2;
        return this;
    }

    public final C10164zU2 g() throws GeneralSecurityException {
        if (this.a == null) {
            throw new GeneralSecurityException("AES key size is not set");
        }
        if (this.b == null) {
            throw new GeneralSecurityException("HMAC key size is not set");
        }
        if (this.c == null) {
            throw new GeneralSecurityException("iv size is not set");
        }
        Integer num = this.d;
        if (num == null) {
            throw new GeneralSecurityException("tag size is not set");
        }
        if (this.e == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        if (this.f == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        int iIntValue = num.intValue();
        C8204sU2 c8204sU2 = this.e;
        if (c8204sU2 == C8204sU2.b) {
            if (iIntValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num));
            }
        } else if (c8204sU2 == C8204sU2.c) {
            if (iIntValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num));
            }
        } else if (c8204sU2 == C8204sU2.d) {
            if (iIntValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num));
            }
        } else if (c8204sU2 == C8204sU2.e) {
            if (iIntValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num));
            }
        } else {
            if (c8204sU2 != C8204sU2.f) {
                throw new GeneralSecurityException("unknown hash type; must be SHA1, SHA224, SHA256, SHA384 or SHA512");
            }
            if (iIntValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num));
            }
        }
        return new C10164zU2(this.a.intValue(), this.b.intValue(), this.c.intValue(), this.d.intValue(), this.f, this.e, null);
    }
}
