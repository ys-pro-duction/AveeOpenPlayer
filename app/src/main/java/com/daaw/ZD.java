package com.daaw;

import android.content.Context;
import com.daaw.C8712uI0;

/* JADX INFO: loaded from: classes.dex */
public class ZD extends XD {
    public final InterfaceC0657Dk0 e0;
    public final InterfaceC0657Dk0 f0;
    public final C8712uI0.d g0;

    public ZD(Class cls, InterfaceC0657Dk0 interfaceC0657Dk0, InterfaceC0657Dk0 interfaceC0657Dk02, Context context, WS ws, C9835yI0 c9835yI0, InterfaceC1141Ib0 interfaceC1141Ib0, C8712uI0.d dVar) {
        super(context, cls, T(ws, interfaceC0657Dk0, interfaceC0657Dk02, AS.class, AbstractC3994dT.class, null), ws, c9835yI0, interfaceC1141Ib0);
        this.e0 = interfaceC0657Dk0;
        this.f0 = interfaceC0657Dk02;
        this.g0 = dVar;
    }

    public static KM T(WS ws, InterfaceC0657Dk0 interfaceC0657Dk0, InterfaceC0657Dk0 interfaceC0657Dk02, Class cls, Class cls2, WI0 wi0) {
        if (interfaceC0657Dk0 == null && interfaceC0657Dk02 == null) {
            return null;
        }
        if (wi0 == null) {
            wi0 = ws.f(cls, cls2);
        }
        return new KM(new C10177zY(interfaceC0657Dk0, interfaceC0657Dk02), wi0, ws.a(AY.class, cls));
    }
}
