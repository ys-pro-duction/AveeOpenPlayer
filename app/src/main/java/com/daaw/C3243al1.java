package com.daaw;

import com.daaw.ComponentCallbacks2C3485be;

/* JADX INFO: renamed from: com.daaw.al1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3243al1 implements ComponentCallbacks2C3485be.a {
    public final /* synthetic */ C10157zT a;

    public C3243al1(C10157zT c10157zT) {
        this.a = c10157zT;
    }

    @Override // com.daaw.ComponentCallbacks2C3485be.a
    public final void a(boolean z) {
        C10157zT c10157zT = this.a;
        c10157zT.O.sendMessage(c10157zT.O.obtainMessage(1, Boolean.valueOf(z)));
    }
}
