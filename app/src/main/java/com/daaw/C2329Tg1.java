package com.daaw;

import java.io.Serializable;

/* JADX INFO: renamed from: com.daaw.Tg1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2329Tg1 implements Serializable {
    public final int B;
    public final boolean C;

    public C2329Tg1(int i, boolean z) {
        AbstractC6948ny0.a(i >= 0, "Monday Day of Week value must be greater or equal to zero");
        this.B = i;
        this.C = z;
    }

    public static /* synthetic */ Integer a(C2329Tg1 c2329Tg1, C2329Tg1 c2329Tg12, int i, int i2, Integer num) {
        int iC = c2329Tg1.c() - c2329Tg12.c();
        int iIntValue = num.intValue();
        if (iC == 0) {
            return num;
        }
        if (iC < 0) {
            iIntValue = num.intValue() + iC;
            int i3 = i - iIntValue;
            if (iIntValue < i) {
                iIntValue = (i2 + 1) - i3;
            }
        }
        if (iC > 0 && (iIntValue = num.intValue() + iC) > i2) {
            iIntValue -= i2;
        }
        return Integer.valueOf(iIntValue);
    }

    public final XQ b(final int i, final int i2, final C2329Tg1 c2329Tg1, final C2329Tg1 c2329Tg12) {
        return new XQ() { // from class: com.daaw.Sg1
            @Override // com.daaw.XQ
            public final Object apply(Object obj) {
                return C2329Tg1.a(this.a, c2329Tg1, i, i2, (Integer) obj);
            }
        };
    }

    public int c() {
        return this.B;
    }

    public boolean d() {
        return this.C;
    }

    public int e(int i, C2329Tg1 c2329Tg1) {
        return (this.C && c2329Tg1.d()) ? ((Integer) b(0, 6, this, c2329Tg1).apply(Integer.valueOf(i))).intValue() : (this.C || c2329Tg1.d()) ? c2329Tg1.d() ? e(i, new C2329Tg1(c2329Tg1.c() + 1, false)) - 1 : (e(i, new C2329Tg1(c2329Tg1.c() - 1, true)) % 7) + 1 : ((Integer) b(1, 7, this, c2329Tg1).apply(Integer.valueOf(i))).intValue();
    }
}
