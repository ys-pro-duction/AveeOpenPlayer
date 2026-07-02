package com.daaw;

import android.content.Context;
import com.daaw.C2078Qw0;

/* JADX INFO: renamed from: com.daaw.iO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C5379iO0 implements InterfaceC3126aL {
    public Context a;

    public C5379iO0(Context context) {
        this.a = context;
    }

    @Override // com.daaw.InterfaceC3126aL
    public String a(String str) {
        return str.toLowerCase();
    }

    @Override // com.daaw.InterfaceC3126aL
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(String str, B61 b61) {
        C2078Qw0.b bVarJ = ((C2078Qw0) b61.a).j(this.a);
        if (bVarJ != null) {
            return bVarJ.h.toLowerCase().contains(str) || bVarJ.e.toLowerCase().contains(str);
        }
        return false;
    }

    @Override // com.daaw.InterfaceC3126aL
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void c(B61 b61) {
        ((C2078Qw0) b61.a).h();
    }
}
