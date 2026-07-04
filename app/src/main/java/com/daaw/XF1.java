package com.daaw;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class XF1 extends AbstractBinderC5625jG1 {
    public static final int J;
    public static final int K;
    public static final int L;
    public final String B;
    public final List C = new ArrayList();
    public final List D = new ArrayList();
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;

    static {
        int iRgb = Color.rgb(12, 174, 206);
        J = iRgb;
        K = Color.rgb(204, 204, 204);
        L = iRgb;
    }

    public XF1(String str, List list, Integer num, Integer num2, Integer num3, int i, int i2, boolean z) {
        this.B = str;
        for (int i3 = 0; i3 < list.size(); i3++) {
            BinderC4501fG1 binderC4501fG1 = (BinderC4501fG1) list.get(i3);
            this.C.add(binderC4501fG1);
            this.D.add(binderC4501fG1);
        }
        this.E = num != null ? num.intValue() : K;
        this.F = num2 != null ? num2.intValue() : L;
        this.G = num3 != null ? num3.intValue() : 12;
        this.H = i;
        this.I = i2;
    }

    public final int a3() {
        return this.G;
    }

    public final List b3() {
        return this.C;
    }

    public final int zzb() {
        return this.H;
    }

    public final int zzc() {
        return this.I;
    }

    public final int zzd() {
        return this.E;
    }

    public final int zze() {
        return this.F;
    }

    @Override // com.daaw.InterfaceC5907kG1
    public final String zzg() {
        return this.B;
    }

    @Override // com.daaw.InterfaceC5907kG1
    public final List zzh() {
        return this.D;
    }
}
