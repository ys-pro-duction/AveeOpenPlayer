package com.daaw;

import android.content.Context;
import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class Q51 implements Closeable, AutoCloseable {

    public interface a {
        Q51 a();

        a b(Context context);
    }

    public abstract XH a();

    public abstract P51 c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        a().close();
    }
}
