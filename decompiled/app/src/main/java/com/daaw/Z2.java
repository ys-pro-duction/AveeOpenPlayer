package com.daaw;

import java.util.Collection;

/* JADX INFO: loaded from: classes4.dex */
public interface Z2 {

    public static final class a implements Z2 {
        public static final a a = new a();

        @Override // com.daaw.Z2
        public Collection a(C2352Tm0 c2352Tm0, InterfaceC4923gl interfaceC4923gl) {
            G10.g(c2352Tm0, "name");
            G10.g(interfaceC4923gl, "classDescriptor");
            return AbstractC1599Mm.k();
        }

        @Override // com.daaw.Z2
        public Collection c(InterfaceC4923gl interfaceC4923gl) {
            G10.g(interfaceC4923gl, "classDescriptor");
            return AbstractC1599Mm.k();
        }

        @Override // com.daaw.Z2
        public Collection d(InterfaceC4923gl interfaceC4923gl) {
            G10.g(interfaceC4923gl, "classDescriptor");
            return AbstractC1599Mm.k();
        }

        @Override // com.daaw.Z2
        public Collection e(InterfaceC4923gl interfaceC4923gl) {
            G10.g(interfaceC4923gl, "classDescriptor");
            return AbstractC1599Mm.k();
        }
    }

    Collection a(C2352Tm0 c2352Tm0, InterfaceC4923gl interfaceC4923gl);

    Collection c(InterfaceC4923gl interfaceC4923gl);

    Collection d(InterfaceC4923gl interfaceC4923gl);

    Collection e(InterfaceC4923gl interfaceC4923gl);
}
