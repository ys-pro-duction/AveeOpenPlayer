package com.daaw;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public interface G31 {
    public static final G31 a = new a();

    public class a implements G31 {
        @Override // com.daaw.G31
        public long a() {
            return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        }
    }

    long a();
}
