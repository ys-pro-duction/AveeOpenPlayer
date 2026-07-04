package com.daaw;

/* JADX INFO: loaded from: classes4.dex */
public interface RU0 {
    public static final RU0 a = new a();

    public static class a implements RU0 {
        public static /* synthetic */ void d(int i) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/descriptors/SourceElement$1", "getContainingFile"));
        }

        @Override // com.daaw.RU0
        public SU0 a() {
            SU0 su0 = SU0.a;
            if (su0 == null) {
                d(0);
            }
            return su0;
        }

        public String toString() {
            return "NO_SOURCE";
        }
    }

    SU0 a();
}
