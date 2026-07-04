package com.daaw;

import java.util.Collection;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.ej0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC4346ej0 extends FI0 {
    public static final a a = a.a;

    /* JADX INFO: renamed from: com.daaw.ej0$a */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        public static final NQ b = C4068dj0.B;

        public static final boolean a(C2352Tm0 c2352Tm0) {
            G10.g(c2352Tm0, "it");
            return true;
        }

        public final NQ c() {
            return b;
        }
    }

    /* JADX INFO: renamed from: com.daaw.ej0$b */
    public static final class b extends AbstractC4635fj0 {
        public static final b b = new b();

        @Override // com.daaw.AbstractC4635fj0, com.daaw.InterfaceC4346ej0
        public Set b() {
            return AbstractC9867yQ0.d();
        }

        @Override // com.daaw.AbstractC4635fj0, com.daaw.InterfaceC4346ej0
        public Set d() {
            return AbstractC9867yQ0.d();
        }

        @Override // com.daaw.AbstractC4635fj0, com.daaw.InterfaceC4346ej0
        public Set e() {
            return AbstractC9867yQ0.d();
        }
    }

    Collection a(C2352Tm0 c2352Tm0, InterfaceC7689qe0 interfaceC7689qe0);

    Set b();

    Collection c(C2352Tm0 c2352Tm0, InterfaceC7689qe0 interfaceC7689qe0);

    Set d();

    Set e();
}
