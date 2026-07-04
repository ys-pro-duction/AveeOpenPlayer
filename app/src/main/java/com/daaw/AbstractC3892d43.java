package com.daaw;

import java.io.IOException;

/* JADX INFO: renamed from: com.daaw.d43, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3892d43 extends AbstractC3051a33 {
    public final AbstractC4449f43 B;
    public AbstractC4449f43 C;

    public AbstractC3892d43(AbstractC4449f43 abstractC4449f43) {
        this.B = abstractC4449f43;
        if (abstractC4449f43.H()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.C = abstractC4449f43.m();
    }

    public static void f(Object obj, Object obj2) {
        C3618c53.a().b(obj.getClass()).d(obj, obj2);
    }

    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final AbstractC3892d43 clone() {
        AbstractC3892d43 abstractC3892d43 = (AbstractC3892d43) this.B.J(5, null, null);
        abstractC3892d43.C = F();
        return abstractC3892d43;
    }

    public final AbstractC3892d43 h(AbstractC4449f43 abstractC4449f43) {
        if (!this.B.equals(abstractC4449f43)) {
            if (!this.C.H()) {
                m();
            }
            f(this.C, abstractC4449f43);
        }
        return this;
    }

    public final AbstractC3892d43 i(byte[] bArr, int i, int i2, U33 u33) throws C8939v43 {
        if (!this.C.H()) {
            m();
        }
        try {
            C3618c53.a().b(this.C.getClass()).h(this.C, bArr, 0, i2, new C5291i33(u33));
            return this;
        } catch (C8939v43 e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        } catch (IndexOutOfBoundsException unused) {
            throw C8939v43.j();
        }
    }

    public final AbstractC4449f43 j() {
        AbstractC4449f43 abstractC4449f43F = F();
        if (abstractC4449f43F.G()) {
            return abstractC4449f43F;
        }
        throw new C8944v53(abstractC4449f43F);
    }

    @Override // com.daaw.T43
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public AbstractC4449f43 F() {
        if (!this.C.H()) {
            return this.C;
        }
        this.C.B();
        return this.C;
    }

    public final void l() {
        if (this.C.H()) {
            return;
        }
        m();
    }

    public void m() {
        AbstractC4449f43 abstractC4449f43M = this.B.m();
        f(abstractC4449f43M, this.C);
        this.C = abstractC4449f43M;
    }
}
