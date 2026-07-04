package com.daaw;

import android.os.Bundle;

/* JADX INFO: renamed from: com.daaw.jw2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5817jw2 implements InterfaceC1343Jz2 {
    public final String a;

    public C5817jw2(String str) {
        this.a = str;
    }

    @Override // com.daaw.InterfaceC1343Jz2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        String str = this.a;
        Bundle bundle = (Bundle) obj;
        if (str != null) {
            bundle.putString("arek", str);
        }
    }
}
