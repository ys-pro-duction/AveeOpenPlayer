package com.daaw;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: renamed from: com.daaw.i1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5277i1 extends ClickableSpan {
    public final int a;
    public final Z1 b;
    public final int c;

    public C5277i1(int i, Z1 z1, int i2) {
        this.a = i;
        this.b = z1;
        this.c = i2;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.a);
        this.b.d0(this.c, bundle);
    }
}
