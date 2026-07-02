package com.daaw;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class L01 {
    public static b d = new a();
    public View a;
    public int b;
    public b c = d;

    public interface b {
        void a(boolean z);
    }

    public L01(View view, int i) {
        this.a = view;
        this.b = i;
    }

    public abstract void a();

    public void b(b bVar) {
        if (bVar == null) {
            bVar = d;
        }
        this.c = bVar;
    }

    public abstract void c();

    public abstract void d();

    public class a implements b {
        @Override // com.daaw.L01.b
        public void a(boolean z) {
        }
    }
}
