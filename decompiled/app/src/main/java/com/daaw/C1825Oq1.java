package com.daaw;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Oq1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1825Oq1 implements InterfaceC1637Mv1 {
    public final Double B;

    public C1825Oq1(Double d) {
        if (d == null) {
            this.B = Double.valueOf(Double.NaN);
        } else {
            this.B = d;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1825Oq1) {
            return this.B.equals(((C1825Oq1) obj).B);
        }
        return false;
    }

    public final int hashCode() {
        return this.B.hashCode();
    }

    @Override // com.daaw.InterfaceC1637Mv1
    public final InterfaceC1637Mv1 m(String str, ES2 es2, List list) {
        if ("toString".equals(str)) {
            return new C6391ly1(zzi());
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", zzi(), str));
    }

    public final String toString() {
        return zzi();
    }

    @Override // com.daaw.InterfaceC1637Mv1
    public final InterfaceC1637Mv1 zzd() {
        return new C1825Oq1(this.B);
    }

    @Override // com.daaw.InterfaceC1637Mv1
    public final Boolean zzg() {
        boolean z = false;
        if (!Double.isNaN(this.B.doubleValue()) && this.B.doubleValue() != 0.0d) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // com.daaw.InterfaceC1637Mv1
    public final Double zzh() {
        return this.B;
    }

    @Override // com.daaw.InterfaceC1637Mv1
    public final String zzi() {
        if (Double.isNaN(this.B.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(this.B.doubleValue())) {
            return this.B.doubleValue() > 0.0d ? "Infinity" : "-Infinity";
        }
        BigDecimal bigDecimalA = AbstractC1410Kq1.a(BigDecimal.valueOf(this.B.doubleValue()));
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        decimalFormat.setMinimumFractionDigits((bigDecimalA.scale() > 0 ? bigDecimalA.precision() : bigDecimalA.scale()) - 1);
        String str = decimalFormat.format(bigDecimalA);
        int iIndexOf = str.indexOf("E");
        if (iIndexOf <= 0) {
            return str;
        }
        int i = Integer.parseInt(str.substring(iIndexOf + 1));
        return ((i >= 0 || i <= -7) && (i < 0 || i >= 21)) ? str.replace("E-", "e-").replace("E", "e+") : bigDecimalA.toPlainString();
    }

    @Override // com.daaw.InterfaceC1637Mv1
    public final Iterator zzl() {
        return null;
    }
}
