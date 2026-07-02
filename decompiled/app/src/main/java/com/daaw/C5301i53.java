package com.daaw;

import java.util.ArrayDeque;
import java.util.Arrays;

/* JADX INFO: renamed from: com.daaw.i53, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5301i53 {
    public final ArrayDeque a = new ArrayDeque();

    public /* synthetic */ C5301i53(AbstractC5022h53 abstractC5022h53) {
    }

    public static /* bridge */ /* synthetic */ AbstractC9213w33 a(C5301i53 c5301i53, AbstractC9213w33 abstractC9213w33, AbstractC9213w33 abstractC9213w332) {
        c5301i53.b(abstractC9213w33);
        c5301i53.b(abstractC9213w332);
        AbstractC9213w33 c7543q53 = (AbstractC9213w33) c5301i53.a.pop();
        while (!c5301i53.a.isEmpty()) {
            c7543q53 = new C7543q53((AbstractC9213w33) c5301i53.a.pop(), c7543q53);
        }
        return c7543q53;
    }

    public static final int c(int i) {
        int iBinarySearch = Arrays.binarySearch(C7543q53.K, i);
        return iBinarySearch < 0 ? (-(iBinarySearch + 1)) - 1 : iBinarySearch;
    }

    public final void b(AbstractC9213w33 abstractC9213w33) {
        AbstractC7264p53 abstractC7264p53;
        if (!abstractC9213w33.F()) {
            if (!(abstractC9213w33 instanceof C7543q53)) {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(abstractC9213w33.getClass())));
            }
            C7543q53 c7543q53 = (C7543q53) abstractC9213w33;
            b(c7543q53.G);
            b(c7543q53.H);
            return;
        }
        int iC = c(abstractC9213w33.y());
        ArrayDeque arrayDeque = this.a;
        int iB0 = C7543q53.b0(iC + 1);
        if (arrayDeque.isEmpty() || ((AbstractC9213w33) this.a.peek()).y() >= iB0) {
            this.a.push(abstractC9213w33);
            return;
        }
        int iB02 = C7543q53.b0(iC);
        AbstractC9213w33 c7543q532 = (AbstractC9213w33) this.a.pop();
        while (true) {
            abstractC7264p53 = null;
            if (this.a.isEmpty() || ((AbstractC9213w33) this.a.peek()).y() >= iB02) {
                break;
            } else {
                c7543q532 = new C7543q53((AbstractC9213w33) this.a.pop(), c7543q532);
            }
        }
        C7543q53 c7543q533 = new C7543q53(c7543q532, abstractC9213w33);
        while (!this.a.isEmpty()) {
            int iC2 = c(c7543q533.y()) + 1;
            ArrayDeque arrayDeque2 = this.a;
            if (((AbstractC9213w33) arrayDeque2.peek()).y() >= C7543q53.b0(iC2)) {
                break;
            } else {
                c7543q533 = new C7543q53((AbstractC9213w33) this.a.pop(), c7543q533);
            }
        }
        this.a.push(c7543q533);
    }
}
