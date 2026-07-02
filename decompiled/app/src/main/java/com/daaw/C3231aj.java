package com.daaw;

import android.graphics.Typeface;

/* JADX INFO: renamed from: com.daaw.aj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3231aj extends N11 {
    public final Typeface a;
    public final a b;
    public boolean c;

    /* JADX INFO: renamed from: com.daaw.aj$a */
    public interface a {
        void a(Typeface typeface);
    }

    public C3231aj(a aVar, Typeface typeface) {
        this.a = typeface;
        this.b = aVar;
    }

    @Override // com.daaw.N11
    public void a(int i) {
        d(this.a);
    }

    @Override // com.daaw.N11
    public void b(Typeface typeface, boolean z) {
        d(typeface);
    }

    public void c() {
        this.c = true;
    }

    public final void d(Typeface typeface) {
        if (this.c) {
            return;
        }
        this.b.a(typeface);
    }
}
