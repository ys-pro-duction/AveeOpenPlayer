package com.daaw;

import android.graphics.Typeface;
import android.os.Handler;
import com.daaw.NO;
import com.daaw.TO;

/* JADX INFO: renamed from: com.daaw.Pi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1895Pi {
    public final TO.c a;
    public final Handler b;

    /* JADX INFO: renamed from: com.daaw.Pi$a */
    public class a implements Runnable {
        public final /* synthetic */ TO.c B;
        public final /* synthetic */ Typeface C;

        public a(TO.c cVar, Typeface typeface) {
            this.B = cVar;
            this.C = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.B.b(this.C);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Pi$b */
    public class b implements Runnable {
        public final /* synthetic */ TO.c B;
        public final /* synthetic */ int C;

        public b(TO.c cVar, int i) {
            this.B = cVar;
            this.C = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.B.a(this.C);
        }
    }

    public C1895Pi(TO.c cVar, Handler handler) {
        this.a = cVar;
        this.b = handler;
    }

    public final void a(int i) {
        this.b.post(new b(this.a, i));
    }

    public void b(NO.e eVar) {
        if (eVar.a()) {
            c(eVar.a);
        } else {
            a(eVar.b);
        }
    }

    public final void c(Typeface typeface) {
        this.b.post(new a(this.a, typeface));
    }
}
