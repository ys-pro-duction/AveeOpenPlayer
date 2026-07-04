package com.daaw;

import android.content.Context;

/* JADX INFO: renamed from: com.daaw.ck1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3795ck1 implements InterfaceC5477ik1 {
    public Context a;

    public /* synthetic */ C3795ck1(AbstractC3238ak1 abstractC3238ak1) {
    }

    @Override // com.daaw.InterfaceC5477ik1
    public final C4920gk1 a() {
        Context context = this.a;
        if (context != null) {
            return new C4920gk1(context, null);
        }
        throw new IllegalStateException(String.valueOf(Context.class.getCanonicalName()).concat(" must be set"));
    }

    public final C3795ck1 b(Context context) {
        context.getClass();
        this.a = context;
        return this;
    }
}
