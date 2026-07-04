package com.daaw;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: loaded from: classes3.dex */
public final class YY2 {
    public Integer a = null;
    public Integer b = null;
    public C4021dZ2 c = null;
    public C4299eZ2 d = C4299eZ2.e;

    public /* synthetic */ YY2(XY2 xy2) {
    }

    public final YY2 a(C4021dZ2 c4021dZ2) {
        this.c = c4021dZ2;
        return this;
    }

    public final YY2 b(int i) {
        this.a = Integer.valueOf(i);
        return this;
    }

    public final YY2 c(int i) {
        this.b = Integer.valueOf(i);
        return this;
    }

    public final YY2 d(C4299eZ2 c4299eZ2) {
        this.d = c4299eZ2;
        return this;
    }

    public final C4867gZ2 e() throws GeneralSecurityException {
        Integer num = this.a;
        if (num == null) {
            throw new GeneralSecurityException("key size is not set");
        }
        if (this.b == null) {
            throw new GeneralSecurityException("tag size is not set");
        }
        if (this.c == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        if (this.d == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        if (num.intValue() < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", this.a));
        }
        Integer num2 = this.b;
        int iIntValue = num2.intValue();
        C4021dZ2 c4021dZ2 = this.c;
        if (iIntValue < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", num2));
        }
        if (c4021dZ2 == C4021dZ2.b) {
            if (iIntValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num2));
            }
        } else if (c4021dZ2 == C4021dZ2.c) {
            if (iIntValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num2));
            }
        } else if (c4021dZ2 == C4021dZ2.d) {
            if (iIntValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num2));
            }
        } else if (c4021dZ2 == C4021dZ2.e) {
            if (iIntValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num2));
            }
        } else {
            if (c4021dZ2 != C4021dZ2.f) {
                throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
            }
            if (iIntValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num2));
            }
        }
        return new C4867gZ2(this.a.intValue(), this.b.intValue(), this.d, this.c, null);
    }
}
