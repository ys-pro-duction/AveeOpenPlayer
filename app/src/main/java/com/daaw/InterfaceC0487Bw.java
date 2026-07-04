package com.daaw;

import java.util.Collection;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.Bw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC0487Bw {

    /* JADX INFO: renamed from: com.daaw.Bw$a */
    public static final class a implements InterfaceC0487Bw {
        public static final a a = new a();

        @Override // com.daaw.InterfaceC0487Bw
        public Set a() {
            return AbstractC9867yQ0.d();
        }

        @Override // com.daaw.InterfaceC0487Bw
        public V20 c(C2352Tm0 c2352Tm0) {
            G10.g(c2352Tm0, "name");
            return null;
        }

        @Override // com.daaw.InterfaceC0487Bw
        public Set d() {
            return AbstractC9867yQ0.d();
        }

        @Override // com.daaw.InterfaceC0487Bw
        public Set e() {
            return AbstractC9867yQ0.d();
        }

        @Override // com.daaw.InterfaceC0487Bw
        public InterfaceC6693n30 f(C2352Tm0 c2352Tm0) {
            G10.g(c2352Tm0, "name");
            return null;
        }

        @Override // com.daaw.InterfaceC0487Bw
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public List b(C2352Tm0 c2352Tm0) {
            G10.g(c2352Tm0, "name");
            return AbstractC1599Mm.k();
        }
    }

    Set a();

    Collection b(C2352Tm0 c2352Tm0);

    V20 c(C2352Tm0 c2352Tm0);

    Set d();

    Set e();

    InterfaceC6693n30 f(C2352Tm0 c2352Tm0);
}
