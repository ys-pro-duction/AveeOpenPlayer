package com.daaw;

/* JADX INFO: renamed from: com.daaw.xO2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9582xO2 extends NN2 {
    public final CharSequence D;
    public final TN2 E;
    public int F = 0;
    public int G = Integer.MAX_VALUE;

    public AbstractC9582xO2(C10140zO2 c10140zO2, CharSequence charSequence) {
        this.E = c10140zO2.a;
        this.D = charSequence;
    }

    @Override // com.daaw.NN2
    public final /* bridge */ /* synthetic */ Object a() {
        int iD;
        int i = this.F;
        while (true) {
            int i2 = this.F;
            if (i2 == -1) {
                b();
                return null;
            }
            int iE = e(i2);
            if (iE == -1) {
                iE = this.D.length();
                this.F = -1;
                iD = -1;
            } else {
                iD = d(iE);
                this.F = iD;
            }
            if (iD != i) {
                if (i < iE) {
                    this.D.charAt(i);
                }
                if (i < iE) {
                    this.D.charAt(iE - 1);
                }
                int i3 = this.G;
                if (i3 == 1) {
                    iE = this.D.length();
                    this.F = -1;
                    if (iE > i) {
                        this.D.charAt(iE - 1);
                    }
                } else {
                    this.G = i3 - 1;
                }
                return this.D.subSequence(i, iE).toString();
            }
            int i4 = iD + 1;
            this.F = i4;
            if (i4 > this.D.length()) {
                this.F = -1;
            }
        }
    }

    public abstract int d(int i);

    public abstract int e(int i);
}
