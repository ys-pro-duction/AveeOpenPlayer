package com.daaw;

/* JADX INFO: renamed from: com.daaw.r71, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC7829r71 {

    /* JADX INFO: renamed from: com.daaw.r71$a */
    public static final class a {
        public static /* synthetic */ C8387t71 a(InterfaceC7829r71 interfaceC7829r71, InterfaceC3072a8 interfaceC3072a8, C71 c71, InterfaceC8612tw interfaceC8612tw, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toAttributes");
            }
            if ((i & 2) != 0) {
                c71 = null;
            }
            if ((i & 4) != 0) {
                interfaceC8612tw = null;
            }
            return interfaceC7829r71.a(interfaceC3072a8, c71, interfaceC8612tw);
        }
    }

    C8387t71 a(InterfaceC3072a8 interfaceC3072a8, C71 c71, InterfaceC8612tw interfaceC8612tw);
}
