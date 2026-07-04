package com.daaw;

import android.content.Context;
import com.daaw.C0850Fg1;
import com.daaw.avee.comp.Visualizer.VisualizerViewCore;

/* JADX INFO: loaded from: classes.dex */
public class V9 extends DB {
    public static C0954Gg1 c = new C0954Gg1();
    public static C0954Gg1 d = new C0954Gg1();
    public static C0850Fg1 e = new C0850Fg1();
    public static C0850Fg1 f = new C0850Fg1();
    public static C0850Fg1 g = new C0850Fg1();
    public static C0850Fg1 h = new C0850Fg1();
    public com.daaw.avee.comp.playback.a b = new com.daaw.avee.comp.playback.a();

    public class a implements C0850Fg1.a {
        public a() {
        }

        @Override // com.daaw.C0850Fg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.daaw.avee.comp.playback.a invoke(Integer num) {
            com.daaw.avee.comp.playback.a aVar = C2221Sf1.b0() ? (com.daaw.avee.comp.playback.a) V9.c.a(V9.this.b, num, null) : (com.daaw.avee.comp.playback.a) V9.d.a(V9.this.b, num, null);
            if (aVar != null) {
                V9.this.b = aVar;
            }
            return aVar;
        }
    }

    public class b implements C0850Fg1.a {
        public b() {
        }

        @Override // com.daaw.C0850Fg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer invoke(Context context) {
            return C2221Sf1.b0() ? (Integer) V9.e.a(context, 0) : (Integer) V9.f.a(context, 0);
        }
    }

    public class c implements C0850Fg1.a {
        public c() {
        }

        @Override // com.daaw.C0850Fg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer invoke(Context context) {
            return C2221Sf1.b0() ? Integer.valueOf(((Integer) V9.g.a(context, 0)).intValue() | 2) : Integer.valueOf(((Integer) V9.h.a(context, 1)).intValue() | 2);
        }
    }

    public V9() {
        VisualizerViewCore.F.b(new a(), this.a);
        VisualizerViewCore.T.b(new b(), this.a);
        VisualizerViewCore.U.b(new c(), this.a);
    }

    public static long c() {
        return C2221Sf1.b0() ? C2221Sf1.Z() / 1000 : C8899uw0.h.a;
    }

    public static long d() {
        return C2221Sf1.b0() ? C2221Sf1.a0() / 1000 : C8899uw0.i;
    }
}
