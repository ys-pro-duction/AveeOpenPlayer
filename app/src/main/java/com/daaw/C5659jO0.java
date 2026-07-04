package com.daaw;

import android.content.Context;

/* JADX INFO: renamed from: com.daaw.jO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C5659jO0 implements InterfaceC3126aL {
    public C5659jO0(Context context) {
    }

    @Override // com.daaw.InterfaceC3126aL
    public String a(String str) {
        return str.toLowerCase();
    }

    @Override // com.daaw.InterfaceC3126aL
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(String str, C7914rS c7914rS) {
        return c7914rS.a.toLowerCase().contains(str);
    }

    @Override // com.daaw.InterfaceC3126aL
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void c(C7914rS c7914rS) {
    }
}
