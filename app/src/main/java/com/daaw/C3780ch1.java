package com.daaw;

import android.view.View;
import android.view.WindowId;

/* JADX INFO: renamed from: com.daaw.ch1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C3780ch1 implements InterfaceC4059dh1 {
    public final WindowId a;

    public C3780ch1(View view) {
        this.a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof C3780ch1) && ((C3780ch1) obj).a.equals(this.a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}
