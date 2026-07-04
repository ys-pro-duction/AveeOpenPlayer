package com.daaw;

import android.view.View;
import com.google.android.gms.ads.AdRequest;

/* JADX INFO: loaded from: classes.dex */
public class M01 extends L01 {
    public int e;
    public int f;
    public int g;
    public boolean h;
    public View.OnSystemUiVisibilityChangeListener i;

    public class a implements View.OnSystemUiVisibilityChangeListener {
        public a() {
        }

        @Override // android.view.View.OnSystemUiVisibilityChangeListener
        public void onSystemUiVisibilityChange(int i) {
            if ((i & M01.this.g) != 0) {
                M01.this.c.a(false);
                M01.this.h = false;
            } else {
                M01 m01 = M01.this;
                m01.a.setSystemUiVisibility(m01.e);
                M01.this.c.a(true);
                M01.this.h = true;
            }
        }
    }

    public M01(View view, int i) {
        super(view, i);
        this.h = true;
        this.i = new a();
        this.e = 0;
        this.f = 1;
        this.g = 1;
        int i2 = this.b;
        if ((i2 & 2) != 0) {
            this.e = 1024;
            this.f = 1028;
            this.g = 4;
        }
        if ((i2 & 6) != 0) {
            this.e |= AdRequest.MAX_CONTENT_URL_LENGTH;
            this.f |= 514;
            this.g |= 2;
        }
    }

    @Override // com.daaw.L01
    public void a() {
        this.a.setSystemUiVisibility(this.f);
    }

    @Override // com.daaw.L01
    public void c() {
        this.a.setOnSystemUiVisibilityChangeListener(this.i);
    }

    @Override // com.daaw.L01
    public void d() {
        this.a.setSystemUiVisibility(this.e);
    }
}
