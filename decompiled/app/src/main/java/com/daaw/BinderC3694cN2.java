package com.daaw;

import android.os.Bundle;

/* JADX INFO: renamed from: com.daaw.cN2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC3694cN2 extends AbstractBinderC7897rN2 {
    public final InterfaceC6224lN2 B;
    public final /* synthetic */ C3973dN2 C;

    public BinderC3694cN2(C3973dN2 c3973dN2, InterfaceC6224lN2 interfaceC6224lN2) {
        this.C = c3973dN2;
        this.B = interfaceC6224lN2;
    }

    @Override // com.daaw.InterfaceC8176sN2
    public final void H1(Bundle bundle) {
        int i = bundle.getInt("statusCode", 8150);
        String string = bundle.getString("sessionToken");
        AbstractC5657jN2 abstractC5657jN2C = AbstractC5936kN2.c();
        abstractC5657jN2C.b(i);
        if (string != null) {
            abstractC5657jN2C.a(string);
        }
        this.B.a(abstractC5657jN2C.c());
        if (i == 8157) {
            this.C.c();
        }
    }
}
