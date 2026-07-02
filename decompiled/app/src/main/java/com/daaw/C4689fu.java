package com.daaw;

import android.content.Context;

/* JADX INFO: renamed from: com.daaw.fu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C4689fu {
    public final Context a;
    public final InterfaceC6333lm b;
    public final InterfaceC6333lm c;

    public C4689fu(Context context, InterfaceC6333lm interfaceC6333lm, InterfaceC6333lm interfaceC6333lm2) {
        this.a = context;
        this.b = interfaceC6333lm;
        this.c = interfaceC6333lm2;
    }

    public AbstractC4400eu a(String str) {
        return AbstractC4400eu.a(this.a, this.b, this.c, str);
    }
}
