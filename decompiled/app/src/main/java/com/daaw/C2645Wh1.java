package com.daaw;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* JADX INFO: renamed from: com.daaw.Wh1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2645Wh1 {
    public final e a;

    /* JADX INFO: renamed from: com.daaw.Wh1$a */
    public static class a extends e {
        public final Window a;
        public final FU0 b;

        public a(Window window, FU0 fu0) {
            this.a = window;
            this.b = fu0;
        }

        public void c(int i) {
            View decorView = this.a.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        }

        public void d(int i) {
            this.a.addFlags(i);
        }

        public void e(int i) {
            View decorView = this.a.getDecorView();
            decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
        }

        public void f(int i) {
            this.a.clearFlags(i);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Wh1$b */
    public static class b extends a {
        public b(Window window, FU0 fu0) {
            super(window, fu0);
        }

        @Override // com.daaw.C2645Wh1.e
        public void b(boolean z) {
            if (!z) {
                e(8192);
                return;
            }
            f(67108864);
            d(Integer.MIN_VALUE);
            c(8192);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Wh1$c */
    public static class c extends b {
        public c(Window window, FU0 fu0) {
            super(window, fu0);
        }

        @Override // com.daaw.C2645Wh1.e
        public void a(boolean z) {
            if (!z) {
                e(16);
                return;
            }
            f(134217728);
            d(Integer.MIN_VALUE);
            c(16);
        }
    }

    public C2645Wh1(Window window, View view) {
        FU0 fu0 = new FU0(view);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.a = new d(window, this, fu0);
            return;
        }
        if (i >= 26) {
            this.a = new c(window, fu0);
        } else if (i >= 23) {
            this.a = new b(window, fu0);
        } else {
            this.a = new a(window, fu0);
        }
    }

    public void a(boolean z) {
        this.a.a(z);
    }

    public void b(boolean z) {
        this.a.b(z);
    }

    /* JADX INFO: renamed from: com.daaw.Wh1$d */
    public static class d extends e {
        public final C2645Wh1 a;
        public final WindowInsetsController b;
        public final FU0 c;
        public final BS0 d;
        public Window e;

        public d(Window window, C2645Wh1 c2645Wh1, FU0 fu0) {
            this(window.getInsetsController(), c2645Wh1, fu0);
            this.e = window;
        }

        @Override // com.daaw.C2645Wh1.e
        public void a(boolean z) {
            if (z) {
                if (this.e != null) {
                    c(16);
                }
                this.b.setSystemBarsAppearance(16, 16);
            } else {
                if (this.e != null) {
                    d(16);
                }
                this.b.setSystemBarsAppearance(0, 16);
            }
        }

        @Override // com.daaw.C2645Wh1.e
        public void b(boolean z) {
            if (z) {
                if (this.e != null) {
                    c(8192);
                }
                this.b.setSystemBarsAppearance(8, 8);
            } else {
                if (this.e != null) {
                    d(8192);
                }
                this.b.setSystemBarsAppearance(0, 8);
            }
        }

        public void c(int i) {
            View decorView = this.e.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        }

        public void d(int i) {
            View decorView = this.e.getDecorView();
            decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
        }

        public d(WindowInsetsController windowInsetsController, C2645Wh1 c2645Wh1, FU0 fu0) {
            this.d = new BS0();
            this.b = windowInsetsController;
            this.a = c2645Wh1;
            this.c = fu0;
        }
    }

    /* JADX INFO: renamed from: com.daaw.Wh1$e */
    public static class e {
        public void a(boolean z) {
        }

        public void b(boolean z) {
        }
    }
}
