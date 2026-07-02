package com.daaw;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.io.Closeable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface JZ0 extends Closeable {
    NZ0 A(String str);

    boolean F0();

    Cursor H0(MZ0 mz0);

    void T();

    void V(String str, Object[] objArr);

    Cursor b0(MZ0 mz0, CancellationSignal cancellationSignal);

    Cursor h0(String str);

    String i();

    boolean isOpen();

    void l0();

    void m();

    List r();

    void v(String str);
}
