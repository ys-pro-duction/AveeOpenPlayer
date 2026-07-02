package com.daaw;

import android.view.View;

/* JADX INFO: renamed from: com.daaw.De1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C0634De1 {
    public final View a;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f = true;
    public boolean g = true;

    public C0634De1(View view) {
        this.a = view;
    }

    public void a() {
        View view = this.a;
        AbstractC2317Td1.a0(view, this.d - (view.getTop() - this.b));
        View view2 = this.a;
        AbstractC2317Td1.Z(view2, this.e - (view2.getLeft() - this.c));
    }

    public int b() {
        return this.d;
    }

    public void c() {
        this.b = this.a.getTop();
        this.c = this.a.getLeft();
    }

    public boolean d(int i) {
        if (!this.g || this.e == i) {
            return false;
        }
        this.e = i;
        a();
        return true;
    }

    public boolean e(int i) {
        if (!this.f || this.d == i) {
            return false;
        }
        this.d = i;
        a();
        return true;
    }
}
