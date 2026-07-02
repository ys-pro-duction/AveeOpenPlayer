package com.daaw;

import android.content.Context;
import com.daaw.AbstractC7242p11;
import com.daaw.AbstractC8476tT;
import com.daaw.C5033h8;
import com.google.android.gms.common.internal.TelemetryData;

/* JADX INFO: renamed from: com.daaw.dm1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4084dm1 extends AbstractC8476tT implements D11 {
    public static final C5033h8.g k;
    public static final C5033h8.a l;
    public static final C5033h8 m;

    static {
        C5033h8.g gVar = new C5033h8.g();
        k = gVar;
        C3248am1 c3248am1 = new C3248am1();
        l = c3248am1;
        m = new C5033h8("ClientTelemetry.API", c3248am1, gVar);
    }

    public C4084dm1(Context context, E11 e11) {
        super(context, m, e11, AbstractC8476tT.a.c);
    }

    @Override // com.daaw.D11
    public final AbstractC6963o11 b(final TelemetryData telemetryData) {
        AbstractC7242p11.a aVarA = AbstractC7242p11.a();
        aVarA.d(AbstractC1182Il1.a);
        aVarA.c(false);
        aVarA.b(new CG0() { // from class: com.daaw.Xl1
            @Override // com.daaw.CG0
            public final void a(Object obj, Object obj2) {
                C5033h8.g gVar = C4084dm1.k;
                ((C2245Sl1) ((C4930gm1) obj).getService()).Z2(telemetryData);
                ((C7521q11) obj2).c(null);
            }
        });
        return d(aVarA.a());
    }
}
