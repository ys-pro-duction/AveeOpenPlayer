package com.daaw;

import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes.dex */
public final class B6 implements InterfaceC2733Xd1 {
    public final ViewConfiguration a;

    public B6(ViewConfiguration viewConfiguration) {
        G10.g(viewConfiguration, "viewConfiguration");
        this.a = viewConfiguration;
    }

    @Override // com.daaw.InterfaceC2733Xd1
    public long a() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // com.daaw.InterfaceC2733Xd1
    public long b() {
        return 40L;
    }

    @Override // com.daaw.InterfaceC2733Xd1
    public long c() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // com.daaw.InterfaceC2733Xd1
    public /* synthetic */ long d() {
        return AbstractC2629Wd1.a(this);
    }

    @Override // com.daaw.InterfaceC2733Xd1
    public float e() {
        return this.a.getScaledTouchSlop();
    }
}
