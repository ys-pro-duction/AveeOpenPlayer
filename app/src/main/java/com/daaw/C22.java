package com.daaw;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class C22 implements InterfaceC4758g83 {
    public final InterfaceC8394t83 a;

    public C22(InterfaceC8394t83 interfaceC8394t83) {
        this.a = interfaceC8394t83;
    }

    @Override // com.daaw.InterfaceC8394t83
    public final /* bridge */ /* synthetic */ Object zzb() {
        try {
            return new JSONObject(((A42) this.a).a().B);
        } catch (JSONException unused) {
            return null;
        }
    }
}
