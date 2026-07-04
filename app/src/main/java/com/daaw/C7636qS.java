package com.daaw;

import android.content.Context;
import com.daaw.C8712uI0;

/* JADX INFO: renamed from: com.daaw.qS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C7636qS extends AbstractC7357pS {
    public final InterfaceC0657Dk0 e0;
    public final Class f0;
    public final Class g0;
    public final C8712uI0.d h0;

    public C7636qS(Context context, WS ws, Class cls, InterfaceC0657Dk0 interfaceC0657Dk0, Class cls2, Class cls3, C9835yI0 c9835yI0, InterfaceC1141Ib0 interfaceC1141Ib0, C8712uI0.d dVar) {
        super(context, cls, z(ws, interfaceC0657Dk0, cls2, cls3, H91.b()), cls3, ws, c9835yI0, interfaceC1141Ib0);
        this.e0 = interfaceC0657Dk0;
        this.f0 = cls2;
        this.g0 = cls3;
        this.h0 = dVar;
    }

    public static InterfaceC0729Ec0 z(WS ws, InterfaceC0657Dk0 interfaceC0657Dk0, Class cls, Class cls2, WI0 wi0) {
        return new KM(interfaceC0657Dk0, wi0, ws.a(cls, cls2));
    }
}
