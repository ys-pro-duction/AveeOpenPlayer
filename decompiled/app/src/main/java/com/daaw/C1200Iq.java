package com.daaw;

import android.content.Context;
import com.daaw.InterfaceC0992Gq;

/* JADX INFO: renamed from: com.daaw.Iq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1200Iq {
    public InterfaceC0992Gq a(Context context, InterfaceC0992Gq.a aVar) {
        return context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0 ? new C2807Xw(context, aVar) : new C1816Oo0();
    }
}
