package com.daaw;

/* JADX INFO: renamed from: com.daaw.Pb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1867Pb extends AbstractC6118l {
    public AbstractC2511Va B;

    public AbstractC1867Pb(AbstractC2511Va abstractC2511Va) {
        G10.g(abstractC2511Va, "arrayMap");
        this.B = abstractC2511Va;
    }

    @Override // com.daaw.AbstractC6118l
    public final AbstractC2511Va e() {
        return this.B;
    }

    @Override // com.daaw.AbstractC6118l
    public final void s(String str, Object obj) {
        G10.g(str, "keyQualifiedName");
        G10.g(obj, "value");
        int iE = m().e(str);
        int iE2 = this.B.e();
        if (iE2 == 0) {
            this.B = new C1097Hq0(obj, iE);
            return;
        }
        if (iE2 == 1) {
            AbstractC2511Va abstractC2511Va = this.B;
            G10.e(abstractC2511Va, "null cannot be cast to non-null type org.jetbrains.kotlin.util.OneElementArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>");
            C1097Hq0 c1097Hq0 = (C1097Hq0) abstractC2511Va;
            if (c1097Hq0.p() == iE) {
                this.B = new C1097Hq0(obj, iE);
                return;
            } else {
                C2615Wa c2615Wa = new C2615Wa();
                this.B = c2615Wa;
                c2615Wa.m(c1097Hq0.p(), c1097Hq0.s());
            }
        }
        this.B.m(iE, obj);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC1867Pb() {
        C4788gG c4788gG = C4788gG.B;
        G10.e(c4788gG, "null cannot be cast to non-null type org.jetbrains.kotlin.util.ArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>");
        this(c4788gG);
    }
}
