package com.daaw;

/* JADX INFO: loaded from: classes4.dex */
public interface VM {

    public static final class a implements VM {
        public static final a a = new a();

        @Override // com.daaw.VM
        public I80 a(KA0 ka0, String str, YS0 ys0, YS0 ys02) {
            G10.g(ka0, "proto");
            G10.g(str, "flexibleId");
            G10.g(ys0, "lowerBound");
            G10.g(ys02, "upperBound");
            throw new IllegalArgumentException("This method should not be used.");
        }
    }

    I80 a(KA0 ka0, String str, YS0 ys0, YS0 ys02);
}
