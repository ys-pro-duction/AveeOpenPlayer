package com.daaw;

import com.google.android.gms.common.api.Status;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class V00 extends E8 {
    public final Throwable C;

    public V00(int i, Throwable th) {
        super(new Status(i, String.format(Locale.ROOT, "Integrity API error (%d): %s.", Integer.valueOf(i), AbstractC1278Jj1.a(i))));
        if (i == 0) {
            throw new IllegalArgumentException("ErrorCode should not be 0.");
        }
        this.C = th;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        return this.C;
    }
}
