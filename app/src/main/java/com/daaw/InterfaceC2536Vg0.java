package com.daaw;

import java.util.List;

/* JADX INFO: renamed from: com.daaw.Vg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC2536Vg0 {

    /* JADX INFO: renamed from: com.daaw.Vg0$a */
    public static final class a {
        public static b a(InterfaceC2536Vg0 interfaceC2536Vg0) {
            return new b(interfaceC2536Vg0);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Vg0$b */
    public static final class b {
        public final InterfaceC2536Vg0 a;

        public b(InterfaceC2536Vg0 interfaceC2536Vg0) {
            G10.g(interfaceC2536Vg0, "match");
            this.a = interfaceC2536Vg0;
        }

        public final InterfaceC2536Vg0 a() {
            return this.a;
        }
    }

    b a();

    List b();
}
