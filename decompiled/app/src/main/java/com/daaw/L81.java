package com.daaw;

/* JADX INFO: loaded from: classes4.dex */
public abstract class L81 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final I80 a(I80 i80) {
        G10.g(i80, "<this>");
        if (i80 instanceof K81) {
            return ((K81) i80).F();
        }
        return null;
    }

    public static final AbstractC5708ja1 b(AbstractC5708ja1 abstractC5708ja1, I80 i80) {
        G10.g(abstractC5708ja1, "<this>");
        G10.g(i80, "origin");
        return d(abstractC5708ja1, a(i80));
    }

    public static final AbstractC5708ja1 c(AbstractC5708ja1 abstractC5708ja1, I80 i80, NQ nq) {
        G10.g(abstractC5708ja1, "<this>");
        G10.g(i80, "origin");
        G10.g(nq, "transform");
        I80 i80A = a(i80);
        return d(abstractC5708ja1, i80A != null ? (I80) nq.invoke(i80A) : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final AbstractC5708ja1 d(AbstractC5708ja1 abstractC5708ja1, I80 i80) {
        G10.g(abstractC5708ja1, "<this>");
        if (abstractC5708ja1 instanceof K81) {
            return d(((K81) abstractC5708ja1).F0(), i80);
        }
        if (i80 == null || G10.c(i80, abstractC5708ja1)) {
            return abstractC5708ja1;
        }
        if (abstractC5708ja1 instanceof YS0) {
            return new C3716cT0((YS0) abstractC5708ja1, i80);
        }
        if (abstractC5708ja1 instanceof UM) {
            return new YM((UM) abstractC5708ja1, i80);
        }
        throw new C6902no0();
    }
}
