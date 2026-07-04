package com.daaw;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public class JS implements InterfaceC2283Sv {
    public final SS B;
    public final TS C;
    public final QX0 D;
    public final SK E;

    public JS(Context context, InterfaceC1883Pf interfaceC1883Pf) {
        SS ss = new SS(context, interfaceC1883Pf);
        this.B = ss;
        this.E = new SK(ss);
        this.C = new TS(interfaceC1883Pf);
        this.D = new QX0();
    }

    @Override // com.daaw.InterfaceC2283Sv
    public CG b() {
        return this.D;
    }

    @Override // com.daaw.InterfaceC2283Sv
    public OI0 d() {
        return this.C;
    }

    @Override // com.daaw.InterfaceC2283Sv
    public NI0 e() {
        return this.B;
    }

    @Override // com.daaw.InterfaceC2283Sv
    public NI0 f() {
        return this.E;
    }
}
