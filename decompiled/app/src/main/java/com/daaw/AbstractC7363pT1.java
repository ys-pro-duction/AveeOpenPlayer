package com.daaw;

/* JADX INFO: renamed from: com.daaw.pT1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC7363pT1 {
    public static final /* synthetic */ int a = 0;

    static {
        AbstractC7765qt1 abstractC7765qt1 = VT1.a;
    }

    public static JS2 a(int i, int i2, com.android.billingclient.api.d dVar) {
        try {
            TR2 tr2B = JS2.B();
            C5134hW2 c5134hW2B = C9343wY2.B();
            c5134hW2B.l(dVar.b());
            c5134hW2B.k(dVar.a());
            c5134hW2B.m(i);
            tr2B.j(c5134hW2B);
            tr2B.l(i2);
            return (JS2) tr2B.e();
        } catch (Exception e) {
            JC1.k("BillingLogger", "Unable to create logging payload", e);
            return null;
        }
    }

    public static JS2 b(int i, int i2, com.android.billingclient.api.d dVar, String str) {
        try {
            C5134hW2 c5134hW2B = C9343wY2.B();
            c5134hW2B.l(dVar.b());
            c5134hW2B.k(dVar.a());
            c5134hW2B.m(i);
            if (str != null) {
                c5134hW2B.j(str);
            }
            TR2 tr2B = JS2.B();
            tr2B.j(c5134hW2B);
            tr2B.l(i2);
            return (JS2) tr2B.e();
        } catch (Exception e) {
            JC1.k("BillingLogger", "Unable to create logging payload", e);
            return null;
        }
    }

    public static ZU2 c(int i) {
        try {
            C9048vU2 c9048vU2Z = ZU2.z();
            c9048vU2Z.k(i);
            return (ZU2) c9048vU2Z.e();
        } catch (Exception e) {
            JC1.k("BillingLogger", "Unable to create logging payload", e);
            return null;
        }
    }
}
