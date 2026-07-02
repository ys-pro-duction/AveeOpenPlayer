package com.daaw;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.daaw.cz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3863cz implements KP0 {
    public final CharSequence a;
    public final int b;
    public final int c;
    public final InterfaceC3429bR d;

    /* JADX INFO: renamed from: com.daaw.cz$a */
    public static final class a implements Iterator, InterfaceC9783y60 {
        public int B = -1;
        public int C;
        public int D;
        public H00 E;
        public int F;

        public a() {
            int iL = AbstractC8417tE0.l(C3863cz.this.b, 0, C3863cz.this.a.length());
            this.C = iL;
            this.D = iL;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final void b() {
            /*
                r6 = this;
                int r0 = r6.D
                r1 = 0
                if (r0 >= 0) goto Lb
                r6.B = r1
                r0 = 0
                r6.E = r0
                return
            Lb:
                com.daaw.cz r0 = com.daaw.C3863cz.this
                int r0 = com.daaw.C3863cz.d(r0)
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L22
                int r0 = r6.F
                int r0 = r0 + r3
                r6.F = r0
                com.daaw.cz r4 = com.daaw.C3863cz.this
                int r4 = com.daaw.C3863cz.d(r4)
                if (r0 >= r4) goto L30
            L22:
                int r0 = r6.D
                com.daaw.cz r4 = com.daaw.C3863cz.this
                java.lang.CharSequence r4 = com.daaw.C3863cz.c(r4)
                int r4 = r4.length()
                if (r0 <= r4) goto L46
            L30:
                com.daaw.H00 r0 = new com.daaw.H00
                int r1 = r6.C
                com.daaw.cz r4 = com.daaw.C3863cz.this
                java.lang.CharSequence r4 = com.daaw.C3863cz.c(r4)
                int r4 = com.daaw.BY0.G(r4)
                r0.<init>(r1, r4)
                r6.E = r0
                r6.D = r2
                goto L9b
            L46:
                com.daaw.cz r0 = com.daaw.C3863cz.this
                com.daaw.bR r0 = com.daaw.C3863cz.b(r0)
                com.daaw.cz r4 = com.daaw.C3863cz.this
                java.lang.CharSequence r4 = com.daaw.C3863cz.c(r4)
                int r5 = r6.D
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.invoke(r4, r5)
                com.daaw.Cs0 r0 = (com.daaw.C0576Cs0) r0
                if (r0 != 0) goto L76
                com.daaw.H00 r0 = new com.daaw.H00
                int r1 = r6.C
                com.daaw.cz r4 = com.daaw.C3863cz.this
                java.lang.CharSequence r4 = com.daaw.C3863cz.c(r4)
                int r4 = com.daaw.BY0.G(r4)
                r0.<init>(r1, r4)
                r6.E = r0
                r6.D = r2
                goto L9b
            L76:
                java.lang.Object r2 = r0.a()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.b()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.C
                com.daaw.H00 r4 = com.daaw.AbstractC8417tE0.q(r4, r2)
                r6.E = r4
                int r2 = r2 + r0
                r6.C = r2
                if (r0 != 0) goto L98
                r1 = 1
            L98:
                int r2 = r2 + r1
                r6.D = r2
            L9b:
                r6.B = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.daaw.C3863cz.a.b():void");
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public H00 next() {
            if (this.B == -1) {
                b();
            }
            if (this.B == 0) {
                throw new NoSuchElementException();
            }
            H00 h00 = this.E;
            G10.e(h00, "null cannot be cast to non-null type kotlin.ranges.IntRange");
            this.E = null;
            this.B = -1;
            return h00;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.B == -1) {
                b();
            }
            return this.B == 1;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C3863cz(CharSequence charSequence, int i, int i2, InterfaceC3429bR interfaceC3429bR) {
        G10.g(charSequence, "input");
        G10.g(interfaceC3429bR, "getNextMatch");
        this.a = charSequence;
        this.b = i;
        this.c = i2;
        this.d = interfaceC3429bR;
    }

    @Override // com.daaw.KP0
    public Iterator iterator() {
        return new a();
    }
}
