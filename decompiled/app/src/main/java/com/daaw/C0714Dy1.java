package com.daaw;

/* JADX INFO: renamed from: com.daaw.Dy1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0714Dy1 extends AbstractCallableC3025Zy1 {
    public final C1957Px1 i;

    public C0714Dy1(C2813Xx1 c2813Xx1, String str, String str2, C9733xv1 c9733xv1, int i, int i2, C1957Px1 c1957Px1) {
        super(c2813Xx1, "tfuuP59pzWN+H8zv1geT3jADiBKBGMQRjmCPoIvL5f45Lvl5qgJ0PgBqZF4WPnQj", "MIrDuKB7N0O22daoYjLtFOJg5TtVRHK1+0ktwmGNtdU=", c9733xv1, i, 94);
        this.i = c1957Px1;
    }

    @Override // com.daaw.AbstractCallableC3025Zy1
    public final void a() {
        int iIntValue = ((Integer) this.f.invoke(null, this.i.a())).intValue();
        synchronized (this.e) {
            this.e.Z(AbstractC2075Qv1.a(iIntValue));
        }
    }
}
