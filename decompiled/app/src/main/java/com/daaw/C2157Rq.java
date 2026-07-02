package com.daaw;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Rq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C2157Rq {
    public final boolean a;
    public final int b;

    /* JADX INFO: renamed from: com.daaw.Rq$a */
    public static class a {
        public final Context b;
        public boolean d;
        public final List a = new ArrayList();
        public int c = 0;

        public a(Context context) {
            this.b = context.getApplicationContext();
        }

        public C2157Rq a() {
            Context context = this.b;
            List list = this.a;
            boolean z = true;
            if (!H02.b() && !list.contains(H02.a(context)) && !this.d) {
                z = false;
            }
            return new C2157Rq(z, this, null);
        }
    }

    public /* synthetic */ C2157Rq(boolean z, a aVar, AbstractC9689xm1 abstractC9689xm1) {
        this.a = z;
        this.b = aVar.c;
    }

    public int a() {
        return this.b;
    }

    public boolean b() {
        return this.a;
    }
}
