package com.daaw;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Je3 extends AbstractC7960rc3 {
    public final AbstractC3772cf3 B;
    public AbstractC3772cf3 C;

    public Je3(AbstractC3772cf3 abstractC3772cf3) {
        this.B = abstractC3772cf3;
        if (abstractC3772cf3.y()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.C = abstractC3772cf3.l();
    }

    public static void h(Object obj, Object obj2) {
        C3225ah3.a().b(obj.getClass()).d(obj, obj2);
    }

    @Override // com.daaw.AbstractC7960rc3
    public final /* bridge */ /* synthetic */ AbstractC7960rc3 f(byte[] bArr, int i, int i2) throws Ef3 {
        k(bArr, 0, i2, C5171he3.c);
        return this;
    }

    @Override // com.daaw.AbstractC7960rc3
    public final /* bridge */ /* synthetic */ AbstractC7960rc3 g(byte[] bArr, int i, int i2, C5171he3 c5171he3) throws Ef3 {
        k(bArr, 0, i2, c5171he3);
        return this;
    }

    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final Je3 clone() {
        Je3 je3 = (Je3) this.B.A(5, null, null);
        je3.C = s();
        return je3;
    }

    public final Je3 j(AbstractC3772cf3 abstractC3772cf3) {
        if (!this.B.equals(abstractC3772cf3)) {
            if (!this.C.y()) {
                o();
            }
            h(this.C, abstractC3772cf3);
        }
        return this;
    }

    public final Je3 k(byte[] bArr, int i, int i2, C5171he3 c5171he3) throws Ef3 {
        if (!this.C.y()) {
            o();
        }
        try {
            C3225ah3.a().b(this.C.getClass()).g(this.C, bArr, 0, i2, new Dc3(c5171he3));
            return this;
        } catch (Ef3 e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        } catch (IndexOutOfBoundsException unused) {
            throw Ef3.f();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        if (r3 != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.daaw.AbstractC3772cf3 l() {
        /*
            r5 = this;
            com.daaw.cf3 r0 = r5.s()
            r1 = 1
            r2 = 0
            java.lang.Object r3 = r0.A(r1, r2, r2)
            java.lang.Byte r3 = (java.lang.Byte) r3
            byte r3 = r3.byteValue()
            if (r3 != r1) goto L13
            goto L30
        L13:
            if (r3 == 0) goto L31
            com.daaw.ah3 r3 = com.daaw.C3225ah3.a()
            java.lang.Class r4 = r0.getClass()
            com.daaw.gh3 r3 = r3.b(r4)
            boolean r3 = r3.c(r0)
            if (r1 == r3) goto L29
            r1 = r2
            goto L2a
        L29:
            r1 = r0
        L2a:
            r4 = 2
            r0.A(r4, r1, r2)
            if (r3 == 0) goto L31
        L30:
            return r0
        L31:
            com.daaw.Nh3 r1 = new com.daaw.Nh3
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.Je3.l():com.daaw.cf3");
    }

    @Override // com.daaw.Ig3
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public AbstractC3772cf3 s() {
        if (!this.C.y()) {
            return this.C;
        }
        this.C.u();
        return this.C;
    }

    public final void n() {
        if (this.C.y()) {
            return;
        }
        o();
    }

    public void o() {
        AbstractC3772cf3 abstractC3772cf3L = this.B.l();
        h(abstractC3772cf3L, this.C);
        this.C = abstractC3772cf3L;
    }
}
