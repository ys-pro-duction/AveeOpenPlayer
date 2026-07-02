package com.daaw;

import java.util.List;

/* JADX INFO: renamed from: com.daaw.vH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC8993vH {
    public static final InterfaceC8993vH a = new a();

    /* JADX INFO: renamed from: com.daaw.vH$a */
    public static class a implements InterfaceC8993vH {
        public static /* synthetic */ void c(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "descriptor";
            } else {
                objArr[0] = "unresolvedSuperClasses";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/serialization/deserialization/ErrorReporter$1";
            if (i != 2) {
                objArr[2] = "reportIncompleteHierarchy";
            } else {
                objArr[2] = "reportCannotInferVisibility";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // com.daaw.InterfaceC8993vH
        public void a(InterfaceC1583Mi interfaceC1583Mi) {
            if (interfaceC1583Mi == null) {
                c(2);
            }
        }

        @Override // com.daaw.InterfaceC8993vH
        public void b(InterfaceC4923gl interfaceC4923gl, List list) {
            if (interfaceC4923gl == null) {
                c(0);
            }
            if (list == null) {
                c(1);
            }
        }
    }

    void a(InterfaceC1583Mi interfaceC1583Mi);

    void b(InterfaceC4923gl interfaceC4923gl, List list);
}
