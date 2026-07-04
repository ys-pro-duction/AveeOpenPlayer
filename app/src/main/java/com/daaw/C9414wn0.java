package com.daaw;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: com.daaw.wn0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C9414wn0 {
    public int a;
    public int b;

    public C9414wn0(ViewGroup viewGroup) {
    }

    public int a() {
        return this.a | this.b;
    }

    public void b(View view, View view2, int i) {
        c(view, view2, i, 0);
    }

    public void c(View view, View view2, int i, int i2) {
        if (i2 == 1) {
            this.b = i;
        } else {
            this.a = i;
        }
    }

    public void d(View view, int i) {
        if (i == 1) {
            this.b = 0;
        } else {
            this.a = 0;
        }
    }
}
