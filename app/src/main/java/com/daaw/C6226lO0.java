package com.daaw;

import android.content.Context;

/* JADX INFO: renamed from: com.daaw.lO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C6226lO0 implements InterfaceC3126aL {
    public Context a;

    public C6226lO0(Context context) {
        this.a = context;
    }

    @Override // com.daaw.InterfaceC3126aL
    public String a(String str) {
        return str.toLowerCase();
    }

    @Override // com.daaw.InterfaceC3126aL
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(String str, C3434bS0 c3434bS0) {
        if (c3434bS0 != null) {
            return c3434bS0.a.toLowerCase().contains(str) || c3434bS0.a().toLowerCase().contains(str);
        }
        return false;
    }

    @Override // com.daaw.InterfaceC3126aL
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void c(C3434bS0 c3434bS0) {
    }
}
