package com.google.android.gms.ads.internal.util;

import com.daaw.AbstractC1114Hu1;
import com.daaw.AbstractC4970gu1;
import com.daaw.BT1;
import com.daaw.C3845cu1;
import com.daaw.C3996dT1;
import com.daaw.C6096ku1;
import com.daaw.C8725uL1;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zzbp extends AbstractC4970gu1 {
    public final BT1 N;
    public final C3996dT1 O;

    public zzbp(String str, Map map, BT1 bt1) {
        super(0, str, new C8725uL1(bt1));
        this.N = bt1;
        C3996dT1 c3996dT1 = new C3996dT1(null);
        this.O = c3996dT1;
        c3996dT1.d(str, "GET", null, null);
    }

    @Override // com.daaw.AbstractC4970gu1
    public final C6096ku1 a(C3845cu1 c3845cu1) {
        return C6096ku1.b(c3845cu1, AbstractC1114Hu1.b(c3845cu1));
    }

    @Override // com.daaw.AbstractC4970gu1
    public final /* bridge */ /* synthetic */ void g(Object obj) {
        C3845cu1 c3845cu1 = (C3845cu1) obj;
        this.O.f(c3845cu1.c, c3845cu1.a);
        byte[] bArr = c3845cu1.b;
        if (C3996dT1.k() && bArr != null) {
            this.O.h(bArr);
        }
        this.N.b(c3845cu1);
    }
}
