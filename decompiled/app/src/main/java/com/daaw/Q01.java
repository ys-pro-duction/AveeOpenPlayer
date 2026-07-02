package com.daaw;

import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;

/* JADX INFO: loaded from: classes.dex */
public class Q01 extends L01 {
    public WindowInsetsController e;

    public Q01(View view, int i, Window window) {
        super(view, i);
        this.e = window.getInsetsController();
    }

    @Override // com.daaw.L01
    public void a() {
        this.e.hide(WindowInsets.Type.systemBars());
    }

    @Override // com.daaw.L01
    public void d() {
        this.e.show(WindowInsets.Type.systemBars());
    }

    @Override // com.daaw.L01
    public void c() {
    }
}
