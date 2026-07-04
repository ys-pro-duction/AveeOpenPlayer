package com.daaw;

import java.util.Collection;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Q80 extends Z0 {

    public static final class a extends Q80 {
        public static final a a = new a();

        @Override // com.daaw.Q80
        public InterfaceC4923gl b(C6607ml c6607ml) {
            G10.g(c6607ml, "classId");
            return null;
        }

        @Override // com.daaw.Q80
        public InterfaceC4346ej0 c(InterfaceC4923gl interfaceC4923gl, LQ lq) {
            G10.g(interfaceC4923gl, "classDescriptor");
            G10.g(lq, "compute");
            return (InterfaceC4346ej0) lq.invoke();
        }

        @Override // com.daaw.Q80
        public boolean d(InterfaceC2968Zk0 interfaceC2968Zk0) {
            G10.g(interfaceC2968Zk0, "moduleDescriptor");
            return false;
        }

        @Override // com.daaw.Q80
        public boolean e(C71 c71) {
            G10.g(c71, "typeConstructor");
            return false;
        }

        @Override // com.daaw.Q80
        public Collection g(InterfaceC4923gl interfaceC4923gl) {
            G10.g(interfaceC4923gl, "classDescriptor");
            Collection collectionB = interfaceC4923gl.k().b();
            G10.f(collectionB, "getSupertypes(...)");
            return collectionB;
        }

        @Override // com.daaw.Z0
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public I80 a(O80 o80) {
            G10.g(o80, "type");
            return (I80) o80;
        }

        @Override // com.daaw.Q80
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public InterfaceC4923gl f(InterfaceC8612tw interfaceC8612tw) {
            G10.g(interfaceC8612tw, "descriptor");
            return null;
        }
    }

    public abstract InterfaceC4923gl b(C6607ml c6607ml);

    public abstract InterfaceC4346ej0 c(InterfaceC4923gl interfaceC4923gl, LQ lq);

    public abstract boolean d(InterfaceC2968Zk0 interfaceC2968Zk0);

    public abstract boolean e(C71 c71);

    public abstract InterfaceC10240zl f(InterfaceC8612tw interfaceC8612tw);

    public abstract Collection g(InterfaceC4923gl interfaceC4923gl);

    /* JADX INFO: renamed from: h */
    public abstract I80 a(O80 o80);
}
