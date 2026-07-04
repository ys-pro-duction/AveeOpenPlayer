package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class KE extends IllegalStateException {
    public KE(String str, Throwable th) {
        super(str, th);
    }

    public static IllegalStateException a(AbstractC6963o11 abstractC6963o11) {
        if (!abstractC6963o11.m()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception excJ = abstractC6963o11.j();
        return new KE("Complete with: ".concat(excJ != null ? "failure" : abstractC6963o11.n() ? "result ".concat(String.valueOf(abstractC6963o11.k())) : abstractC6963o11.l() ? "cancellation" : "unknown issue"), excJ);
    }
}
